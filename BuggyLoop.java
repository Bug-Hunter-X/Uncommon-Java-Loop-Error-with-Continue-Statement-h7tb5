public class MyClass {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i == 5) {
                continue; // Skip the rest of the loop for i == 5
            }
            System.out.println(i);
            i++;
        }
    }
}