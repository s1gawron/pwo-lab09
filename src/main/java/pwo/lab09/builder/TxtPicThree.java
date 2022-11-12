package pwo.lab09.builder;

public class TxtPicThree extends TxtPicTwo {

    @Override public TxtPicTwo createTxtPic() {
        if (this.size < 0) {
            throw new RuntimeException("Size cannot be less than 0!");
        }

        if (this.foreground == '\u0000') {
            throw new RuntimeException("Foreground was not set!");
        }

        if (this.background == '\u0000') {
            throw new RuntimeException("Background was not set!");
        }

        if (isFileNameNotSet()) {
            throw new RuntimeException("Filename was not set!");
        }

        return super.createTxtPic();
    }

    private boolean isFileNameNotSet() {
        if (this.fileName == null) {
            return true;
        }

        return this.fileName.isBlank();
    }
}
