package pwo.lab09.builder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TxtPicTwo {

    protected char background;

    protected char foreground;

    protected int size;

    protected String fileName;

    private String art;

    public TxtPicTwo() {
    }

    private TxtPicTwo(char background, char foreground, int size, String fileName) {
        this.background = background;
        this.foreground = foreground;
        this.size = size;
        this.fileName = fileName;

        art = "";
    }

    public TxtPicTwo setBackground(char background) {
        this.background = background;
        return this;
    }

    public TxtPicTwo setForeground(char foreground) {
        this.foreground = foreground;
        return this;
    }

    public TxtPicTwo setSize(int size) {
        this.size = size;
        return this;
    }

    public TxtPicTwo setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public TxtPicTwo createTxtPic() {
        return new TxtPicTwo(background, foreground, size, fileName);
    }

    private void genArt() {
        for (int i = 0; i < size; i++) {
            int count = i + 1;
            int start = (size - count) / 2;

            for (int j = 0; j < size; j++) {
                if (j < start || count == 0)
                    art += background;
                else {
                    art += foreground;
                    count--;
                }
            }
            art += "\n";
        }
    }

    private void toFile() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(art);
        writer.close();
    }

    public boolean save() {
        genArt();

        try {
            toFile();
        } catch (IOException ex) {
            return false;
        }

        return true;
    }
}
