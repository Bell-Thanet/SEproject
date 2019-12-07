package com.cpe.backend.registeruser.repository;

import com.cpe.backend.registeruser.entity.Return;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.repository.query.Param;
import java.util.Collection;

@CrossOrigin(origins = "http://localhost:8080")
@RepositoryRestResource
public interface ReturnRepository extends JpaRepository<Return, Long> {
    Return findById(long id);
    // @Query( value = "SELECT * FROM User z WHERE z.email = :email and z.password = :password",nativeQuery = true)
    // Collection<Return> findCheck(@Param("email") String email,@Param("password") String password);
}