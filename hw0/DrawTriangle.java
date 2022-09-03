/** Draw a Triangle */
public class DrawTriangle {
    public static void PrintTriangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintTriangle(5);
    }
}
