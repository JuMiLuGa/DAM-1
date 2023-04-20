package tarefa9;

import org.junit.Test;
import static org.junit.Assert.*;

public class OperacionsArraysTest {

    @Test
    public void testBusca() {
        OperacionsArrays oa = new OperacionsArrays();

        // Prueba para la Clase de Equivalencia 1: Array vacío
        char[] array1 = {};
        assertFalse(oa.busca('a', array1));

        // Prueba para la Clase de Equivalencia 2: Carácter no presente en el array
        char[] array2 = {'b', 'c', 'd', 'e'};
        assertFalse(oa.busca('a', array2));

        // Prueba para la Clase de Equivalencia 3: Carácter presente en el array
        char[] array3 = {'a', 'b', 'c', 'd'};
        assertTrue(oa.busca('c', array3));

        // Prueba para el Valor Límite 1: Array con un elemento igual al carácter
        char[] array4 = {'a'};
        assertTrue(oa.busca('a', array4));

        // Prueba para el Valor Límite 2: Array con un elemento diferente al carácter
        char[] array5 = {'b'};
        assertFalse(oa.busca('a', array5));

        // Prueba para el Valor Límite 3: Array con dos elementos, carácter igual al primer elemento
        char[] array6 = {'a', 'b'};
        assertTrue(oa.busca('a', array6));

        // Prueba para el Valor Límite 4: Array con dos elementos, carácter igual al segundo elemento
        char[] array7 = {'a', 'b'};
        assertTrue(oa.busca('b', array7));

        // Prueba para el Valor Límite 5: Array con dos elementos, carácter diferente a ambos elementos
        char[] array8 = {'a', 'b'};
        assertFalse(oa.busca('c', array8));
    }
}
