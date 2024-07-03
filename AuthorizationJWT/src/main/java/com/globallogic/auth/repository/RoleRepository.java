package com.globallogic.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.auth.entity.Role;

public interface RoleRepository extends JpaRepository<Role,String>{

}
