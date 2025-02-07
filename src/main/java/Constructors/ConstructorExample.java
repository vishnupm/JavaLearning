package Constructors;

public class ConstructorExample {
    public ConstructorExample(){
        System.out.println("No argument constructor");
    }
    public ConstructorExample(int i){
        System.out.println("Integer argument constructor");
    }
    public ConstructorExample(int i, int j){
        System.out.println("2 Integer argument constructor");
    }
    public ConstructorExample(String s){
        System.out.println("String argument constructor");
    }
    public static void main(String[] args) {
        ConstructorExample ce = new ConstructorExample(5,89);
    }
}
