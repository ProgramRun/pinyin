package com.oie.pinyin.controller;

import com.oie.pinyin.ApiResponse;
import com.oie.pinyin.common.CharacterType;
import com.oie.pinyin.common.ValidateUtil;
import com.oie.pinyin.domain.FullName;
import com.oie.pinyin.service.IPinYinService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

import static com.oie.pinyin.config.SysErrorCode.PARAMS_ERROR;

/**
 * @author oie
 * @date 2020/9/2 19:33
 * @description
 */
@RestController
@RequestMapping("api")
@Api(value = "拼音转换")
public class PinYinController {

    @Autowired
    private IPinYinService pinYinService;

    @ApiOperation("普通话拼音转换")
    @GetMapping("nameCN/{name}")
    public ApiResponse<Collection<FullName>> convertName(@ApiParam(required = true) @PathVariable String name,
                                                         @ApiParam(name = "字母格式,uppercase(全大写),lowercase(全小写),capitalize(首字母大写)")
                                                         @RequestParam(defaultValue = "uppercase") String type,
                                                         @RequestParam(defaultValue = " ") String separator) {
        ValidateUtil.isTrue(StringUtils.hasText(name), PARAMS_ERROR, "输入为空");
        return ApiResponse.getSuccResponse("success",
                pinYinService.convertCn(name.trim(), CharacterType.get(type), getSeparator(separator)));
    }

    @ApiOperation("粤语拼音转换")
    @GetMapping("nameHK/{name}")
    public ApiResponse<Collection<FullName>> convertHKName(@ApiParam(required = true) @PathVariable String name,
                                                           @ApiParam(name = "字母格式,uppercase(全大写),lowercase(全小写),capitalize(首字母大写)")
                                                           @RequestParam(defaultValue = "uppercase") String type,
                                                           @RequestParam(defaultValue = " ") String separator) {
        ValidateUtil.isTrue(StringUtils.hasText(name), PARAMS_ERROR, "输入为空");
        return ApiResponse.getSuccResponse("success",
                pinYinService.convertHk(name.trim(), CharacterType.get(type), getSeparator(separator)));
    }

    private String getSeparator(String separator) {
        return StringUtils.hasText(separator) ? separator.trim() : " ";
    }


    @ApiOperation("普通话拼音转换")
    @GetMapping("{chinese}")
    public ApiResponse<Collection<String>> convert(@ApiParam(required = true) @PathVariable String chinese) {
        ValidateUtil.isTrue(StringUtils.hasText(chinese), PARAMS_ERROR, "输入为空");
        return ApiResponse.getSuccResponse("success", pinYinService.convert(chinese.trim()));
    }

}
