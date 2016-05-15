/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textparsing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author gaffs
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String text = reader.readLine();
        //System.out.println(text);
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        //System.out.println(text);
        String textReadeble = text.replace(".", "").replace(",", "").replace("!", "").replace("?", "").toLowerCase();
        //  System.out.println(textReadeble);

        String[] textArray = textReadeble.split(" ");
        Arrays.sort(textArray);

        System.out.println(Arrays.toString(textArray));
        Map<String, Integer> countRepetitions = new HashMap<String, Integer>();
        Integer compareElement;
        for (String element : textArray) {

            compareElement = countRepetitions.get(element);
            countRepetitions.put(element, compareElement == null ? 1 : compareElement + 1);

        }
        System.out.println(countRepetitions.size());
        //System.out.println(countRepetitions);

        Set<Map.Entry<String, Integer>> entrySet = countRepetitions.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.print(entry.getKey() + ": ");
            System.out.println(entry.getValue());

        }

    }
}
