import Models.Viking;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] ars){

        List<Viking> listVikings = new ArrayList<>();

        listVikings.add(new Viking("Santiago",24,85,39966396,10,5));
        listVikings.add(new Viking("Franco",22,69,41001010,12,6));
        Integer totalAge = listVikings.stream().map(f -> f.getAge()).collect(Collectors.summingInt(Integer::intValue));

        System.out.println(totalAge);
        System.out.println("hola");

        System.exit(1);
    }
}
