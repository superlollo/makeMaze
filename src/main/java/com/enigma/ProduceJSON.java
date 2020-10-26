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
        public static String doMaze() {
                String message = "";
                JSONArray percorsi = null;
                JSONObject difficolta = new JSONObject();
                FileWriter file;

                //EASY
                percorsi = new JSONArray();
                //NUMERO DI LABIRINTI
                for (int i = 1; i <= 2; i++) {
                    JSONArray array = new JSONArray();
                    JSONObject labirinti = new JSONObject();
                    System.out.println("Crea Labirinto Facile n° "+String.valueOf(i));
                    int X_Matrice = 0;
                    int X_Json = 0;
                    int Y_Matrice = 0;
                    int Y_Json = 0;
                    String matrix[][] = new String[5][5];
                    for (int z = 0; z < matrix.length; z++) {
                        for (int u = 0; u < matrix.length; u++) {
                            matrix[z][u] = "0";
                        }
                    }
                    //NUMERO DI PERCORSI
                    for (int j = 1; j <= 5; j++) {
                        JSONObject item = new JSONObject();
                        Scanner in = new Scanner(System.in);
                        if(j!=1) {
                            System.out.print("Muovi: ");
                            int mossa = in.nextInt();
                            switch (mossa) {
                                case (8):
                                    X_Matrice = X_Matrice - 1;
                                    Y_Json = Y_Json + 1;
                                    break;
                                case (2):
                                    X_Matrice = X_Matrice + 1;
                                    Y_Json = Y_Json - 1;
                                    break;
                                case (4):
                                    Y_Matrice = Y_Matrice - 1;
                                    X_Json = X_Json - 1;
                                    break;
                                case (6):
                                    Y_Matrice = Y_Matrice + 1;
                                    X_Json = X_Json + 1;
                                    break;
                                default:
                                    break;
                            }
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
                for (int i = 1; i <= 2; i++) {
                    JSONArray array = new JSONArray();
                    JSONObject labirinti = new JSONObject();
                    System.out.println("Crea Labirinto Medio n° "+String.valueOf(i));
                    int X_Matrice = 0;
                    int X_Json = 0;
                    int Y_Matrice = 0;
                    int Y_Json = 0;
                    String matrix[][] = new String[5][5];
                    for (int z = 0; z < matrix.length; z++) {
                        for (int u = 0; u < matrix.length; u++) {
                            matrix[z][u] = "0";
                        }
                    }
                    //NUMERO DI PERCORSI
                    for (int j = 1; j <= 5; j++) {
                        JSONObject item = new JSONObject();
                        Scanner in = new Scanner(System.in);
                        if(j!=1) {
                            System.out.print("Muovi: ");
                            int mossa = in.nextInt();
                            switch (mossa) {
                                case (8):
                                    X_Matrice = X_Matrice - 1;
                                    Y_Json = Y_Json + 1;
                                    break;
                                case (2):
                                    X_Matrice = X_Matrice + 1;
                                    Y_Json = Y_Json - 1;
                                    break;
                                case (4):
                                    Y_Matrice = Y_Matrice - 1;
                                    X_Json = X_Json - 1;
                                    break;
                                case (6):
                                    Y_Matrice = Y_Matrice + 1;
                                    X_Json = X_Json + 1;
                                    break;
                                default:
                                    break;
                            }
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
                for (int i = 1; i <= 2; i++) {
                    JSONArray array = new JSONArray();
                    JSONObject labirinti = new JSONObject();
                    System.out.println("Crea Labirinto Difficile n° "+String.valueOf(i));
                    int X_Matrice = 0;
                    int X_Json = 0;
                    int Y_Matrice = 0;
                    int Y_Json = 0;
                    String matrix[][] = new String[5][5];
                    for (int z = 0; z < matrix.length; z++) {
                        for (int u = 0; u < matrix.length; u++) {
                            matrix[z][u] = "0";
                        }
                    }
                    //NUMERO DI PERCORSI
                    for (int j = 1; j <= 5; j++) {
                        JSONObject item = new JSONObject();
                        Scanner in = new Scanner(System.in);
                        if(j!=1) {
                            System.out.print("Muovi: ");
                            int mossa = in.nextInt();
                            switch (mossa) {
                                case (8):
                                    X_Matrice = X_Matrice - 1;
                                    Y_Json = Y_Json + 1;
                                    break;
                                case (2):
                                    X_Matrice = X_Matrice + 1;
                                    Y_Json = Y_Json - 1;
                                    break;
                                case (4):
                                    Y_Matrice = Y_Matrice - 1;
                                    X_Json = X_Json - 1;
                                    break;
                                case (6):
                                    Y_Matrice = Y_Matrice + 1;
                                    X_Json = X_Json + 1;
                                    break;
                                default:
                                    break;
                            }
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
                    file = new FileWriter("C:/Users/Luca/Desktop/Enigma.json");
                    file.write(difficolta.toJSONString());
                    file.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
                message = difficolta.toString();
                return message;
        }

    private static void randomXYFacile() {
        Random r = new Random();
        int low = 2;
        int high = 4;
        x = r.nextInt(high - low) + low;
        y = r.nextInt(high - low) + low;
    }
    private static void randomXYMedio() {
        Random r = new Random();
        int low = 2;
        int high = 4;
        x = r.nextInt(high - low) + low;
        y = r.nextInt(high - low) + low;
    }
    private static void randomXYDifficile() {
        Random r = new Random();
        int low = 2;
        int high = 4;
        x = r.nextInt(high - low) + low;
        y = r.nextInt(high - low) + low;
    }

    public static void main(String[] args) {
        System.out.println(doMaze());
    }
}
