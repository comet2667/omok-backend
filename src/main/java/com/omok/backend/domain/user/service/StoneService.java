package com.omok.backend.domain.user.service;

import com.omok.backend.domain.user.mapper.StoneMapper;
import com.omok.backend.domain.user.model.StoneRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoneService {
    @Autowired
    public StoneMapper mapper;

    public int insertStone(StoneRequest stoneRequest) throws Exception {
        return mapper.insertStone(stoneRequest);
    }
}
