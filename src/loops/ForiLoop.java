package loops;

public class ForiLoop {
    public static void main(String[] args) {

         /*
           Wyrażenie początkowe służy do zainicjowania licznika,
           zazwyczaj jest w tym samym miejscu zadeklarowana zmienna typu całkowitego -
           najczęściej oznacza się je przy pomocy liter od "i" wzwyż, jest to przydatne przy zagnieżdżonych pętlach,
           gdzie przy długich nazwach ciężko by się było połapać. Warunek sprawdza, czy ma się wykonać instrukcja z wnętrza pętli,
           natomiast modyfikator zmienia licznik - zazwyczaj jest to instrukcja inkrementacji.

           https://javastart.pl/baza-wiedzy/java-podstawy-jezyka/petle#for
         */

        String[] dogs = new String[]{"Rex", "Scooby", "Szarik", "Sara"};

        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i]);
        }
    }
}
