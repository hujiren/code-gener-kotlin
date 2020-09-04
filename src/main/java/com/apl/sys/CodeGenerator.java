package com.apl.sys;


import com.apl.sys.generator.Generator;
import com.apl.sys.generator.JavaGenerator;
import com.apl.sys.generator.KotlinGenerator;

public class CodeGenerator {


    /**
     * <p>
     * MySQL 生成演示
     * </p>
     */
    public static void main(String[] args) {

        //Generator generator = new KotlinGenerator();
        Generator generator = new JavaGenerator();

        generator.genCode();

    }



}
