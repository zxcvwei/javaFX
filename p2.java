import javafx.application.*;
import javafx.stage.*;

public class p2 extends Application {
	public p2(){
		System.out.println("Test constructor is invoked");//第二行
	}
	public void start(Stage mainStage){
		System.out.println("start method is invoked.");//第三行
	}

	public static void main(String args[]){
		System.out.println("launch application");//第一行
		Application.launch();
	}
}
//文字程式