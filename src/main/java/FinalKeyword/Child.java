package FinalKeyword;

public class Child extends Parent {
    public int i = 10;
    public final int f = 30;

    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.i);
        c.i=20;
        System.out.println(c.i);
        System.out.println(c.f);
//        c.f=20; //not allowed
//        System.out.println(c.f);
        c.setData();
    }

//    Not allowed to override the setData method in parent class
//    public void setData(){
//        System.out.println(i);
//    }
}
