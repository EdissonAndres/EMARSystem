import java.io.*;
import javax.swing.JOptionPane;

public class ManejoProducto {
    
    String nombreArchivoProducto = "Productos.dbf";
    Excepciones o = new Excepciones();
    
    public void adicionarProducto(String cp, String d, String m, String cat, String c, String vu)  throws IOException
    {
        boolean f = o.Producto(cp, c, vu);
        if (f){
            
            Producto p;
            File archivoProd = new File (nombreArchivoProducto);
            try (RandomAccessFile archivo = new RandomAccessFile(nombreArchivoProducto, "rw" ) 
            ) {
                p = new Producto(cp,d,m,cat,Long.parseLong(c),Long.parseLong(vu));
                if (!archivoProd.exists())
                    archivoProd.createNewFile();  
                archivo.seek( archivo.length() ); 
                p.guardarProducto(archivo);
                archivo.close();
            }
        }
        else
            JOptionPane.showMessageDialog(null, "ERROR");
    }
    
    public Producto consultarProducto(String cp) throws IOException 
    {
        Producto x = new Producto();
        boolean b = false;
        File archivoProd = new File (nombreArchivoProducto);
        RandomAccessFile archivo = null;
        if (archivoProd.exists()) 
        {
            archivo =  new RandomAccessFile( nombreArchivoProducto, "r" );
            archivo.seek(0);  
            while ((!b) && (archivo.getFilePointer() < archivo.length()))
            {
                x.recuperarProducto(archivo);
                if ((x.getCodProducto().equals(cp)) && (x.getCantidad()!= -1))
                b = true;
            }
            archivo.close();    
        }
        if (b)
            return x;
        else
            return null;
   }
    public Producto consultarProductoAgg(String cp, String m) throws IOException 
    {
        Producto x = new Producto();
        boolean b = false;
        File archivoProd = new File (nombreArchivoProducto);
        RandomAccessFile archivo = null;
        if (archivoProd.exists()) 
        {
            archivo =  new RandomAccessFile( nombreArchivoProducto, "r" );
            archivo.seek(0);  
            while ((!b) && (archivo.getFilePointer() < archivo.length()))
            {
                x.recuperarProducto(archivo);
                if (x.getMarca().equals(m) && (x.getDescripcion().equals(cp)))
                b = true;
            }
            archivo.close();    
        }
        if (b)
            return x;
        else
            return null;
   }
    
    public void adicionarCantidad (String cp, int n, long c)  throws IOException 
     {
        long aux = 0;
        File archivoPro = new File (nombreArchivoProducto);
        RandomAccessFile archivo = null; 
        boolean b = false; 
        if (archivoPro.exists())
        {     
           long ap;              
           Producto x = new Producto();  
           archivo =  new RandomAccessFile( nombreArchivoProducto, "rw" );  
           archivo.seek(0);   
           while ((!b) && (archivo.getFilePointer() < archivo.length()))
            { 
                ap = archivo.getFilePointer();
                x.recuperarProducto(archivo);
                if ((x.getCodProducto().equals(cp)) && (x.getCantidad()!= -1))
                {
                    if (n == 1){
                        aux = (x.getCantidad() + c);
                        x.setCantidad (aux);
                    }
                    if (n == 2){
                        aux = (x.getCantidad() - c);
                        x.setCantidad (aux);
                    }
                    archivo.seek(ap);     
                    x.guardarProducto(archivo);   
                    b = true;
                }
            }
           archivo.close();   
        }
        if (!b)
            JOptionPane.showMessageDialog(null, "ERROR");
    }
    
    public void listarMerca()  throws IOException 
    {
        File archivoMer = new File (nombreArchivoProducto);
        RandomAccessFile archivo = null;  
        if (archivoMer.exists())
        {  
            Producto x = new Producto();
            archivo =  new RandomAccessFile( nombreArchivoProducto, "r" );  
            archivo.seek(0);      
            while (archivo.getFilePointer() < archivo.length())
            {
                x.recuperarProducto(archivo);
                if (x.getCantidad() > -1)
                    x.mostrarDatos(); 
            }
            archivo.close();    
        }     
    }
}
