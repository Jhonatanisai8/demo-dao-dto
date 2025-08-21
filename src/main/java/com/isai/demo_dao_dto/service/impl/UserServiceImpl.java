package com.isai.demo_dao_dto.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.isai.demo_dao_dto.service.interfaces.IUserService;
import com.isai.demo_dao_dto.presentacion.dto.UserDto;

@Service
public class UserServiceImpl implements IUserService {

    @Override
    public List<UserDto> listUsers() {
        throw new UnsupportedOperationException("Unimplemented method 'listUsers'");
    }

    @Override
    public UserDto getUserById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'getUserById'");
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        throw new UnsupportedOperationException("Unimplemented method 'createUser'");
    }

    @Override
    public UserDto updateUser(Long id, UserDto userDto) {
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    @Override
    public void deleteUser(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

}
