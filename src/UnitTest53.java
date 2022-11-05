import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest53 {

    @Test
    void testMethod() {
        var t = Main.h(1);
        t = Double.parseDouble(String.format("%.4f", t));
        assertEquals(0.5666, t);
    }
}