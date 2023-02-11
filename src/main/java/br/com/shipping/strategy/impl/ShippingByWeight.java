package br.com.shipping.strategy.impl;

import br.com.shipping.strategy.ShippingStrategy;

import java.math.BigDecimal;

public class ShippingByWeight implements ShippingStrategy {
    @Override
    public BigDecimal calculate(BigDecimal value) {
        return BigDecimal.TEN.multiply(value);
    }
}
