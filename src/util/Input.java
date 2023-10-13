package util;



public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        String userString = scanner.nextLine();
        return userString;
    };
    public boolean yesNo(){
        String userResponse = scanner.nextLine();
        return userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes");
    }
    //    public int getInt(int min, int max){
//        return MethodsExercises.getInteger(min, max);
//    }
    public int getInt(){
        int returnInt = scanner.nextInt();
        return returnInt;
    }
    public double getDouble(double min, double max){
        System.out.printf("Please enter a number between %f and %f%n", min, max);

        double userDblAnswer = scanner.nextDouble();

        if(userDblAnswer < min || userDblAnswer > max){
            System.out.println("Incorrect input detected - please try again");

            return getDouble(min, max);
        }
        return userDblAnswer ;
    }
    public double getDouble(){
        double userDblAnswer = scanner.nextDouble();
        return userDblAnswer;
    }

    public static void main(String[] args) {
        Input testInput = new Input();

        String testStr = testInput.getString();
        System.out.println(testStr);

        boolean booleTest = testInput.yesNo();
        System.out.println(booleTest);
//
//        int testInt = testInput.getInt(10,50);
//
//        System.out.println(testInt);

        testInput.getString();
        int testInt2 = testInput.getInt();

        System.out.println(testInt2);
        testInput.getString();
        double testDouble = testInput.getDouble(5.5, 55.55);
        System.out.println(testDouble);

        testInput.getString();
        double testDouble2 = testInput.getDouble();
        System.out.println(testDouble2);
    }

}
