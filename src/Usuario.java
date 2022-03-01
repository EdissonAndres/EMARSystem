/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Edison Andres
 */
public class Usuario {
    String nombre;
    String contraseña;
    String cargo;
    int atributo;

    public Usuario() {
    }

    public Usuario(String nombre, String contraseña, String cargo, int atributo) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.cargo = cargo;
        this.atributo = atributo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getAtributo() {
        return atributo;
    }

    public void setAtributo(int atributo) {
        this.atributo = atributo;
    }
    
    
    public void guardarUsuario (RandomAccessFile archivo) throws IOException 
    {
        archivo.writeUTF( nombre );
        archivo.writeUTF( contraseña );
        archivo.writeUTF( cargo );
        archivo.writeInt( atributo );
    }
    
    public void recuperarUsuario (RandomAccessFile archivo) throws IOException 
    {
        nombre  = archivo.readUTF();     
        contraseña  = archivo.readUTF(); 
        cargo = archivo.readUTF();
        atributo = archivo.readInt();
    }
}
