package scriptrunner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Runs a script and returns output as JsonElement
 */
public class Scriptrunner {

    /**
     * Runs a script and returns a JsonElement with correctly formatted variable names
     * @param scriptPath Path to script to be run
     * @return JsonElement with data returned by script
     */
    public String run(String scriptPath) {
        Runtime rt = Runtime.getRuntime();
        try {
            Process proc = rt.exec("node " + scriptPath);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(proc.getInputStream()));

            String line = "";
            StringBuilder stringBuilder = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
            return stringBuilder.toString().replace("_", "");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
