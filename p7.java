import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class p7 extends Application {
	public void start(Stage mainStage) {
		StackPane pane = new StackPane();
		Button btOK = new Button("OK");
		btOK.setStyle("-fx-border-color:blue;");
		pane.getChildren().add(btOK);
		pane.setRotate(45);//����pane
		pane.setStyle("-fx-border-color:red;"
				+ " -fx-background-color:lightgray;");
/*btOK.setStyle & pane.setStyle �������C�� + �I���C��
		border-->���*/
		Scene scene = new Scene(pane, 200, 250);
		mainStage.setTitle("Rotate");
		mainStage.setScene(scene);
		mainStage.show();
	}

	public static void main(String args[]) {
		Application.launch();
	}
}
