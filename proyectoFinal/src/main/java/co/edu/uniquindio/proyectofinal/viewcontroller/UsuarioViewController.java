package co.edu.uniquindio.proyectofinal.viewcontroller;

import co.edu.uniquindio.proyectofinal.controller.UsuarioController;
import co.edu.uniquindio.proyectofinal.mapping.dto.UsuarioDto;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class UsuarioViewController {
    UsuarioController usuarioController;
    ObservableList<UsuarioDto> listUsuariosDto = FXCollections.observableArrayList();
    UsuarioDto selectedUsuario;


    @FXML
    void initialize() {
        usuarioController = new UsuarioController();

        initView();
    }

    private void initView() {
        initDataBinding();
        obtenerUsuarios();
        tableUsuario.getItems().clear();
        tableUsuario.setItems(listUsuariosDto);
        listenerSelection();
    }

    private void initDataBinding() {
        tcNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().nombre()));
        tcApellidos.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().apellidos()));
        tcCedula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().cedula()));
        tcDireccion.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().direccion()));
        tcContraseña.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().contraeña()));
    }

    private void obtenerUsuarios() {
        listUsuariosDto.addAll(usuarioController.obtenerUsuarios());
    }

    private void listenerSelection() {
        tableUsuario.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedUsuario = newSelection;
            mostrarInformacionCliente(selectedUsuario);
        });
    }

    private void mostrarInformacionCliente(UsuarioDto usuario) {
        if (usaurio != null) {
            txtNombre.setText(usuario.nombre());
            txtApellidos.setText(usuario.apellidos());
            txtCedula.setText(usuario.cedula());
            txtDireccion.setText(usuario.direccion());
            txtContraseña.setText(usuario.contraseña());
        }
    }


    private void crearUsuario() {
        UsuarioDto newUsuarioDto = buildUsuarioDto();

        if (usuarioController.agregarUsuario(newUsuarioDto)) {
            listUsuariosDto.add(newUsuarioDto);
            limpiarCamposUsuario();
        }
    }

    private UsuarioDto buildUsuarioDto() {
        return new UsuarioDto(
                txtNombre.getText(),
                txtApellidos.getText(),
                txtCedula.getText(),
                txtDireccion.getText(),
                txtContraseña.getText(),
        );
    }

    private void limpiarCamposUsuario() {
        txtNombre.clear();
        txtApellidos.clear();
        txtCedula.clear();
        txtDireccion.clear();
        txtContraseña.clear();
    }

}
