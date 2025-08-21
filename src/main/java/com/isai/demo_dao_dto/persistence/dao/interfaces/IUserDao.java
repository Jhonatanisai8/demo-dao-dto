package com.isai.demo_dao_dto.persistence.dao.interfaces;

import java.util.List;
import java.util.Optional;

import com.isai.demo_dao_dto.persistence.entity.UserEntity;

public interface IUserDao {

    List<UserEntity> listUsers();

    Optional<UserEntity> getUserById(Long id);

    UserEntity createUser(UserEntity userEntity);

    UserEntity updateUser(UserEntity userEntity);

    UserEntity deleteUser(UserEntity userEntity);
}
