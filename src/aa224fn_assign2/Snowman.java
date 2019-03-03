package aa224fn_assign2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Snowman extends Application {

	public void start(Stage primaryStage) {
		Group root = new Group();
		Rectangle backround = new Rectangle(0, 0, 800, 400);
		backround.setFill(Color.rgb(30, 144, 255, .588));
		Circle head = new Circle(400, 246, 20);
		head.setFill(Color.WHITE);
		Circle midBody = new Circle(400, 290, 30);
		midBody.setFill(Color.WHITE);
		Circle biggestCircle = new Circle(400, 365, 60);
		biggestCircle.setFill(Color.WHITE);
		Line mouth = new Line(390, 255, 410, 255);
		mouth.setStrokeWidth(1.0);
		Circle Sun = new Circle(650, 130, 60);
		Sun.setFill(Color.YELLOW);
		Circle button1 = new Circle(400, 275, 2.5);
		button1.setFill(Color.BLACK);
		Circle button2 = new Circle(400, 285, 2.5);
		button2.setFill(Color.BLACK);
		Circle button3 = new Circle(400, 295, 2.5);
		button2.setFill(Color.BLACK);
		Circle lefteye = new Circle(390, 245, 2.5);
		lefteye.setFill(Color.BLACK);
		Circle righteye = new Circle(410, 245, 2.5);
		righteye.setFill(Color.BLACK);
		root.getChildren().addAll(backround, head, midBody, biggestCircle, button1, button2, button3, lefteye, righteye,
				mouth, Sun);
		Scene scene = new Scene(root, 800, 480);
		primaryStage.setTitle("Snow Man");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
