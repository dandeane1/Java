public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int myFavoriteNumber = 12;
        System.out.println(myFavoriteNumber);


        String myString = "This is a string.";
        System.out.println(myString);


        int x = 10;
        int y = 2;
        x = x / y;
        y = -x;
        System.out.println(x);
        System.out.println(y);

        int maxNumber = Integer.MAX_VALUE;
        System.out.println("maxNumber: " + maxNumber);
        int number1 = Integer.MAX_VALUE - 1;
        System.out.println("number1: " + number1);
        if (number1 < maxNumber) {
            System.out.println("number1 < maxNumber");
        }
    }
}








