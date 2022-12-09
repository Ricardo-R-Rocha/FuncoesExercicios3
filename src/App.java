import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
System.out.println("Escreva abaixo o primeiro número inteiro: ");

Scanner teclado = new Scanner(System.in);
int a = teclado.nextInt();

System.out.println("Escreva abaixo o segundo número inteiro: ");
int b = teclado.nextInt();

System.out.println("Escreva abaixo o terceiro número inteiro: ");
int c = teclado.nextInt();
System.out.println("Resultado: ");
printaNumeros(a,b,c);

teclado.close();

}

public static void printaNumeros(int a, int b, int c) {
    
    int soma = a + b + c;

    System.out.print(soma);

    }

}