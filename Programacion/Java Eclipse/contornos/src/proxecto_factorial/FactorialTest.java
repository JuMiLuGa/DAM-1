package proxecto_factorial;

import org.junit.Test;
import org.junit.Assert;

public class FactorialTest {

    @Test(timeout=1000)
    public void testFactorialBucle() throws Exception {
        Factorial f = new Factorial();
        int resultado = f.factorial_bucle(5);
        Assert.assertEquals(120, resultado);
    }

    @Test(timeout=1000)
    public void testFactorialRecursivo() throws Exception {
        Factorial f = new Factorial();
        int resultado = f.factorial_recursivo(5);
        Assert.assertEquals(120, resultado);
    }

    @Test(timeout=1000)
    public void testFactorialBucleNegativo() throws Exception {
        Factorial f = new Factorial();
        try {
            f.factorial_bucle(-5);
        } catch (Exception e) {
            Assert.assertEquals("Erro. O número ten que ser >=0", e.getMessage());
        }
    }

    @Test(timeout=1000)
    public void testFactorialRecursivoNegativo() throws Exception {
        Factorial f = new Factorial();
        try {
            f.factorial_recursivo(-5);
        } catch (Exception e) {
            Assert.assertEquals("Erro. O número ten que ser >=0", e.getMessage());
        }
    }
}

