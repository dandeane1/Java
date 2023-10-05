public class Clothing {
    public String clothingType;
    public String size;
    public String color;


    public static void main(String[] args) {

        Clothing myClothes = new Clothing();

        myClothes.clothingType = "t-shirt";
        System.out.println(myClothes.clothingType);
        myClothes.size = "XL";
        myClothes.color = "light blue";
        System.out.printf("I am wearing a %s that is %s and the color is %s.%n", myClothes.clothingType, myClothes.size, myClothes.color);
    }
}
