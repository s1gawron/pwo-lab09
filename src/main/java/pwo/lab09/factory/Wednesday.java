package pwo.lab09.factory;

public class Wednesday implements MessageFactory {

    @Override public String createIntroMessage() {
        return "Środa minie tydzień zginie";
    }

    @Override public String createMainMessage() {
        return "Już połowa połowy tygodnia";
    }

    @Override public String createClosingMessage() {
        return "Jeszcze tylko 2 dni!";
    }
}
