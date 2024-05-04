package com.minji.crud.board;

import com.minji.crud.board.model.GetBoardRes;
import com.minji.crud.board.model.PostBoardReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    int postBoard1 (PostBoardReq param);
    int postBoard2 (PostBoardReq param);
    GetBoardRes getBoardOne (long boardId);
    List<GetBoardRes> getBoardList ();
}
