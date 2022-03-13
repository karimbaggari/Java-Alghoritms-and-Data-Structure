import java.awt.*;
import java.util.*;
import java.util.List;


class theList {
    public static void main(String[] args) {
        //this List is unmodifiable
       List <String> colorsUnmodifiable =  List.of(
                "blue",
                "purple",
                "green"
        );
        System.out.println(colorsUnmodifiable);
        List <String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("purle");
        System.out.println(colors.size());
        System.out.println(colors.contains("blue"));
        System.out.println(colors.contains("red"));
        for (String color : colors) {
            if (color == "blue") {
                System.out.println(color);
            }
        }
        colors.forEach(System.out::println);
    }
}