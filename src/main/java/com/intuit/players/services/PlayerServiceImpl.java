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

    public ResponseEntity<List<Player>> getAllPlayers() {
        List<Player> allPlayers = playerRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(allPlayers);
    }

    public ResponseEntity<Player> getPlayer(String playerID) {
        Optional<Player> player = playerRepository.findById(playerID);
        return player.map(value -> ResponseEntity.status(HttpStatus.OK).body(value)).orElseGet(()
                -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

}
