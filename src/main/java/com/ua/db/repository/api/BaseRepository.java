package com.ua.db.repository.api;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends CrudRepository {

    /**
     *
     * @param id
     * @return
     */
    T findById(ID id);
}
