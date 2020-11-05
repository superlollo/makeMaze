package com.enigma;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import static com.enigma.Constants.*;

public class ProduceJSON {
    private  static     int x;
    private     static    int y;
    private static int X_Matrice;
    private static int X_Json;
    private static int Y_Matrice;
    private static int Y_Json;

    public static String doMaze() {
                String message = "";
                JSONArray percorsi = null;
                JSONObject difficolta = new JSONObject();
                FileWriter file;

                //EASY
                percorsi = new JSONArray();
                //NUMERO DI LABIRINTI
                for (int i = 1; i <= NUM_LAB; i++) {
                    JSONArray array = new JSONArray();
                    JSONObject labirinti = new JSONObject();
                    System.out.println("Crea Labirinto Facile n° "+String.valueOf(i));
                    String matrix[][] = new String[54][54];
                    for (int z = 0; z < matrix.length; z++) {
                        for (int u = 0; u < matrix.length; u++) {
                            matrix[z][u] = "0";
                        }
                    }
                    //NUMERO DI PASSI
                    for (int j = 1; j <= 54; j++) {
                        JSONObject item = new JSONObject();
                        Scanner in = new Scanner(System.in);
                        if(j!=1) {
                            switchMossa(in);
                        }
                        else{
                            randomXYFacile();
                            X_Matrice = X_Json = x;
                            Y_Matrice = Y_Json = y;
                        }
                        item.put("x", X_Json);
                        item.put("y", Y_Json);
                        matrix[X_Matrice][Y_Matrice] = ANSI_GREEN + "1" + ANSI_RESET;
                        for (int z = 0; z < matrix.length; z++) {
                            for (int u = 0; u < matrix.length; u++) {
                                System.out.print(matrix[z][u] + " ");
                            }
                            System.out.println();
                        }
                        matrix[X_Matrice][Y_Matrice] = ANSI_BLUE + "1" + ANSI_RESET;
                        array.add(item);
                    }
                    labirinti.put("maze", array);
                    percorsi.add(labirinti);
                }
                difficolta.put("easy", percorsi);

                //MEDIUM
                percorsi = new JSONArray();
                //NUMERO DI LABIRINTI
                for (int i = 1; i <= NUM_LAB; i++) {
                    JSONArray array = new JSONArray();
                    JSONObject labirinti = new JSONObject();
                    System.out.println("Crea Labirinto Medio n° "+String.valueOf(i));
                    String matrix[][] = new String[78][78];
                    for (int z = 0; z < matrix.length; z++) {
                        for (int u = 0; u < matrix.length; u++) {
                            matrix[z][u] = "0";
                        }
                    }
                    //NUMERO DI PASSI
                    for (int j = 1; j <= 78; j++) {
                        JSONObject item = new JSONObject();
                        Scanner in = new Scanner(System.in);
                        if(j!=1) {
                            switchMossa(in);
                        }
                        else{
                            randomXYMedio();
                            X_Matrice = X_Json = x;
                            Y_Matrice = Y_Json = y;
                        }
                        item.put("x", X_Json);
                        item.put("y", Y_Json);
                        matrix[X_Matrice][Y_Matrice] = ANSI_GREEN + "1" + ANSI_RESET;
                        for (int z = 0; z < matrix.length; z++) {
                            for (int u = 0; u < matrix.length; u++) {
                                System.out.print(matrix[z][u] + " ");
                            }
                            System.out.println();
                        }
                        matrix[X_Matrice][Y_Matrice] = ANSI_BLUE + "1" + ANSI_RESET;
                        array.add(item);
                    }
                    labirinti.put("maze", array);
                    percorsi.add(labirinti);
                }
                difficolta.put("medium", percorsi);


                //HARD
                percorsi = new JSONArray();
                //NUMERO DI LABIRINTI
                for (int i = 1; i <= NUM_LAB; i++) {
                    JSONArray array = new JSONArray();
                    JSONObject labirinti = new JSONObject();
                    System.out.println("Crea Labirinto Difficile n° "+String.valueOf(i));
                    String matrix[][] = new String[108][108];
                    for (int z = 0; z < matrix.length; z++) {
                        for (int u = 0; u < matrix.length; u++) {
                            matrix[z][u] = "0";
                        }
                    }
                    //NUMERO DI PASSI
                    for (int j = 1; j <= 108; j++) {
                        JSONObject item = new JSONObject();
                        Scanner in = new Scanner(System.in);
                        if(j!=1) {
                            switchMossa(in);
                        }
                        else{
                            randomXYDifficile();
                            X_Matrice = X_Json = x;
                            Y_Matrice = Y_Json = y;
                        }
                        item.put("x", X_Json);
                        item.put("y", Y_Json);
                        matrix[X_Matrice][Y_Matrice] = ANSI_GREEN + "1" + ANSI_RESET;
                        for (int z = 0; z < matrix.length; z++) {
                            for (int u = 0; u < matrix.length; u++) {
                                System.out.print(matrix[z][u] + " ");
                            }
                            System.out.println();
                        }
                        matrix[X_Matrice][Y_Matrice] = ANSI_BLUE + "1" + ANSI_RESET;
                        array.add(item);
                    }
                    labirinti.put("maze", array);
                    percorsi.add(labirinti);
                }
                difficolta.put("hard", percorsi);


            try {
                    file = new FileWriter("C:/Users/Luca/Desktop/Mazes.json");
                    file.write(difficolta.toJSONString());
                    file.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
                message = difficolta.toString();
                return message;
        }


    private static void switchMossa(Scanner in){
        System.out.print("Muovi: ");
        int mossa = in.nextInt();
        switch (mossa) {
            case (SU):
                X_Matrice = X_Matrice - 1;
                Y_Json = Y_Json + 1;
                break;
            case (GIU):
                X_Matrice = X_Matrice + 1;
                Y_Json = Y_Json - 1;
                break;
            case (SX):
                Y_Matrice = Y_Matrice - 1;
                X_Json = X_Json - 1;
                break;
            case (DX):
                Y_Matrice = Y_Matrice + 1;
                X_Json = X_Json + 1;
                break;
            default:
                break;
        }

    }

    private static void randomXYFacile() {
        Random r = new Random();
        int low = 10;
        int high = 44;
        x = r.nextInt(high - low) + low;
        y = r.nextInt(high - low) + low;
    }
    private static void randomXYMedio() {
        Random r = new Random();
        int low = 14;
        int high = 62;
        x = r.nextInt(high - low) + low;
        y = r.nextInt(high - low) + low;
    }
    private static void randomXYDifficile() {
        Random r = new Random();
        int low = 18;
        int high = 88;
        x = r.nextInt(high - low) + low;
        y = r.nextInt(high - low) + low;
    }
}
