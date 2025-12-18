
package com.example.healthmonitor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FailTest {
    @Test
    void testFail() {
        assertTrue(false, "Intentional failure for CI demonstration");
    }
}
