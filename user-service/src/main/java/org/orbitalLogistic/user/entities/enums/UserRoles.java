package org.orbitalLogistic.user.entities.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum UserRoles {
    USER, OPERATOR, SUPPORT, ADMIN;

    @JsonCreator
    public static UserRoles from(String value) {
        if (value == null ) return null;
        String s = value.trim().toUpperCase();
        for (UserRoles t : values()) {
            if (t.name().equals(s)) return t;
        }
        throw new IllegalArgumentException("Unknown UserRoles value: '" + value + "'");
    }

    @JsonValue
    public String toValue() {return name();}
}
