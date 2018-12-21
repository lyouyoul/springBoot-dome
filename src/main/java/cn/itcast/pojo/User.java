package cn.itcast.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;

/**
 * @Description: TODO
 * @Auther: LYY
 * @Date: 2018/12/15 19:21
 * @Version: V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tb_user")
//@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"}) 延时加载 避免com.fasterxml.jackson.databind.exc.InvalidDefinitionException 异常
public class User  implements Serializable{

    private static final long serialVersionUID = 890205170610769712L;
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;

    private String userName;

    private String password;

    private String name;

    private Integer age;

    private Integer sex;

    private Date birthday;

    private Date created;

    private  String note;

    private Date updateTime;

    private Produce produce;

    private String sds;

    @Transient   //瞬时
    private String test;

}
