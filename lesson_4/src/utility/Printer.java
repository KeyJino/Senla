package utility;

import bean.AEntity;


import javax.swing.text.html.parser.Entity;

public class Printer {

    public static void print(Object obj){
        System.out.println(obj);
    }

    public static void printArray(AEntity[] entities){
        System.out.println();
        for (AEntity entity : entities) {
            print(entity);
        }
    }
}
