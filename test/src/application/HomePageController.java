package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HomePageController{

    @FXML
    private Button profile;

    @FXML
    private Button managedata;

    @FXML
    private Button config;

    @FXML
    private Button watch;

    public void profilePressed() throws IOException{
    	
    	Parent root = FXMLLoader.load(getClass().getResource("/profileconfigs/myview.fxml"));
        Stage stageTheLabelBelongs = (Stage) managedata.getScene().getWindow();
        stageTheLabelBelongs.setScene(new Scene(root));
    	//Scene scene = new Scene(root);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		//primaryStage.setScene(new Scene(root,600,600));
		//primaryStage.show();
    	
    }
    
    public void managedatapressed(){
    	
    }
    
    public void configpressed(){
    	
    }
    
    public void watchpressed(){
    	
    }
    
   
    
    
    
}
