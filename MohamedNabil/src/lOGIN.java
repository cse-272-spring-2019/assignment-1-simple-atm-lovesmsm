import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class lOGIN {
	Scene scene;
	MENU MENU;
	IDChecker check;
 Stage stage;
 BankAccount account;
	public lOGIN(Stage stage) {
	this.stage = stage;
}
	public void prepareScene() {
		
		
		Label idnumberLabel= new Label( "Id Number:");
		PasswordField idnumberField= new PasswordField();
		Label pss= new Label( "(0000)");
		Button enter=new Button("Enter");
		Label ValidationLabel= new Label();
		GridPane grid= new GridPane();
		grid.add(idnumberLabel, 0, 0);
		grid.add(idnumberField, 0, 1);
		grid.add(enter, 1, 1);
		grid.add(ValidationLabel, 0, 2);
		grid.add(pss, 0, 4);
enter.setOnAction(e->{String idnumber = idnumberField.getText();
boolean valid=IDChecker.validate(idnumber);
if(valid)
{	
stage.setScene(MENU.getScene());
}
else
    ValidationLabel.setText("Wrong Id Number");});

scene = new Scene(grid,300,300);
}
	public Scene getScene() {
		
		return  this.scene;
		
	}
	public void setMENU(MENU mENU) {
		MENU = mENU;
	}
	
}
