package aa224fn_assign3;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class NorseGodsInterface extends Application {

	@Override
	public void start(Stage primaryStage) {
		ArrayList<NorseGods> list = new ArrayList<NorseGods>();
		NorseGods ng = new NorseGods("Thor", "God",
				"Thor was one of the most important and famous gods in Norse mythology. He was the son of Odin and Fyorgyn, the earth goddess. Thor was considered the storm-weather god of sky and thunder and also a fertility god. His wife was Sif, a goddess also linked to fertility. He had a red beard and eyes, he was huge in size, he had an insatiable appetite and not much wit. Thor was the strongest of all gods and men according to The Prose Edda.Thor was very talented at slaying giants; many of his stories revolve around violent episodes between him and his enemies. In order to perform his duties, Thor had a hammer, Mjollnir, a deadly weapon also associated with lightning and thunder, which was built by the dwarves. He also had iron gloves and a belt named Megingjard that doubled Thor’s strength once buckled on. There were also some other less destructive aspects of Thor. As a weather god he was associated with the fertility of the earth. He was also regarded as a guide for those travelling over the sea because of his power over storms and wind.\r\n" + 
				"\r\n" + 
				"Thor had a chariot to travel across the sky, which was drawn by two giant goats: Tanngniost and Tanngrisnir. These powerful animals had a very convenient magical property: they could be killed and eaten at any time, and as long as their bones were undamaged and returned into their skins, they would regenerate overnight and the following day would be alive, just like new.One of the most famous stories involving Thor is included in Hymir’s Poem: the gods organized a feast and the giant Ægir is requested to prepare it. Ægir agrees, but requests an enormous cauldron, which can only be obtained from the giant Hymir. Thor accepts the task of getting the cauldron and sets off on his adventure. In the middle of his mission, Thor and Hymir get involved in a fishing expedition");
		NorseGods ng1 = new NorseGods("Odin", "God",
				" is a widely revered god. In Norse mythology, from which stems most of the information about the god, Odin is associated with wisdom, healing, death, royalty, the gallows, knowledge, battle, sorcery, poetry, frenzy, and the runic alphabet, and is the husband of the goddess Frigg.");
		NorseGods ng2 = new NorseGods("Valkyrie", "valkyrie ",
				"is one of a host of female figures who choose those who may die in battle and those who may live. Selecting among half of those who die in battle , the valkyries bring their chosen to the afterlife hall of the slain, Valhalla, ruled over by the god Odin.");
		NorseGods ng3 = new NorseGods("Loki", "God",
				" is a god in Norse mythology. Loki is in some sources the son of Fárbauti and Laufey, and the brother of Helblindi and Býleistr. By the jötunn Angrboða, Loki is the father of Hel, the wolf Fenrir, and the world serpent Jörmungandr. By his wife Sigyn, Loki is the father of Narfi and/or Nari. By the stallion Svaðilfari, Loki is the mother—giving birth in the form of a mare—to the eight-legged horse Sleipnir. In addition, Loki is referred to as the father of Váli in Prose Edda, though this source also refers to Odin as the father of Váli twice, and Váli is found mentioned as a Son of Loki only once.");
		NorseGods ng4 = new NorseGods("Heimdallr", "God",
				" a god who possesses the resounding horn Gjallarhorn, owns the golden-maned horse Gulltoppr, has gold teeth, and is the son of Nine Mothers, grandson of Aegir and great grandson of Fornjotr. Heimdallr is attested as possessing foreknowledge, keen eyesight and hearing, and keeps watch for the onset of Ragnarök while drinking fine mead in his dwelling Himinbjörg, located where the burning rainbow bridge Bifröst meets heaven. Heimdallr is said to be the originator of social classes among humanity and once regained Freyja's treasured possession Brísingamen while doing battle in the shape of a seal with Loki. Heimdallr and Loki are foretold to kill one another during the events of Ragnarök. Heimdallr is additionally referred to as Rig, Hallinskiði, Gullintanni, and Vindlér or Vindhlér.");
		NorseGods ng5 = new NorseGods("Ymir", "jötunn ",
				" In Norse mythology, Ymir, is the ancestor of all jötnar. Ymir is attested in the Poetic Edda, compiled in the 13th century from earlier traditional material, in the Prose Edda, written by Snorri Sturluson in the 13th century, and in the poetry of skalds. Taken together, several stanzas from four poems collected in the Poetic Edda refer to Ymir as a primeval being who was born from venom that dripped from the icy rivers Élivágar and lived in the grassless void of Ginnungagap. Ymir birthed a male and female from the pits of his arms, and his legs together begat a six-headed being.");
		NorseGods ng6 = new NorseGods("Freyja", "goddess ",
				" is a goddess associated with love, sex, beauty, fertility, gold, seiðr, war, and death. Freyja is the owner of the necklace Brísingamen, rides a chariot pulled by two cats, accompanied by the boar Hildisvíni, and possesses a cloak of falcon feathers. ");
		NorseGods ng7 = new NorseGods("Frigg", "goddesses ",
				" As the wife of Odin, Frigg is one of the foremost goddesses of Norse mythology. She is the patron of marriage and motherhood, and the goddess of love and fertility. In that aspect she shows many similarities with Freya, of whom she possibly is a different form.\r\n"
						+ "\r\n"
						+ "She has a reputation of knowing every person's destiny, but never unveils it. As the mother of Balder, she tried to prevent his death by extracting oaths from every object in nature, but forgot the mistletoe. And by a fig made from mistletoe Balder died.\r\n"
						+ "\r\n" + "Her hall in Asgard is Fensalir (water halls).\r\n" + "\r\n"
						+ "Frigg's messenger is Gna, who rides through the sky on the horse Hofvarpnir. In some myths she was rumored to have had love affairs with Odin's brothers Ve and Vili.\r\n"
						+ "\r\n"
						+ "As Woden/Odin gave his name to Wednesday, and Thunor/Thor to Thursday, so Frigg is remembered in Friday. Frigg was the direct daughter of Fjorgyn, the Goddess of Earth. She kept her own hall, called Fensalir. Women prayed to her for children and prayed again for safe labor and delivery.\r\n"
						+ "\r\n" + "");
		NorseGods ng8 = new NorseGods("Baldr", "God",
		
				" is the god of light, joy, purity, and the summer sun in Norse mythology, and a son of the god Odin and the goddess Frigg. He is the father of Forseti, and He has numerous brothers, such as Thor and Váli.");
		
		NorseGods ng9 = new NorseGods();
		ng9.setName("Tyr");
		ng9.setRace("god");
		ng9.setDesc(" a Germanic god associated with law and heroic glory in Norse mythology, portrayed as one-handed. Corresponding names in other Germanic languages are Gothic Teiws, Old English Tiw and Old High German Ziu and Cyo, all from Proto-Germanic Tiwaz. The Latinised name is rendered as Tius or Tio and also formally as Mars Thincsus.In the late Icelandic Eddas, Tyr is portrayed, alternately, as the son of Odin (Prose Edda) or of Hymir (Poetic Edda), while the origins of his name and his possible relationship to Tuisto (see Tacitus' Germania) suggest he was once considered the father of the gods and head of the pantheon, since his name is ultimately cognate to that of Dyeus ( Dyaus), the reconstructed chief deity in Indo-European religion. It is assumed that Tîwaz was overtaken in popularity and in authority by both Odin and Thor at some point during the Migration Age, as Odin shares his role as God of war.");
		list.add(ng);
		list.add(ng1);
		list.add(ng2);
		list.add(ng3);
		list.add(ng4);
		list.add(ng5);
		list.add(ng6);
		list.add(ng7);
		list.add(ng8);
		list.add(ng9);

		primaryStage.setTitle("NorseGods");

		BorderPane bp = new BorderPane();
		Label heading = new Label("Norse Gods and other beings");
		heading.setFont(new Font("Comfortaa", 30));

		ListView<String> gods = new ListView<>();

		gods.setPrefWidth(150);
		gods.getItems().addAll(

				list.get(0).getName(), list.get(1).getName(), list.get(2).getName(), list.get(3).getName(),
				list.get(4).getName(), list.get(5).getName(), list.get(6).getName(), list.get(7).getName(),
				list.get(8).getName(),list.get(9).getName());

		Text name = new Text();
		name.setFont(Font.font("Comfortaa", 30));
		name.setStrokeWidth(4);
		Text race = new Text();
		race.setFont(Font.font("Helvetica", 15));

		Text desc = new Text();
		desc.setFont(Font.font("Helvetica", 15));
		VBox ver = new VBox();

		ScrollPane sp = new ScrollPane();

		TextFlow textFlow = new TextFlow(desc);

		textFlow.setTextAlignment(TextAlignment.JUSTIFY);
		textFlow.setPrefSize(300, 300);
		sp.setPrefSize(400, 300);
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setPadding(new Insets(0, 0, 0, 10));
		
		gods.getSelectionModel().selectedIndexProperty().addListener(ov -> {
			name.setText(list.get(gods.getSelectionModel().getSelectedIndex()).getName());
			race.setText(list.get(gods.getSelectionModel().getSelectedIndex()).getRace() + "\n");
			desc.setText(list.get(gods.getSelectionModel().getSelectedIndex()).getDesc());

		});
		ver.getChildren().addAll(name, race, textFlow);
		sp.setContent(ver);
		bp.setTop(heading);
		bp.setLeft(gods);
		bp.setCenter(sp);
		bp.setPadding(new Insets(0, 10, 30, 10));

		Scene scene = new Scene(bp, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
