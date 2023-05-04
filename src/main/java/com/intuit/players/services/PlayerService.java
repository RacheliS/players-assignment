package com.intuit.players.services;

import com.intuit.players.models.Player;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PlayerService {

    List<Player> getAllPlayers();
    Player getPlayer(String playerID);

}
