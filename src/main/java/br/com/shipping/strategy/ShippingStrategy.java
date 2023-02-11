package br.com.shipping.strategy;

import java.math.BigDecimal;

public interface ShippingStrategy {

    public BigDecimal calculate(BigDecimal value);
}
