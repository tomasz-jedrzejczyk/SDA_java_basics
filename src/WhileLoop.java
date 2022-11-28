public class WhileLoop {
    public static void main(String[] args) {

        /*
           Pętlę while najczęściej wykorzystuje się w miejscach,
           gdzie zakładana ilość powtórzeń jest bliżej nieokreślona, ale znamy warunek jaki musi być spełniony

           Gdy warunek jest spełniony instrukcja we wnętrzu pętli jest wykonywana.
           Jeżeli natomiast warunek jest fałszywy może się ona nie wykonać, ani razu.

           https://javastart.pl/baza-wiedzy/java-podstawy-jezyka/petle#p%C4%99tla_while
         */

        int count = 0;

        while (count < 10){
            System.out.println(count);
            count++;
        }
    }
}
