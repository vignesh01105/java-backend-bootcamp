package io.javabrains.javabasics;

public class InstanceOf {

    public static void main(String[] args) {

        Object[] objects = {
                10,
                "Hello",
                true,
                20.5
        };

        // Challenge: Use instanceof to determine the type of each object in the array
        for(Object o : objects)
        {
            if(o instanceof Integer)
                System.out.println("o is an integer value = " + o);
            else if (o instanceof  String) {
                System.out.println("o is string= " + o);
            } else if (o instanceof Boolean) {
                System.out.println("o is an Boolean = " + o);
            }
            else
                System.out.println("o is double value" + o);
        }
    }
}
