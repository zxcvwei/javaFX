import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class p3 extends Application {
	public void start(Stage mainStage){
		StackPane pane = new StackPane();
		pane.getChildren().add(new Button("pane"));
		Scene scene = new Scene(pane,200,50);
		mainStage.setTitle("pane");
		mainStage.setScene(scene);
		mainStage.show();
	}
	public static void main(String args[]){
		Application.launch();
	}

}
//建立一個按鈕(不占滿整個版面--->StackPane)