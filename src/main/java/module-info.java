module gui {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.logging.log4j;
    requires java.desktop;

    opens org.example to javafx.fxml;
    exports org.example;
}