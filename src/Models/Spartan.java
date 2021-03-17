package Models;

import Interface.ToPee;

public class Spartan extends Human{

    //region Properties
    private  Integer ExtraTolerance;
    private Integer DrinkerNormal;

    private ToPee toPee;
    //endregion

    //region Constructor
    public Spartan(String name, Integer age, Integer weight, Integer dni, Integer extraTolerance, Integer drinkerNormal) {
        super(name, age, weight,dni);
        this.ExtraTolerance = extraTolerance;
        this.DrinkerNormal = drinkerNormal;
    }
    //endregion

    //region Methods
    public void ToPee(){

        toPee.ToPee();
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
