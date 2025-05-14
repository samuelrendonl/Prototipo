package Controlador;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



public class LoginController implements Initializable {

    public Stage stage ;
    
    @FXML
    PasswordField txtContraseña;
    
    @FXML
    TextField txtUsuario;
    
    @FXML
    Button btnLogin;
    
    @FXML
   public void LoginAction(ActionEvent event) throws IOException{
        
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Productos.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            
    }
    


    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    void setStage(Stage primaryStage) {
        stage = primaryStag;
    }
    
}
