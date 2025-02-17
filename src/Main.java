import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("Possui CNH (1 para sim, 0 para não): ");
        int cnh = entrada.nextInt();

        if(idade >= 18 && cnh == 1){
            System.out.println("Verificação Aprovada!!");
        }else{
            System.out.println("Verificação Recusada!! Necessário +18 e CNH!");
        }

    }
}