package ADU1EX01_ddp;

public class AccesFileReader43222998H {
    public String lectura(String pathOrigen) {
        try {
            java.io.FileReader lectura = new java.io.FileReader(pathOrigen);
            StringBuilder copia = new StringBuilder();
            int i;
            while ((i = lectura.read()) != -1) {
                copia.append((char) i);
            }
            lectura.close();
            // System.out.print(copia);
            return copia.toString();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error al leer el archivo");
            return null;
        } catch (java.io.IOException e) {
            System.out.println("Error al leer el archivo");
            return null;
        }
        
    }
}
