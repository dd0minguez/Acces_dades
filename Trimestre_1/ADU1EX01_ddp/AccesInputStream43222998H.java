package ADU1EX01_ddp;
import java.io.FileInputStream;
import java.io.IOException;

public class AccesInputStream43222998H {
    public String lectura(String pathOrigen) throws IOException {
        // System.out.println(pathOrigen);
        try { 
            
            FileInputStream lectura = new FileInputStream(pathOrigen);
            StringBuilder copia = new StringBuilder();
            int i;
            while ((i = lectura.read()) != -1) {
                copia.append((char) i);
            }
            lectura.close();
            System.out.print(copia.toString());
            
         } catch (java.io.FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
            return null;
        } catch (java.io.IOException e) {
            System.out.println("Error al leer el archivo");
            return null;
        }
        return copia.toString();
        // return null;
    }
}
