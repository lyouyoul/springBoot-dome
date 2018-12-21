package cn.itcast.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Description: TODO
 * @Auther: LYY
 * @Date: 2018/12/19 20:45
 * @Version: V1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "produce")
//@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"}) 延时加载 避免com.fasterxml.jackson.databind.exc.InvalidDefinitionException 异常
public class Produce implements Serializable {
    private static final long serialVersionUID = -4466891110269458770L;
    @Id
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "pro_name")
    private String proName;

    private Integer score;
}
