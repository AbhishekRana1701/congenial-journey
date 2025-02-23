import java.util.ArrayList;

public class RetrieveElementFromArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        System.out.println("Colors: " + colors);

        String firstElement = colors.get(0);
        System.out.println("First element: " + firstElement);
        
        String secondElement = colors.get(1);
        System.out.println("Second element: " + secondElement);

        String thirdElement = colors.get(2);
        System.out.println("Third element: " + thirdElement);
    }
}
