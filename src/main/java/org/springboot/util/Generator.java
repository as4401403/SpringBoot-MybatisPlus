package org.springboot.util;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.DbType;

/**
 * Created by 付勇 on 14/8/2017.
 */
public class Generator {
    public static void main(String[] args) {
        AutoGenerator generator=new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir("generate");
        gc.setFileOverride(true);
        gc.setActiveRecord(false);
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(false);// XML ResultMap
        gc.setBaseColumnList(false);// XML columList
        gc.setAuthor("fuyong");
        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setControllerName("%sController");


        //数据源配置
        DataSourceConfig sourceConfig=new DataSourceConfig();
        sourceConfig.setDbType(DbType.MYSQL);
        sourceConfig.setTypeConvert(new MySqlTypeConvert() {
            // 自定义数据库表字段类型转换【可选】
            @Override
            public DbColumnType processTypeConvert(String fieldType) {
                System.out.println("转换类型：" + fieldType);
                // 注意！！processTypeConvert 存在默认类型转换，如果不是你要的效果请自定义返回、非如下直接返回。
                return super.processTypeConvert(fieldType);
            }
        });
        sourceConfig.setDriverName("com.mysql.jdbc.Driver");
        sourceConfig.setUsername("root");
        sourceConfig.setPassword("dou8615355");
        sourceConfig.setUrl("jdbc:mysql://localhost:3306/studentRecordOpt?useUnicode=true&characterEncoding=UTF-8");


        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // strategy.setCapitalMode(true);// 全局大写命名 ORACLE 注意
        //strategy.setTablePrefix(new String[]{"t_"});// 此处可以修改为您的表前缀
        //strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        //strategy.setInclude(new String[]{"t_sms_send_log"}); // 需要生成的表
        // strategy.setExclude(new String[]{"test"}); // 排除生成的表
        // 自定义实体父类
        //strategy.setSuperEntityClass("cn.useonline.contract.com.fuyong.common.BaseEntity");
        // 自定义实体，公共字段
        //strategy.setSuperEntityColumns(new String[]{"created_date", "updated_date", "creator_id", "updator_id", "is_deleted"});
        // 自定义 com.fuyong.mapper 父类
        strategy.setSuperMapperClass("com/fuyong/common/BaseMapper");
        // 自定义 com.fuyong.service 父类
        //strategy.setSuperServiceClass("com.baomidou.demo.TestService");
        // 自定义 com.fuyong.service 实现类父类
        // strategy.setSuperServiceImplClass("com.baomidou.demo.TestServiceImpl");
        // 自定义 controller 父类
        // strategy.setSuperControllerClass("com.baomidou.demo.TestController");
        // 【实体】是否生成字段常量（默认 false）
        // public static final String ID = "test_id";
        // strategy.setEntityColumnConstant(true);
        // 【实体】是否为构建者模型（默认 false）
        // public User setName(String name) {this.name = name; return this;}
        // strategy.setEntityBuilderModel(true);
        strategy.setEntityLombokModel(true);


        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("");
        pc.setModuleName("");

        //关闭默认 xml 生成，调整生成至根目录
        TemplateConfig tc = new TemplateConfig();
        tc.setXml(null);


        // 自定义模板配置，可以 copy 源码 mybatis-plus/src/main/resources/template 下面内容修改，
        // 放置自己项目的 src/main/resources/template 目录下, 默认名称一下可以不配置，也可以自定义模板名称
        // TemplateConfig tc = new TemplateConfig();
        // tc.setController("...");
        // tc.setEntity("...");
        // tc.setMapper("...");
        // tc.setXml("...");
        // tc.setService("...");
        // tc.setServiceImpl("...");
        // 如上任何一个模块如果设置 空 OR Null 将不生成该模块。
        // mpg.setTemplate(tc);


        //加载全局配置
        generator.setGlobalConfig(gc);
        //加载数据源配置
        generator.setDataSource(sourceConfig);
        //加载策略配置
        generator.setStrategy(strategy);
        //加载包配置
        generator.setPackageInfo(pc);
        //xml配置
        generator.setTemplate(tc);


        //执行
        generator.execute();
    }
}
