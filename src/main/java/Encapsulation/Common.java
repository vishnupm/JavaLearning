package Encapsulation;

public class Common {
    private int length;
    private int breadth;
    private int height;

    public void setBox(int l, int b, int h){
        System.out.println("The dimension of box is: " +l+" "+b+" "+h);
    }

    public int setLength(int l){
        length = l;
        return length;
    }
    public int setBreadth(int b){
        breadth = b;
        return breadth;
    }
    public int setHeight(int h){
        height = h;
        return height;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    public int getHeight(){
        return height;
    }
}
