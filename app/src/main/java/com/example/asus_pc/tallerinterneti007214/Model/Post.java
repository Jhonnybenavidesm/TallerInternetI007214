package com.example.asus_pc.tallerinterneti007214.Model;

/**
 * Created by Asus-PC on 17/04/2018.
 */

public class Post {
    private int codigo;
    private String nombre;
    private int edad;
    private String correo;
    private int pass;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public int getPass() {
        return pass;
    }
}
