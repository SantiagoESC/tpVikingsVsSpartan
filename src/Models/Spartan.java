package Models;

import Implements.ToPeeSpartanImpl;
import Interface.ToPee;

import java.util.Objects;

public class Spartan extends Human{

    //region Properties
    private  Integer ExtraTolerance;
    private Integer DrinkerNormal;
    //endregion

    //region Constructor
    public Spartan(String name, Integer age, Integer weight, Integer dni, Integer extraTolerance, Integer drinkerNormal, ToPeeSpartanImpl toPeeSpartan) {
        super(name, age, weight,dni,toPeeSpartan);
        this.ExtraTolerance = extraTolerance;
        this.DrinkerNormal = drinkerNormal;
    }
    //endregion

    //region Methods

    @Override
    public String toString() {
        return "Spartan{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Weight=" + Weight +
                ", Dni=" + Dni +
                ", ExtraTolerance=" + ExtraTolerance +
                ", DrinkerNormal=" + DrinkerNormal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spartan spartan = (Spartan) o;
        return ExtraTolerance.equals(spartan.ExtraTolerance) && DrinkerNormal.equals(spartan.DrinkerNormal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ExtraTolerance, DrinkerNormal);
    }
//endregion

    //region Getters && Setters

    public Integer getExtraTolerance() {
        return ExtraTolerance;
    }

    public void setExtraTolerance(Integer extraTolerance) {
        ExtraTolerance = extraTolerance;
    }

    public Integer getDrinkerNormal() {
        return DrinkerNormal;
    }

    public void setDrinkerNormal(Integer drinkerNormal) {
        DrinkerNormal = drinkerNormal;
    }

    //endregion
}
