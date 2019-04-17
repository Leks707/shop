package com.ua.db.repository.api;

import com.ua.db.entity.User;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @autor Oleksii_Shylo
 */
@NoRepositoryBean
public interface UserRepository extends BaseRepository<User, Long> {

}
