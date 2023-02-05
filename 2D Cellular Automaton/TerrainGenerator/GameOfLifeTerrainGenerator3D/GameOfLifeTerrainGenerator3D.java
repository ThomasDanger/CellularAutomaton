
package com.mycompany.main;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Random rand = new Random();
        
        int sizeX = 32;
        int sizeY = 32;
        int sizeZ = 32;
        
        boolean[][][] terrain = new boolean[sizeZ][sizeX][sizeY];
        
        for(int i = 0; i < sizeX; i++){
            for(int j = 0; j < sizeY; j++){
                terrain[0][i][j] = rand.nextBoolean();
            }
        }
        
        for(int i = 1 ; i < sizeZ; i++){
            terrain[i] = gameOfLife(terrain[i-1]);
        }
        
        printTerrain(terrain);
    }
    
    public static boolean[][] gameOfLife(boolean[][] prev){
        boolean[][] next = new boolean[prev.length][prev[0].length];
        
        int sizeX = prev.length;
        int sizeY = prev[0].length;
        
        for(int i = 0; i < sizeX; i++){
            for(int j = 0; j < sizeY; j++){
                int neighbors = 0;
                
                if(prev[i][(j-1+sizeY)%sizeY])
                    neighbors++;
                if(prev[i][(j+1)%sizeY])
                    neighbors++;
                if(prev[(i-1+sizeX)%sizeX][(j-1+sizeY)%sizeY])
                    neighbors++;
                if(prev[(i-1+sizeX)%sizeX][j])
                    neighbors++;
                if(prev[(i-1+sizeX)%sizeX][(j+1)%sizeY])
                    neighbors++;
                if(prev[(i+1)%sizeX][(j-1+sizeY)%sizeY])
                    neighbors++;
                if(prev[(i+1)%sizeX][j])
                    neighbors++;
                if(prev[(i+1)%sizeX][(j+1)%sizeY])
                    neighbors++;
                
                if(prev[i][j] &&(neighbors == 2 || neighbors == 3))
                    next[i][j] = true;
                if(!prev[i][j] && neighbors == 3)
                    next[i][j] = true;
            }
        }
        return next;
    } 
    
    public static void printTerrain(boolean[][][] terrain){
        int sizeX = terrain[0].length;
        int sizeY = terrain[0][0].length;
        int sizeZ = terrain.length;
        
        String asciiGradient = "$@B%8&WM#*oahkbdpqwmZO0QLCJUYXzcvunxrjft/\\|()1{}[]?-_+~<>i!lI;:,\"^`'. ";
        
        System.out.println("\nTOP:");
        for(int i = 0; i < sizeX; i++){
            for(int j = 0; j < sizeY; j++){
                for(int k = sizeZ-1; k>=0; k--){
                    if(terrain[k][i][j]){
                        System.out.print(""+asciiGradient.charAt(((sizeZ-k)*(asciiGradient.length()/sizeZ))%70) + asciiGradient.charAt(((sizeZ-k)*(asciiGradient.length()/sizeZ))%70));
                        break;
                    }
                    if(k == 0)
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
        
        System.out.println("\nFRONT:");
        for(int i = sizeZ-1; i >=0; i--){
            for(int j = 0; j <sizeY; j++){
                for(int k = sizeX-1; k>=0; k--){
                    if(terrain[i][k][j]){
                        System.out.print(""+asciiGradient.charAt(((sizeX-k)*(asciiGradient.length()/sizeX))%70) + asciiGradient.charAt(((sizeX-k)*(asciiGradient.length()/sizeX))%70));
                        break;
                    }
                    if(k == 0)
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
        
        
        System.out.println("\nSIDE:");
        for(int i = sizeZ-1; i >=0; i--){
            for(int j = sizeX-1; j >=0 ; j--){
                for(int k = 0; k<sizeY; k++){
                    if(terrain[i][j][k]){
                        System.out.print(""+asciiGradient.charAt(((k)*(asciiGradient.length()/sizeY))%70) + asciiGradient.charAt(((k)*(asciiGradient.length()/sizeY))%70));
                        break;
                    }
                    if(k == sizeY-1)
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
