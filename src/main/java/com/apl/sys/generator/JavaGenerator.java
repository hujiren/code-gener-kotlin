package com.apl.sys.generator;

import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerator implements Generator {




    @Override
    public void genCode() {

        GeneratorConfig.isKotlin = false;

        GeneratorConfig.init();

        List<FileOutConfig> focList = new ArrayList<FileOutConfig>();
        // 调整 xml 生成目录演示
        focList.add(new FileOutConfig("/templates/java/entityListVo.java.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {

                return System.getProperty("user.dir") + "/code/pojo/vo/"+ tableInfo.getEntityName() + "ListVo.java";
            }
        });

        focList.add(new FileOutConfig("/templates/java/entityInfoVo.java.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {

                return System.getProperty("user.dir") + "/code/pojo/vo/"+ tableInfo.getEntityName() + "InfoVo.java";
            }
        });

        focList.add(new FileOutConfig("/templates/java/entityKeyDto.java.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {

                return System.getProperty("user.dir") + "/code/pojo/dto/"+ tableInfo.getEntityName() + "KeyDto.java";
            }
        });

        focList.add(new FileOutConfig("/templates/java/entityAddDto.java.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {

                return System.getProperty("user.dir") + "/code/pojo/dto/"+ tableInfo.getEntityName() + "AddDto.java";
            }
        });

        focList.add(new FileOutConfig("/templates/java/entityUpdDto.java.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {

                return System.getProperty("user.dir") + "/code/pojo/dto/"+ tableInfo.getEntityName() + "UpdDto.java";
            }
        });

        focList.add(new FileOutConfig("/templates/java/entityPo.java.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {

                return System.getProperty("user.dir") + "/code/pojo/po/"+ tableInfo.getEntityName() + "Po.java";
            }
        });

        /*focList.add(new FileOutConfig("/templates/java/entitySaveDto.java.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {

                return System.getProperty("user.dir") + "/code/pojo/dto/"+ tableInfo.getEntityName() + "SaveDto.java";
            }
        });*/

        GeneratorConfig.cfg.setFileOutConfigList(focList);
        GeneratorConfig.mpg.setCfg(GeneratorConfig.cfg);

        // 关闭默认 xml 生成，调整生成 至 根目录
        TemplateConfig tc = new TemplateConfig();
        tc.setXml(null);
        tc.setController("/templates/java/controller.java.vm");
        tc.setService("/templates/java/service.java.vm");
        tc.setServiceImpl("/templates/java/serviceImpl.java.vm");
        tc.setMapper("/templates/java/mapper.java.vm");
        tc.setXml("/templates/java/mapper.xml.vm");
        GeneratorConfig.mpg.setTemplate(tc);

        // 执行生成
        GeneratorConfig.mpg.execute();

    }




}
