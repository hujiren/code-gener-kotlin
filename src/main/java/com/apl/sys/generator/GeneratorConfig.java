package com.apl.sys.generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratorConfig {


    public static AutoGenerator mpg = null;

    public static InjectionConfig cfg = null;

    public static Boolean isKotlin = false;


    static final String AUTHOR = "hjr";
    static final String DB_USER = "root";
    static final String DB_PWD = "123456";
    static final String DB_URL = "jdbc:mysql://192.168.1.185:3307/pgs_lms_common?serverTimezone=UTC&useUnicode=true&characterEncoding=utf8&useSSL=false";

    static final String POJO_PACKAGE_NAME = "com.apl.lms.common.pojo";
    static final String SERVICE_PACKAGE_NAME = "com.apl.lms.price.exp.manage";
    static final String CHILD_MODULE= "lmsc-ommon";
    static final String MODULE_NAME = "";
    static String TABLE_INCLUDE =  "country"; //表名(下划线)，不能为空;  例如：commodity_brand
    static String EXISTS_FIELDS = ""; //不能重复的字段名(下划线)，可为空;  例如： country_code,name_cn

    static final String SYSTEM_PATH = System.getProperty("user.dir");
    static String JAVA_OUT_PUT_TO_PROJECT = SYSTEM_PATH + "/code";


    public static void init(){

        JAVA_OUT_PUT_TO_PROJECT = SYSTEM_PATH + "/code";
        if(MODULE_NAME.length()>0)
            JAVA_OUT_PUT_TO_PROJECT += "/" +CHILD_MODULE ;

        if(GeneratorConfig.TABLE_INCLUDE==null || GeneratorConfig.TABLE_INCLUDE.trim().equals("")){
            System.out.println("表名不能为空");
            return;
        }

        mpg = new AutoGenerator();
        // 全局配置
        GlobalConfig gc = new GlobalConfig();

        gc.setOutputDir(GeneratorConfig.JAVA_OUT_PUT_TO_PROJECT);
        gc.setFileOverride(true);

        gc.setSwagger2(true);
        gc.setActiveRecord(true);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        //gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(true);// XML columList
        gc.setIdType(IdType.UUID);
        gc.setAuthor(GeneratorConfig.AUTHOR);
        gc.setKotlin(isKotlin);


        gc.setServiceName("%sService");

        mpg.setGlobalConfig(gc);


        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");

        dsc.setUsername(GeneratorConfig.DB_USER);
        dsc.setPassword(GeneratorConfig.DB_PWD);
        dsc.setUrl(GeneratorConfig.DB_URL);
        mpg.setDataSource(dsc);


        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        //strategy.setTablePrefix(TABLE_PREFIX);// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略


        /**
         * 分库分表  需要生成的表
         */
        strategy.setInclude(GeneratorConfig.TABLE_INCLUDE.split(","));


        strategy.setRestControllerStyle(true);
        strategy.setEntitySerialVersionUID(true);


        strategy.setEntityLombokModel(true);
        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        //pc.setParent(GeneratorConfig.SERVICE_PACKAGE_NAME);
        //pc.setModuleName(MODULE_NAME);
        //pc.setEntity("po");
        pc.setXml("mapper/mapper");

        mpg.setPackageInfo(pc);



        cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                Map<String , Object> map = new HashMap<>();
                map.put("packageName" , GeneratorConfig.SERVICE_PACKAGE_NAME);

                map.put("vo" , GeneratorConfig.POJO_PACKAGE_NAME + ".vo");
                map.put("dto" , GeneratorConfig.POJO_PACKAGE_NAME + ".dto");
                map.put("po" , GeneratorConfig.POJO_PACKAGE_NAME + ".po");
                map.put("nowTime" , new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis())));
                if(GeneratorConfig.EXISTS_FIELDS!=null && GeneratorConfig.EXISTS_FIELDS.length()>0) {
                    LinkedHashMap<String , Map> map2 = GeneratorConfig.createExistsTempData(GeneratorConfig.EXISTS_FIELDS);
                    map.put("exists_fields", map2);
                }
                setMap(map);
            }
        };

    }


    static LinkedHashMap<String, Map> createExistsTempData(String EXISTS_FIELDS){

        LinkedHashMap<String, Map> maps = new LinkedHashMap<>();

        String[] arr = EXISTS_FIELDS.split(",");
        for (String fieldName : arr) {
            String fieldName2 = lineToHump(fieldName.trim());
            String getMethodName = "get"+fieldName2.substring(0,1).toUpperCase()+fieldName2.substring(1)+"()";
            Map<String, String> fieldMap = new HashMap<>();
            fieldMap.put("name", fieldName2); //驼峰字段名
            fieldMap.put("getMethodName", getMethodName); //get方法
            fieldMap.put("underscoreName", fieldName.trim()); //下划线字段名
            fieldMap.put("upperCaseName", fieldName.toUpperCase().trim()); //大写字母字段名

            maps.put(fieldName, fieldMap);
        }

        return maps;

    }


    private static Pattern linePattern = Pattern.compile("_(\\w)");
    /** 下划线转驼峰 */
    public static String lineToHump(String str) {
        str = str.toLowerCase();
        Matcher matcher = linePattern.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }


    private static Pattern humpPattern = Pattern.compile("[A-Z]");
    /** 驼峰转下划线,效率比上面高 */
    static String humpToLine(String str) {
        Matcher matcher = humpPattern.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, "_" + matcher.group(0).toLowerCase());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

    protected class HandlerMethodParameter{


        public void getMsg() {
            GeneratorConfig.this.init();
        }


    }

}
