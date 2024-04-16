package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JsonVerifierTest {

    @Test
    void testValidJson() throws Exception {
        String filePath = "/Users/grzegorz/IdeaProjects/Maven/src/main/java/org/example/package.json";
        assertFalse(JsonVerifier.verifyMethod(filePath));
    }

    @Test
    void testValidPolicyName () throws Exception {
        String filePath = "/Users/grzegorz/IdeaProjects/Maven/src/main/java/org/example/package.json";
        assertTrue(JsonVerifier.verifyMethod(filePath));
    }
}