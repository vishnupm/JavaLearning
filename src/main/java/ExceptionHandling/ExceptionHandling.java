package ExceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            System.out.println("Hello");
            int i = 1/0;
            System.out.println("Finished");
        }
        catch (Exception exp){
            System.out.println("Message is: "+exp.getMessage());
            System.out.println("Cause is: "+exp.getCause());
            exp.printStackTrace();
        }

    }
}
