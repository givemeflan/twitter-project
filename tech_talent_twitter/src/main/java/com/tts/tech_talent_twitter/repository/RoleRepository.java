package com.tts.tech_talent_twitter.repository;

import com.tts.tech_talent_twitter.model.Role;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByRole(String role);

}
