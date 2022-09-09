import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Streams2 {
    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(10,4,5,6,8,6,345,65,2);
        List<List<Integer>>listEnteros = new ArrayList<>();
        listEnteros.add(integers);
        listEnteros.add(integers);

        /*integers.stream()
                .filter(integer -> integer%2==0)
                .limit(3)
                .map(integer -> integer*integer)
                .forEach(System.out::println);*/

        /*int cont=0;
        for(Integer i : integers){
            if(i%2==0 && cont<3){
                cont++;
                System.out.println(i*i);
            }*/
        //listEnteros.stream()
          //      .forEach(li -> li.forEach(System.out::println));

        List<Integer> colect = listEnteros.stream()
                .flatMap(a -> a.stream())
                .sorted()
                .collect(Collectors.toList());
                colect.forEach(System.out::println);
                //.forEach(System.out::println)


        }

    }
