package org.example;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
public class TestStand {
    public class StandTest {

        @Test
        public void testCrearStand() {
            Stand stand = null;

            // Caso 1: Verificar que crearStandF devuelve el adecuado
            stand = Stand.crearStandF();
            assertNotNull(stand);
            assertEquals("Moody Reds", stand.getNombreStand());

            // Caso 2: Verificar que crearStandP devuelve el adecuado
            stand = Stand.crearStandP();
            assertNotNull(stand);
            assertEquals("Oogie's Way", stand.getNombreStand());

            // Caso 3: Verificar que crearStandA devuelve el adecuado
            stand = Stand.crearStandA();
            assertNotNull(stand);
            assertEquals("Surfer's Highway", stand.getNombreStand());
        }
    }

}
