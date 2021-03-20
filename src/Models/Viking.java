package Models;

import Implements.ToPeeVikingImpl;
import Interface.ToPee;

import java.util.Objects;

public class Viking extends Human{

    //region Properties
    private Integer ProfessionalDrinker;
    private Integer ToleranceNormal;
    //endregion

    //region Constructor
    public Viking(String name, Integer age, Integer weight, Integer dni, Integer professionalDrinker, Integer toleranceNormal, ToPeeVikingImpl toPeeViking) {
        super(name, age, weight,dni,toPeeViking);
        this.ProfessionalDrinker = professionalDrinker;
        this.ToleranceNormal = toleranceNormal;
    }
    //endregion

    //region Methods

    @Override
    public String toString() {
        return "Viking{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Weight=" + Weight +
                ", Dni=" + Dni +
                ", ProfessionalDrinker=" + ProfessionalDrinker +
                ", ToleranceNormal=" + ToleranceNormal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Viking viking = (Viking) o;
        return Objects.equals(ProfessionalDrinker, viking.ProfessionalDrinker) && Objects.equals(ToleranceNormal, viking.ToleranceNormal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ProfessionalDrinker, ToleranceNormal);
    }

    //endregion

    //region Getters && Setters

    public Integer getProfessionalDrinker() {
        return ProfessionalDrinker;
    }

    public void setProfessionalDrinker(Integer professionalDrinker) {
        ProfessionalDrinker = professionalDrinker;
    }

    public Integer getToleranceNormal() {
        return ToleranceNormal;
    }

    public void setToleranceNormal(Integer toleranceNormal) {
        ToleranceNormal = toleranceNormal;
    }

    //endregion
}
