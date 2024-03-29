
package com.yoprogramo.portfolioBack.security.repository;

import com.yoprogramo.portfolioBack.security.entity.Rol;
import com.yoprogramo.portfolioBack.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRRol extends JpaRepository<Rol, Long>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
