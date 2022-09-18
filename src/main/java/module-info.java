module com.example.calculadorasimples {
    requires javafx.controls;
    requires javafx.fxml;


    opens Controllers to javafx.fxml;
    exports Controllers;
}