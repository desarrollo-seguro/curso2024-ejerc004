package es.cic.curso.ejerc004;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RelojTest {
    private Calculadora dependencia;
    private Reloj cut;
    
    @BeforeEach
    public void setUp() {
        cut = new Reloj();
        dependencia = mock(Calculadora.class);
        cut.setCalculadora(dependencia);
    }

    @Test
    public void testCalcularMinutoDelDia() {
        
        when(dependencia.multiplicar(5, 60)).thenReturn(300);
        when(dependencia.sumar(15, 300)).thenReturn(315);
        
        
        int resultado = cut.calcularMinutoDelDia(5, 15);
        assertEquals(315, resultado, "El minuto del día no es correcto");

        verify(dependencia, times(1)).multiplicar(5, 60);
        verify(dependencia).sumar(15, 300);
    }

}
