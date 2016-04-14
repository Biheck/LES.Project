package profileconfigs;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.*;
import javafx.collections.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;

public class NewConfigController implements Initializable{


    @FXML
    private AnchorPane palete;
    @FXML
    private ToggleGroup GAtg;

    @FXML
    private ToggleGroup GAtg1;

    @FXML
    private ToggleGroup GAtg11;

    @FXML
    private ToggleGroup GAtg111;

    @FXML
    private TextField starttime;

    @FXML
    private TextField endtime;

    @FXML
    private TextField schedtim;
    

    @FXML
    private RadioButton bit16;

    @FXML
    private RadioButton bit24;

    @FXML
    private RadioButton khz105;

    @FXML
    private RadioButton khz52;
    
    @FXML
    private ListView<String> list;
    
    @FXML
    private BorderPane paners;
    
    @FXML
    void contTimes() {
    	starttime.setDisable(false);
    	endtime.setDisable(false);
    	schedtim.setDisable(true);
    }

    @FXML
    void manTimes() throws IOException{
    	
    	
    	setcenter();
    	starttime.setDisable(true);
    	endtime.setDisable(true);
    	schedtim.setDisable(true);
    }
    
    void setcenter() throws IOException{
    	
    	VBox panex = FXMLLoader.load(getClass().getResource("/profileconfigs/mtesting.fxml"));
    	System.out.println("LOADED"+ panex);
    	palete.getChildren().clear();
    	palete.getChildren().add(panex);
    	    
    	
    }

   

	@FXML
    void schedTimes() throws IOException {
    	starttime.setDisable(true);
    	endtime.setDisable(true);
    	schedtim.setDisable(false);
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/profileconfigs/SchedulePopUp.fxml"));  
    	Parent root = (Parent) loader.load();  
    	SchedPopController controller = (SchedPopController) loader.getController();  
    	

    	
    	Scene scene = new Scene(root);  
    	Stage stage = new Stage();  
    	stage.setScene(scene);  
    	stage.setTitle("My Window"); 
    	stage.initModality(Modality.APPLICATION_MODAL);
    	stage.showAndWait();
    	if(controller.edited == true)
    		list.setItems(controller.getSched());
    	
    		
    	
    	
    	
    }
    //THIS IS 24 BIT SELECTED RENAME LATER
    @FXML
    void khz105select(){
    	if(khz105.isSelected()== true)
    		khz105.setSelected(false);
    	khz105.setDisable(true);
    	khz52.setDisable(false);
    	
    	
    }
    //THIS IS 16 BIT SELECTED RENAME LATER

    @FXML
    void khz52select(){
    	khz105.setDisable(false);
    	khz52.setDisable(false);
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		List<String> values = Arrays.asList("one", "two", "three");

        list.setItems(FXCollections.observableList(values));
	
	
	}

}

