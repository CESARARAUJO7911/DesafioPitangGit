import org.junit.Test;

public class CalculadoraTeste {
    @Test
    public void testSoma(){
        Calculadora c = new Calculadora(  2,  3);
        assertEquals(5.0,c.soma(),0.001);
    }
}
