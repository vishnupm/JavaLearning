package TryCatch;

public class TryClass {
    public static void main(String[] args) {
        try {
            int i = 10;
            System.out.println(i/0);
        } catch (Throwable e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally block");
        }
        System.out.println("After");

    }
}
