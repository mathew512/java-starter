package io.github.mathew512.generics;

import java.util.List;

// Generic repository interface
public interface Repository<T, ID> {
    T findById(ID id);
    List<T> findAll();
    void save(T entity);
    void delete(ID id);
}
