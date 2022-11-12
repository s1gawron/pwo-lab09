package pwo.lab09.factory;

public class Friday implements MessageFactory {

    @Override public String createIntroMessage() {
        return "8 godzin i fajrancik :)";
    }

    @Override public String createMainMessage() {
        return "Obiadek, youtube i do domu";
    }

    @Override public String createClosingMessage() {
        return "WEEKEND!!!";
    }
}
