package com.minji.crud.board;

import com.minji.crud.board.model.GetBoardRes;
import com.minji.crud.board.model.PostBoardReq;
import com.minji.crud.board.model.PutBoardReq;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("{boardId}")
    public GetBoardRes getBoardOne (@PathVariable long boardId) {
        return service.getBoardOne(boardId);
    }

    @GetMapping
    public List<GetBoardRes> getBoardList (){
        return service.getBoardList();
    }

    @PutMapping
    public int putBoard(@RequestBody PutBoardReq param) {
        return service.putBoard(param);
    }
    @DeleteMapping(name = "board_id")
    public int delBoard(@RequestParam long boardId) {
        return service.delBoard(boardId);
    }


}
