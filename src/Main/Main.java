package Main;

import com.org.JFiles.Archivos.Archivos;
import com.org.JFiles.Vistas.Vistas;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
public class Main {

    public static void main(String[] args) throws InterruptedException, InvocationTargetException, IOException {
        File ChooserFile = Vistas.ChooserFolder("J - Blue","Seleccionar");
        ChooserFile = Archivos.Operaciones.CrearArchivo(ChooserFile, "prueba", "txt");
        String xd = Archivos.Operaciones.LeerArchivo(ChooserFile);
        Archivos.Operaciones.EscribirArchivo(ChooserFile, "Hola mundo"
                + "\nxddd" 
                + "\n" + xd
        );
        System.out.println(Archivos.Operaciones.LeerArchivo(ChooserFile));
    }
    
}
