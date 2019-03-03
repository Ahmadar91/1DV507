package aa224fn_assign3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TinyPainter extends Application {

	Canvas canvas = new Canvas(1000, 1000);
	GraphicsContext graphic = canvas.getGraphicsContext2D();
	ComboBox<String> shape = new ComboBox<String>();
	ComboBox<Integer> size = new ComboBox<Integer>();

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Tiny Printer");

		BorderPane borderPane = new BorderPane();
		HBox hBox = new HBox();

		ComboBox<Integer> size = new ComboBox<>();
		ComboBox<String> shape = new ComboBox<>();
		ColorPicker color = new ColorPicker(Color.BLACK);
		shape.getItems().addAll("Dot", "Rectangle", "Circle", "Line");
		for (int i = 1; i <= 40; i++) {
			size.getItems().addAll(i);
		}
		graphic = canvas.getGraphicsContext2D();
		graphic.setLineWidth(1);
		Line line = new Line();
		Circle circ = new Circle();
		Rectangle rectangle = new Rectangle();
		shape.getSelectionModel().selectLast();
		;
		size.getSelectionModel().selectFirst();
		canvas.setOnMousePressed(e -> {
			if (shape.getValue().equals("Circle")) {
				graphic.setStroke(color.getValue());
				graphic.setFill(color.getValue());
				circ.setCenterX(e.getX());
				circ.setCenterY(e.getY());

			} else if (shape.getValue().equals("Rectangle")) {
				graphic.setStroke(color.getValue());
				graphic.setFill(color.getValue());
				rectangle.setX(e.getX());
				rectangle.setY(e.getY());
			} else if (shape.getValue().equals("Dot")) {

				graphic.setStroke(color.getValue());
				graphic.beginPath();
				graphic.lineTo(e.getX(), e.getY());
				graphic.stroke();
				graphic.closePath();

			} else if (shape.getValue().equals("Line")) {
				graphic.setStroke(color.getValue());
				line.setStartX(e.getX());
				line.setStartY(e.getY());
				;
			}
		});
		canvas.setOnMouseReleased(e -> {
			if (shape.getValue().equals("Circle")) {
				circ.setRadius((Math.abs(e.getX() - circ.getCenterX()) + Math.abs(e.getY() - circ.getCenterY())) / 2);
				if (circ.getCenterX() > e.getX()) {
					circ.setCenterX(e.getX());
				}
				if (circ.getCenterY() > e.getY()) {
					circ.setCenterY(e.getY());
				}
				graphic.fillOval(circ.getCenterX(), circ.getCenterY(), circ.getRadius(), circ.getRadius());
				graphic.strokeOval(circ.getCenterX(), circ.getCenterY(), circ.getRadius(), circ.getRadius());

			} else if (shape.getValue().equals("Rectangle")) {
				rectangle.setWidth(Math.abs((e.getX() - rectangle.getX())));
				rectangle.setHeight(Math.abs((e.getY() - rectangle.getY())));
				if (rectangle.getX() > e.getX()) {
					rectangle.setX(e.getX());
				}
				if (rectangle.getY() > e.getY()) {
					rectangle.setY(e.getY());
				}
				graphic.fillRect(rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());
				graphic.strokeRect(rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());

			} else if (shape.getValue().equals("Line")) {
				line.setEndX(e.getX());
				line.setEndY(e.getY());
				graphic.strokeLine(line.getStartX(), line.getStartY(), line.getEndX(), line.getEndY());

			}
		});

		ColorPicker colorPicker = new ColorPicker(Color.BLACK);
		colorPicker.setOnAction(e -> graphic.setStroke(colorPicker.getValue()));
		hBox.getChildren().addAll(shape, size, color);
		borderPane.setTop(hBox);
		borderPane.setCenter(canvas);

		size.setOnAction(e -> {
			for (int i = 1; i <= 40; i++)
				if (size.getValue().equals(i)) {
					graphic.setLineWidth(i);
				}
		});

		Scene scene = new Scene(borderPane, 700, 700);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
