import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MontyPythonReferenceTest {

    MontyPythonReference mpr = new MontyPythonReference();

    @Test
    @DisplayName("Testing for gorn.")
    void testGorn() {assertEquals("Gorn.", mpr.gornGet());
    }
}