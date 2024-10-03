package co.edu.uniquindio.proyectofinal.model.builder;

import co.edu.uniquindio.proyectofinal.model.Usuario;

public class UsuarioBuilder {
    protected String nombre;
    protected String apellidos;
    protected String cedula;
    protected String direccion;
    protected String contraseña;



    public UsuarioBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public UsuarioBuilder setApellidos(String apellidos) {
        this.apellidos = apellidos;
        return this;
    }

    public UsuarioBuilder setCedula(String cedula) {
        this.cedula = cedula;
        return this;
    }

    public UsuarioBuilder setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public UsuarioBuilder setContraseña(String contraseña) {
        this.contraseña = contraseña;
        return this;
    }

    public Usuario build() {
        return new Usuario(nombre, apellidos, cedula, direccion, contraseña);
    }

}
