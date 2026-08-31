import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class EnvKeyChecker {
    public static void main(String[] args) {
        Set<String> envKeys = new HashSet<>();
        Set<String> exampleKeys = new HashSet<>();
        
        try {
            BufferedReader envReader = new BufferedReader(new FileReader(".env"));
            String line;
            while ((line = envReader.readLine()) != null) {
                if (!line.trim().isEmpty() && !line.startsWith("#")) {
                    envKeys.add(line.split("=")[0].trim());
                }
            }
            envReader.close();
            
            BufferedReader exampleReader = new BufferedReader(new FileReader(".env.example"));
            while ((line = exampleReader.readLine()) != null) {
                if (!line.trim().isEmpty() && !line.startsWith("#")) {
                    exampleKeys.add(line.split("=")[0].trim());
                }
            }
            exampleReader.close();
            
            exampleKeys.removeAll(envKeys);
