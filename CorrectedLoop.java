public class MyClass {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            if (i == 5) {
                //The continue statement is still here, but it doesn't affect the number 5
            }
            i++;
        }
    }
}