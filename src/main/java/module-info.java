module net.traininguniverse.hellojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens net.traininguniverse.hellojavafx to javafx.fxml;
    exports net.traininguniverse.hellojavafx;
}