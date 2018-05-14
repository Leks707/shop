package com.ua.db.repository;

import com.ua.db.entity.User;
import com.ua.db.mapper.UserMapper;
import com.ua.db.repository.api.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * @autor Oleksii_Shylo
 */
@Repository
public class UserRepository implements IUserRepository {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;
    @Autowired
    private RowMapper<User> userMapper;

    @Override
    public User save(User entity) {
        SqlParameterSource parameterSource = new BeanPropertySqlParameterSource(entity);
        return null;
    }

    @Override
    public User findOne(long id) {
        return null;//jdbcTemplate.query();
    }

    @Override
    public void delete(long id) {

    }
}
