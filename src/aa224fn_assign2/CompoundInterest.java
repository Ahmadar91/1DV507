package aa224fn_assign2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CompoundInterest extends Application {

	public void start(Stage primaryStage) {

		primaryStage.setTitle("Compund Interest");

		VBox vertical = new VBox();
		vertical.setPadding(new Insets(0, 0, 10, 10));
		Label heading = new Label("Compund Interest");
		heading.setFont(new Font("Comfortaa", 32));
		heading.setAlignment(Pos.CENTER);
		VBox labels = new VBox();
		labels.setSpacing(10);
		VBox textfields = new VBox();
		textfields.setSpacing(2);
		Label label1 = new Label("Start Amount:");
		TextField startamount = new TextField();
		Label label2 = new Label("Interest:");
		TextField Interest = new TextField();
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(5, 5, 5, 0));
		hbox.setSpacing(10);
		Label label3 = new Label("Number of Years: ");
		TextField Numberofyears = new TextField();
		Label result = new Label();
		Button Calculate = new Button("Calculate");

		Calculate.setOnAction(e -> {
			try {
				double amount = Double.valueOf(startamount.getText());
				double rate = Double.valueOf(Interest.getText());
				double time = Double.valueOf(Numberofyears.getText());
				double total = amount * Math.pow((1 + rate / 100), time);
				result.setText("In total that will be: " + (int) Math.round(total));

			} catch (NumberFormatException mustbenumber) {
				result.setText("Enter a number");
			}
		});
		textfields.getChildren().addAll(startamount, Interest, Numberofyears);
		labels.getChildren().addAll(label1, label2, label3);
		hbox.getChildren().addAll(labels, textfields);
		vertical.getChildren().addAll(heading, hbox, Calculate, result);
		Scene scene = new Scene(vertical);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
