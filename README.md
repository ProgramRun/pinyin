# pinyin
此项目是以数据库为基础的拼音转换项目,开箱即用

## source
1. [基准数据来源](https://github.com/belerweb/pinyin4j)
2. [汉字unicode范围](https://www.qqxiuzi.cn/zh/hanzi-unicode-bianma.php)
3. [简繁体转换数据来源](https://github.com/BYVoid/OpenCC/tree/master/data/dictionary)
4. [粤语拼音数据来源](https://github.com/YuhangGe/yueyu/blob/master/dict.txt)
5. [复姓数据来源](https://baike.baidu.com/item/%E5%A4%8D%E5%A7%93/4092246?fr=aladdin) 

# 使用
1. 先将src\main\resources\db\last_name.sql和src\main\resources\db\pin_yin.sql 数据导入本地数据库
2. 修改src\main\resources\application.properties中数据库配置信息
3. 启动项目即可

# 目前功能
1. 转换为普通话拼音,可以自定义输出字母的格式,如uppercase(全大写),lowercase(全小写),capitalize(首字母大写),可以自定义拼音之间的分隔符,目前支持~!@#$*-_=?
2. 转换为粤语,当粤语拼音不存在时,会以*代替
3. 转换汉字