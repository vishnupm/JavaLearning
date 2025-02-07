package Encapsulation;

public class CreateBox {
    public static void main(String[] args) {

        Common cm = new Common();
        int l = cm.setLength(10);
        int b = cm.setBreadth(2);
        int h = cm.setHeight(8);
        cm.setBox(l,b,h);

    }
}
