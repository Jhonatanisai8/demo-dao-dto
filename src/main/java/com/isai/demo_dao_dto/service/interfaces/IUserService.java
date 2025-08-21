package com.isai.demo_dao_dto.service.interfaces;

import java.util.List;

import com.isai.demo_dao_dto.dto.UserDto;

public interface IUserService {

    List<UserDto> listUsers();

    UserDto getUserById(Long id);

    UserDto createUser(UserDto userDto);

    UserDto updateUser(Long id, UserDto userDto);

    void deleteUser(Long id);
}
