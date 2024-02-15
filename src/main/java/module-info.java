module com.dev.javafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.base;


    opens com.dev.javafxjdbc;
    exports com.dev.javafxjdbc;
    exports com.dev.javafxjdbc.controllers;
    opens com.dev.javafxjdbc.model.entities to javafx.base;
    opens com.dev.javafxjdbc.model.services to javafx.base;
    opens com.dev.javafxjdbc.controllers to javafx.fxml;
}