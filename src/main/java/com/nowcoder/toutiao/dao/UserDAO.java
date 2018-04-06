package com.nowcoder.toutiao.dao;

import com.nowcoder.toutiao.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by kongxy on 2018/4/6 0006.
 */
@Mapper
public interface UserDAO {
    String TABLE_NAME = "user";
    String INSET_FIELDS = "name,password,salt,head_url";
    String SELECT_FIELDS = "id,name,password,salt,head_url";

    @Insert({"insert into ", TABLE_NAME,"(",INSET_FIELDS,") values (#{name},#{password},#{salt},#{headUrl})"})
    int addUser(User user);

    @Select({"select " ,SELECT_FIELDS ,"from ",TABLE_NAME,"where id = #{id}"})
    User selectById(int id);
}
