package br.com.shipping;

import br.com.shipping.order.Order;
import br.com.shipping.strategy.impl.ShippingByDistance;
import br.com.shipping.strategy.impl.ShippingBySpeed;
import br.com.shipping.strategy.impl.ShippingByWeight;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor que deseja calcular o frete: ");
        String input = scan.nextLine();
        BigDecimal value = new BigDecimal(input);

        System.out.println("Valor baseado no peso: " + Order.calculate(value, new ShippingByWeight())
                + "\nValor baseado na distancia: " + Order.calculate(value, new ShippingByDistance())
                + "\nValor baseado na velocidade: " + Order.calculate(value, new ShippingBySpeed()));
    }
}