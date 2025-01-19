package com.srpingcore.jpa;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Entity
@Data
public class gymAdmin implements JpaRepository<GymMember, Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int admin_id;
    private String name;
    private String email;
    private String role;
    private int phone_number;
    private Timestamp last_login;

    @Override
    public void flush() {

    }

    @Override
    public <S extends GymMember> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends GymMember> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<GymMember> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public GymMember getOne(Long aLong) {
        return null;
    }

    @Override
    public GymMember getById(Long aLong) {
        return null;
    }

    @Override
    public GymMember getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends GymMember> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends GymMember> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends GymMember> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends GymMember> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends GymMember> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends GymMember> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends GymMember, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends GymMember> S save(S entity) {
        return null;
    }

    @Override
    public <S extends GymMember> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<GymMember> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<GymMember> findAll() {
        return List.of();
    }

    @Override
    public List<GymMember> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(GymMember entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends GymMember> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<GymMember> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<GymMember> findAll(Pageable pageable) {
        return null;
    }
}
