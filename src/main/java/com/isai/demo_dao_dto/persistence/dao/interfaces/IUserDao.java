package com.isai.demo_dao_dto.persistence.dao.interfaces;

import java.util.List;

import com.isai.demo_dao_dto.persistence.entity.UserEntity;

public interface IUserDao {

    List<UserEntity> listUsers();

    UserEntity getUserById(Long id);

    UserEntity createUser(UserEntity userEntity);

    UserEntity updateUser(Long id, UserEntity userEntity);

    void deleteUser(Long id);
}
