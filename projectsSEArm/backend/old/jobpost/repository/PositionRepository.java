package com.cpe.backend.jobpost.repository;

import com.cpe.backend.jobpost.entity.Position;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface PositionRepository extends JpaRepository<Position, Long> {
	Position findById(long id);
}