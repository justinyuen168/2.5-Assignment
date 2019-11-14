import java.util.Scanner;

class question6 {
    public static void main(String[] args) {
        Box(50,30);
    }
    
    public static void Box(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("x");
            }
            System.out.println("");
        }
    }
    
}
