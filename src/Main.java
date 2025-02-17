import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Membro VIP (1 para sim, 0 para não): ");
        int vip = entrada.nextInt();

        System.out.println("Valor compra: ");
        double valorCompra = entrada.nextDouble();

        if(vip == 1 || valorCompra >= 500) {

            double valorPago = valorCompra - (valorCompra * 0.10);
            double valorDesconto = valorCompra * 0.10;

            System.out.println("Valor a ser Pago: " + valorPago);
            System.out.println("Desconto: " + valorDesconto);
        }else{
            System.out.println("Valor a ser Pago: " +valorCompra);
            System.out.println("Para ter desconto necessário membro VIP, ou compra no valor de 500+ reais!! ");
        }
    }
}