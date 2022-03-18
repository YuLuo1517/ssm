package com.duingtao.movie.service;

import com.duingtao.movie.entity.Film;
import com.duingtao.movie.vo.FilmVo;

import java.util.List;


public interface FilmService {

    List<FilmVo>  queryFilmsList();
}
