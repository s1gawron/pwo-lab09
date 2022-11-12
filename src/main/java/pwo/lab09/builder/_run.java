package pwo.lab09.builder;

public class _run {

    public static void main(String[] args) {
        TxtPicOne txtPic = new TxtPicOne('.', '*', 20, "txtpic1.txt");
        txtPic.save();

        TxtPicTwo txtPicTwo = new TxtPicTwo();

        txtPicTwo
            .setBackground('_')
            .setForeground('*')
            .setSize(20)
            .setFileName("txtpic2.txt")
            .createTxtPic()
            .save();
    }
}