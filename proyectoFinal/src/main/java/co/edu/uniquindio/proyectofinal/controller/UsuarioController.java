package co.edu.uniquindio.proyectofinal.controller;

import co.edu.uniquindio.proyectofinal.factory.ModelFactory;
import co.edu.uniquindio.proyectofinal.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyectofinal.service.IUsuarioControllerService;

import java.util.List;

public class UsuarioController implements IUsuarioControllerService {
    ModelFactory modelFactory;
    public UsuarioController(){
        modelFactory = ModelFactory.getInstance();
    }
    public List<UsuarioDto> obtenerUsuarios(){
        return modelFactory.obtenerUsuarios();
    }

    @Override
    public  List<UsuarioDto> obtenerUsuariosDto(){
        return List.of();
    }
    @Override
    public boolean agregarUsuario(UsuarioDto usuarioDto){
        return modelFactory.agregarUsuario(usuarioDto);
    }

    @Override
    public boolean actualizarUsuario(String cedulaActual, UsuarioDto usuarioDto){
        return false;
    }

    @Override
    public boolean eliminarUsuario(String cedula){
        return false;
    }
}
