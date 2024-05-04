package com.minji.crud.board;

import com.minji.crud.board.model.GetBoardRes;
import com.minji.crud.board.model.PostBoardReq;
import com.minji.crud.board.model.PutBoardReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper mapper;

    public int postBoard1 (PostBoardReq param) {
        return mapper.postBoard1(param);
    }

    public int postBoard2 (PostBoardReq param) {
        return mapper.postBoard1(param);
    }

    public GetBoardRes getBoardOne (long boardId) {
        return mapper.getBoardOne(boardId);
    }

    public List<GetBoardRes> getBoardList () {
        return mapper.getBoardList();
    }

    public int putBoard(PutBoardReq param) {
        return mapper.putBoard(param);
    }
}
