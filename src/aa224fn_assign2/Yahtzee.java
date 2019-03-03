package aa224fn_assign2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Yahtzee extends Application {
	Image d1 = new Image(getClass().getResourceAsStream("one.png"), 65, 65, true, true);
	Image d2 = new Image(getClass().getResourceAsStream("two.png"), 65, 65, true, true);
	Image d3 = new Image(getClass().getResourceAsStream("three.png"), 65, 65, true, true);
	Image d4 = new Image(getClass().getResourceAsStream("four.png"), 65, 65, true, true);
	Image d5 = new Image(getClass().getResourceAsStream("five.png"), 65, 65, true, true);
	Image d6 = new Image(getClass().getResourceAsStream("six.png"), 65, 65, true, true);

	ImageView Dice1 = new ImageView(d1);
	ImageView Dice2 = new ImageView(d2);
	ImageView Dice3 = new ImageView(d3);
	ImageView Dice4 = new ImageView(d4);
	ImageView Dice5 = new ImageView(d5);

	int[] arr = new int[6];
	CheckBox ck[] = new CheckBox[5];

	int x = 0;
	Random dicerolls = new Random();
	CheckBox one = new CheckBox();
	CheckBox two = new CheckBox();
	CheckBox three = new CheckBox();
	CheckBox four = new CheckBox();
	CheckBox five = new CheckBox();
	int count = 0;
	int [] counter = new int [5];
	ArrayList <CheckBox> boxlist = new ArrayList <CheckBox> ();

	
	
	
	private void Diceroll() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1 + dicerolls.nextInt(6);
		}
	}

	private void setImageDice1() {
		if(one.isSelected()) {
		}else
	if (arr[0] == 1)
		Dice1.setImage(d1);
	else if (arr[0] == 2)
		Dice1.setImage(d2);
	else if (arr[0] == 3)
		Dice1.setImage(d3);
	else if (arr[0] == 4)
		Dice1.setImage(d4);
	else if (arr[0] == 5)
		Dice1.setImage(d5);
	else if (arr[0] == 6)
		Dice1.setImage(d6);
	}

	private void setImageDice2() {
		if(two.isSelected()) {

		}else
		if (arr[1] == 1)
			Dice2.setImage(d1);
		else if (arr[1] == 2)
			Dice2.setImage(d2);
		else if (arr[1] == 3)
			Dice2.setImage(d3);
		else if (arr[1] == 4)
			Dice2.setImage(d4);
		else if (arr[1] == 5)
			Dice2.setImage(d5);
		else if (arr[1] == 6)
			Dice2.setImage(d6);
	}

	private void setImageDice3() {
		if(three.isSelected()) {

		}else
		if (arr[2] == 1)
			Dice3.setImage(d1);
		else if (arr[2] == 2)
			Dice3.setImage(d2);
		else if (arr[2] == 3)
			Dice3.setImage(d3);
		else if (arr[2] == 4)
			Dice3.setImage(d4);
		else if (arr[2] == 5)
			Dice3.setImage(d5);
		else if (arr[2] == 6)
			Dice3.setImage(d6);
	}

	private void setImageDice4() {
		if(four.isSelected()) {

		}else
		if (arr[3] == 1)
			Dice4.setImage(d1);
		else if (arr[3] == 2)
			Dice4.setImage(d2);
		else if (arr[3] == 3)
			Dice4.setImage(d3);
		else if (arr[3] == 4)
			Dice4.setImage(d4);
		else if (arr[3] == 5)
			Dice4.setImage(d5);
		else if (arr[3] == 6)
			Dice4.setImage(d6);
	}

	private void setImageDice5() {
		if(five.isSelected()) {

		}else
		if (arr[4] == 1)
			Dice5.setImage(d1);
		else if (arr[4] == 2)
			Dice5.setImage(d2);
		else if (arr[4] == 3)
			Dice5.setImage(d3);
		else if (arr[4] == 4)
			Dice5.setImage(d4);
		else if (arr[4] == 5)
			Dice5.setImage(d5);
		else if (arr[4] == 6)
			Dice5.setImage(d6);
	}

	private void setallImages() {
		setImageDice1();
		setImageDice2();
		setImageDice3();
		setImageDice4();
		setImageDice5();
	}

	private int checkallDices() {
		
		
		
		return counter.length;
	}
	
	
	
	
	private String Values() {
		 if( counter.length== 2)	
			return "two of a kind!";
		else if( counter.length== 3)	
			return "three of a kind!";
		else if( counter.length== 4)	
			return "4 of a kind!";
		else if( counter.length== 5)	
			return "Yahtzee!";
		else
		 return "Nothing";
}
	
	public static boolean checkForYahtzee(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] != arr[j]) {
					return false;
				}
			}
		}
		return true;
	}

	public void start(Stage primaryStage) {		primaryStage.setTitle("Yahtzee");
		/* Layout */
	
		VBox layout = new VBox();
		layout.setAlignment(Pos.TOP_LEFT);
		layout.setPadding(new Insets(0, 10, 10, 10));
		layout.setSpacing(0);
		Label heading = new Label("Yahtzee");
		heading.setFont(new Font("Comfortaa", 50));
		/* image */
		HBox image = new HBox();
		image.setPadding(new Insets(0, 0, 0, 0));
		image.setSpacing(5);
		image.setAlignment(Pos.CENTER);
		image.getChildren().addAll(Dice1, Dice2, Dice3, Dice4, Dice5);

		/* dice checkboxes */
		HBox Dices = new HBox();
		Dices.setPadding(new Insets(3, 3, 3, 3));
		Dices.setSpacing(50);
		Dices.setAlignment(Pos.CENTER);
		Dices.getChildren().addAll(one, two, three, four, five);
		
		/* Button and results */
		HBox box = new HBox();
		box.setPadding(new Insets(0, 0, 0, 0));
		box.setSpacing(10);
		Button Roll = new Button("Roll the Dice!");
		final Label answer = new Label();
		 StringBuilder theOrder = new StringBuilder("You have Rolled "+ Values() +" "+counter.length);
		 boxlist.add(one);
		 boxlist.add(two);
		 boxlist.add(three);
		 boxlist.add(four);
		 
		/* Action */
		Roll.setOnAction(e -> {
	
			Diceroll();
			setallImages();
			if (x <= 3) {
				x++;
			} else {
				Roll.setDisable(true);
//				if(boxlist.get(0)==one.isSelected())
//				counter[0]= 1;
//				else if (two.isSelected()==true)
//					counter[1]= 1;
//				else if (three.isSelected()==true)
//					counter[2]= 1;
//				else if (four.isSelected()==true)
//					counter[3]= 1;
//				else if (five.isSelected()==true)
//					counter[4]= 1;
			answer.setText(theOrder.toString());
			}
			x++;
		});
		box.getChildren().addAll(Roll, answer);
		layout.getChildren().addAll(heading, image, Dices, box);
		Scene scene = new Scene(layout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
