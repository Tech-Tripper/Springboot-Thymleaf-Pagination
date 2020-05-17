package com.codeflix.springbootCRUD.service;

import com.codeflix.springbootCRUD.domain_Model.Player;
import com.codeflix.springbootCRUD.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }
}
