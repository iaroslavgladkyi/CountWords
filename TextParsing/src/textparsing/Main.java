/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textparsing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
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
        String textReadeble = text.replace(".","").replace(",", "").replace("!", "").toLowerCase();
      //  System.out.println(textReadeble);
        
        String[] textArray = textReadeble.split(" ");
        
        System.out.println(Arrays.toString(textArray));
        
    }
    
}
