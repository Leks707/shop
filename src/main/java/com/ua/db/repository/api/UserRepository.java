package com.ua.db.repository.api;

import com.ua.db.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @autor Oleksii_Shylo
 */
public interface UserRepository extends CrudRepository<User, Long> {

    /**
     *
     * @param firstName
     * @return
     */
    User findByFirstName(String firstName);
}
