package com.yyx.mapper;

import com.yyx.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//这个注解表示了这是一个Mybatis的mapper类
@Mapper
//被Spring整合,表示这个类是持久层
@Repository
public interface UserMapper {
    List<User> queryUserList();
    User queryUserById(int id);
    int addUser(User user);
    int updUser(User user);
    int delUser(int id);
}
