import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Persona persona=new Persona();
        Function<Persona, String> nombre= person -> person.getNombre();
        persona.setNombre("Viviana");
        System.out.println(nombre.apply(persona));

        /*Persona persona = new Persona();
        Function<Persona, String>  func  = Persona -> persona.getNombre();
        persona.setNombre("Alex");
        System.out.println( func.apply(persona));*/


        Function<Integer, Boolean> integerIntegerFunction=a -> {
            Predicate<Integer> evaluar = integer -> integer>50;
            return  evaluar.test(a);
        };
        //System.out.println(integerIntegerFunction.apply(4));

        BiFunction<Integer, String, Boolean> biFunction=(a, b) -> b.length()>a;
        Boolean resultado=biFunction.apply(50, "Hola");
        //System.out.println(resultado);

        //Moises
        BiConsumer<String, String> dobleImp = (texto1, texto2) -> System.out.println(texto1.concat(texto2));
        BiPredicate <Integer, Integer> compare = (a, b) -> a > b;

        //Ulises
        BiConsumer<Integer, String> myBiConsumer = (x, y) -> {
            if(x>0)
                System.out.print(y);
        };
        BiPredicate<String, String> myBiPredicate = (a,b) -> a.equals(b);

        //Elias
        BiConsumer <Double, Double> doubleImp = (num1,num2) -> System.out.println(num1*num2);
        BiPredicate<String,String> biprediString = (str1,str2) -> str1.equals(str2);

        //Viviana
        BiConsumer<Integer, Integer> dobleImp2 = (n1, n2) -> System.out.println(n1+n2);
        BiPredicate <String, String> biPredicate = (a, b) -> a.equals(b);

        //Luis
        BiConsumer<Double, String> biConsumer = (doble,cadena) -> System.out.println(doble +" "+ cadena);
        BiPredicate<String,String> comparator = (x,y) -> x.length() == y.length();
        System.out.println(comparator);

        //Alejandro
        Supplier<Boolean> supplier =() -> 5>7;
        Boolean bol=supplier.get();

        //Juan
        BiConsumer <Integer, Integer> sum = (num1, num2) -> System.out.println(num1 + num2);
        BiPredicate <String, String> compLng = (cad1, cad2) -> cad1.length() == cad2.length();

        //Alberto
        BiConsumer<String, String>biConsumer2=(Nombre,Apellido)-> System.out.println(Nombre+Apellido);
        BiPredicate<Integer, Integer> biPredicate2 = (a,b) -> a<b;

        //Cesar
        BiConsumer<String, String> biConsumer3 =  (a1, a2) -> System.out.println(a1.concat(a2));
        BiPredicate<Integer, Integer> biPredicate3 = (n1, n2) -> n1.equals(n2);
//
        Consumer<String> stringConsumer=System.out::println;
//        stringConsumer.accept("Hola Mundo");
//
//        Supplier<Double> doubleSupplier=
//                () -> {return 1.1;};
//        System.out.println(doubleSupplier.get());
//
//
//
//        Predicate<List<Integer>> listPredicate= list -> list.isEmpty();
//
//        List<Integer> lista=new ArrayList<>();
//
//        if (listPredicate.test(lista)){
//
//        }
//        System.out.println(listPredicate.test(lista));
    }
}