package com.isai.demo_dao_dto.service.interfaces;

import com.isai.demo_dao_dto.presentacion.dto.UserDto;

import java.util.List;


public interface IUserService {

    List<UserDto> listUsers();

    UserDto getUserById(Long id);

    UserDto createUser(UserDto userDto);

    UserDto updateUser(Long id, UserDto userDto);

    String deleteUser(Long id);
}
    