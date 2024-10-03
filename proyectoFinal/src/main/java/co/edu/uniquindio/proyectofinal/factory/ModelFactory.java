package co.edu.uniquindio.proyectofinal.factory;

import co.edu.uniquindio.proyectofinal.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyectofinal.mapping.mappers.MarketPlaceMappinglmpl;
import co.edu.uniquindio.proyectofinal.model.MarketPlace;
import co.edu.uniquindio.proyectofinal.model.Usuario;
import co.edu.uniquindio.proyectofinal.service.IModelFactoryServices;

import java.util.List;

public class ModelFactory implements IModelFactoryServices {
    private static ModelFactory instance;
    MarketPlace marketPlace;
    MarketPlaceMappinglmpl mapper;

    public static ModelFactory getInstance(){
        if(instance == null){
            instance = new ModelFactory();
        }
        return instance;
    }

    private ModelFactory(){
        mapper = new MarketPlaceMappinglmpl();
        marketPlace = inicializarDatos();
    }
    public  MarketPlace getMarketPlace(){
        return marketPlace;
    }

    public void setMarketPlace(MarketPlace marketPlace){
        this.marketPlace = marketPlace;
    }



    @Override
    public List<UsuarioDto> obtenerUsuarios(){
        return mapper.getUsuariosDto(marketPlace.getListUsuarios());
    }

    @Override
    public boolean agregarUsuario(UsuarioDto usuarioDto){
        if(marketPlace.verificarUsuarioExistente(usuarioDto.cedula())){
            Usuario newUsuario = mapper.usuarioDtoToUsuario(usuarioDto);
            getMarketPlace().crearUsuario(
                    newUsuario.getApellidos(),
                    newUsuario.getCedula(),
                    newUsuario.getContraseña(),
                    newUsuario.getDireccion(),
                    newUsuario.getNombre());
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarUsuario(String cedula){
        return false;
    }
    @Override
    public boolean actualizarUsuario(String cedulaActual, UsuarioDto usuarioDto) {
        return false;
    }

    public static MarketPlace inicializarDatos(){
        MarketPlace marketPlace1 = new MarketPlace();
        Usuario usuario1 = Usuario.builder()
                .nombre("Alicia")
                .apellidos("Montes Ceballos")
                .cedula("1254785624")
                .direccion("Montes de villa")
                .contraseña("25MNhgg")
                .build();

        Usuario usuario2 = Usuario.builder()
                .nombre("Macarena")
                .apellidos("López Martinez")
                .cedula("418956315")
                .direccion("Villa nueva")
                .contraseña("3351.kdn")
                .build();

        marketPlace1.getListUsuarios().add(usuario1);
        marketPlace1.getListUsuarios().add(usuario2);

        return marketPlace1;

    }
}

