/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package natacion;


/*
 * 
 * Para sacar el promedio de quien saco mayor puntaje
 * solamente debo de agregar esos valores a un ACOMULADOR 
 * sumar y dividir por el número de la dimensión del arreglo.
*/


import javax.swing.*;
public class Natacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Definir cantidad de nadadores
        int longitudNadadores = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de nadadores"));

        //Definir cantidad de tiempo 
        int longitudTiempo = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de tiempos que desea registrar"));
        //int longitudTiempo = 1;
        
        
        String nadador = " ";
        int tiempoValor = 0;
        int promedioTiempo = 0;
        int tiempoTotal =0;
        int valorComparable = 0;
        int ganador = 0;
        

        //En esta variable guardamos el promedio
        int promedioTotalTiempo [] = new int[longitudNadadores];
        String nadadores[] = new String[longitudNadadores];     
        int tiempo[] = new int[longitudTiempo];


        //Ciclo que representa los nadadores
        for(int i = 0;i < nadadores.length;i++){
            nadador = JOptionPane.showInputDialog("Digite el nombre del nadador");
            //nadador = "Jhon doe";
            nadadores[i] = nadador;
            
            
            //Ciclo que representa el tiempo
            for(int j = 0; j < tiempo.length;j++){
                
                tiempoValor = Integer.parseInt(JOptionPane.showInputDialog(null, "Tiempo #"+(j+1), 
                "Nadador: #"+(i+1)+" "+(nadadores[i]), JOptionPane.INFORMATION_MESSAGE));
                
                promedioTiempo += tiempoValor;
                

                tiempo[j] = tiempoValor;
                //Saco promedio del tiempo
                tiempoTotal = (promedioTiempo / longitudTiempo);

                System.out.println(tiempoTotal);
                
                //Guardo Promedio en arreglo
                promedioTotalTiempo[i] = tiempoTotal;
                


            }  
            promedioTiempo = 0;
        }
        
        
        valorComparable = promedioTotalTiempo[0];
        
        
        for(int k=0;k<promedioTotalTiempo.length;k++){
            System.out.println("Promedio de los nadadores"+promedioTotalTiempo[k]);
            if(promedioTotalTiempo[k] < valorComparable){
                valorComparable = promedioTotalTiempo[k];
            }
            
        }
        System.out.println("El ganador es"+valorComparable);
        
        
        
        
 }   
    
}
