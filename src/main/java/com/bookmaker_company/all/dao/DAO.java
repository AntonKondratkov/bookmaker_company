package com.bookmaker_company.all.dao;

import java.util.List;
import java.util.UUID;

public interface DAO<Entity> {
    List<Entity> getAll();
    Entity getById(UUID id);
    void delete(UUID id);
    void create(Entity entity);
    void update(Entity entity);
}
