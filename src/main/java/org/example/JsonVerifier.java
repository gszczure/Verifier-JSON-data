package org.example;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonVerifier {

    public static boolean verifyMethod(String filePath) throws Exception {
        try {
            String jsonString = new String(Files.readAllBytes(Paths.get(filePath)));

            JSONObject jsonObject = new JSONObject(jsonString);

            if (!jsonObject.has("PolicyDocument") || !jsonObject.getJSONObject("PolicyDocument").has("Statement") || !jsonObject.has("PolicyName")) {
                throw new Exception ("Invalid object name");
            }

            String policyName = jsonObject.getString("PolicyName");
            if (!validPolicyName(policyName)) {
                throw new Exception("Invalid 'PolicyName' field value");
            }

            JSONArray statements = jsonObject.getJSONObject("PolicyDocument").getJSONArray("Statement");

            for(int i = 0; i < statements.length(); i++) {
                JSONObject statement = statements.getJSONObject(i);
                String resourcee = statement.getString("Resource");
                if (resourcee.equals("*")) {
                    return false;
                }
            }
            return true;
        } catch (IOException | JSONException e){
            e.printStackTrace();
            return false;
        }
    }
    public static boolean validPolicyName (String policyName) {
        return policyName != null
                && !policyName.isEmpty()
                && policyName.length() <= 128
                && policyName.matches("[\\w+=,.@-]+");
     }

    public static void main(String[] args) throws Exception {
        String filePath = "/Users/grzegorz/IdeaProjects/Verifier/src/main/java/org/example/package.json";
        boolean result = verifyMethod(filePath);
        System.out.println(result);
    }
}