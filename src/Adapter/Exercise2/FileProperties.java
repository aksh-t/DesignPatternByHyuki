package Adapter.Exercise2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class FileProperties implements FileIO {
    private Properties properties;

    FileProperties() {
        this.properties = new Properties();
    }

    public void readFromFile(String filename) throws IOException {
        InputStream inputStream = new FileInputStream(filename);
        properties.load(inputStream);
        inputStream.close();
    }

    public void writeToFile(String filename) throws IOException {
        OutputStream outputStream = new FileOutputStream(filename);
        properties.store(outputStream, "written by FileProperties");
        outputStream.close();
    }

    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    public String getValue(String key) {
        return properties.getProperty(key);
    }

}
