import java.io.*;
import javax.swing.JOptionPane;

public class ManejoAbono {
    
    String nombreArchivoAbono = "Abonos.dbf";
    Excepciones o = new Excepciones();
    
    public void adicionarAbono(String nv, String f, long a)  throws IOException
    {
        Abonos p;
        File archivoProd = new File (nombreArchivoAbono);
        try (RandomAccessFile archivo = new RandomAccessFile(nombreArchivoAbono, "rw" ) 
                ) {
            p = new Abonos(nv,f,a);
            if (!archivoProd.exists())
                archivoProd.createNewFile();  
            archivo.seek( archivo.length() ); 
            p.guardarAbono(archivo);
            archivo.close();
        }
    }
}
