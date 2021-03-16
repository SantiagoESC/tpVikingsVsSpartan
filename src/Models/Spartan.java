package Models;

import Interface.Orinar;

public class Spartan extends Human{

    //region Properties
    private  Integer ToleranciaExtra;

    private  Orinar orinar;
    //endregion

    //region Constructor
    public Spartan(String nombre, Integer edad, Integer peso, Integer toleranciaExtra) {
        super(nombre, edad, peso);
        this.ToleranciaExtra = toleranciaExtra;
    }
    //endregion
    //region Methods
    public void Orinar(){
        orinar.Orinar();
    }

    //endregion
}
