package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

/*try {
Parent root = FXMLLoader.load(getClass().getResource("myview.fxml"));
//Scene scene = new Scene(root);
//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
primaryStage.setScene(new Scene(root,300,300));
primaryStage.show();








} catch(Exception e) {
e.printStackTrace();
}*/

/*
 window = primaryStage;
		window.setTitle("Marsensing Hidro Management");
		// Menus
		Menu Configs = new Menu("Configs");
		
		Configs.getItems().add(new MenuItem("Nova Config"));
		Configs.getItems().add(new MenuItem("Load Config"));
		
		Menu wav = new Menu("WAV Files");
		wav.getItems().add(new MenuItem("Get files infos"));
		wav.getItems().add(new MenuItem("Manage file"));
		
		
		MenuBar menubar = new MenuBar();
		menubar.getMenus().add(Configs);
		menubar.getMenus().add(wav);
		//--------------
		GridPane fp1 = new GridPane();
		FlowPane fp2 = new FlowPane();
		Button b1 = new Button("Go to page 2");
		b1.setOnAction(e -> layout1.setCenter(fp2));
		fp1.getChildren().add(b1);
		
		
		Button b2 = new Button("Go to page 1");
		b2.setOnAction(e -> layout1.setCenter(fp1));
		fp1.setAlignment(Pos.CENTER);
		fp2.setAlignment(Pos.CENTER);
		fp2.getChildren().add(b2);
		
		
		
		Configs.getItems().get(0).setOnAction(e -> layout1.setCenter(fp2));
		Configs.getItems().get(1).setOnAction(e -> layout1.setCenter(fp1));		
		
		layout2 = new BorderPane();
	
		//-------
		
		layout1 = new BorderPane();
		layout1.setTop(menubar);
		layout1.setCenter(fp1);
		scene1 = new Scene(layout1,600,400);
		window.setScene(scene1);
		window.show();
		
 
 */



public class Main extends Application {
	
	Stage window;
	BorderPane layout1, layout2;
	Scene scene1,scene2;
	
	
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
			//FXMLLoader loader = new FXMLLoader(getClass().getResource("MyGui.fxml"));

			//Scene scene = new Scene(root);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//HomePageController controller = (HomePageController) loader.getController(); 

			primaryStage.setScene(new Scene(root,600,400));
			primaryStage.show();

			} catch(Exception e) {
			e.printStackTrace();
			}
		
	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
