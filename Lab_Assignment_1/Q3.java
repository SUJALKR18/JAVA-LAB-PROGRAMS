public class Q3 {
    public static void main(String[] args) {
        double base = 3;
        double height = 4;

        double hypotenuse = Math.sqrt((base* base) + (height * height));
        double perimeter = base + height + hypotenuse; 
        System.out.println("The Perimeter of the triangle is : " + perimeter);
    }
}
