package SeleniumUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream x = new FileInputStream("config.properties");
            properties.load(x);
            x.close();
        } catch (IOException e) {
            System.out.println("Error Occurred While Reading Configuration File");
            e.printStackTrace();
        }
    }

    public static String getProperties(String key) {
        return properties.getProperty(key);
    }
}
