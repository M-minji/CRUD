package com.minji.crud.board;

import com.minji.crud.board.model.PostBoardReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
