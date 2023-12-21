package com.testZep.testzeprestApisb.service;

import com.testZep.testzeprestApisb.dto.PlayerDTO;
import com.testZep.testzeprestApisb.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlayerService {
    private final PlayerRepository playerRepository;
    public int save(PlayerDTO playerDTO) {
        return playerRepository.save(playerDTO);
    }
}
