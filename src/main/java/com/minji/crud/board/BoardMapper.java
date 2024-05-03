package com.minji.crud.board;

import com.minji.crud.board.model.PostBoardReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    int postBoard1 (PostBoardReq param);
    int postBoard2 (PostBoardReq param);
}
