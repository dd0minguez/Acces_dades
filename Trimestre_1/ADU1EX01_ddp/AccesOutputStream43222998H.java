package ADU1EX01_ddp;

public class AccesOutputStream43222998H {
    public void escritura(String pathOrigen, String copia) {
        try {
            java.io.FileOutputStream escritura = new java.io.FileOutputStream(pathOrigen);
            String data = copia;
            escritura.write(data.getBytes());
            escritura.close();
        } catch (java.io.IOException e) {
            System.out.println("Error al escribir el archivo");
        }
    }
}
