package com.cpe.backend.registeruser.repository;

import com.cpe.backend.registeruser.entity.Status;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface StatusRepository extends JpaRepository<Status, Long> {
	Status findById(long id);
}