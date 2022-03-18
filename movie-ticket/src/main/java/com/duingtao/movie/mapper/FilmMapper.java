package com.duingtao.movie.mapper;

import com.duingtao.movie.entity.Film;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmMapper {


    List<Film> queryFilmsList();

}
