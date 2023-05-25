package it.polito.tdp.IndovinaNumero;

import javafx.application.Application;
import static javafx.application.Application.launch;

import it.polito.tdp.IndovinaNumero2.model.Gioco;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class EntryPoint extends Application {

    @Override
    public void start(Stage stage) throws Exception {
    	
        // punto di contatto fra controller e model
    	
    	//!! il modello non puo' essere creato all'interno del controllore --> deve essere creato in un livello piu' alto
    	
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Scene.fxml"));
    	Parent root = loader.load();
    	
    	FXMLController controller = loader.getController();
    	
    	Gioco model = new Gioco();
    	controller.setModel(model);
    	
       // Parent root = FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");
        scene.getRoot().setStyle("-fx-font-family: 'serif'");

        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    
 
    public static void main(String[] args) {
        launch(args);
    }

}
