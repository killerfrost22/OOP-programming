package src; 
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class InterestTableGUI extends Application{
	private Label principal, ratePercentage, numOfYears, displayArea;
	private Button simpInterest, compInterest, bothInterest;
	private TextField pTextF, rTextF;
	private Slider slider;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	/* Non-anonymous inner class to handle button event for "Both Interest" */
	private class BothEventHandler implements EventHandler<ActionEvent>{
		@Override
		public void handle(ActionEvent event) {
			displayArea.setText(CalculateInterest.calcBI(pTextF.getText(),rTextF.getText(),slider.getValue()));
		}
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Interest Table Calculator");
			
		simpInterest = new Button("Simple Interest");
		
		/* Anonymous inner class to handle button event for "Simple Interest" */
		simpInterest.setOnAction(new EventHandler<ActionEvent>() {
            @Override 
            public void handle(ActionEvent e) {
                displayArea.setText(CalculateInterest.calcSI(pTextF.getText(),rTextF.getText(),slider.getValue()));
            }
        });
			
		compInterest = new Button("Compound Interest");
		
		/* Lambda expression to handle button event for "Compound Interest" */
		compInterest.setOnAction((event) -> {
		    displayArea.setText(CalculateInterest.calcCI(pTextF.getText(),rTextF.getText(),slider.getValue()));
		});
		
		bothInterest = new Button("Both Interests");
		bothInterest.setOnAction(new BothEventHandler());
		
		displayArea = new Label();
		
		principal = new Label("Principal: ");
		pTextF = new TextField();
		
		ratePercentage = new Label("Rate(Percentage): ");
		rTextF = new TextField();
		
		numOfYears = new Label("Number of Years: ");
		
		pTextF.setMaxWidth(150);
		rTextF.setMaxWidth(100);
		
		slider = new Slider(1, 25, 4);
		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);
		slider.setMajorTickUnit(4f);
		slider.setMinorTickCount(3);
		slider.setMaxWidth(250);
		slider.setMinWidth(250);
		slider.setSnapToTicks(true);

		/* layout -> main pane
		 * gp1 -> bottom portion of GUI (includes three buttons)
		 * gp21 -> middle portion of GUI (includes principal and rate textfields)
		 * gp22 -> middle portion of GUI (includes slider for number of years)
		 * outside -> main middle portion of GUI (contains both gp21 and gp22)
		 * sp -> top portion of GUI (displays calculations in scrollpane)
		 */
		BorderPane layout = new BorderPane();
		ScrollPane sp = new ScrollPane();
		GridPane gp21 = new GridPane();
		GridPane gp22 = new GridPane();
		GridPane outside = new GridPane();
		GridPane gp1 = new GridPane();
		
		/*Set up scrollable display area */
		sp.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
		sp.setContent(displayArea);
		sp.setMaxSize(600, 250);
		sp.setMinSize(600, 250);
		layout.setTop(sp);
			
		/* Set up middle portion (labels, textfields and slider) of GUI */
		gp21.add(principal, 0, 0);
		gp21.add(pTextF,1,0);
		gp21.setPadding(new Insets(10,10,10,10));
		GridPane.setMargin(pTextF, new Insets(0,100,0,0));
		gp21.add(ratePercentage, 2, 0);
		gp21.add(rTextF, 3, 0);
		gp22.add(numOfYears,0,0);
		gp22.add(slider, 1, 0);
		GridPane.setMargin(numOfYears, new Insets(0,0,0,100));
		gp22.setPadding(new Insets(10,10,10,10));
		outside.add(gp21, 0, 0);
		outside.add(gp22, 0, 1);
		layout.setCenter(outside);
		
		/* Set up bottom portion containing three buttons to calculate interest */
		gp1.add(simpInterest, 0, 0);
		gp1.add(compInterest, 1, 0);
		gp1.add(bothInterest, 2, 0);
		GridPane.setMargin(simpInterest, new Insets(0,100,0,0));
		GridPane.setMargin(compInterest, new Insets(0,125,0,0));
		gp1.setPadding(new Insets(10,10,10,10));
		layout.setBottom(gp1);
		
		/* Scene initialization */
		Scene scene = new Scene(layout,600,400);
		
		/* Stage/Scene setting */
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	}
}