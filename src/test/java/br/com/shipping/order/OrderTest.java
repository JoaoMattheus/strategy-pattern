package br.com.shipping.order;

import static org.junit.Assert.assertEquals;
import java.math.BigDecimal;

import br.com.shipping.strategy.ShippingStrategy;
import br.com.shipping.strategy.impl.ShippingByDistance;
import br.com.shipping.strategy.impl.ShippingBySpeed;
import br.com.shipping.strategy.impl.ShippingByWeight;
import org.junit.Test;

public class OrderTest {

    @Test
    public void mustCalculateWithShippingByWeight() {
        BigDecimal value = new BigDecimal(100);
        ShippingStrategy shippingStrategy = new ShippingByWeight();
        BigDecimal expected = value.multiply(BigDecimal.TEN);

        BigDecimal result = Order.calculate(value, shippingStrategy);

        assertEquals(expected, result);
    }

    @Test
    public void mustCalculateWithShippingByDistance() {
        BigDecimal value = new BigDecimal(100);
        ShippingStrategy shippingStrategy = new ShippingByDistance();
        BigDecimal expected = value.multiply(new BigDecimal(5));

        BigDecimal result = Order.calculate(value, shippingStrategy);

        assertEquals(expected, result);
    }

    @Test
    public void mustCalculateWithShippingBySpeed() {
        BigDecimal value = new BigDecimal(100);
        ShippingStrategy shippingStrategy = new ShippingBySpeed();
        BigDecimal expected = value.multiply(new BigDecimal(100));

        BigDecimal result = Order.calculate(value, shippingStrategy);

        assertEquals(expected, result);
    }
}