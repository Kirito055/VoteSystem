package com.ad.dao;

import com.ad.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleDao extends CrudRepository<Role, Integer> {
    
    Role findByName(String name);
}
