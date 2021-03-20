package Models;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Confrontation <T extends Human>{

    //region Properties

    private List<Spartan> listSpartan;

    private List<Viking> listViking;

    private List<T> listWinners;
    //endregion

    //region Constructor

    public Confrontation (List<Spartan> listSpartan, List<Viking> listViking){
        this.listSpartan = listSpartan;
        this.listViking = listViking;
    }
    //endregion

    //region Methods

    public void Confrontation()
    {
        if(!this.listSpartan.isEmpty() && !this.listViking.isEmpty()){


            boolean finishBattle = false;
            Scanner sc = new Scanner(System.in);
            int i = 0, dni = 0;

            System.out.println("Bienvenidos al Torneo de Frescas. A continuacion estan los siguientes participantes:\n");

            System.out.println("Ingresa DNI ");
            dni = sc.nextInt();
            if(this.dniIsPair(dni)){
              this.OrderTeamByAge();
            }else {
                this.OrderTeamByWeight();
            }
            System.out.println("\n\n\n La Batalla empieza! \n");

            while (finishBattle == false) {
                Spartan spartan = this.RetrieveRandomSpartan();
                Viking viking = this.RetrieveRandomViking();
                System.out.println(spartan.toString());
                System.out.println(viking.toString());
                int dniLoser = this.Drink(spartan, viking);

                for(Spartan spartanLoser : this.listSpartan){
                    if(spartanLoser.Dni == dniLoser){
                        this.listSpartan.remove(spartanLoser);
                    }
                }
                for(Viking vikingLoser : this.listViking){
                    if(vikingLoser.Dni == dniLoser){
                        this.listViking.remove(vikingLoser);
                    }
                }
                System.out.println("¿Desea continuar la batalla ?");
                i = sc.nextInt();
                finishBattle = i !=0 ? true : false;
            }



        }
    }



    //endregion

    //region Methods utils to Confrontation
    //TODO: Refactor code.
    private Viking RetrieveRandomViking(){
        Random randomGenerator = new Random();
        int index = randomGenerator.nextInt(this.listViking.size());
        return this.listViking.get(index);
    }

    private Spartan RetrieveRandomSpartan(){
        Random randomGenerator = new Random();
        int index = randomGenerator.nextInt(this.listSpartan.size());
        return this.listSpartan.get(index);
    }

    private int Drink(Spartan spartan, Viking viking){
        boolean theBattleEnds = false;
        int dniLoser = 0;
        Random generateRandomDrink = new Random();
        while (theBattleEnds == false) {
            int cantBeer = generateRandomDrink.nextInt(10);
            spartan.setExtraTolerance(spartan.getDrinkerNormal() > cantBeer ? spartan.getExtraTolerance() : spartan.getExtraTolerance() - 2);
            viking.setToleranceNormal(viking.getProfessionalDrinker() > cantBeer ? viking.getToleranceNormal() : viking.getToleranceNormal() - 2);

            if (spartan.getExtraTolerance() < 0 && viking.getToleranceNormal() > 0) {
                System.out.println("El espartano " + spartan.getName() + " ha perdido.");
                theBattleEnds = true;
                //this.listWinners.add((T) viking);
                this.listSpartan.remove(spartan);
                dniLoser = spartan.Dni;
            }
            if (viking.getToleranceNormal() < 0 && spartan.getExtraTolerance() > 0) {
                System.out.println("El vikingo " + viking.getName() + " ha perdido.");
                theBattleEnds = true;
                //this.listWinners.add((T) spartan);
                this.listViking.remove(viking);
                dniLoser = viking.Dni;

            }
        }
        return dniLoser;

    }

    private boolean dniIsPair(int dni){
        return dni/2 == 0 ? false : true;
    }

    private void OrderTeamByAge(){
        List<Viking> listVikingsOrderByAge = listViking.stream()
                .sorted(Comparator.comparing(Viking::getAge))
                .collect(Collectors.toList());
        System.out.println("\nEl equipo de los Vikingos ordenados por edad: \n" +listVikingsOrderByAge.toString());
        List<Spartan> listSpartanOrderByAge = listSpartan.stream()
                .sorted(Comparator.comparing(Spartan::getAge))
                .collect(Collectors.toList());
        System.out.println("\nEl equipo de los Espartanos ordenados por edad: \n" +listSpartanOrderByAge.toString());
    }

    private  void OrderTeamByWeight(){
        List<Viking> listVikingsOrderByWeight = listViking.stream()
                .sorted(Comparator.comparing(Viking::getWeight))
                .collect(Collectors.toList());
        System.out.println("\nEl equipo de los Vikingos ordenados por peso: \n" +listVikingsOrderByWeight.toString());
        List<Spartan> listSpartanOrderByWeight = listSpartan.stream()
                .sorted(Comparator.comparing(Spartan::getWeight))
                .collect(Collectors.toList());
        System.out.println("\nEl equipo de los Espartanos ordenados por peso: \n" +listSpartanOrderByWeight.toString());
    }

    private void SearchAndRemoveLoser(int dniLoser) {

    }
    //endregion
}
