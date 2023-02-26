//Byl's Loop

package com.mycompany.main;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[32][64];
        HashMap<String, Integer> ruleSet = new HashMap();
                
        try{
            ruleSet = getRuleSetFromFile();
        }
        catch(FileNotFoundException e){
            System.out.println("Could not find rule set file");
        }
        insertLangtonLoop(arr);
        
        System.out.println("Enter number of frames: ");
        int frames =scan.nextInt();
        
        for(int i = 0; i < frames; i++){
            arr = calcNext(arr, ruleSet);
        }
        printArr(arr);
        
        
    }
    
    public static HashMap getRuleSetFromFile() throws FileNotFoundException{
        
        File ruleFile = new File("ruleset.txt");
        Scanner scan = new Scanner(ruleFile);
        HashMap<String,Integer> ruleSet = new HashMap<>();
        
        while(scan.hasNext()){
            String curKey = scan.next();
            String curOut = scan.next();
            
            ruleSet.put(curKey, Integer.parseInt(curOut));
        }
        scan.close();
        return ruleSet;
    }
    
    public static void insertLangtonLoop(int[][] arr){
        int[][] loop =  new int[][]{{0,2,2,0},
                                    {2,3,1,2},
                                    {2,3,4,2},
                                    {0,2,5,0}};
        
        for(int i = 0; i <loop.length; i++){
            for(int j = 0; j<loop[i].length; j++){
                arr[i][j] = loop[i][j];
            }
        }
        
    }
    
    public static int[][] calcNext(int[][] prev, HashMap<String,Integer> ruleSet){
        int[][] next = new int[prev.length][prev[0].length];
        
        for(int i = 0; i < prev.length; i++){
            for(int j = 0; j < prev[0].length; j++){
                
                String key = "";
                
                //CTRBL
                
                key += prev[i][j];
                key += prev[(i-1+prev.length)%prev.length][j];
                key += prev[i][(j+1)%prev[0].length];
                key += prev[(i+1)%prev.length][j];
                key += prev[i][(j-1+prev[0].length)%prev[0].length];
                
                key = reverseKey(key);
                
                for(int p = 0; p < 4; p++){
                    
                    
                    if(ruleSet.containsKey(key)){
                        break;
                    }
                    
                    key = shiftKeyLeft(key);
                    
                }
                
                if(ruleSet.containsKey(key))
                    next[i][j] = ruleSet.get(key);
                else{
                    next[i][j] = ruleSet.get(""+key.charAt(0));
                }
            }
        }
        
        return next;
    }
    
    public static String reverseKey(String key){
        return ""+key.charAt(0)+key.charAt(4)+key.charAt(3)+key.charAt(2)+key.charAt(1);
    }
    public static String shiftKeyLeft(String key){
        return ""+key.charAt(0)+key.charAt(2)+key.charAt(3)+key.charAt(4)+key.charAt(1);
    }
    
    
    public static void printArr(int[][] arr){
        String asciiGradient = " .$[tzZo";
        String asciiColor = " BRGYMWC";
        String numbers = " 12345678";
        
        for(int i = 0; i < arr.length; i ++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(""+asciiColor.charAt(arr[i][j]));
            }
            System.out.println();
        }
        System.out.println();
    }
}
