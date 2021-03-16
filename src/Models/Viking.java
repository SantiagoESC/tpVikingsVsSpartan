package Models;

import Interface.Orinar;

public class Viking extends Human{

    //region Properties
    private Integer BebedorProfesional;
    //endregion
    //region Properties Implements
    private Orinar orinar;
    //endregion

    //region Constructor
    public Viking(String nombre, Integer edad, Integer peso, Integer bebedorProfesional) {
        super(nombre, edad, peso);
        this.BebedorProfesional = bebedorProfesional;
    }
    //endregion

    //region Methods
    public void Orinar(){
        orinar.Orinar();
    }
    //endregion
}
