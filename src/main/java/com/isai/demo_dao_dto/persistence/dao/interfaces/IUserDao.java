package com.isai.demo_dao_dto.persistence.dao.interfaces;

import java.util.List;
import java.util.Optional;

import com.isai.demo_dao_dto.persistence.entity.UserEntity;

public interface IUserDao {

    List<UserEntity> listUsers();

    Optional<UserEntity> getUserById(Long id);

    void createUser(UserEntity userEntity);

    void updateUser(UserEntity userEntity);

    void deleteUser(UserEntity userEntity);
}
