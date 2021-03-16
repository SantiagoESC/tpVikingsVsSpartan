package Models;

import Interface.Orinar;

public abstract class Human implements Orinar {
    //region Properties
    protected String Nombre;
    protected Integer Edad;
    protected Integer Peso;
    //endregion

    //Region Properties Implements
    private  Orinar orinar;
    //endregion
    //region Constructor

    public Human(String nombre, Integer edad, Integer peso) {
        Nombre = nombre;
        Edad = edad;
        Peso = peso;
    }

    //endregion

    //region Methods

    //endregion
}
