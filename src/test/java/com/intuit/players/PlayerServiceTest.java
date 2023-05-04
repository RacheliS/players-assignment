package com.intuit.players;

import com.intuit.players.models.Player;
import com.intuit.players.repositoreis.PlayerRepository;
import com.intuit.players.services.PlayerServiceImpl;


import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class PlayerServiceTest {

    @Mock
    private PlayerRepository playerRepository;

    @InjectMocks
    private PlayerServiceImpl playerService;

    private final Player player1 = Player.builder().playerID("sddfc3s").birthYear("1981").birthMonth("10").build();
    private final Player player2 = Player.builder().playerID("aardsda01").birthYear("1983").build();

    @Test
    public void testGetAllPlayers() {
        List<Player> expectedPlayers = List.of(player1, player2);
        Mockito.when(playerRepository.findAll()).thenReturn(expectedPlayers);
        List<Player> actualPlayers = playerService.getAllPlayers();
        assertEquals(expectedPlayers, actualPlayers);
    }

    @Test
    public void testGetPlayer() {
        Mockito.when(playerRepository.findById(player1.getPlayerID())).thenReturn(Optional.of(player1));
        Player actualPlayer = playerService.getPlayer(player1.getPlayerID());
        assertEquals(player1, actualPlayer);
    }
}
