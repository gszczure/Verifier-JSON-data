package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JsonVerifierTest {

    @Test
    public void testVerifyMethod_ValidJson_ReturnsFalse() throws Exception {
        String filePath = "/Users/grzegorz/IdeaProjects/Verifier/src/test/java/org/example/valid.json";
        boolean result = JsonVerifier.verifyMethod(filePath);
        assertFalse(result);
    }

    @Test
    public void testVerifyMethod_InvalidResource_ReturnsTrue() throws Exception {
        String filePath = "/Users/grzegorz/IdeaProjects/Verifier/src/test/java/org/example/invalid_resource.json";
        boolean result = JsonVerifier.verifyMethod(filePath);
        assertTrue(result);
    }

    @Test
    public void testVerifyMethod_MissingPolicyName_ThrowsException() {
        String filePath = "/Users/grzegorz/IdeaProjects/Verifier/src/test/java/org/example/missing_json_object.json";
        assertThrows(Exception.class, () -> JsonVerifier.verifyMethod(filePath));
    }

    @Test
    public void testVerifyMethod_InvalidPolicyName_ThrowsException() {
        String filePath = "/Users/grzegorz/IdeaProjects/Verifier/src/test/java/org/example/invalid_policy_name.json";
        assertThrows(Exception.class, () -> JsonVerifier.verifyMethod(filePath));
    }

    @Test
    public void testVerifyMethod_InvalidEffect_ThrowsException() {
        String filePath = "/Users/grzegorz/IdeaProjects/Verifier/src/test/java/org/example/invalid_effect.json";
        assertThrows(Exception.class, () -> JsonVerifier.verifyMethod(filePath));
    }
}
