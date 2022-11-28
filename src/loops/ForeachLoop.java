public class ForeachLoop {
    public static void main(String[] args) {

        /*
           Pętla for each to konstrukcja, która pozwala na sekwencyjne przeglądanie różnych zbiorów danych.
           Mogą nimi być tablice, a także dynamiczne struktury jak na przykład listy.

           https://javastart.pl/baza-wiedzy/java-podstawy-jezyka/petla-for-each
         */

        String[] dogs = new String[]{"Rex", "Scooby", "Szarik", "Sara"};

        for (String dog : dogs) {
            System.out.println(dog);
        }
    }
}
