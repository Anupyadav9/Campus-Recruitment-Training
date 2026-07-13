import java.util.*;
class Main {
    public static void main(String[] args) {
       System.out.print(sum(5));
    }
    public static int sum(int x) {
        if(x == 0 || x == 1) {
            return x;
        }
        else {
            return x+sum(x-1);
        }
    }
}
