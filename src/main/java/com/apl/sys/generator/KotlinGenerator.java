package com.apl.sys.generator;

import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;

import java.util.ArrayList;
import java.util.List;

public class KotlinGenerator implements Generator {


    @Override
    public void genCode() {

        GeneratorConfig.isKotlin = true;

        GeneratorConfig.init();


        List<FileOutConfig> focList = new ArrayList<FileOutConfig>();
        // 调整 xml 生成目录演示
        focList.add(new FileOutConfig("/templates/kotlin/entityListVo.kt.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {

                return System.getProperty("user.dir") + "/" + GeneratorConfig.CHILD_MODULE  +  "/src/main/java/" + GeneratorConfig.POJO_PACKAGE_NAME.replaceAll("\\." , "/")  + "/vo/"+ tableInfo.getEntityName() + "ListVo.kt";
            }
        });
        focList.add(new FileOutConfig("/templates/kotlin/entityInfoVo.kt.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {

                return System.getProperty("user.dir") + "/" + GeneratorConfig.CHILD_MODULE  +  "/src/main/java/" + GeneratorConfig.POJO_PACKAGE_NAME.replaceAll("\\." , "/")  + "/vo/"+ tableInfo.getEntityName() + "InfoVo.kt";
            }
        });
        focList.add(new FileOutConfig("/templates/kotlin/entityDto.kt.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {

                return System.getProperty("user.dir") + "/" + GeneratorConfig.CHILD_MODULE  +  "/src/main/java/" + GeneratorConfig.POJO_PACKAGE_NAME.replaceAll("\\." , "/") + "/dto/"+ tableInfo.getEntityName() + "KeyDto.kt";
            }
        });
        focList.add(new FileOutConfig("/templates/kotlin/entityPo.kt.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {

                return System.getProperty("user.dir") + "/" + GeneratorConfig.CHILD_MODULE  +  "/src/main/java/" + GeneratorConfig.POJO_PACKAGE_NAME.replaceAll("\\." , "/") + "/po/"+ tableInfo.getEntityName() + "Po.kt";
            }
        });

        GeneratorConfig.cfg.setFileOutConfigList(focList);
        GeneratorConfig.mpg.setCfg(GeneratorConfig.cfg);

        // 关闭默认 xml 生成，调整生成 至 根目录
        TemplateConfig tc = new TemplateConfig();
        tc.setXml(null);
        tc.setController("/templates/kotlin/controller.kt.vm");
        tc.setService("/templates/kotlin/service.kt.vm");
        tc.setServiceImpl("/templates/kotlin/serviceImpl.kt.vm");
        tc.setMapper("/templates/kotlin/mapper.kt.vm");
        tc.setXml("/templates/kotlin/mapper.xml.vm");
        GeneratorConfig.mpg.setTemplate(tc);

        // 执行生成
        GeneratorConfig.mpg.execute();

    }
}
