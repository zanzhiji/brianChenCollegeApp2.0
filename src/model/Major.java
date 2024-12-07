package model;

import java.io.Serializable;

public enum Major implements Serializable{
    COMPUTER_SCIENCE("CSE"),
    MATH("MAT");

    private String abbr;

    Major(String abbr) {
        this.abbr = abbr;
    }

    public String getAbbreviation() {
        return abbr;
    }
}