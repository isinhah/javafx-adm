module com.dev.javafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.dev.javafxjdbc to javafx.fxml;
    exports com.dev.javafxjdbc;
    exports com.dev.javafxjdbc.controllers;
    opens com.dev.javafxjdbc.controllers to javafx.fxml;
}