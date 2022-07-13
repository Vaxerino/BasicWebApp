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
        } else if (query.contains("numbers")) {
            String[] numbers = query.split(":")[1].split(",");
            int largest = Integer.MIN_VALUE;
            for (String num : numbers){
                if (Integer.parseInt(num)> largest){
                    largest = Integer.parseInt(num);
                }
            }
           return String.valueOf(largest);
        } else { // TODO extend the programm here
            return "";
        }
    }
}
