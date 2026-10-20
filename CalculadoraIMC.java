import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        float peso, altura, total;

        System.out.println("Digite seu peso");
        peso = scanner.nextFloat();

        System.out.println("Digite seu altura");
        altura = scanner.nextFloat();

        if (altura > 10){
            altura = altura / 100;
        }

        total = peso/(altura*altura);

        if (total < 18.6){
            System.out.println(total + " : Abaixo do peso");
        } else if (total < 25){
            System.out.println(total + " : Peso ideal");
        } else if (total < 30){
            System.out.println(total + " : Levemente acima do peso");
        } else if (total < 35){
            System.out.println(total + " : Obesidade Grau I");
        } else if (total <= 40){
            System.out.println(total + " : Obesidade Grau I (Severa)");
        } else {
            System.out.println(total + " : Obesidade III (Morbida)");
        }

        }
    }
