package ADU1EX01_ddp;

import java.io.IOException;

public class ADU1EX01_ddp {
        public static void main(String[] args) throws IOException {

            String pathOrigen = "fondo.JPG";
            String pathDestinoCaracter = "File2.txt";
            String pathDestinobinario = "fondo2.JPG";

            if (pathOrigen.endsWith(".txt")) {
            AccesFileReader43222998H lecturaTexto = new AccesFileReader43222998H();  
            lecturaTexto.lectura(pathOrigen);
            AccesFileWriter43222998H escritura = new AccesFileWriter43222998H();
            escritura.escritura(pathDestinoCaracter, lecturaTexto.lectura(pathOrigen));
            File43222998H.main(pathOrigen);
            lecturaTexto.lectura(pathOrigen);
            } else {  
            AccesInputStream43222998H lecturaBinario = new AccesInputStream43222998H();
            lecturaBinario.lectura(pathOrigen);
            AccesOutputStream43222998H escrituraBinario = new AccesOutputStream43222998H();
            escrituraBinario.escritura(pathDestinobinario, lecturaBinario.lectura(pathDestinobinario));
            File43222998H.main(pathOrigen);
            lecturaBinario.lectura(pathOrigen);
            }  
        }
}