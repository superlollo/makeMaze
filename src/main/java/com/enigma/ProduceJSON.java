package com.enigma;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static com.enigma.Constants.*;

public class ProduceJSON {
        public static String doMaze() {
                String message = "";
                JSONObject percorsiMedio = new JSONObject();
                JSONObject percorsiDifficile = new JSONObject();
                JSONObject difficolta = new JSONObject();
                JSONArray percorsiFacile = new JSONArray();
                FileWriter file;

            //EASY
                //NUMERO DI LABIRINTI
                for (int i = 1; i <= 3; i++) {
                    JSONArray array = new JSONArray();
                    JSONObject labirinti = new JSONObject();
                    System.out.println("Crea Labirinto n° "+String.valueOf(i));
                    int X_Matrice = X_MATRICE_FACILE;
                    int X_Json = X_JSON_FACILE;
                    int Y_Matrice = Y_MATRICE_FACILE;
                    int Y_Json = Y_JSON_FACILE;
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
                                case (1):
                                    X_Matrice = X_Matrice - 1;
                                    Y_Json = Y_Json + 1;
                                    break;
                                case (2):
                                    X_Matrice = X_Matrice + 1;
                                    Y_Json = Y_Json - 1;
                                    break;
                                case (3):
                                    Y_Matrice = Y_Matrice - 1;
                                    X_Json = X_Json - 1;
                                    break;
                                case (4):
                                    Y_Matrice = Y_Matrice + 1;
                                    X_Json = X_Json + 1;
                                    break;
                                default:
                                    break;
                            }
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
                    percorsiFacile.add(labirinti);
                }
                difficolta.put("Easy", percorsiFacile);
                try {
                    file = new FileWriter("/C:/Users/loren/Desktop/Enigma.json");
                    file.write(difficolta.toJSONString());
                    file.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
                message = difficolta.toString();
                return message;
        }

    public static void main(String[] args) {
        System.out.println(doMaze());
    }
}
