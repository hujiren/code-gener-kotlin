package com.apl.sys;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.text.SimpleDateFormat;
import java.util.*;

public class CodeGenerator {


    public static final String AUTHOR = "cy";
    public static final String DB_USER = "root";
    public static final String DB_PWD = "123456";

    public static final String DB_URL = "jdbc:mysql://192.168.31.185:3307/pgs_basic?serverTimezone=UTC&useUnicode=true&characterEncoding=utf8&useSSL=false";


    public static final String POJO_PACKAGE_NAME = "com.apl.wms.wh";
    public static final String IMPL_PACKAGE_NAME = "com.apl.wms";
    public static final String CHILD_MODULE= "/apl-wms-wh-service-impl";
    public static final String MODULE_NAME = "wh";

    public List<String> TABLE_INCLUDE = new ArrayList<>();

    public static final String SYSTEM_PATH = System.getProperty("user.dir");
    public static final String SYSTEM_CONTENTS = "D:/mp/";

    public static final String XML_OUT_PUT_TO_PROJECT = SYSTEM_PATH + CHILD_MODULE  + "/src/main/resources/mapper/";
    public static final String JAVA_OUT_PUT_TO_PROJECT = SYSTEM_PATH + CHILD_MODULE  + "/src/main/java";

    public static final String XML_OUT_PUT = XML_OUT_PUT_TO_PROJECT;
    public static final String JAVA_OUT_PUT = JAVA_OUT_PUT_TO_PROJECT;


    /**
     * <p>
     * MySQL 生成演示
     * </p>
     */
    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();

        gc.setOutputDir(JAVA_OUT_PUT);
        gc.setFileOverride(true);

        gc.setSwagger2(true);
        gc.setActiveRecord(true);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        //gc.setBaseResultMap(true);// XML ResultMap
        //gc.setBaseColumnList(true);// XML columList
        gc.setIdType(IdType.UUID);
        gc.setAuthor(AUTHOR);


        //动卡空间app
        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        // gc.setMapperName("%sDao");
        // gc.setXmlName("%sDao");
         gc.setServiceName("%sService");
        // gc.setServiceImplName("%sServiceDiy");
        // gc.setControllerName("%sAction");
        //gc.setEntityName("%sPo");
        mpg.setGlobalConfig(gc);


        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");

        dsc.setUsername(DB_USER);
        dsc.setPassword(DB_PWD);
        dsc.setUrl(DB_URL);
        mpg.setDataSource(dsc);


        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        //strategy.setTablePrefix(TABLE_PREFIX);// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略


        /**
         * 分库分表  需要生成的表
         */
        // strategy.setInclude("commodity_category");

        //strategy.setExclude(TABLE_EXCLUDE); // 排除生成的表

        // 自定义实体父类
        //strategy.setSuperEntityClass("com.prb.entity.BaseModel");
        // 自定义实体，公共字段
        // strategy.setSuperEntityColumns(new String[] { "test_id", "age" });
        // 自定义 com.apl.sys.innerOrg.mapper 父类
        // strategy.setSuperMapperClass("com.baomidou.demo.TestMapper");
        // 自定义 service 父类
        //strategy.setSuperServiceClass("com.prb.service.BaseService");
        // 自定义 service 实现类父类
        //strategy.setSuperServiceImplClass("com.prb.service.impl.BaseServiceImpl");
        // 自定义 com.apl.sys.innerOrg.controller 父类
        //strategy.setSuperControllerClass("com.prb.com.apl.sys.innerOrg.controller.BaseController");
        strategy.setRestControllerStyle(true);
        strategy.setEntitySerialVersionUID(true);


        strategy.setEntityLombokModel(true);
        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent(IMPL_PACKAGE_NAME);
        pc.setModuleName(MODULE_NAME);
        pc.setEntity("po");
        pc.setXml("mapper/mapper");

        mpg.setPackageInfo(pc);

        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                Map<String , Object> map = new HashMap<>();
                map.put("vo" , POJO_PACKAGE_NAME + ".vo");
                map.put("dto" , POJO_PACKAGE_NAME + ".dto");
                map.put("po" , POJO_PACKAGE_NAME + ".po");
                map.put("nowTime" , new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis())));
                setMap(map);

            }
        };

        List<FileOutConfig> focList = new ArrayList<FileOutConfig>();
        // 调整 xml 生成目录演示
        focList.add(new FileOutConfig("/templates/entityVo.java.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {

                return System.getProperty("user.dir") + "/"+CHILD_MODULE  +  "/src/main/java/" + POJO_PACKAGE_NAME.replaceAll("\\." , "/")  + "/vo/"+ tableInfo.getEntityName() + "ListVo.java";
            }
        });
        focList.add(new FileOutConfig("/templates/entityInfoVo.java.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {

                return System.getProperty("user.dir") + "/"+CHILD_MODULE  +  "/src/main/java/" + POJO_PACKAGE_NAME.replaceAll("\\." , "/")  + "/vo/"+ tableInfo.getEntityName() + "InfoVo.java";
            }
        });
       focList.add(new FileOutConfig("/templates/entityDto.java.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {

                return System.getProperty("user.dir") + "/"+CHILD_MODULE  +  "/src/main/java/" + POJO_PACKAGE_NAME.replaceAll("\\." , "/") + "/dto/"+ tableInfo.getEntityName() + "KeyDto.java";
            }
        });
       focList.add(new FileOutConfig("/templates/entity.java.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {

                return System.getProperty("user.dir") + "/"+CHILD_MODULE  +  "/src/main/java/" + POJO_PACKAGE_NAME.replaceAll("\\." , "/") + "/po/"+ tableInfo.getEntityName() + "Po.java";
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);

        // 关闭默认 xml 生成，调整生成 至 根目录
        /*TemplateConfig tc = new TemplateConfig();
        tc.setXml(null);
        tc.setController("/templates/controller.java.vm");
        tc.setService("/templates/service.java.vm");
        tc.setServiceImpl("/templates/serviceImpl.java.vm");
        tc.setMapper("/templates/mapper.java.vm");
        tc.setXml("/templates/mapper.xml.vm");
        mpg.setTemplate(tc);*/

        // 执行生成
        mpg.execute();

    }

}
