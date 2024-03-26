

package com.mycompany.proyectoinventariosbisuteria;

import Controller.ControllerAccesorio;
import Model.ModelAccesorio;
import java.util.*;

public class ProyectoInventariosBisuteria {
    
    static ControllerAccesorio controladorAccesorio;
    
    public static void main(String[] args) {
        boolean whileaux = true ;
        int aux=0;
       
        while(whileaux){
            ModelAccesorio ModeloAccesorio = new ModelAccesorio();
            controladorAccesorio = new ControllerAccesorio(ModeloAccesorio);
            controladorAccesorio.main(args);  
       }
        
    }
}
