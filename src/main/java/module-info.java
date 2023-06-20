module orsegups.com.br.javafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens orsegups.com.br.javafxjdbc to javafx.fxml;
    exports orsegups.com.br.javafxjdbc;
}