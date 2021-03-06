/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.dominio;

import com.demo.dominio.Empleado;
import java.util.List;

/**
 *
 * @author Jona
 */
public class User {
    private int id_user;
    private List <Empleado> empleado;
    private String nick;
    private String password;
    private String rol;
    private boolean activo;
    private Empleado empleadoUsuario;

    public User() {
    }

    public User(String nick, String password, int id_user) {
        this.nick = nick;
        this.password = password;
        this.id_user = id_user;
    }
    
    public User(int id_user, String nick, String password, String rol, boolean activo) {
        this.id_user = id_user;
        this.nick = nick;
        this.password = password;
        this.rol = rol;
        this.activo = activo;
    }

    public User(int id_user, List<Empleado> empleado, String nick, String password, String rol, boolean activo, Empleado empleadoUsuario) {
        this.id_user = id_user;
        this.empleado = empleado;
        this.nick = nick;
        this.password = password;
        this.rol = rol;
        this.activo = activo;
        this.empleadoUsuario = empleadoUsuario;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public List<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(List<Empleado> empleado) {
        this.empleado = empleado;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Empleado getEmpleadoUsuario() {
        return empleadoUsuario;
    }

    public void setEmpleadoUsuario(Empleado empleadoUsuario) {
        this.empleadoUsuario = empleadoUsuario;
    }

    @Override
    public String toString() {
        return "User{" + "id_user=" + id_user + 
                //", empleado=" + empleado.toString() + 
                ", nick=" + nick + 
                ", password=" + password + 
                ", rol=" + rol + 
                ", activo=" + activo + 
                /*", empleadoUsuario=" + empleadoUsuario.toString() +*/ '}';
    }
    
    
}
