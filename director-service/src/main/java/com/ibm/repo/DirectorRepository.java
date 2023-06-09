package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.entity.Director;

public interface DirectorRepository extends JpaRepository<Director, Integer> {

}
