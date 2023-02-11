package br.com.shipping.strategy.impl;

import br.com.shipping.strategy.ShippingStrategy;

import java.math.BigDecimal;

public class ShippingByDistance implements ShippingStrategy {
    @Override
    public BigDecimal calculate(BigDecimal value) {
        return value.multiply(new BigDecimal(5));
    }
}
