package com.isai.demo_dao_dto.service.impl;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.isai.demo_dao_dto.service.interfaces.IUserService;

import lombok.RequiredArgsConstructor;

import com.isai.demo_dao_dto.persistence.dao.interfaces.IUserDao;
import com.isai.demo_dao_dto.persistence.entity.UserEntity;
import com.isai.demo_dao_dto.presentacion.dto.UserDto;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {

    private final IUserDao userDao;

    @Override
    public List<UserDto> listUsers() {
        ModelMapper modelMapper = new ModelMapper();
        // convertimos la lista de entities a dtos
        return userDao.listUsers()
                .stream()
                .map(entity -> modelMapper.map(entity, UserDto.class))
                .toList();
    }

    @Override
    public UserDto getUserById(Long id) {
        Optional<UserEntity> userEntity = userDao.getUserById(id);
        if (userEntity.isPresent()) {
            ModelMapper modelMapper = new ModelMapper();
            UserEntity usserCurrent = userEntity.get();
            return modelMapper.map(usserCurrent,
                    UserDto.class);
        } else {
            return new UserDto();
        }

    }

    @Override
    public UserDto createUser(UserDto userDto) {
        try {
            ModelMapper modelMapper = new ModelMapper();
            UserEntity userEntity = modelMapper.map(userDto,
                    UserEntity.class);
            userDao.createUser(userEntity);
            return userDto;
        } catch (Exception e) {
            throw new UnsupportedOperationException("Error al guardar un usuario");
        }
    }

    @Override
    public UserDto updateUser(Long id, UserDto userDto) {
        Optional<UserEntity> userEntity = userDao.getUserById(id);
        if (userEntity.isPresent()) {
            UserEntity userCurrent = userEntity.get();
            userCurrent.setFirstName(userDto.getFirstName());
            userCurrent.setLastName(userDto.getLastName());
            userCurrent.setEmail(userDto.getEmail());
            userCurrent.setAge(userDto.getAge());
            userDao.updateUser(userCurrent);
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(userCurrent,
                    UserDto.class);
        } else {
            throw new IllegalArgumentException("Error al actualizar un usuario");
        }
    }

    @Override
    public String deleteUser(Long id) {
        Optional<UserEntity> userEntity = userDao.getUserById(id);
        if (userEntity.isPresent()) {
            UserEntity userCurrent = userEntity.get();
            userDao.deleteUser(userCurrent);
            return "Usuario Eliminado correctamente";
        } else {
            throw new IllegalArgumentException("Error al eliminar un usuario");
        }
    }

}
