import Implements.ToPeeSpartanImpl;
import Implements.ToPeeSpartanStandUpImp;
import Implements.ToPeeVikingImpl;
import Models.Confrontation;
import Models.Spartan;
import Models.Viking;
import sun.security.krb5.Confounder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] ars){

        //region Vikings
        List<Viking> listVikings = new ArrayList<>();
        listVikings.add(new Viking("Santiago",24,85,39966396,10,5,new ToPeeVikingImpl()));
        listVikings.add(new Viking("Franco",22,69,41001010,12,6,new ToPeeVikingImpl()));
        listVikings.add(new Viking("Agustin",22,55,42845231,8,3,new ToPeeVikingImpl()));

        //endregion

        //region Spartans
        List<Spartan> listSpartan = new ArrayList<>();
        listSpartan.add(new Spartan("Pablo",40,95,36549992,14,9,new ToPeeSpartanImpl()));
        listSpartan.add(new Spartan("German",32,45,45205485,9,5,new ToPeeSpartanImpl()));
        listSpartan.add(new Spartan("Gonzalo",45,78,458711232,10,7,new ToPeeSpartanImpl()));

        //endregion
        //region test

        //Integer totalAge = listVikings.stream().map(f -> f.getAge()).collect(Collectors.summingInt(Integer::intValue));
        //listVikings.forEach(f -> f.ToPee());
        //spartan.ToPee();
        //spartan.setToPee(new ToPeeSpartanStandUpImp());
        //spartan.ToPee();
        //endregion

        Confrontation confrontation = new Confrontation(listSpartan,listVikings);
        confrontation.Confrontation();

        System.exit(1);
    }
}
