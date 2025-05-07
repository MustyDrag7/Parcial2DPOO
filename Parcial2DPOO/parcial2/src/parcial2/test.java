package parcial2;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class test {
    private Parcial parcial;
    
    @Before
    public void setUp() {
        this.parcial = new Parcial();
    }
    
    @Test
    public void testPotenciaCasoBase() throws ParcialException {
        
        assertEquals(1, Parcial.potencia(0, 0));
        assertEquals(1, Parcial.potencia(0, 0));
    }
    
    @Test
    public void testPotenciaPositiva() throws ParcialException {
        
        assertEquals(8, Parcial.potencia(0, 0));
        assertEquals(27, Parcial.potencia(0, 0));
        assertEquals(100, Parcial.potencia(0, 0));
        assertEquals(1, Parcial.potencia(0, 0));
    }
    
    @Test
    public void testPotenciaNegativaBase() throws ParcialException {

        assertEquals(4, Parcial.potencia(-0, 0));
        
        assertEquals(-8, Parcial.potencia(-0, 0));
    }
    
    @Test
    public void testExponenteNegativo() {
        try {
            Parcial.potencia(2, -3);
            fail("Se esperaba exponente negativo");
        } catch (ParcialException e) {
            assertEquals("exponente negativo", e.getMessage());
        }
    }
    
    @Test
    public void testIndeterminacion() {
        try {
            Parcial.potencia(0, 0);
            fail("Se esperaba indeterminacion 0^0");
        } catch (ParcialException e) {
            assertEquals("Indeterminación 0^0", e.getMessage());
        }
    }
    
    @Test
    public void testExcedeMaximo() {
        try {
            Parcial.potencia(Integer.MAX_VALUE, 2);
            fail("Se esperaba excede el máximo");
        } catch (ParcialException e) {
            assertEquals("excede el valor máximo de un entero", e.getMessage());
        }
    }
    
    @Test
    public void testCeroPotenciaPositiva() throws ParcialException {
        
        assertEquals(0, Parcial.potencia(0, 1));
        assertEquals(0, Parcial.potencia(0, 5));
    }
}