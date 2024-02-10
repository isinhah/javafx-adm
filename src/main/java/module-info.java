module com.dev.javafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.dev.javafxjdbc to javafx.fxml;
    exports com.dev.javafxjdbc;
}