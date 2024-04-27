package designPatterns.creationalPattern.factory.shapeExample;

import java.util.Scanner;

public class ShapeDemo {

    public static CreatorClass creatorClass;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input == 1){
            creatorClass = new RectangleCreator(4,5);
        }
        else{
            creatorClass = new CircleCreator(5);
        }
        System.out.println(creatorClass.calculateTotalArea(20));
    }

}
