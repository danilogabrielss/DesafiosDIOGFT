module com.desafio.desafiopoo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.desafio.desafiopoo to javafx.fxml;
    exports com.desafio.desafiopoo;
}