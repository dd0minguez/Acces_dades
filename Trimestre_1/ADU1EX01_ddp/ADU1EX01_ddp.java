package ADU1EX01_ddp;

import java.nio.file.Path;

public class ADU1EX01_ddp {
        public static void main(String[] args) {

            String pathOrigen = "ADU1EX01_ddp/fondo.png";
            String pathDestinotexto = "File2.txt";
            String pathDestinobinario = "fondo2.png";

            // AccesFileReader43222998H lectura = new AccesFileReader43222998H();  
            // lectura.lectura(pathOrigen);
            // AccesFileWriter43222998H escritura = new AccesFileWriter43222998H();
            // escritura.escritura(pathDestinotexto, lectura.lectura(pathOrigen));

            AccesInputStream43222998H lectura= new AccesInputStream43222998H();
            String algo = lectura.lectura(pathOrigen);
            AccesOutputStream43222998H escrituraBinario = new AccesOutputStream43222998H();
            escrituraBinario.escritura(pathDestinobinario, lectura.lectura(pathDestinobinario));
            
            // String pathOrigen = "File.txt";
            // String pathDestino = "File2.txt";

            // if (pathOrigen == pathOrigen.length(3){

            // })
                
        }
}