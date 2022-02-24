import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class Test {

    public static void main(String[] args) {
        FastAutoGenerator fastAutoGenerator =  FastAutoGenerator.create("jdbc:mysql://rm-bp18wnkm8169vxd3cbo.mysql.rds.aliyuncs.com:3306/zrm_blog?characterEncoding=UTF-8&autoReconnect=true","zrmblog","zlj123456!");
        fastAutoGenerator.globalConfig(builder -> {
                    builder.author("zalrjcher") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D:\\workspace\\blog\\zorom-core\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.zorom.core") // 设置父包名
//                            .moduleName("blog") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "D:\\workspace\\blog\\zorom-core\\src\\main\\resources\\mappers")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("zrm_user_info") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
