import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class p5 extends Application{
	public void start(Stage mainStage){
		Pane pane = new Pane();
		Circle circle = new Circle();
		circle.centerXProperty().bind(pane.widthProperty().divide(2));
		circle.centerYProperty().bind(pane.heightProperty().divide(2));
		circle.setRadius(50);
		circle.setStroke(Color.BLUE);
		circle.setFill(Color.YELLOW);
		pane.getChildren().add(circle);

		Scene scene = new Scene(pane,200,200);
		mainStage.setTitle("center circle");
		mainStage.setScene(scene);
		mainStage.show();
	}

	public static void main(String args[]){
		Application.launch();
	}
}
//繫結   固定圓於中心點