/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturassequenciais;

import java.util.Scanner;

/**
 *
 * @author aline.poliveira3
 */
public class Es02 {
    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);
         //ENTRADA
        System.out.print("Cateto 1: ");
        double c1 = NN.nextDouble();
        System.out.print("Cateo 2: ");
        double c2 = NN.nextDouble();

        //PROCESSAMENTO
        double H = Math.pow(c1, 2) + Math.pow(c2, 2);

        //SAIDA
        System.out.printf("O triangulo de lados %.1f e %.1f é %.2f", c1, c2, H);
        System.out.println("");
    }
}
