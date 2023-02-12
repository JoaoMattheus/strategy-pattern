package br.com.shipping.enuns;

import br.com.shipping.strategy.ShippingStrategy;
import br.com.shipping.strategy.impl.ShippingByDistance;
import br.com.shipping.strategy.impl.ShippingBySpeed;
import br.com.shipping.strategy.impl.ShippingByWeight;

public enum ShippingType {
    SHIPPING_BY_WEIGHT(new ShippingByWeight()),
    SHIPPING_BY_DISTANCE(new ShippingByDistance()),
    SHIPPING_BY_SPEED(new ShippingBySpeed());

    private ShippingStrategy shippingStrategy;

    ShippingType(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public ShippingStrategy getShippingStrategy() {
        return shippingStrategy;
    }
}