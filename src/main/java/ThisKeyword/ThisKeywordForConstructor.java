package ThisKeyword;

public class ThisKeywordForConstructor {
    int x;
    int y;
    String s = "Vishnu";
    public ThisKeywordForConstructor(){
        System.out.println("Default constructor");
    }
    public ThisKeywordForConstructor(int x, int y){
        this.x=x;
        this.y=y;
        System.out.println(x+y);
        System.out.println("parameterised constructor");
    }

    public static void main(String[] args) {
        ThisKeywordForConstructor tk = new ThisKeywordForConstructor(10,20);
        tk.getData();
    }
    public void getData(){
        System.out.println(this.x+this.y);
    }
}
