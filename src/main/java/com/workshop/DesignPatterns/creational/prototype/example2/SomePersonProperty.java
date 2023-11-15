package com.workshop.DesignPatterns.creational.prototype.example2;

import lombok.Getter;

@Getter
public class SomePersonProperty {

    private String propretyName;

    public SomePersonProperty(String propretyName) {
        this.propretyName = propretyName;
    }

    public SomePersonProperty(SomePersonProperty otherProperty) {
        this.propretyName = otherProperty.propretyName;
    }

}
