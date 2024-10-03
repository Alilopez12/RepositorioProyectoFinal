package co.edu.uniquindio.proyectofinal.model.builder;

import co.edu.uniquindio.proyectofinal.model.Usuario;

public class UsuarioBuilder {
    private String nombre;
    private String apellidos;
    private String cedula;
    private String direccion;
    private String contraseña;

    public UsuarioBuilder(String nombre, String apellidos, String cedula, String direccion, String contraseña) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.direccion = direccion;
        this.contraseña = contraseña;
    }

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
