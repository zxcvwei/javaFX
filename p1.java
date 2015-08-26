import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class p1 extends Application{
	public void start(Stage mainStage){
		Scene scene = new Scene(new Button("OK"),200/*©³Ãä*/,250/*°ª*/);
		mainStage.setTitle("OK");
		mainStage.setScene(scene);
		mainStage.show();

		Stage stage = new Stage();
		stage.setTitle("YES");
		stage.setScene(new Scene(new Button("Yes"),150,200));
		stage.show();
	}
	public static void main(String args[]){
		Application.launch();
	}

}
