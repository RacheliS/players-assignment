package com.intuit.players.services;

import com.intuit.players.models.Player;
import com.intuit.players.repositoreis.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    public PlayerRepository playerRepository;

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Player getPlayer(String playerID) {
        Optional<Player> byId = playerRepository.findById(playerID);
        return byId.orElse(null);
    }

}
