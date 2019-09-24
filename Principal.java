package ExercicioInterface;

import javax.swing.JOptionPane;


public class Principal {

    public static void main(String[] args) {

        String NumBuild = JOptionPane.showInputDialog(null,"digite o numero de builds");
        int nb = Integer.parseInt(NumBuild);
        Building[] array = new Building[nb] ;
        
        String NumCar = JOptionPane.showInputDialog(null,"digite o numero de carros");
        int nc = Integer.parseInt(NumCar);
        Car[] array1 = new Car[nc];
      
       
        
        

       

    }
}
