import java.awt.Component;
import java.io.*;
import javax.swing.JOptionPane;

public class ManejoVenta
{
    String nombreArchivoVenta = "Venta.dbf";
    
    public void adicionarVenta(String c, String f, String n, String v, String deu)  throws IOException 
     {
       RandomAccessFile archivo = new RandomAccessFile(nombreArchivoVenta, "rw" );  
       if (archivo.length()==0){
           Venta x = new Venta(c,f,n,Long.parseLong(v),1,Long.parseLong(deu));
           archivo.seek(0);  
           x.guardarVenta(archivo);
           archivo.close();
       }
       else {
           long numF = numeroFactura();
           Venta x = new Venta(c,f,n,Long.parseLong(v),numF+1,Long.parseLong(deu));
           archivo.seek( archivo.length() );  
           x.guardarVenta(archivo);
           archivo.close();
       }
       
     }
     
    
    public Venta consultarVenta(String buscar)  throws IOException 
    {
       File archivoVen = new File (nombreArchivoVenta);
       RandomAccessFile archivo = null;
       boolean b = false;
       Venta x = new Venta();
       if (archivoVen.exists())
       {  
            archivo =  new RandomAccessFile( nombreArchivoVenta, "r" );  
            archivo.seek(0);     
            while ((!b) && (archivo.getFilePointer() < archivo.length()))
            {
                x.recuperarVenta(archivo);
                if ((x.getNumeroVenta() == Long.parseLong(buscar)) || (x.getCodigoCliente().equals(buscar)))
                b = true;
            }
            archivo.close();
        }
        if (b)
            return x; 
        else 
            return null;
    }

public void editarVenta (String id, String v)  throws IOException 
     {
        long aux = 0;
        File archivoVen = new File (nombreArchivoVenta);
        RandomAccessFile archivo = null; 
        boolean b = false; 
        if (archivoVen.exists())
        {     
           long ap;              
           Venta x = new Venta();  
           archivo =  new RandomAccessFile( nombreArchivoVenta, "rw" );  
           archivo.seek(0);   
           while ((!b) && (archivo.getFilePointer() < archivo.length()))
            { 
                ap = archivo.getFilePointer();
                x.recuperarVenta(archivo);
                if ((x.getNumeroVenta() == Long.parseLong(id)))
                {
                    aux = (x.getDeuda() - Long.parseLong(v));
                    x.setDeuda(aux);
                    archivo.seek(ap);     
                    x.guardarVenta(archivo);   
                    b = true;
                }
            }
           archivo.close();  
           if (!b)
               JOptionPane.showMessageDialog(null, "ERROR"); 
        }
    }

    public long numeroFactura ()  throws IOException 
    {
        RandomAccessFile archivo = null;
        Venta x = new Venta();
        archivo =  new RandomAccessFile( nombreArchivoVenta, "r" );  
        archivo.seek(0);
        while (archivo.getFilePointer() < archivo.length())
        {
            x.recuperarVenta(archivo);
        }
       archivo.close();
       return x.getNumeroVenta();
    }
 
    public void listarVenta()  throws IOException 
     {
       File archivoVen = new File (nombreArchivoVenta);
       RandomAccessFile archivo = null;  
       if (archivoVen.exists())
          {  
            Venta x = new Venta();
            archivo =  new RandomAccessFile( nombreArchivoVenta, "r" );  
            archivo.seek(0);      
            while (archivo.getFilePointer() < archivo.length())
             {
               x.recuperarVenta(archivo);
               x.mostrarDatos(); 
             }
            archivo.close();    
          }     
    }
}