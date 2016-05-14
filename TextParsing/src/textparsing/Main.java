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
        String textReadeble = text.replace(".","").replace(",", "").replace("!", "").replace("?", "").toLowerCase();
      //  System.out.println(textReadeble);
        
        String[] textArray = textReadeble.split(" ");
        
       System.out.println(Arrays.toString(textArray));
        Map<String,Integer> countRepetitions = new HashMap<String,Integer>();
        
        for (int i = 0; i < textArray.length; i++){
            //int counter = 0;
            //if (textArray[i].equals(word)) counter++;
            countRepetitions.put(textArray[i],1);
        }
        
        System.out.println(countRepetitions.size());
    }
    
}
