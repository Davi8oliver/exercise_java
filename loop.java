public class loop {

    public static void main (String[] args){

        Integer num1 = 67;
        Integer num2 = 0;
        String word = "FAHH";
        String letra = "D";
        Integer i = 0;

        while (i < 10) {
            IO.println(num1);
            i++;
        }

        i = 0;

        while (i < 10) {
            IO.println(num2);
            num2 = num2 + 2;
            i++;
        }

        i = 0;

        do {
            IO.println(word);
            i++;
        }while (i < 10);

        for (i = 0; i < 10; i++){
            IO.println(letra);
        }

    }

}
