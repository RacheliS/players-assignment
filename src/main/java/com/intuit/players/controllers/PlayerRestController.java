package com.intuit.players.controllers;

import com.intuit.players.models.Player;
import com.intuit.players.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/players")
public class PlayerRestController {

    @Autowired
    public PlayerService playerService;

    @GetMapping
    public ResponseEntity<List<Player>> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @GetMapping("/{playerID}")
    public ResponseEntity<Player> getPlayer(@PathVariable String playerID) {
        return playerService.getPlayer(playerID);
    }

}
