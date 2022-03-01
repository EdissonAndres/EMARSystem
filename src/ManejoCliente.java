import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

public class ManejoCliente {
    
    String nombreArchivoCliente = "Clientes.dbf";
    
    Excepciones Exp = new Excepciones();
    public void adicionarCliente (String id, String n, String d, String t, String deu)  throws IOException
    {
        boolean b = Exp.Cliente(id, t, deu);
        if (b){
            Cliente c;
            File archivoClie = new File (nombreArchivoCliente);
            try (RandomAccessFile archivo = new RandomAccessFile(nombreArchivoCliente, "rw" ) 
            ) {
                c = new Cliente(id,n,d,t,Long.parseLong(deu));
                if (!archivoClie.exists())
                  archivoClie.createNewFile();   
                archivo.seek( archivo.length() );  
                c.guardarCliente(archivo);
                archivo.close();
            }
        }
        if (!b)
            JOptionPane.showMessageDialog(null, "ERROR");
        else 
            JOptionPane.showMessageDialog(null, "CLIENTE CREADO EXITOSAMENTE");
    }
    
    public Cliente consultarCliente (String id) throws IOException 
    {
        Cliente x = new Cliente();
        boolean b = false;
        File archivoClie = new File (nombreArchivoCliente);
        RandomAccessFile archivo = null;
        if (archivoClie.exists()) 
        {
            archivo =  new RandomAccessFile( nombreArchivoCliente, "r" );  
            archivo.seek(0);   
            while ((!b) && (archivo.getFilePointer() < archivo.length()))
            {
                x.recuperarCliente(archivo);
                if ((x.getIdentificacion().equals(id)) && (x.getDeuda()!= -1))
                b = true;
            }
            archivo.close();    
        }
        if (b)
            return x;
        else
            return null;
    }
    
    public void modificarDeuda (String id, String d)  throws IOException 
    {
            File archivoClie = new File (nombreArchivoCliente);
            RandomAccessFile archivo = null;  
            if (archivoClie.exists())
            {  
                boolean b = false;    
                long ap;              
                Cliente x = new Cliente();  
                archivo =  new RandomAccessFile( nombreArchivoCliente, "rw" );  
                archivo.seek(0);   
                while ((!b) && (archivo.getFilePointer() < archivo.length()))
                {    
                    ap = archivo.getFilePointer();
                    x.recuperarCliente(archivo);
                    if ((x.getIdentificacion().equals(id)) && (x.getDeuda()!= -1))
                    {   
                        x.setDeuda(Long.parseLong(d));
                        archivo.seek(ap);     
                        x.guardarCliente(archivo);   
                        b = true;
                    }
                }
                archivo.close();   
                if (!b)
                    JOptionPane.showMessageDialog(null, "ERROR");
            
        }
    }
    
    public void eliminarCliente (String id, long d)  throws IOException 
    {
            File archivoClie = new File (nombreArchivoCliente);
            RandomAccessFile archivo = null;  
            if (archivoClie.exists())
            {  
                boolean b = false;    
                long ap;              
                Cliente x = new Cliente();  
                archivo =  new RandomAccessFile( nombreArchivoCliente, "rw" );  
                archivo.seek(0);   
                while ((!b) && (archivo.getFilePointer() < archivo.length()))
                {    
                    ap = archivo.getFilePointer();
                    x.recuperarCliente(archivo);
                    if ((x.getIdentificacion().equals(id)) && (x.getDeuda()!= -1))
                    {   
                        x.setDeuda(d);
                        archivo.seek(ap);     
                        x.guardarCliente(archivo);   
                        b = true;
                    }
                }
                archivo.close();   
                if (!b)
                    JOptionPane.showMessageDialog(null, "ERROR");
            }
        
    }
    
    public Cliente buscarDeudor (String id)  throws IOException 
    {
        File archivoCli = new File (nombreArchivoCliente);
        RandomAccessFile archivo = null;
        long ap = 0;
        boolean b = false;
        Cliente x = new Cliente();
        if (archivoCli.exists())
        {  
            archivo =  new RandomAccessFile( nombreArchivoCliente, "r" );  
            archivo.seek(0);     
            while ((!b) && (archivo.getFilePointer() < archivo.length()))
            {
                ap = archivo.getFilePointer();
                x.recuperarCliente(archivo);
                if ((x.getIdentificacion().equals(id)) && (x.getDeuda()>0))
                b = true;
            }
            archivo.close();}
            if (b)
                return x;
            else
                return null;     
     }

public void listarCliente()  throws IOException 
    {
        RandomAccessFile archivo = null; 
        System.out.print("\n\n LISTADO DE CLIENTES: ");
        Cliente x = new Cliente();
        archivo =  new RandomAccessFile(nombreArchivoCliente, "r" );  
        archivo.seek(0);   
        while (archivo.getFilePointer() < archivo.length())
        {
            x.recuperarCliente(archivo);
            if (x.getDeuda()!= -1)
                x.mostrarDatos(); 
        }
        archivo.close(); 
    }
}
