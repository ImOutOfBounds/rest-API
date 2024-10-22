package com.backspace.backspace_noob.Dto;

import com.backspace.backspace_noob.Enum.LiteraryGenreEnum;
import com.backspace.backspace_noob.Enum.StarRatingEnum;

public class BookInfoDto {

    private Long id;
    private String name;
    private StarRatingEnum stars;
    private String summary;
    private String impressions;
    private LiteraryGenreEnum literaryGenre;

    BookInfoDto(){};

    BookInfoDto(Long id, String name, StarRatingEnum stars, String summary, String impressions, LiteraryGenreEnum literaryGenre){
        this.id = id;
        this.name = name;
        this.stars = stars;
        this.summary = summary;
        this.impressions = impressions;
        this.literaryGenre = literaryGenre;
    }

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    public StarRatingEnum getStars(){
        return stars;
    }
    public String getSummary(){
        return summary;
    }
    public String getImpressions(){
        return impressions;
    }

    public LiteraryGenreEnum getLiteraryGenre(){
        return literaryGenre;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setStars(StarRatingEnum stars){
        this.stars = stars;
    }
    public void setSummary(String summary){
        this.summary = summary;
    }
    public void setImpressions(String impressions){
        this.impressions = impressions;
    }

    public void setLiteraryGenre(LiteraryGenreEnum literaryGenre){
        this.literaryGenre = literaryGenre;
    }


}
