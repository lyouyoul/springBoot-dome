package cn.itcast.config;/**
 * @Author: zhl
 * @Date: Createdtime 2018/12/13 22:44
 * @Description:
 */

import cn.itcast.interceptor.MyInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description: TODO springMVC 高级配置 之拦截器
 * @Auther: LYY
 * @Date: 2018/12/13 22:44
 * @Version: V1.0
 */


@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加拦截器并设置拦截路径
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
    }
}
