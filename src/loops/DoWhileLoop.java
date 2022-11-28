public class DoWhileLoop {
    public static void main(String[] args) {

        /*
           To co znajduje się w jej wnętrzu wykona się przynajmniej raz,
           ponieważ warunek jest sprawdzany dopiero w drugiej kolejności.

           Tą pętlę można zapamiętać następująco "wykonuj instrukcje dopóki warunek jest prawdziwy"

           https://javastart.pl/baza-wiedzy/java-podstawy-jezyka/petle
         */

        int count = 0;

        do{
            System.out.println(count);
            count++;
        }while (count < 10);
    }
}
