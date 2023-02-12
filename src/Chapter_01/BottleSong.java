package Chapter_01;

public class BottleSong {
    public static void main(String[] args) {
        int i = 10;
        String s = "bottles";
        String newS = "bottles";

        while(i>0) {
            if(i == 1) {
                s = "bottle";
            }
            System.out.println(i + " green "+ s + " hanging on the wall, ");
            System.out.println(i + " green "+ s + " hanging on the wall, ");
            System.out.println("And if one green bottle should accidentally fall, ");
            i--;
            if(i==1) {
                newS = "bottle";
            }
            if(i>0) {
                System.out.println("There'll be " + i + " green " + newS + " hanging on the wall");
            } else {
                System.out.println("There'll be no green bottles hanging on the wall");
            }
            System.out.println();
        }
    }
}
