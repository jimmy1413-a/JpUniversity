
/**
 * Write a description of class Control here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Control {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnBuscar;

    @FXML
    private ChoiceBox<?> choicebAyuda;

    @FXML
    private ChoiceBox<?> choicebDocumento;

    @FXML
    private ChoiceBox<?> choicebEstado;

    @FXML
    private Label lblAyuda;

    @FXML
    private Label lblCodigo;

    @FXML
    private Label lblDocumento;

    @FXML
    private Label lblEmail;

    @FXML
    private Label lblEstado;

    @FXML
    private Label lblFecha;

    @FXML
    private Label lblFechaNacimiento;

    @FXML
    private Label lblJpUniversity;

    @FXML
    private Label lblNombre;

    @FXML
    private TextArea txtAreaResultados;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtFecha;

    @FXML
    private TextField txtFechaNacimiento;

    @FXML
    private TextField txtNombre;

    @FXML
    void AgregarEstudiante(ActionEvent event) {

    }

    @FXML
    void BuscarEstudiante(ActionEvent event) {

    }

    private JPuniversity jpuniversity = new JPuniversity();
    
     @FXML
    void initialize() {
        assert btnAgregar != null : "fx:id=\"btnAgregar\" was not injected: check your FXML file 'Untitled'.";
        assert btnBuscar != null : "fx:id=\"btnBuscar\" was not injected: check your FXML file 'Untitled'.";
        assert choicebAyuda != null : "fx:id=\"choicebAyuda\" was not injected: check your FXML file 'Untitled'.";
        assert choicebDocumento != null : "fx:id=\"choicebDocumento\" was not injected: check your FXML file 'Untitled'.";
        assert choicebEstado != null : "fx:id=\"choicebEstado\" was not injected: check your FXML file 'Untitled'.";
        assert lblAyuda != null : "fx:id=\"lblAyuda\" was not injected: check your FXML file 'Untitled'.";
        assert lblCodigo != null : "fx:id=\"lblCodigo\" was not injected: check your FXML file 'Untitled'.";
        assert lblDocumento != null : "fx:id=\"lblDocumento\" was not injected: check your FXML file 'Untitled'.";
        assert lblEmail != null : "fx:id=\"lblEmail\" was not injected: check your FXML file 'Untitled'.";
        assert lblEstado != null : "fx:id=\"lblEstado\" was not injected: check your FXML file 'Untitled'.";
        assert lblFecha != null : "fx:id=\"lblFecha\" was not injected: check your FXML file 'Untitled'.";
        assert lblFechaNacimiento != null : "fx:id=\"lblFechaNacimiento\" was not injected: check your FXML file 'Untitled'.";
        assert lblJpUniversity != null : "fx:id=\"lblJpUniversity\" was not injected: check your FXML file 'Untitled'.";
        assert lblNombre != null : "fx:id=\"lblNombre\" was not injected: check your FXML file 'Untitled'.";
        assert txtAreaResultados != null : "fx:id=\"txtAreaResultados\" was not injected: check your FXML file 'Untitled'.";
        assert txtCodigo != null : "fx:id=\"txtCodigo\" was not injected: check your FXML file 'Untitled'.";
        assert txtEmail != null : "fx:id=\"txtEmail\" was not injected: check your FXML file 'Untitled'.";
        assert txtFecha != null : "fx:id=\"txtFecha\" was not injected: check your FXML file 'Untitled'.";
        assert txtFechaNacimiento != null : "fx:id=\"txtFechaNacimiento\" was not injected: check your FXML file 'Untitled'.";
        assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'Untitled'.";
        
        jpuniversity = new JPuniversity();
    }
}
