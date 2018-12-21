package cn.itcast.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @Author: zhl
 * @Date: Createdtime 2018/12/12 21:45
 * @Description:
 */
//@ConfigurationProperties(prefix = "jdbc")
@Data
public class JdbcProperties {
    String url;
    String driverClassName;
    String username;
    String password;
    User user;

    class User{
        String name;
        Integer age;
        List<String> language;

    }
}
