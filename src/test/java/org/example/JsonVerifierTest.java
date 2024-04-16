package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JsonVerifierTest {

    @Test
    public void testVerify_ValidJson_ReturnsFalse() throws Exception {
        String filePath = "/Users/grzegorz/IdeaProjects/Verifier/src/test/java/org/example/valid.json";
        boolean result = JsonVerifier.verifyMethod(filePath);
        assertFalse(result);
    }

    @Test
    public void testVerify_InvalidResource_ReturnsTrue() throws Exception {
        String filePath = "/Users/grzegorz/IdeaProjects/Verifier/src/test/java/org/example/invalid_resource.json";
        boolean result = JsonVerifier.verifyMethod(filePath);
        assertTrue(result);
    }

    @Test
    public void testVerify_MissingPolicyName_ThrowsException() {
        String filePath = "/Users/grzegorz/IdeaProjects/Verifier/src/test/java/org/example/missing_json_object.json";
        assertThrows(Exception.class, () -> JsonVerifier.verifyMethod(filePath));
    }

    @Test
    public void testVerify_InvalidPolicyName_ThrowsException() {
        String filePath = "/Users/grzegorz/IdeaProjects/Verifier/src/test/java/org/example/invalid_policy_name.json";
        assertThrows(Exception.class, () -> JsonVerifier.verifyMethod(filePath));
    }

    @Test
    public void testVerify_InvalidEffect_ThrowsException() {
        String filePath = "/Users/grzegorz/IdeaProjects/Verifier/src/test/java/org/example/invalid_effect.json";
        assertThrows(Exception.class, () -> JsonVerifier.verifyMethod(filePath));
    }
    @Test
    public void testVerify_LongPolicyName_ThrowsException() {
        String filePath = "/Users/grzegorz/IdeaProjects/Verifier/src/test/java/org/example/long_policy_name.json";
        assertThrows(Exception.class, () -> JsonVerifier.verifyMethod(filePath));
    }
}
