package SuperKeyword;

public class Parent {
    String empName = "Tom";
    int empNo = 234;
    public Parent(){
        System.out.println("parent constructor");
    }
    public Parent(int i){
        System.out.println("Parameterised constructor");
    }

    public void getData(){
        System.out.println(empName);
        System.out.println(empNo);
    }
}
