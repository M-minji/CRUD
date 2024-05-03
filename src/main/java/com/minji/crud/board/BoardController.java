package com.minji.crud.board;

import com.minji.crud.board.model.PostBoardReq;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("board")
public class BoardController {
    private final BoardService service;

    @PostMapping("post1")
    public int postBoard1 (@RequestBody PostBoardReq param) {
        return service.postBoard1(param);
    }

    @PostMapping("post2")
    public int postBoard2 (@RequestBody PostBoardReq param) {
        return service.postBoard2(param);
    }


}
