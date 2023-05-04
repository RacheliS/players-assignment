package com.intuit.players.controllers;

import com.intuit.players.models.Player;
import com.intuit.players.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/players")
public class PlayerRestController {

    @Autowired
    public PlayerService playerService;

    @GetMapping
    public ResponseEntity<List<Player>> getAllPlayers() {
        return ResponseEntity.status(HttpStatus.OK).body(playerService.getAllPlayers());
    }

    @GetMapping("/{playerID}")
    public ResponseEntity<Player> getPlayer(@PathVariable String playerID) {
        Player player = playerService.getPlayer(playerID);
        if (Objects.nonNull(player)) {
            return ResponseEntity.status(HttpStatus.OK).body(player);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

}
