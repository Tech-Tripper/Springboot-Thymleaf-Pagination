package com.codeflix.springbootCRUD.repository;

import com.codeflix.springbootCRUD.domain_Model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}

