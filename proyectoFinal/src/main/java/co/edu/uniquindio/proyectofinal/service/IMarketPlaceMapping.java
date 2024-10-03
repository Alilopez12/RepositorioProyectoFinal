package co.edu.uniquindio.proyectofinal.service;

import co.edu.uniquindio.proyectofinal.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyectofinal.model.Usuario;

import java.awt.*;

public interface IMarketPlaceMapping {
    List<UsuarioDto> getUsuariosDto(List<Usuario> listaUsuarios);
    UsuarioDto usuarioToUsuarioDto(Usuario usuario);
    Usuario usuarioDtoToUsuario(UsuarioDto usuarioDto);
}
