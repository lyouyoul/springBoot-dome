package cn.itcast.mapeer;

import cn.itcast.pojo.Produce;
import cn.itcast.pojo.User;
import cn.itcast.utils.MyMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Description: TODO
 * @Auther: LYY
 * @Date: 2018/12/19 20:49
 * @Version: V1.0
 */
public interface ProcuceMapper extends MyMapper<Produce> {

    Produce findProduceById(Integer id);
}
