package com.backspace.backspace_noob.Enum;

public enum StarRatingEnum {
    ONE_STAR(1),
    TWO_STARS(2),
    THREE_STARS(3),
    FOUR_STARS(4),
    FIVE_STARS(5);

    private final int value;

    StarRatingEnum(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static StarRatingEnum fromValue(Long value) {
        for (StarRatingEnum rating : StarRatingEnum.values()) {
            if (rating.getValue() == value) {
                return rating;
            }
        }
        throw new IllegalArgumentException("Valor de estrelas inválido: " + value);
    }
}
