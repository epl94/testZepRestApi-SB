package com.testZep.testzeprestApisb.repository;

import com.testZep.testzeprestApisb.dto.PlayerDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PlayerRepository {
    private final SqlSessionTemplate sql;
    public int save(PlayerDTO playerDTO) {
        return sql.insert("Player.save", playerDTO);
    }
}
