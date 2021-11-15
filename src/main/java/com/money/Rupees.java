package com.money;

import java.util.Objects;

public class Rupees {
    private int rupeeValue;


    public Rupees(int value) {
        this.rupeeValue = value;
    }

    public Rupees addRupees(Rupees rupees){

        return new Rupees(this.rupeeValue + rupees.rupeeValue);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Rupees rupees = (Rupees) o;
        System.out.println(this.hashCode());
        System.out.println(rupees.hashCode());
        return rupeeValue == rupees.rupeeValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rupeeValue);
    }

}
