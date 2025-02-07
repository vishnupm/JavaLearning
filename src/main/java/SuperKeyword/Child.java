package SuperKeyword;

public class Child extends Parent{
    String empName = "Jerry";
    int empNo = 678;

    public Child(){
        super(6);
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.getData();
    }
    public void getData(){
        super.getData();
        System.out.println(empName);
        System.out.println(empNo);
        System.out.println(super.empName);
        System.out.println(super.empNo);
    }
}
