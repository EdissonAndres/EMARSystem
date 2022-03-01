/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import javax.swing.JOptionPane;

/**
 *
 * @author Edison Andres
 */
public class ManejoUsuario {
    
    String nombreArchivoUsuario = "sd67sdhjhj23.dbf";
    public void adicionarUsuario(String nom, String con, String car)  throws IOException
    {
        Usuario p;
        File archivoProd = new File (nombreArchivoUsuario);
        try (RandomAccessFile archivo = new RandomAccessFile(nombreArchivoUsuario, "rw" ) 
                ) {
            String a = encriptar(nom);
            String b = encriptar(con);
            String c = encriptar(car);
            p = new Usuario(a,b,c,0);
            if (!archivoProd.exists())
                archivoProd.createNewFile();  
            archivo.seek( archivo.length() ); 
            p.guardarUsuario(archivo);
            archivo.close();
        }
    }
    
    public Usuario consultarUsuario (String n) throws IOException 
    {
        Usuario x = new Usuario();
        boolean d = false;
        File archivoClie = new File (nombreArchivoUsuario);
        RandomAccessFile archivo = null;
        if (archivoClie.exists()) 
        {
            archivo =  new RandomAccessFile( nombreArchivoUsuario, "r" );  
            archivo.seek(0);   
            while ((!d) && (archivo.getFilePointer() < archivo.length()))
            {
                x.recuperarUsuario(archivo);
                String a = desencriptar(x.getNombre());
                if (a.equals(n) && x.getAtributo()==0)
                d = true;
            }
            archivo.close();    
        }
        if (d)
            return x;
        else
            return null;
    }
    
    public void eliminarUsuario (String n)  throws IOException 
    {
            File archivoClie = new File (nombreArchivoUsuario);
            RandomAccessFile archivo = null;  
            if (archivoClie.exists())
            {  
                boolean b = false;    
                long ap;              
                Usuario x = new Usuario();  
                archivo =  new RandomAccessFile( nombreArchivoUsuario, "rw" );  
                archivo.seek(0);   
                while ((!b) && (archivo.getFilePointer() < archivo.length()))
                {    
                    ap = archivo.getFilePointer();
                    x.recuperarUsuario(archivo);
                    String a = desencriptar(x.getNombre());
                    if (a.equals(n)) 
                    {   
                        x.setAtributo(-1);
                        archivo.seek(ap);     
                        x.guardarUsuario(archivo);   
                        b = true;
                        JOptionPane.showMessageDialog(null, "¡USUARIO ELIMINADO CORRECTAMENTE!");
                    }
                }
                archivo.close();   
                if (!b)
                    JOptionPane.showMessageDialog(null, "ERROR");
            }
    }
    
    public  String encriptar(String s) throws UnsupportedEncodingException{
        return Base64.getEncoder().encodeToString(s.getBytes("utf-8"));
    }
    
    public  String desencriptar(String s) throws UnsupportedEncodingException{
        byte[] decode = Base64.getDecoder().decode(s.getBytes());
        return new String(decode, "utf-8");
    }
    
}
