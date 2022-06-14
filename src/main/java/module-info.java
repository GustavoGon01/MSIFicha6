module com.example.fichapraticamsi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fichapraticamsi to javafx.fxml;
    exports com.example.fichapraticamsi;
}