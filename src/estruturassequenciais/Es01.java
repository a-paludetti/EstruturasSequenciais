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
public class Es01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);
        //ENTRADAS
        System.out.println("Quantos litros foram colocados?");
        double L = NN.nextDouble();
        System.out.println("Quantos kilometros ira percorrer?");
        double K = NN.nextDouble();
        //PROCESSAMENTO
        double kml = K/L;
        //SAIDA
        System.out.println("O carro faz "+kml+"km/l.");
    }
    
}
