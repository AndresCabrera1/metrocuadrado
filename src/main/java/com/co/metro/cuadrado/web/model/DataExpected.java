package com.co.metro.cuadrado.web.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DataExpected {

    MONTHLY_INCOME("5000000"),
    INCOME_BANK("114474391"),
    MINIMUM_DOWN_PAYMENT("49060453");

    private String value;
}
