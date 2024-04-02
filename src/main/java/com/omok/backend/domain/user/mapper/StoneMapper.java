package com.omok.backend.domain.user.mapper;

import com.omok.backend.domain.user.model.StoneRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface StoneMapper {
    int insertStone(StoneRequest stoneRequest);
}
