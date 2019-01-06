package com.dhee.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.dhee.entity.UserEntity;

@Mapper
@Component
public interface UserMapper {

	@Select("SELECT * FROM MY_USER")
	List<UserEntity> selectAll();

}
