package profileconfigs;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SchedPopController implements Initializable{

    @FXML
    private ListView<String> SchedList;

    @FXML
    private Button finish;
       
    @FXML
    private TextField date;

    @FXML
    private TextField time;

    @FXML
    private Button addto;
    
    public boolean edited = false;
    
    public void adtosched(){
    	List<String> current  = new ArrayList<String>(SchedList.getItems());
    	String toadd = "";
    	toadd += date.getText() + " ";
    	toadd += time.getText();
    	current.add(toadd);
    	SchedList.setItems(FXCollections.observableList(current));
    	date.clear();
    	time.clear();
    	
    	//TODO VALIDATE INPUTS AND CHANGE FROM STRING TO DATE?
    	
    }
    
    public void schedfinished(){
    	System.out.println("potato");
    	List<String> result = new ArrayList<String>(SchedList.getItems());
    	edited = true;
    	Stage stage = (Stage) finish.getScene().getWindow();
    	 stage.close();
    //	return result;
    }
    
    public ObservableList<String> getSched(){
    	return SchedList.getItems();
    }
    
    public void cancelPressed(){
    	System.out.println("canceledpotato");
    	Stage stage = (Stage) finish.getScene().getWindow();
    	stage.close();
    }
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		System.out.println("hello");
    	List<String> values = Arrays.asList("1", "2", "3");
    	SchedList.setItems(FXCollections.observableList(values));
	
	}
}
