
package Controller;

import Model.ModelAccesorio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


public class ControllerAccesorio implements ActionListener{
    private static ModelAccesorio modelAccesorio;
     
     public static void main(String[] args) {
        System.out.println("***** Controlador *****");
        System.out.println("Digite el numero");
         
        Scanner scan = new Scanner(System.in);
        int aux = scan.nextInt();
          
        switch (aux) {
            case 1:
                listarUsuario();
            break;
            default:
                System.out.println("It's something else.");
            break;
        }
    }
    
 
    public ControllerAccesorio(ModelAccesorio modelAccesorio) {
        this.modelAccesorio = modelAccesorio;
    }
    public static void crearAccesorio(){
        modelAccesorio.crearAccesorio();
    }
    public static void listarUsuario(){
       modelAccesorio.listarAccesorio();
    }
    
   
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
