package com.company.contactbase.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Unit implements EnumClass<Integer> {

    Day(10),
    Week(20),
    Month(30),
    Year(40);

    private Integer id;

    Unit(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Unit fromId(Integer id) {
        for (Unit at : Unit.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}