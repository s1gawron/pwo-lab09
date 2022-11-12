package pwo.lab09.factory;

public class Thursday implements MessageFactory {

    @Override public String createIntroMessage() {
        return "Czwartek to mały piątek :)";
    }

    @Override public String createMainMessage() {
        return "Ahh spokojne czwartkowe popołudnie";
    }

    @Override public String createClosingMessage() {
        return "Już tylko piątek!";
    }
}
