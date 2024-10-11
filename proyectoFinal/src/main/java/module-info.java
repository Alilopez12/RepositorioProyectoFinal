module co.edu.uniquindio.proyectofinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens co.edu.uniquindio.proyectofinal to javafx.fxml;
    exports co.edu.uniquindio.proyectofinal;

    opens co.edu.uniquindio.proyectofinal.viewcontroller;
    exports co.edu.uniquindio.proyectofinal.viewcontroller;

}