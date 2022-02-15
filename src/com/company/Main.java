package com.company;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        Calculos data = new Calculos();
        System.out.println("Actividad 5 Computacion en Java");
        System.out.println("Digite el valor para X");
        int x = Integer.parseInt(reader.readLine());
        System.out.println("Digite el valor para Y");
        int y = Integer.parseInt(reader.readLine());
        System.out.println("X: "+ x +"\r\n" +
                "Y: " + y + " \r\n"+
                "Suma :" + data.suma(x, y) + "\r\n" +
                "Resta: " + data.resta(x, y) + "\r\n" +
                "Multiplicacion : " + data.multiplicacion(x, y) + "\r\n" +
                "Division :" + data.division(x, y) + "\r\n" +
                "Modulo: " + data.modulo(x, y) + "\r\n" );

    }
}
