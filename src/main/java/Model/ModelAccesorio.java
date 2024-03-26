package Model;

import Entities.*;
import java.util.*;

public class ModelAccesorio {
    
   public Map<String, Object> accesorioBisuteria = new HashMap<>();
    
    // Agregar atributos al diccionario
   public static void crearAccesorio(Map<String, Object> accesorioBisuteria){
        
        accesorioBisuteria.put("Tipo de accesorio", "Collar");
        accesorioBisuteria.put("Material", "Vidrio");
        accesorioBisuteria.put("Color", "Azul");
        accesorioBisuteria.put("Estilo o diseño", "Vintage");
        accesorioBisuteria.put("Longitud", "45 cm");
        accesorioBisuteria.put("Detalle decorativo", "Cuentas de vidrio con perlas de imitación");
        accesorioBisuteria.put("Tipo de cierre", "Broche de gancho");
        accesorioBisuteria.put("Precio", 25.99);
        accesorioBisuteria.put("Marca", "Bijoux Fantaisie");
        accesorioBisuteria.put("Ocasion", "Uso diario");
        accesorioBisuteria.put("Estado", "Nuevo");
   }
          
    public static void listarAccesorio(){
        try{
            System.out.println("-------------- Listar los Accesorios Registrados -----------------------");
            
            
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public void crearAccesorio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
