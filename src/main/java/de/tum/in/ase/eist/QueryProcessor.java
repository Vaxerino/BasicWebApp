package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Comparator;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("largest")) {
            String[] numbers = query.split("\\:")[1].replaceAll(" ", "").split(",");
            int largest = Integer.MIN_VALUE;
            for (String num : numbers){
                if (Integer.parseInt(num)> largest){
                    largest = Integer.parseInt(num);
                }
            }
           return String.valueOf(largest);
        } else if (query.contains("plus")){ // TODO extend the programm here
            String[] numebrs = query.split(" ");
            for (int i = 0; i < numebrs.length; i++) {
                if (numebrs[i].equals("plus")){
                    return String.valueOf(Integer.parseInt(numebrs[i-1]) + Integer.parseInt(numebrs[i+1]));
                }
            }
            return "";
        } else if (query.contains("multiplied")) {
            String[] numebrs = query.split(" ");
            for (int i = 0; i < numebrs.length; i++) {
                if (numebrs[i].equals("multiplied")){
                    return String.valueOf(Integer.parseInt(numebrs[i-1]) * Integer.parseInt(numebrs[i+2]));
                }
            }
        }
        return "";
    }
}
