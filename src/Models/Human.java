package Models;

import Interface.ToPee;

public abstract class Human implements ToPee {
    //region Properties
    protected String Name;
    protected Integer Age;
    protected Integer Weight;
    protected Integer Dni;
    //endregion

    //region Properties Interface
    private ToPee toPee;
    //endregion

    //region Constructor

    public Human(String name, Integer age, Integer weight, Integer dni,ToPee toPeeImp) {
        Name = name;
        Age = age;
        Weight = weight;
        Dni = dni;
        this.toPee = toPeeImp;
    }

    //endregion

    //region Methods
    public void ToPee(){
        toPee.ToPee();
    }
    //endregion

    //region Getters && Setters

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Integer getWeight() {
        return Weight;
    }

    public void setWeight(Integer weight) {
        Weight = weight;
    }

    public Integer getDni() {
        return Dni;
    }

    public void setDni(Integer dni) {
        Dni = dni;
    }

    public ToPee getToPee() {
        return toPee;
    }

    public void setToPee(ToPee toPee) {
        this.toPee = toPee;
    }
//endregion
}
