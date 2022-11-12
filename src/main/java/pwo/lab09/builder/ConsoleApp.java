package pwo.lab09.builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleApp {

    public static void main(String[] args) {
        final TxtPicThree txtPic = new TxtPicThree();

        System.out.println("Provide size of the graphic you want to create:");
        txtPic.setSize(getSize());
        System.out.println("Provide background for the graphic you want to create:");
        txtPic.setBackground(getSign());
        System.out.println("Provide foreground for the graphic you want to create:");
        txtPic.setForeground(getSign());
        System.out.println("Provide name of the file for the graphic:");
        txtPic.setFileName(readLine().trim());

        txtPic.createTxtPic();
        txtPic.save();
    }

    private static char getSign() {
        final String input = readLine();

        if (input.length() > 1) {
            throw new RuntimeException("More than one char is not allowed!");
        }

        return input.charAt(0);
    }

    private static int getSize() {
        final String input = readLine();

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("!!! ERROR: " + e.getMessage());
        }
    }

    private static String readLine() {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            return "!!! ERROR: " + e.getMessage();
        }
    }

}
