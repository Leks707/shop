package com.ua.db.repository.api;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends Repository<T, ID> {

    /**
     *
     * @param id
     * @return
     */
    T findById(ID id);
    
    T saveOrModify(T t);
}
