package org.springframework.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.mybatis.entity.User;

import java.util.List;

public interface UserMapper {
	@Select("select * from user where id = #{id}")
	List<User> select(@Param("id") String id);
}
