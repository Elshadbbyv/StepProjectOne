package iktlab.javaPro.j4Group.Projects.One.FunkPro;
import java.util.*;

public class LambdaExpression {
    private String color;


    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Green");
        color.add("Orange");
        color.add("White");
        color.add("Black");
        Scanner sc  =new Scanner(System.in);

        String b = sc.next();
        for (int i = 0; i < color.toArray().length; i++) {
            if (b.equalsIgnoreCase(color.get(i))){
                System.out.println(b);
                System.out.println(i);

        }
            else
                continue;

        }
    }

}
