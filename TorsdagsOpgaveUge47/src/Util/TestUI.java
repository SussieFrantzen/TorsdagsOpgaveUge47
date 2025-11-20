package Util;

import java.util.ArrayList;

public class TestUI {

    public void msg(String besked){
        System.out.println(besked);
    }
    public void printArraylist(ArrayList<String>indsætArraylist) {
        //System.out.println("\u001B[36m");
        indsætArraylist.forEach(System.out::println);
    }
}
