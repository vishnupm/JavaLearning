package ThisKeyword;

public class ThisKeyword {
    int x = 11;
    int y = 22;
    String s = "Vishnu";
    public static void main(String[] args) {
        ThisKeyword tk = new ThisKeyword();
        tk.getData();

    }
    public void getData(){
        int x = 30;
        int y = 40;
        System.out.println(this.x+this.y);
        System.out.println(x+y);
    }
}
