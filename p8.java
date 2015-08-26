import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.text.*;

public class p8 extends Application {
	public void start(Stage mainStage) {
		Pane pane = new Pane();

		Circle circle = new Circle();
		circle.setRadius(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(new Color(0.5, 0.5, 0.5, 0.1));
		pane.getChildren().add(circle);

		Label label = new Label("javaFX");
		label.setFont(Font.font("Times",
				FontWeight.BOLD, FontPosture.ITALIC, 20));
		pane.getChildren().add(label);

		Scene scene = new Scene(pane);
		mainStage.setTitle("Font");
		mainStage.setScene(scene);
		mainStage.show();
	}

	public static void main(String args[]) {
		Application.launch();
	}
}
