package br.com.shipping;

import br.com.shipping.enuns.ShippingType;
import br.com.shipping.order.Order;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o valor que deseja calcular o frete: ");
        String input = scan.nextLine();
        BigDecimal value = new BigDecimal(input);
        
        System.out.println("Escolha o tipo de frete: ");
        for (int i = 0; i < ShippingType.values().length; i++) {
            System.out.println(i + " - " + ShippingType.values()[i].name());
        }
        int choice = scan.nextInt();
        
        scan.close();

        if (choice >= 0 && choice < ShippingType.values().length) {
            ShippingType shippingMethod = ShippingType.values()[choice];
            System.out.println("Valor baseado na escolha: " + Order.calculate(value, shippingMethod.getShippingStrategy()));
        } else {
            System.out.println("Opção inválida, por favor escolha uma opção válida.");
        }
    }
}