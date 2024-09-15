package ru.kata.spring.boot_security.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.Role;

import java.util.Collection;
import java.util.Set;

@Repository
public interface RoleDao extends JpaRepository<Role, Long> {
    Collection<Role> findAllByNameIn(Set<String> roles);
}
