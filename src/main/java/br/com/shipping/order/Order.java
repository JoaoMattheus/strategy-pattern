package br.com.shipping.order;

import br.com.shipping.strategy.ShippingStrategy;

import java.math.BigDecimal;

public class Order {

    public static BigDecimal calculate(BigDecimal value, ShippingStrategy strategy) {
        return strategy.calculate(value);
    }
}
