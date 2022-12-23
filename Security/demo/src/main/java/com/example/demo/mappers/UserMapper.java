package com.example.demo.mappers;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

  UserDto userToDto(User user);
}
