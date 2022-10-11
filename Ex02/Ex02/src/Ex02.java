import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) throws Exception {
        
            System.out.print("Informe um número:");
            Scanner sc = new Scanner(System.in);
            int numero = sc.nextInt();
            sc.close();

            System.out.println("O número informado foi: ");

            System.out.println(numero);
        }
        }