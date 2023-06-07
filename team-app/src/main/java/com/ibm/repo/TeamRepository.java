package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Integer> {

}
