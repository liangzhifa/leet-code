package com.zhifa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    /*// output:
// A101-052-001
// J01-002-001
// M3-602-001
// M04-002-001
// M18-002-001
// M103-002-11
// M104-003-001*/
    public static void main(String[] args) {
	// write your code here
        List<String> list=new ArrayList<>();
        list.add("M04-002-001");
        list.add("M3-602-001");
        list.add("M104-003-001");
        list.add("M103-002-11");
        list.add("M18-002-001");
        list.add("J01-002-001");
        list.add("A101-052-001");
        list.sort((x,y)->{
            String x1 = x.split("-")[0];
            String y1 = y.split("-")[0];
            String cx = x1;
            String cy = y1;
            if (x1.length()<4){
                if (x1.length()==2){
                    cx=x1.charAt(0) + "00" + x1.charAt(x1.length()-1);
                }else if (x1.length()==3){
                    cx=x1.charAt(0) + "0" + x1.charAt(x1.length()-1);
                }
            }
            if (y1.length()<4){
                if (y1.length()==2){
                    cy=y1.charAt(0) + "00" + y1.charAt(y1.length()-1);
                }else if (y1.length()==3){
                    cy=y1.charAt(0) + "0" + y1.charAt(y1.length()-1);
                }
            }
            return cx.compareTo(cy);
        });
        list.forEach(System.out::println);
    }
}
