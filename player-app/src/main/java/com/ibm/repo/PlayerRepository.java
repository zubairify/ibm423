package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
