import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class p4 extends Application{
	public void start(Stage mainStage){
		Circle circle = new Circle();
		circle.setCenterX(100);
		circle.setCenterY(100);
		circle.setRadius(50);
		circle.setStroke(Color.BLUE);
		circle.setFill(Color.WHITE);
		Pane pane = new Pane();
		pane.getChildren().add(circle);
		Scene scene = new Scene(pane,200,200);
		mainStage.setTitle("circle");
		mainStage.setScene(scene);
		mainStage.show();

	}

	public static void main(String args[]){
		Application.launch();
	}

}
