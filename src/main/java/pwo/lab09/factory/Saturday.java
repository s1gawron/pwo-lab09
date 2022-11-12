package pwo.lab09.factory;

public class Saturday implements MessageFactory {

    @Override public String createIntroMessage() {
        return "Piękny sobotni poranek";
    }

    @Override public String createMainMessage() {
        return "Co by tu porobić?";
    }

    @Override public String createClosingMessage() {
        return "Czas na film!";
    }
}
