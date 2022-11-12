package pwo.lab09.factory;

public class Sunday implements MessageFactory {

    @Override public String createIntroMessage() {
        return "Dzisiaj handlowa?";
    }

    @Override public String createMainMessage() {
        return "Czas na rosół";
    }

    @Override public String createClosingMessage() {
        return "O nie po spaniu praca :(";
    }
}
