package com.isai.demo_dao_dto.persistence.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.isai.demo_dao_dto.persistence.dao.interfaces.IUserDao;
import com.isai.demo_dao_dto.persistence.entity.UserEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class UserDaoImpl implements IUserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void createUser(UserEntity userEntity) {
        this.entityManager.persist(userEntity);
        // nos aseguramos de que se guarde en la base de datos
        this.entityManager.flush();
    }

    @Override
    public void deleteUser(UserEntity userEntity) {
        this.entityManager.remove(userEntity);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<UserEntity> getUserById(Long id) {
        return Optional.ofNullable(this.entityManager
                .find(UserEntity.class, id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<UserEntity> listUsers() {
        return this.entityManager
                .createQuery("SELECT u FROM UserEntity u", UserEntity.class)
                .getResultList();
    }

    @Override
    public void updateUser(UserEntity userEntity) {
        this.entityManager.merge(userEntity);
    }

}
