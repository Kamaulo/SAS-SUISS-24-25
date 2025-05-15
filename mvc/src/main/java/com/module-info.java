module com.saslab {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.saslab to javafx.fxml;
    exports com.saslab;
}
