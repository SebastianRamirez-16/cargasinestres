package com.upc.cargasinestres.Users.repository;

import com.upc.cargasinestres.Users.model.entity.Role;
import com.upc.cargasinestres.Users.model.enums.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
    /**
     * Searchs a role by its name
     * @param name Nombre del rol
     * @return Rol encontrado (si existe)
     */
    Optional<Role> findByName(ERole name);

    /**
     * Verifies if a role exists by its name
     * @param name Nombre del rol
     * @return true si existe, false si no
     */
    boolean existsByName(ERole name);
}
