package com.JwtJpa.Authentication.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JwtJpa.Authentication.Model.UserModel;

@Repository
public interface UserModelRepositry extends JpaRepository<UserModel, Integer> {
    public Optional<UserModel> findByUserName(String username);
}
