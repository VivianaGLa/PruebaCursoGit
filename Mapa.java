package viviana;
import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mapa {
    public static void main(String[] args) {
        Map<String, String> color = new HashMap<>();
        color.put("red", "uno");
        color.put("blue", "dos");
        color.put("green", "tres");
        color.put("black", "cuatro");
        color.put("yellow", "cinco");


        //Punto de entrada
        /*Stream<Object> opt = color.entrySet().stream()
                .filter(e ->"blue".equals(e.getValue()))
                .map(Map.Entry::getKey);
                opt.forEach(System.out::println);*/


       List<String> colors = color.entrySet().stream()
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        colors.forEach(System.out::println);

        List<Nombre> nombreCompleto = new ArrayList<>();
        nombreCompleto.add(new Nombre("Viviana", "Garcia"));
        nombreCompleto.add(new Nombre("Gerardo","Espinosa"));
        nombreCompleto.add(new Nombre("Vivian", "Garcia"));

        Map<String, String> mapNombre = nombreCompleto.stream()

                .collect(Collectors.toMap(Nombre::getNombre, Nombre::getApellido));
        System.out.println(mapNombre);

    }
}
