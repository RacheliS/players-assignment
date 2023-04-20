package com.intuit.players.services;

import com.intuit.players.models.Player;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PlayerService {

    ResponseEntity<List<Player>> getAllPlayers();
    ResponseEntity<Player> getPlayer(String playerID);

}
