package com.example.foooball_app.service;

import com.example.foooball_app.entity.Player;
import com.example.foooball_app.repository.PlayerRepository;
import com.example.foooball_app.request.PlayerCreateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public Player createPlayerService(PlayerCreateRequest req){
        Player player = new Player();
        player.setPlayerName(req.getPlayerName());
        player.setTeam(req.getTeam());
        player.setNationality(req.getNationality());
        player.setPosition(req.getPosition());
        player.setDateOfBirth(req.getDateOfBirth());

        return playerRepository.save(player);
    }
}
