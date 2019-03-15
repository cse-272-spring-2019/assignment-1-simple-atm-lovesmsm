import javafx.application.Application;
import javafx.stage.Stage;


public class SimpleATM extends Application {
	IDChecker check;
	public static void main(String[] args) {

launch(args);
	}

	

	@Override
	public void start(Stage primaryStage) throws Exception {
		check = new IDChecker();
		primaryStage.setTitle("Simple ATM");
		lOGIN LOGIN= new lOGIN(primaryStage);
		MENU MENU=new MENU(primaryStage);
		
		LOGIN.prepareScene();
		MENU.prepareScene();
		LOGIN.setMENU(MENU);
		MENU.setlOGIN(LOGIN);
	    
		primaryStage.setScene(LOGIN.getScene());	
		
	    primaryStage.show();
	}

}
