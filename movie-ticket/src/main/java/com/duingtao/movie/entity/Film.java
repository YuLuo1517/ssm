package com.duingtao.movie.entity;

import java.io.Serializable;

/**
 * create table t_film (
 * id  bigint  unsigned not null primary  key auto_increment  comment '主键',
 * <p>
 * film_id varchar(32) not null default '' comment '唯一标识',
 * <p>
 * name varchar(40) not null default  ''  comment '电视名称',
 * <p>
 * director varchar(30) not null default  ''  comment '导演',
 * <p>
 * player varchar(20) not null default  '' comment '主演',
 * <p>
 * type varchar(50) not null default ''  comment '电影类型',
 * <p>
 * status tinyint  not null default 1  comment '电影状态 1 表示 正在热映 2 ，即将上映'
 * <p>
 * country varchar(50) not null default '' comment '城市',
 * <p>
 * length  int unsigned not null  comment '电影时长',
 * <p>
 * summary varchar(200) not null comment '电影摘要',
 * <p>
 * image_path  varchar(200) not null default  '' comment '海报地址',
 * )default charset=utf-8
 */
public class Film implements Serializable {


    private static final long serialVersionUID = -6028979656716411366L;
    // 唯一id
    private Long id;

    // 唯一业务主键
    private String filmId;

    // 电影名
    private String name;

    // 影片国家
    private String country;

    // 电影的类型
    private String type;
    // 导演
    private String director;

    // 主演
    private String player;

    // 影片的状态
    private Integer status;

    // 影片时长
    private Integer filmLength;

    // 影片摘要
    private String summary;

    // 影片海报
    private String imagePath;


    public Film() {

    }

    public Film(Long id, String filmId, String name, String country, String type, String director, String player, Integer status, Integer filmLength, String summary, String imagePath) {
        this.id = id;
        this.filmId = filmId;
        this.name = name;
        this.country = country;
        this.type = type;
        this.director = director;
        this.player = player;
        this.status = status;
        this.filmLength = filmLength;
        this.summary = summary;
        this.imagePath = imagePath;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFilmLength() {
        return filmLength;
    }

    public void setFilmLength(Integer filmLength) {
        this.filmLength = filmLength;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
