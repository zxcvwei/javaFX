import javafx.application.*;
import javafx.stage.*;

public class p2 extends Application {
	public p2(){
		System.out.println("Test constructor is invoked");//�ĤG��
	}
	public void start(Stage mainStage){
		System.out.println("start method is invoked.");//�ĤT��
	}

	public static void main(String args[]){
		System.out.println("launch application");//�Ĥ@��
		Application.launch();
	}
}
//��r�{��