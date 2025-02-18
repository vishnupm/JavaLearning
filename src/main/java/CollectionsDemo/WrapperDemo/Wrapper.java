package CollectionsDemo.WrapperDemo;

public class Wrapper {
    public static void main(String[] args) {
        int i = 10;
        Integer int1 = new Integer(i); //Wrapping
        System.out.println(int1);

        int j = int1; //Unwrapping
        System.out.println(j);
    }
}
