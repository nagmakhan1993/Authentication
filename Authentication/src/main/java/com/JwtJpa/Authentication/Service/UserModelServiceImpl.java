package com.JwtJpa.Authentication.Service;

import com.JwtJpa.Authentication.Model.UserModel;
import com.JwtJpa.Authentication.Repository.UserModelRepositry;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class UserModelServiceImpl implements UserModelRepositry {

    @Override
    public Optional<UserModel> findByUserName(String username) {
        return Optional.empty();
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends UserModel> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends UserModel> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<UserModel> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public UserModel getOne(Integer integer) {
        return null;
    }

    @Override
    public UserModel getById(Integer integer) {
        return null;
    }

    @Override
    public UserModel getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends UserModel> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends UserModel> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends UserModel> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends UserModel> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends UserModel> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends UserModel> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends UserModel, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends UserModel> S save(S entity) {
        return null;
    }

    @Override
    public <S extends UserModel> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<UserModel> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<UserModel> findAll() {
        return null;
    }

    @Override
    public List<UserModel> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(UserModel entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends UserModel> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<UserModel> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<UserModel> findAll(Pageable pageable) {
        return null;
    }
}
