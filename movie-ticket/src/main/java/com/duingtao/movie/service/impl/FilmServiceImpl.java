package com.duingtao.movie.service.impl;

import com.duingtao.movie.entity.Film;
import com.duingtao.movie.mapper.FilmMapper;
import com.duingtao.movie.service.FilmService;
import com.duingtao.movie.vo.FilmVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {


    @Autowired
    private FilmMapper filmMapper;

    /**
     * 查询影片的基本信息，
     *
     * @return
     */
    @Override
    public List<FilmVo> queryFilmsList() {

        List<Film> filmList = filmMapper.queryFilmsList();

        List<FilmVo> voList = new ArrayList<>();

        for (Film film : filmList) {
            voList.add(new FilmVo(film.getFilmId(), film.getName(),film.getImagePath(),film.getDirector()));
        }
        return voList;
    }
}
