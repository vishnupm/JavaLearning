package Polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.login(123,"pass");
        mo.login(123,"pass", 4325);
    }

    public void login(String u, String p){
        System.out.println("Logged in using username and password");
    }
    public void login(int u, String p){
        System.out.println("Logged in using phone number and password");
    }
    public void login(int u, String p, int t){
        System.out.println("Logged in using phone number, pin and password");
    }
}
