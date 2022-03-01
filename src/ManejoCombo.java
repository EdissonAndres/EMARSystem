
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;


public class ManejoCombo {
   String nombreArchivoCombo = "Categorias.dbf";
   
    public void adicionarCategoria (String c) throws IOException
    {
        Combo b;
        File archivoClie = new File (nombreArchivoCombo);
        RandomAccessFile archivo = new RandomAccessFile(nombreArchivoCombo, "rw" );
        if (archivo.length()==0)
        {
            archivoClie.createNewFile();   
            b = new Combo(c,0);
            archivo.seek(0);
        }
        else
        {
            b = new Combo(c,numeroCategoria()+1);    
            archivo.seek( archivo.length() );  
        }
            b.guardarCategoria(archivo);
            archivo.close();
    }
    
    public String consultarCategoria (int n) throws IOException
    {
        Combo a = new Combo();
        boolean b = false;
        File archivoClie = new File (nombreArchivoCombo);
        RandomAccessFile archivo = null;
        if (archivoClie.exists()) 
        {
            archivo =  new RandomAccessFile( nombreArchivoCombo, "r" );  
            archivo.seek(0);   
            while ((!b) && (archivo.getFilePointer() < archivo.length()))
            {
                a.recuperarCategoria(archivo);
                if ( a.getNumero() == n )
                b = true;
            }
            archivo.close();    
        }
        return a.getCategoria();
    }
    
    public int numeroCategoria ()  throws IOException 
    {
        RandomAccessFile archivo = null;
        Combo x = new Combo();
        archivo =  new RandomAccessFile( nombreArchivoCombo, "r" );  
        archivo.seek(0);
        while (archivo.getFilePointer() < archivo.length())
        {
            x.recuperarCategoria(archivo);
        }
       archivo.close();
       return x.getNumero();
    }
}
