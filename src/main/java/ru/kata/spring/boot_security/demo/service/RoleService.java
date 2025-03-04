package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    List<Role> getRoles();

    Optional<Role> findById(Long id);

    void save(Role role);

    Role findByName(String name);

    List<Role> findAllRoleIds(List<Long> roleIds);
}
