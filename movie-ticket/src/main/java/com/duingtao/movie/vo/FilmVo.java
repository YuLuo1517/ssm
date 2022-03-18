package com.duingtao.movie.vo;

import java.io.Serializable;

public class FilmVo implements Serializable {
    private String filmId;
    private String name;

    private String imagePath;

    private String director;

    public String getFilmId() {
        return filmId;
    }

    public void setFilmId(String filmId) {
        this.filmId = filmId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public FilmVo(String filmId, String name, String imagePath, String director) {
        this.filmId = filmId;
        this.name = name;
        this.imagePath = imagePath;
        this.director = director;
    }
}
