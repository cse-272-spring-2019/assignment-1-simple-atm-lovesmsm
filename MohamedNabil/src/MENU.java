import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MENU{
	Scene his,scene1,scene2,scene3,scene4,scene5;

lOGIN lOGIN;
int count=0;
BankAccount account= new BankAccount();
Stage window;
public MENU(Stage stage) {
	
	this.window=stage;
}
		public  void prepareScene() {
			VBox Layout4=new VBox(20);
			
			Button submit1 = new Button("WithDraw");
			Button submit2= new Button("Deposit");
			Button submit3= new Button("CurrentBalance");
			Button submit4= new Button("History Navigtion");
			Button submit6= new Button("Transctions");
			Button submit5= new Button("Exit");	
			Layout4.getChildren().addAll(submit1,submit2,submit3,submit4,submit6,submit5);
			scene1=new Scene(Layout4,300,300);
			
			submit1.setOnAction(e->window.setScene(scene3));
			Label label2= new Label( "Amount To Withdraw:");
			TextField label2Field=new TextField();
			Label check= new Label();
			Button withdraw=new Button("Enter");
			withdraw.setOnAction(e->{
				if(label2Field.getText()==null||label2Field.getText().trim().isEmpty())
					check.setText("Enter Amount First");
					
					
				else					
				{
				boolean checker=account.Withdraw(Double.parseDouble(label2Field.getText()));
			if(checker)
				{check.setText("Check Your Balance");
			String y="Withdraw Of "+ label2Field.getText();
			
			account.history(y);
			
			;}
			else
				check.setText("You Can't Withdraw More Than Your Current Balance");
			label2Field.setText("");
			}});
			Button menu= new Button("Back");
			VBox Layout2=new VBox(20);
			Layout2.getChildren().addAll(label2,label2Field,check,withdraw,menu);
			scene3=new Scene(Layout2,300,300);
			menu.setOnAction(e->{window.setScene(scene1);
			check.setText("");
			label2Field.setText("");
			});
			
			
			
			
			submit2.setOnAction(e->window.setScene(scene2));
			Label label1= new Label( "Amount To Deposit:");
			TextField label1Field=new TextField();
			Label check2= new Label();
			Button deposit=new Button("Enter");
			deposit.setOnAction(e->{
				if(label1Field.getText()==null||label1Field.getText().trim().isEmpty())
					check2.setText("Enter Amount First");
					
					
				else				
				{	
				boolean checker2=account.Deposit(Double.parseDouble(label1Field.getText()));
			if(checker2)
				{check2.setText("Check Your Balance");
				
				account.history("Deposit Of " + label1Field.getText());}
			else
				check2.setText("You Can't Deposit By Negative Value");
			label1Field.setText("");
			
			}});
			Button men= new Button("Back");
			VBox Layout1=new VBox(20);
			Layout1.getChildren().addAll(label1,label1Field,check2,deposit,men);
			scene2=new Scene(Layout1,300,300);
			men.setOnAction(e->{label1Field.setText("");
			check2.setText("");
				window.setScene(scene1);
			
			});
			
			
			
			 Label balanceLabel= new Label();
			submit3.setOnAction(e->{window.setScene(scene4);
			{double x;
		    x=account.getBalance();
		    balanceLabel.setText(Double.toString(x));
			}});
		    Label label4= new Label( "Your Balance Is:");
			Button me= new Button("Back");
			VBox Layout=new VBox(20);
			Layout.getChildren().addAll(label4,balanceLabel,me);
			scene4=new Scene(Layout,300,300);
			me.setOnAction(e->{window.setScene(scene1);
			  balanceLabel.setText("");});
		 
		VBox grid1=new VBox(20);	
		
			submit4.setOnAction(e->window.setScene(scene5));
			 Label historyLabel= new Label();
			 Button nex=new Button("Next");
			 Button pre=new Button ("Previous");
			 Button m=new Button("Back");
			 grid1.getChildren().addAll(historyLabel,pre,nex,m);
			 scene5=new Scene(grid1,300,300);
			 m.setOnAction(e->window.setScene(scene1));
			 pre.setOnAction(e->{
			 if(count!=0 || count >0)	
			 {historyLabel.setText(account.history[count-1]);	
			 count--;}
			 else
				 
				 historyLabel.setText("Error Click On Next");
				});
			 nex.setOnAction(e->{historyLabel.setText(account.history[count]);
					 count++;
					 if(count>=5)
						historyLabel.setText("Error Click On Previous ");});
			
		
		submit5.setOnAction(e->System.exit(0));
		
		VBox hist=new VBox(20);	
		Label trans1=new Label();
		Label trans2=new Label();
		Label trans3=new Label();
		Label trans4=new Label();
		Label trans5=new Label();
		Button ba=new Button("Back");
		hist.getChildren().addAll(trans1,trans2,trans3,trans4,trans5,ba);
		submit6.setOnAction(e->{window.setScene(his);
		int i=0;
			trans1.setText(account.history[i]);
			trans2.setText(account.history[i+1]);
			trans3.setText(account.history[i+2]);
			trans4.setText(account.history[i+3]);
			trans5.setText(account.history[i+4]);
		
		
		});
		ba.setOnAction(e->window.setScene(scene1));
		his=new Scene(hist,300,300);
		
			
}

		public Scene getScene() {
			return scene1;
		}

		public lOGIN getlOGIN() {
			return lOGIN;
		}
		public void setlOGIN(lOGIN lOGIN) {
			this.lOGIN = lOGIN;
		}
		
	
}