package com.duingtao.movie.controller;

import com.duingtao.movie.common.R;
import com.duingtao.movie.service.FilmService;
import com.duingtao.movie.vo.FilmVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class FilmController {


    private final FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }


    /**
     * 返回查询出结果的所有影片
     * @return
     */
    @ResponseBody
    @GetMapping(value = "/film")
    public R<List<FilmVo>> getFilmsList() {
        return R.success(filmService.queryFilmsList());
    }
}
