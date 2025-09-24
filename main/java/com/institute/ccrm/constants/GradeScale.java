package com.institute.ccrm.constants;

/**
 * Enum representing standard grade letters and their grade points.
 */
public enum GradeScale {
    A_PLUS("A+", 4.0),
    A("A", 4.0),
    A_MINUS("A-", 3.7),
    B_PLUS("B+", 3.3),
    B("B", 3.0),
    B_MINUS("B-", 2.7),
    C_PLUS("C+", 2.3),
    C("C", 2.0),
    C_MINUS("C-", 1.7),
    D_PLUS("D+", 1.3),
    D("D", 1.0),
    F("F", 0.0);

    private final String letter;
    private final double point;

    GradeScale(String letter, double point) {
        this.letter = letter;
        this.point = point;
    }

    public String getLetter() {
        return letter;
    }

    public double getPoint() {
        return point;
    }

    /**
     * Looks up GradeScale enum by grade letter.
     */
    public static GradeScale fromLetter(String gradeLetter) {
        for (GradeScale gs : values()) {
            if (gs.letter.equalsIgnoreCase(gradeLetter)) {
                return gs;
            }
        }
        return F;
    }
}
