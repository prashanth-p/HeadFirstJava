package Chapter_01;

public class Loopy {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the loop: " + x);
        while(x<4){
            System.out.println("Inside the loop: " + x);
            x = x+1;
        }
        System.out.println("This line is after the loop: " + x);
    }
}
