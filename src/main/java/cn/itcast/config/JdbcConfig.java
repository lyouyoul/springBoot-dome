package cn.itcast.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author: zhl
 * @Date: Createdtime 2018/12/12 20:52
 * @Description:  老方法连接数据库
 */

@Configuration  //Configuration可理解为用spring的时候xml里面的<beans>标签
//@PropertySource("classpath:application.properties") //加载资源
//@EnableConfigurationProperties(JdbcProperties.class)  //使用配置属性
public class JdbcConfig {

    /*@Value("${jdbc.url}")
    String url;
    @Value("${jdbc.driverClassName}")
    String driverClassName;
    @Value("${jdbc.username}")
    String username;
    @Value("${jdbc.password}")
    String password;*/
   /* @Autowired
    JdbcProperties jdbcProperties;

    public  JdbcConfig(JdbcProperties jdbcProperties){
        this.jdbcProperties=jdbcProperties;
    }*/

    /*@Bean
    public DataSource dataSource(JdbcProperties prop){
        DruidDataSource druidDataSource= new DruidDataSource();
        druidDataSource.setDriverClassName(prop.getDriverClassName());
        druidDataSource.setUrl(prop.getUrl());
        druidDataSource.setUsername(prop.getUsername());
        druidDataSource.setPassword(prop.getPassword());
        return druidDataSource;
    }*/

    //@Bean
    //@ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource() {
        return new DruidDataSource();
    }
}
