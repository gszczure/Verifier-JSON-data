# JSON Data Verification Method in Java

This project contains a JSON data verification method implemented in Java using Maven. The method is designed to verify the input JSON data against certain criteria. Additionally, the project includes seven test cases to ensure the correctness of the verification method.

## Installation in IntelliJ IDEA

1. Open IntelliJ IDEA: Launch IntelliJ IDEA on your computer.
2. Open the clone window: Select "Get from Version Control" from the "File" menu or click the "Get from VCS" button on the IntelliJ welcome screen.
3. Copy the repository URL: Open your web browser, navigate to the repository on GitHub `https://github.com/gszczure/Verifier-JSON-data.git`, and copy the repository URL.
4. Paste the URL into IntelliJ: In the "Get from Version Control" window, paste the repository URL into the "URL" field and choose the location where you want to place the cloned project on your computer.

## Sample Results

When running this code, it's possible to receive three different results:

- false: When the resource contains an asterisk (*). 
- true: If the asterisk is not present in the resource.
- Exception "...": When one of the Role Policy conditions is not met."

- Additionally, in the example.json file, an asterisk is present in the resource field. Therefore, without modifying the code, the result will be false
