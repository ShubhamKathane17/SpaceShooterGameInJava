module com.example.spaceshooter1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.spaceshooter1 to javafx.fxml;
    exports com.example.spaceshooter1;
}