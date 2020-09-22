package Builder.Exercise3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextFileBuilder extends Builder {
    private PrintWriter writer;
    private String filename;

    public void makeTitle(String title) {
        filename = title + ".txt";
        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println(("=========================="));
        writer.println(" [" + title + "] ");
        writer.println("");

    }

    public void makeString(String str) {
        writer.println('■' + str);
        writer.println("");
    }

    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            writer.println(" ・" + items[i]);
        }
        writer.println("");
    }

    public void close() {
        writer.close();
    }

    public String getResult() {
        return filename;
    }
}
