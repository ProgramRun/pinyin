package com.oie.pinyin.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

/**
 * @author oie
 * @date 2020/7/20 13:21
 * @description
 */
@Slf4j
@Component
public final class ErrorCodeLoader implements ResourceLoaderAware, InitializingBean {
	private static Resource[] resources;
	private static ResourceLoader resourceLoader;

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		ErrorCodeLoader.resourceLoader = resourceLoader;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		resources = ResourcePatternUtils.getResourcePatternResolver(resourceLoader)
				.getResources("classpath:errorCode*.properties");
		loadErrorCode();
	}

	private void loadErrorCode() {
		if (resources == null || resources.length == 0) {
			log.warn("error code load fail. cause not specify any resource location");
			return;
		}
		for (Resource location : resources) {
			try {
				Properties prop = PropertiesLoaderUtils
						.loadProperties(new EncodedResource(location, "UTF-8"));
				for (Map.Entry<Object, Object> entry : prop.entrySet()) {
					ErrorCodeContext.set(Integer.parseInt(entry.getKey().toString()), entry.getValue().toString());
				}
			} catch (IOException e) {
				log.error(String.format("Error to load '%s'", location), e);
			}
		}
	}

}
