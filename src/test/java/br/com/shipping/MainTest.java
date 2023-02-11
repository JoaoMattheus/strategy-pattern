package br.com.shipping;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testMain() {
        String input = "100\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Main.main(new String[0]);

        String expectedOutput = "Digite o valor que deseja calcular o frete: Valor baseado no peso: 1000\n" +
                "Valor baseado na distancia: 500\n" +
                "Valor baseado na velocidade: 10000\r\n";
        assertEquals(expectedOutput, out.toString());
    }
}
