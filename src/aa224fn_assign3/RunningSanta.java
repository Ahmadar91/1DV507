package aa224fn_assign3;

import java.util.ArrayList;
import java.util.Collection;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class RunningSanta extends Application {
	static int x = 1;

	@Override
	public void start(Stage primaryStage) {

	
		Image BG = new Image(getClass().getResourceAsStream("BG.png"));
		ImageView ViewBG = new ImageView(BG);
		ViewBG.setFitHeight(400);
		ViewBG.setFitWidth(800);
		ViewBG.setImage(BG);

		Image floor = new Image(getClass().getResourceAsStream("1.png"));
		ImageView ViewFloor = new ImageView(floor);
		ViewFloor.setFitHeight(60);
		ViewFloor.setFitWidth(100);
		ViewFloor.setY(340);
		ViewFloor.setImage(floor);

		Image floor1 = new Image(getClass().getResourceAsStream("2.png"));
		ImageView ViewFloor1 = new ImageView(floor1);
		ViewFloor1.setFitHeight(60);
		ViewFloor1.setFitWidth(100);
		ViewFloor1.setY(340);
		ViewFloor1.setX(100);
		ViewFloor1.setImage(floor1);

		Image floor2 = new Image(getClass().getResourceAsStream("2.png"));
		ImageView ViewFloor2 = new ImageView(floor2);
		ViewFloor2.setFitHeight(60);
		ViewFloor2.setFitWidth(100);
		ViewFloor2.setY(340);
		ViewFloor2.setX(200);
		ViewFloor2.setImage(floor2);

		Image floor3 = new Image(getClass().getResourceAsStream("2.png"));
		ImageView ViewFloor3 = new ImageView(floor3);
		ViewFloor3.setFitHeight(60);
		ViewFloor3.setFitWidth(100);
		ViewFloor3.setY(340);
		ViewFloor3.setX(300);
		ViewFloor3.setImage(floor3);

		Image floor4 = new Image(getClass().getResourceAsStream("2.png"));
		ImageView ViewFloor4 = new ImageView(floor4);
		ViewFloor4.setFitHeight(60);
		ViewFloor4.setFitWidth(100);
		ViewFloor4.setY(340);
		ViewFloor4.setX(400);
		ViewFloor4.setImage(floor4);

		Image floor5 = new Image(getClass().getResourceAsStream("2.png"));
		ImageView ViewFloor5 = new ImageView(floor5);
		ViewFloor5.setFitHeight(60);
		ViewFloor5.setFitWidth(100);
		ViewFloor5.setY(340);
		ViewFloor5.setX(500);
		ViewFloor5.setImage(floor5);

		Image floor6 = new Image(getClass().getResourceAsStream("2.png"));
		ImageView ViewFloor6 = new ImageView(floor6);
		ViewFloor6.setFitHeight(60);
		ViewFloor6.setFitWidth(100);
		ViewFloor6.setY(340);
		ViewFloor6.setX(600);
		ViewFloor6.setImage(floor6);

		Image floor7 = new Image(getClass().getResourceAsStream("3.png"));
		ImageView ViewFloor7 = new ImageView(floor7);
		ViewFloor7.setFitHeight(60);
		ViewFloor7.setFitWidth(100);
		ViewFloor7.setY(340);
		ViewFloor7.setX(700);
		ViewFloor7.setImage(floor7);
		ArrayList<Image> Santaimagelist = new ArrayList<Image>();
		ArrayList<ImageView> ViewSanta = new ArrayList<ImageView>();
		for (int i = 0; i < 11; i++) {
			Santaimagelist.add(new Image(getClass().getResourceAsStream("Run" + (i + 1) + ".png")));
			ViewSanta.add(new ImageView(Santaimagelist.get(i)));
			ViewSanta.get(i).setFitWidth(90);
			ViewSanta.get(i).setFitHeight(100);
			ViewSanta.get(i).setY(250);
			ViewSanta.get(i).setImage(Santaimagelist.get(i));
		}
		

		Image SnowMan = new Image(getClass().getResourceAsStream("SnowMan.png"), 100, 80, true, true);
		ImageView ViewSnowMan = new ImageView(SnowMan);
		ViewSnowMan.setY(260);
		ViewSnowMan.setX(-20);
		ViewSnowMan.setImage(SnowMan);

		Image Tree = new Image(getClass().getResourceAsStream("Tree.png"), 200, 150, true, true);
		ImageView ViewTree = new ImageView(BG);
		ViewTree.setY(190);
		ViewTree.setX(730);
		ViewTree.setImage(Tree);
		Group G;
		G = new Group(ViewSanta.get(0));
		G.setRotationAxis(Rotate.Y_AXIS);
		G.setTranslateX(100);
		Timeline tl = new Timeline();
		Collection<KeyFrame> frames = tl.getKeyFrames();
		double duration = 0;
		tl.setCycleCount(Animation.INDEFINITE);
		for (ImageView santaimages : ViewSanta) {
			duration += 100;
			frames.add(new KeyFrame(Duration.millis(duration), new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent t) {
					G.getChildren().setAll(santaimages);
				}
			}));
		}
		Timeline t = new Timeline();
		t.setCycleCount(Animation.INDEFINITE);
		KeyFrame run = new KeyFrame(Duration.seconds(.01300), new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				double min = G.getBoundsInParent().getMinX();
				double max = G.getBoundsInParent().getMaxX();

				if (min < ViewSnowMan.getX() + (ViewSnowMan.getFitWidth() / 2)
						|| max > ViewTree.getX() + (ViewSnowMan.getFitWidth() / 2)) {
					x = x * -1;
					if (min < ViewSnowMan.getX() + (ViewSnowMan.getFitWidth() / 2)) {
						G.setRotate(0);
					} else {
						G.setRotate(180);
					}
				}
				G.setTranslateX(G.getTranslateX() + x);
			}
		});
		t.getKeyFrames().add(run);
		t.play();
		tl.play();

		Group root = new Group(ViewBG, ViewSnowMan, ViewTree, ViewFloor, ViewFloor1, ViewFloor2, ViewFloor3, ViewFloor4,
				ViewFloor5, ViewFloor6, ViewFloor7, G);
		Scene scene = new Scene(root, 800, 400);
		primaryStage.setTitle("Santa");
		primaryStage.setScene(scene);

		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
