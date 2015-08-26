import javafx.application.*;
import javafx.stage.*;

public class p2 extends Application {
	public p2(){
		System.out.println("Test constructor is invoked");
	}
	public void start(Stage mainStage){
		System.out.println("start method is invoked.");
	}

	public static void main(String args[]){
		System.out.println("launch application");
		Application.launch();
	}

}
