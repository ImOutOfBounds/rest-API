package com.backspace.backspace_noob.Enum;

public enum LiteraryGenreEnum {
    FICTION("Ficção"),
    POETRY("Poesias"),
    DRAMA("Drama"),
    ROMANCE("Romance"),
    MYSTERY("Mystery"),
    THRILLER("Ação"),
    FANTASY("Fantasia"),
    SCIENCE("Ciência"),
    HORROR("Horror"),
    HISTORICAL("História"),
    BIOGRAPHY("Biografia"),
    AUTOBIOGRAPHY("Auto Biografia"),
    MANGA("Mangá");

    private final String value;

    LiteraryGenreEnum(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static LiteraryGenreEnum fromValue(String value) {
        for (LiteraryGenreEnum genre : LiteraryGenreEnum.values()) {
            if (genre.getValue().equals(value)) {
                return genre;
            }
        }
        throw new IllegalArgumentException("Literary Genre Not Valid: " + value);
    }
}
