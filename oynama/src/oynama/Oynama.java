
package oynama;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author mertp
 */
public class Oynama extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("KELİME OYUNU-201307084-MERT BULUT");
        stage.show();
    }

  
    public static void main(String[] args) {
        launch(args);
    }
    
}
