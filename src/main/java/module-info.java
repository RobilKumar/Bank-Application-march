module com.example.bankapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bankapplication to javafx.fxml;
    exports com.example.bankapplication;
}