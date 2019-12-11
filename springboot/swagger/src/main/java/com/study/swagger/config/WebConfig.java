package com.study.swagger.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @ClassName：WebConfig
 * @Description：
 * @Author：ChenCong
 * @Date：Created in 2019/12/11 15:41
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    /**
     * 跨域支持
     *
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowCredentials(true)
                .allowedMethods("GET", "POST", "DELETE", "PUT", "HEAD", "OPTIONS")
                .maxAge(3600 * 24);
    }

    /**
     * 视图控制器配置
     * 重定向根路径跳转到swagger-UI页面
     *
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/", "/swagger-ui.html");
    }

    /**
     * 添加静态资源--过滤swagger-api (开源的在线API文档)
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //过滤swagger
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");

        registry.addResourceHandler("/swagger-resources/**")
                .addResourceLocations("classpath:/META-INF/resources/swagger-resources/");

        registry.addResourceHandler("/swagger/**")
                .addResourceLocations("classpath:/META-INF/resources/swagger*");

        registry.addResourceHandler("/v2/api-docs/**")
                .addResourceLocations("classpath:/META-INF/resources/v2/api-docs/");
    }

    /**
     * 配置消息转换器--这里我用的是alibaba 开源的 fastjson
     * @param converters
     */
    // @Override
    // public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
    //     //1.需要定义一个convert转换消息的对象;
    //     FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
    //     //2.添加fastJson的配置信息，比如：是否要格式化返回的json数据;
    //     FastJsonConfig fastJsonConfig = new FastJsonConfig();
    //     fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat,
    //             SerializerFeature.WriteMapNullValue,
    //             SerializerFeature.WriteNullStringAsEmpty,
    //             SerializerFeature.DisableCircularReferenceDetect,
    //             SerializerFeature.WriteNullListAsEmpty,
    //             SerializerFeature.WriteDateUseDateFormat);
    //     //3处理中文乱码问题
    //     List<MediaType> fastMediaTypes = new ArrayList<>();
    //     fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
    //     //4.在convert中添加配置信息.
    //     fastJsonHttpMessageConverter.setSupportedMediaTypes(fastMediaTypes);
    //     fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
    //     //5.将convert添加到converters当中.
    //     converters.add(fastJsonHttpMessageConverter);
    // }
}

