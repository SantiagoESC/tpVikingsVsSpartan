package Models;

import Interface.ToPee;

public class Viking extends Human{

    //region Properties
    private Integer ProfessionalDrinker;
    private Integer ToleranceNormal;
    //endregion

    //region Properties Implements
    private ToPee toPee;
    //endregion

    //region Constructor
    public Viking(String name, Integer age, Integer weight, Integer dni, Integer professionalDrinker, Integer toleranceNormal) {
        super(name, age, weight,dni);
        this.ProfessionalDrinker = professionalDrinker;
        this.ToleranceNormal = toleranceNormal;
    }
    //endregion

    //region Methods
    public void ToPee(){
        toPee.ToPee();
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
