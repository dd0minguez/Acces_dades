package ADU1EX01_ddp;

import java.io.IOException;

public class AccesFileWriter43222998H {
    public void escritura(String pathOrigen, String copia) {
        
        try {
            java.io.FileWriter escritura = new java.io.FileWriter(pathOrigen);
            String data = copia;
            escritura.write(data);
            escritura.close();
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");
        }
    }
}
