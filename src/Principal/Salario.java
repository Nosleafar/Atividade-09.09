package Principal;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int salarioMinimo = 788;
        System.out.print("Informe o valor do sal�rio do usu�rio (R$): ");
        double salarioUsuario = scanner.nextDouble();

        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;
        System.out.println("O usu�rio ganha " + quantidadeSalariosMinimos + " sal�rio(s) m�nimo(s).");

        scanner.close();
    }
}