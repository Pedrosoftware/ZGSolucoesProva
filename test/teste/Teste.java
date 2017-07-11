package teste;

import org.junit.Test;
import static org.junit.Assert.*;
import zgprova.entity.Caixa;
import zgprova.entity.Compra;

/**
 *
 * @author pedro
 */
public class Teste {

    private Compra compra;
    private Caixa caixa;

    @Test
    public void teste1() throws Exception {
        compra = new Compra();
        caixa = new Caixa(compra);

        compra.add("A");
        assertEquals(50, caixa.getTotalPrice(), 0);
        assertEquals(0, caixa.getTotalDiscount(), 0);
        compra.add("A");
        assertEquals(100, caixa.getTotalPrice(), 0);
        assertEquals(0, caixa.getTotalDiscount(), 0);
        compra.add("A");
        assertEquals(130, caixa.getTotalPrice(), 0);
        assertEquals(20, caixa.getTotalDiscount(), 0);
        compra.add("A");
        assertEquals(180, caixa.getTotalPrice(), 0);
        assertEquals(20, caixa.getTotalDiscount(), 0);
        compra.add("A");
        assertEquals(230, caixa.getTotalPrice(), 0);
        assertEquals(20, caixa.getTotalDiscount(), 0);
        compra.add("A");
        assertEquals(260, caixa.getTotalPrice(), 0);
        assertEquals(40, caixa.getTotalDiscount(), 0);
        compra.remove("A");
        assertEquals(230, caixa.getTotalPrice(), 0);
        assertEquals(20, caixa.getTotalDiscount(), 0);
        compra.add("A");
        assertEquals(260, caixa.getTotalPrice(), 0);
        assertEquals(40, caixa.getTotalDiscount(), 0);
        compra.add("A");
        assertEquals(300, caixa.getTotalPrice(), 0);
        assertEquals(50, caixa.getTotalDiscount(), 0);
    }

    @Test
    public void teste2() throws Exception {
        compra = new Compra();
        caixa = new Caixa(compra);

        compra.add("D");
        assertEquals(15, caixa.getTotalPrice(), 0);
        assertEquals(0, caixa.getTotalDiscount(), 0);
        compra.add("A");
        assertEquals(65, caixa.getTotalPrice(), 0);
        assertEquals(0, caixa.getTotalDiscount(), 0);
        compra.add("B");
        assertEquals(95, caixa.getTotalPrice(), 0);
        assertEquals(0, caixa.getTotalDiscount(), 0);
        compra.add("A");
        assertEquals(145, caixa.getTotalPrice(), 0);
        assertEquals(0, caixa.getTotalDiscount(), 0);
        compra.add("B");
        assertEquals(160, caixa.getTotalPrice(), 0);
        assertEquals(15, caixa.getTotalDiscount(), 0);
        compra.add("A");
        assertEquals(190, caixa.getTotalPrice(), 0);
        assertEquals(35, caixa.getTotalDiscount(), 0);
        compra.remove("A");
        assertEquals(160, caixa.getTotalPrice(), 0);
        assertEquals(15, caixa.getTotalDiscount(), 0);
        compra.remove("B");
        assertEquals(145, caixa.getTotalPrice(), 0);
        assertEquals(0, caixa.getTotalDiscount(), 0);
    }

    @Test
    public void teste3() throws Exception {
        compra = new Compra();
        caixa = new Caixa(compra);

        compra.add("C");
        assertEquals(20, caixa.getTotalPrice(), 0);
        assertEquals(0, caixa.getTotalDiscount(), 0);
        compra.add("C");
        assertEquals(40, caixa.getTotalPrice(), 0);
        assertEquals(0, caixa.getTotalDiscount(), 0);
        compra.add("C");
        assertEquals(40, caixa.getTotalPrice(), 0);
        assertEquals(20, caixa.getTotalDiscount(), 0);
        compra.add("C");
        assertEquals(60, caixa.getTotalPrice(), 0);
        assertEquals(20, caixa.getTotalDiscount(), 0);
        compra.remove("C");
        assertEquals(40, caixa.getTotalPrice(), 0);
        assertEquals(20, caixa.getTotalDiscount(), 0);
        compra.remove("C");
        assertEquals(40, caixa.getTotalPrice(), 0);
        assertEquals(0, caixa.getTotalDiscount(), 0);

    }

    @Test
    public void teste4() throws Exception {
        compra = new Compra();
        caixa = new Caixa(compra);

        compra.add("C");
        assertEquals(20, caixa.getTotalPrice(), 0);
        assertEquals(0, caixa.getTotalDiscount(), 0);
        compra.add("B");
        assertEquals(50, caixa.getTotalPrice(), 0);
        assertEquals(0, caixa.getTotalDiscount(), 0);
        compra.add("B");
        assertEquals(65, caixa.getTotalPrice(), 0);
        assertEquals(15, caixa.getTotalDiscount(), 0);
        compra.remove("B");
        assertEquals(50, caixa.getTotalPrice(), 0);
        assertEquals(0, caixa.getTotalDiscount(), 0);
    }
}
