package ADU1EX01_ddp;

import java.io.File;

public class File43222998H {
    public static void main(String pathOrigen) {
        try {
            File archivo = new File(pathOrigen);
            archivo.setWritable(false);
            System.out.println("Se han quitado los permisos de escritura correctamente.");
        }
        catch (Exception e) {
            System.out.println("Error al quitar los permisos de escritura.");
        }
    }
}
