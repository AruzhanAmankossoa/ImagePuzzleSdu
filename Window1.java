
import javafx.event.ActionEvent;

import java.util.ArrayList;
import java.util.List;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.VBoxBuilder;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;

import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Window1 extends Application implements ActionListener {

	// Public controls
	Stage primaryWindow;// Gives us opportunity to access controls from all
						// methods
	VBox vb, vb1, vb2; // VBox lays out its children in a single vertical column
	GridPane grid, gridScene2, gridScene3; // we can placed anywhere within the
											// grid and may span multiple
											// rows/columns.
	Label labelTitle, labelTitle1, labelTitle2; // for displaying text
	Scene scene1, scene2, scene3; // for switching scenes
	String string;// to get name of user
	private Timeline timeline;// for creating animation

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryWindow) throws Exception {
		primaryWindow.getIcons().add(new Image("file:///C:/Users/Asus/workspace/semestr2/src/Try/src/icon.jpg"));
		primaryWindow.setTitle("Image Puzzle");
		// Main Page
		GridPane mainGrid = new GridPane();
		mainGrid.setStyle("-fx-background-image: url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/mm.jpg')");
		HBox mainHBox = new HBox();
		Button buttonPlay = new Button("  Play  ");
		buttonPlay.setFont(Font.font("Bodoni MT Black", 30));
		buttonPlay.setMinSize(130, 30);
		buttonPlay.setStyle("-fx-background-color:gray");
		buttonPlay.setAlignment(Pos.BOTTOM_CENTER);
		mainHBox.getChildren().add(buttonPlay);
		mainHBox.setPadding(new Insets(450, 0, 80, 620));
		mainGrid.add(mainHBox, 0, 0);
		GridPane grid = new GridPane();
		grid.setHgap(40);// The width of the horizontal gaps between columns.
		grid.setVgap(20);// The height of the vertical gaps between rows.

		///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// Scene - I *
		// setting background image
		grid.setStyle(
				"-fx-background-image: url('file:///C:/Users/Asus/workspace/semestr2/src/Try/73584f85887791e.jpg')");

		labelTitle = new Label(" " + " [ Please,choose one of the following section.]"); // for
																							// displaying
																							// text
		labelTitle.setFont(new Font("Arial", 30));
		labelTitle.setTextFill(Color.GRAY);
		labelTitle.setAlignment(Pos.BASELINE_LEFT);
		grid.add(labelTitle, 0, 2);
		Button section1 = new Button(" All interesting about animals");
		section1.setStyle("-fx-border-insets: -5; " + "-fx-border-radius: 20;" + "-fx-border-style: solid inside;"
				+ "-fx-background-color: lightblue ; " + "-fx-border-width: 2;");
		Button section2 = new Button("Kazakhstan is my Motherland");
		section2.setStyle("-fx-border-insets: -5; " + "-fx-border-radius: 20;" + "-fx-border-style: solid;"
				+ "-fx-background-color: lightblue; " + "-fx-border-width: 2;");
		// we connected section1 and section2 in one vbox
		VBox vb = new VBox();
		vb.setPadding(new Insets(10, 50, 50, 110));
		vb.setSpacing(25);
		section1.setFont(Font.font("Amble CN", FontWeight.BOLD, 40));
		section2.setFont(Font.font("Amble CN", FontWeight.BOLD, 40));
		vb.getChildren().add(section1);
		vb.getChildren().add(section2);
		GridPane grid1 = new GridPane();
		grid1.add(vb, 5, 2);

		// This app has menu file: file, edit,help
		MenuBar menu = new MenuBar();
		Menu file = new Menu("File");
		Menu help = new Menu("Help");
		menu.setMinSize(740, 50);
		menu.setStyle("-fx-font-size:25");
		// Adding images
		Image img1 = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/icon.png");
		ImageView uploadView = new ImageView(img1);
		uploadView.setFitWidth(30);
		uploadView.setFitHeight(30);
		file.setGraphic(uploadView);

		// Adding images
		Image img2 = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/Actions-help-about-icon.png");
		ImageView uploadView1 = new ImageView(img2);
		uploadView1.setFitWidth(30);
		uploadView1.setFitHeight(30);
		help.setGraphic(uploadView1);

		MenuItem newItem = new MenuItem("New");
		MenuItem history = new MenuItem("History");
		MenuItem exit = new MenuItem("Exit");
		MenuItem solution = new MenuItem("About");

		exit.setOnAction(event -> System.exit(0));

		Button but = new Button("Cancel");
		history.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				GridPane root = new GridPane();
				root.setStyle("-fx-background-image: url('file:///C:/Users/Asus/workspace/semestr2/src/Try/hist.jpg')");
				final TextArea textArea = new TextArea();
				textArea.setText(
						"The origins of image puzzles go back to the 1760s when\n European mapmakers pasted maps onto wood \nand cut them into small pieces. John Spilsbury, \nan engraver and mapmaker, is credited with inventing the first \njigsaw puzzle in 1767. The dissected map has been a \nsuccessful educational toy ever since. American \nchildren still learn geography by playing with puzzle maps of the United States or the world. The eighteenth century inventors of jigsaw puzzles would be amazed to see the transformations of the last 250 years. Children's puzzles have moved from lessons to entertainment, showing diverse subjects like animals, nursery rhymes, and modern tales of super heroes. But the biggest surprise for the early puzzle makers would be how adults have embraced puzzling over the last century."
								+ "\nPuzzling as a Hobby"
								+ "\nPuzzles for adults emerged around 1900, and by \n1908 a full-blown craze was in progress in the \nUnited States. Contemporary writers depicted the\n inexorable progression of the puzzle addict: from the skeptic who first ridiculed puzzles as silly and childish, to the perplexed puzzler who ignored meals while\n chanting just one more piece; to the bleary-eyed victor who finally put in the last piece in the wee hours of the morning.The puzzles of those days were quite a challenge. Most had pieces cut exactly on the color lines. There were no transition pieces with two colors to signal, for example, that the brown area (roof) fit next to the blues (sky). A sneeze or a careless move could undo an evening's work because the pieces did not interlock. And, unlike children's puzzles, the adult puzzles had no guide picture on the box; if the title was vague or misleading, the true subject could remain a mystery until the last pieces were fitted into place.");
				textArea.setFont(new Font("Viner Hand Itc", 27));
				textArea.prefWidth(640);
				textArea.prefHeight(280);
				textArea.setWrapText(true);
				textArea.setStyle("-fx-background-color: BEIGE");
				textArea.setStyle(
						"-fx-highlight-fill: #00ff00; -fx-highlight-text-fill: #000000; -fx-text-fill: brown; ");
				ScrollPane scrollPane = new ScrollPane();
				scrollPane.setContent(textArea);
				scrollPane.setFitToWidth(true);
				scrollPane.setFitToHeight(true);
				scrollPane.setPrefWidth(700);
				scrollPane.setPrefHeight(380);
				scrollPane.setStyle("-fx-background-color: transparent;");

				VBox a = new VBox();
				VBox vBox = new VBox();
				VBox vb = new VBox();
				vb.getChildren().add(but);
				vb.setPadding(new Insets(20, 20, 0, 650));
				vBox.getChildren().add(scrollPane);
				vBox.setPadding(new Insets(250, 50, 0, 50));
				a.getChildren().addAll(vBox, vb);
				root.getChildren().addAll(a);
				primaryWindow.setScene(new Scene(root, 800, 700));
				primaryWindow.show();
			}
		});

		// It is about for main
		GridPane grd4 = new GridPane();
		HBox hboxCancel = new HBox();
		Button caanсcel = new Button("Cancel");
		caanсcel.setFont(new Font("Arial", 20));

		hboxCancel.setPadding(new Insets(380, 20, 5, 410));
		hboxCancel.getChildren().add(caanсcel);
		grd4.setStyle("-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/about.jpg')");
		grd4.add(hboxCancel, 0, 0);
		Scene scne2 = new Scene(grd4, 552, 434);// scne2-for about

		solution.setOnAction(e -> primaryWindow.setScene(scne2));

		file.getItems().addAll(newItem, history, exit);
		help.getItems().addAll(solution);
		menu.getMenus().addAll(file, help);

		BorderPane bp = new BorderPane();
		bp.setTop(menu);
		bp.setMinSize(900, 100);

		grid.add(bp, 0, 0);
		grid.add(grid1, 0, 4);
		Scene scene1 = new Scene(grid, 840, 620); // the container for all
													// content in a scene graph
		newItem.setOnAction(e -> primaryWindow.setScene(scene1));
		caanсcel.setOnAction(e -> primaryWindow.setScene(scene1));
		but.setOnAction(e -> primaryWindow.setScene(scene1));

		//////////////////////////////////////////////////////

		/*
		 * Scene -II(1)
		 */
		GridPane gridScene2 = new GridPane();
		gridScene2.setStyle(
				"-fx-background-image: url('file:///C:/Users/Asus/workspace/semestr2/src/Try/73584f85887791e.jpg');-fx-background-repeat:stretch;-fx-background-size:  110%  100%;-fx-background-position: bottom ;");
		Label labelTitle1 = new Label("  [ Please,enter your name.]");
		labelTitle1.setFont(new Font("Arial", 30));
		labelTitle1.setTextFill(Color.web("#0076a3"));
		labelTitle1.setAlignment(Pos.BASELINE_LEFT);
		labelTitle1.setPadding(new Insets(190, 50, 50, 20));
		TextField enterName = new TextField("");
		enterName.setPromptText("Enter Your Name");
		enterName.setMinSize(280, 60);
		enterName.setFont(new Font("Arial", 33));
		enterName.setStyle(
				" -fx-background-color: linear-gradient(to bottom, derive(-fx-text-box-border, -10%), -fx-text-box-border),linear-gradient(from 0px 0px to 0px 5px, derive(-fx-control-inner-background, -9%), -fx-control-inner-background);");

		Button cancel1 = new Button("Cancel");
		Button enter1 = new Button("Enter");
		enter1.setStyle(
				" -fx-background-color:         #090a0c,        linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),        linear-gradient(#20262b, #191d22),        radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));    -fx-background-radius: 5,4,3,5;    -fx-background-insets: 0,1,2,0;    -fx-text-fill: white;    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );   -fx-text-fill: linear-gradient(white, #d0d0d0);    -fx-font-size: 25px;    -fx-padding: 10 20 10 20;");
		cancel1.setStyle(
				" -fx-background-color:         #090a0c,        linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),        linear-gradient(#20262b, #191d22),        radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));    -fx-background-radius: 5,4,3,5;    -fx-background-insets: 0,1,2,0;    -fx-text-fill: white;    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );   -fx-text-fill: linear-gradient(white, #d0d0d0);    -fx-font-size: 25px;    -fx-padding: 10 20 10 20;");
		VBox vb1 = new VBox();
		vb1.setPadding(new Insets(10, 50, 50, 180));
		HBox hb1 = new HBox(5);
		hb1.setPadding(new Insets(20, 0, 50, 280));
		hb1.getChildren().add(enter1);
		hb1.getChildren().add(cancel1);
		hb1.setMinSize(100, 80);
		vb1.getChildren().add(enterName);
		vb1.getChildren().add(hb1);

		gridScene2.add(labelTitle1, 0, 5);
		gridScene2.add(vb1, 0, 6);
		Scene scene2 = new Scene(gridScene2, 740, 640);

		/*
		 * Scene -II(2)
		 */
		GridPane gridScene3 = new GridPane();
		gridScene3.setStyle(
				"-fx-background-image: url('file:///C:/Users/Asus/workspace/semestr2/src/Try/73584f85887791e.jpg');-fx-background-repeat:stretch;-fx-background-size:  110%  100%;-fx-background-position: bottom ;");
		Button cancel2 = new Button("Cancel");
		Button enter2 = new Button("Enter");
		enter2.setStyle(
				" -fx-background-color:         #090a0c,        linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),        linear-gradient(#20262b, #191d22),        radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));    -fx-background-radius: 5,4,3,5;    -fx-background-insets: 0,1,2,0;    -fx-text-fill: white;    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );   -fx-text-fill: linear-gradient(white, #d0d0d0);    -fx-font-size: 25px;    -fx-padding: 10 20 10 20;");
		cancel2.setStyle(
				" -fx-background-color:         #090a0c,        linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),        linear-gradient(#20262b, #191d22),        radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));    -fx-background-radius: 5,4,3,5;    -fx-background-insets: 0,1,2,0;    -fx-text-fill: white;    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );   -fx-text-fill: linear-gradient(white, #d0d0d0);    -fx-font-size: 25px;    -fx-padding: 10 20 10 20;");
		Label labelTitle2 = new Label("  [ Please,enter your name.]");
		labelTitle2.setTextFill(Color.web("#0076a3"));
		labelTitle2.setFont(new Font("Arial", 30));
		labelTitle2.setAlignment(Pos.BASELINE_LEFT);
		labelTitle2.setPadding(new Insets(190, 50, 50, 20));

		TextField enterName1 = new TextField("");
		enterName1.setMinSize(280, 60);
		enterName1.setPromptText("Enter your name...");
		enterName1.setFont(new Font("Arial", 30));

		VBox vb12 = new VBox();
		vb12.setPadding(new Insets(10, 50, 50, 180));
		HBox hb12 = new HBox(5);
		hb12.setPadding(new Insets(20, 0, 50, 280));
		hb12.getChildren().add(enter2);
		hb12.getChildren().add(cancel2);
		hb12.setMinSize(100, 80);
		vb12.getChildren().add(enterName1);
		vb12.getChildren().add(hb12);

		gridScene3.add(labelTitle2, 0, 5);
		gridScene3.add(vb12, 0, 6);
		Scene scene3 = new Scene(gridScene3, 740, 640);

		// this is main scene(first page)
		Scene scene = new Scene(mainGrid, 992, 620);
		buttonPlay.setOnAction(e -> primaryWindow.setScene(scene1));
		newItem.setOnAction(e -> primaryWindow.setScene(scene));
		section2.setOnAction(e -> primaryWindow.setScene(scene3));
		cancel1.setOnAction(e -> primaryWindow.setScene(scene1));
		cancel2.setOnAction(e -> primaryWindow.setScene(scene1));

		// levels
		GridPane gridDif = new GridPane();
		VBox vboxDif = new VBox(22);
		vboxDif.setPadding(new Insets(150, 100, 0, 220));
		Button butDif1 = new Button("      3x3      ");
		Button butDif2 = new Button("      4x3      ");
		Button butDif3 = new Button("      5x3      ");
		butDif1.setStyle(
				" -fx-background-color: linear-gradient(#686868 0%, #232723 25%, #373837 75%, #757575 100%),linear-gradient(#020b02, #3a3a3a),linear-gradient(#9d9e9d 0%, #6b6a6b 20%, #343534 80%, #242424 100%),linear-gradient(#8a8a8a 0%, #6b6a6b 20%, #343534 80%, #262626 100%),linear-gradient(#777777 0%, #606060 50%, #505250 51%, #2a2b2a 100%);-fx-background-insets: 0,1,4,5,6;-fx-background-radius: 9,8,5,4,3;-fx-padding: 15 30 15 30; "
						+ " -fx-font-size: 26px;-fx-font-weight: bold;-fx-text-fill: white;-fx-effect: dropshadow( three-pass-box , rgba(255,255,255,0.2) , 1, 0.0 , 0 , 1);");
		butDif2.setStyle(
				" -fx-background-color: linear-gradient(#686868 0%, #232723 25%, #373837 75%, #757575 100%),linear-gradient(#020b02, #3a3a3a),linear-gradient(#9d9e9d 0%, #6b6a6b 20%, #343534 80%, #242424 100%),linear-gradient(#8a8a8a 0%, #6b6a6b 20%, #343534 80%, #262626 100%),linear-gradient(#777777 0%, #606060 50%, #505250 51%, #2a2b2a 100%);-fx-background-insets: 0,1,4,5,6;-fx-background-radius: 9,8,5,4,3;-fx-padding: 15 30 15 30; "
						+ " -fx-font-size: 26px;-fx-font-weight: bold;-fx-text-fill: white;-fx-effect: dropshadow( three-pass-box , rgba(255,255,255,0.2) , 1, 0.0 , 0 , 1);");
		butDif3.setStyle(
				" -fx-background-color: linear-gradient(#686868 0%, #232723 25%, #373837 75%, #757575 100%),linear-gradient(#020b02, #3a3a3a),linear-gradient(#9d9e9d 0%, #6b6a6b 20%, #343534 80%, #242424 100%),linear-gradient(#8a8a8a 0%, #6b6a6b 20%, #343534 80%, #262626 100%),linear-gradient(#777777 0%, #606060 50%, #505250 51%, #2a2b2a 100%);-fx-background-insets: 0,1,4,5,6;-fx-background-radius: 9,8,5,4,3;-fx-padding: 15 30 15 30; "
						+ " -fx-font-size: 26px;-fx-font-weight: bold;-fx-text-fill: white;-fx-effect: dropshadow( three-pass-box , rgba(255,255,255,0.2) , 1, 0.0 , 0 , 1);");
		vboxDif.getChildren().addAll(butDif1, butDif2, butDif3);
		gridDif.getChildren().addAll(vboxDif);
		gridDif.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/Hack/puzzle.jpg')");
		gridDif.setVgap(60);
		gridDif.setHgap(60);
		Scene chooseDif = new Scene(gridDif, 560, 500);

		// for button dif1
		HBox hb = new HBox();
		ImageView imageViewArt = new ImageView(new Image(getClass().getResourceAsStream("собака.jpg")));
		imageViewArt.setFitWidth(230);
		imageViewArt.setFitHeight(180);
		Button buttonDog = new Button("", imageViewArt);
		buttonDog.setPrefSize(230, 180);

		ImageView imageViewDeb = new ImageView(new Image(getClass().getResourceAsStream("кошка.jpg")));
		imageViewDeb.setFitHeight(180);
		imageViewDeb.setFitWidth(230);
		Button buttonCat = new Button("", imageViewDeb);
		buttonCat.setPrefSize(230, 180);

		ImageView imageViewDom = new ImageView(new Image(getClass().getResourceAsStream("кролик.jpg")));
		imageViewDom.setFitWidth(230);
		imageViewDom.setFitHeight(180);
		Button buttonRabbit = new Button("", imageViewDom);
		buttonRabbit.setPrefSize(230, 180);

		GridPane gridPaneClub = new GridPane();
		gridPaneClub.add(hb, 0, 0);
		gridPaneClub.add(buttonDog, 0, 0);
		gridPaneClub.add(buttonCat, 0, 1);
		gridPaneClub.add(buttonRabbit, 0, 2);
		gridPaneClub.setAlignment(Pos.TOP_CENTER);
		gridPaneClub.setVgap(10);
		gridPaneClub.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/73584f85887791e.jpg')");
		Scene scene3by3 = new Scene(gridPaneClub, 645, 600);
		// action listener of buttindif1 (buttondif means level of game)
		butDif1.setOnAction(event -> primaryWindow.setScene(scene3by3));

		// load puzzle image
		Image image = new Image(getClass().getResourceAsStream("собака.jpg"));
		// we set a number columns and rows by figuring out the width of our
		// image
		int numOfColumns = (int) (image.getWidth() / Piece.SIZE);
		int numOfRows = (int) (image.getHeight() / Piece.SIZE);
		// create desk
		final Desk desk = new Desk(numOfColumns, numOfRows);
		// we're going to create puzzle pieces.So we go through this for loop
		// and we create all our pieces when we insert this jigsaw piece that
		// we're creating into the pieces array
		final List<Piece> pieces = new ArrayList<Piece>();
		for (int col = 0; col < numOfColumns; col++) {
			for (int row = 0; row < numOfRows; row++) {
				int x = col * Piece.SIZE;
				int y = row * Piece.SIZE;

				final Piece piece = new Piece(image, x, y, row > 0, col > 0, row < numOfRows - 1,
						col < numOfColumns - 1, desk.getWidth(), desk.getHeight());
				pieces.add(piece);
				// count++;
			}
		}
		desk.getChildren().addAll(pieces);
		// create button box

		Button shuffleButton = new Button("Shuffle");
		shuffleButton.setStyle("-fx-font-size: 2em;-fx-background-color:gray");

		shuffleButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : pieces) {
					piece.setActive();
					double shuffleX = Math.random() * (desk.getWidth() - Piece.SIZE + 48f) - 24f - piece.getCorrectX();
					double shuffleY = Math.random() * (desk.getHeight() - Piece.SIZE + 30f) - 15f - piece.getCorrectY();
					timeline.getKeyFrames()
							.add(new KeyFrame(Duration.seconds(1), new KeyValue(piece.translateXProperty(), shuffleX),
									new KeyValue(piece.translateYProperty(), shuffleY)));
				}
				timeline.playFromStart();
			}
		});

		MenuBar menu1 = new MenuBar();
		menu1.setStyle("-fx-background-color: gray;");
		Menu file1 = new Menu("File");
		Menu edit1 = new Menu("Edit");
		Menu help1 = new Menu("Help");
		menu1.setMinSize(740, 50);
		menu1.setStyle("-fx-font-size:25");

		// Adding images
		Image img11 = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/icon.png");
		ImageView uploadView11 = new ImageView(img11);
		uploadView11.setFitWidth(30);
		uploadView11.setFitHeight(30);
		file1.setGraphic(uploadView11);

		// Adding images
		Image img21 = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/Actions-help-about-icon.png");
		ImageView uploadView12 = new ImageView(img21);
		uploadView12.setFitWidth(30);
		uploadView12.setFitHeight(30);
		help1.setGraphic(uploadView12);

		// Adding images
		Image img31 = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/edit.png");
		ImageView uploadView31 = new ImageView(img31);
		uploadView31.setFitWidth(30);
		uploadView31.setFitHeight(30);
		edit1.setGraphic(uploadView31);

		MenuItem exit1 = new MenuItem("Exit");
		MenuItem solution1 = new MenuItem("About");

		exit1.setOnAction(e -> System.exit(0));

		file1.getItems().addAll(exit1);
		// It is about for main
		GridPane griidd41 = new GridPane();
		HBox hboxCancel1 = new HBox();
		Button ccanсcel = new Button("Cancel");
		ccanсcel.setFont(new Font("Arial", 20));
		hboxCancel1.setPadding(new Insets(380, 20, 5, 410));
		hboxCancel1.getChildren().add(ccanсcel);
		griidd41.setStyle("-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/about.jpg')");
		griidd41.add(hboxCancel1, 0, 0);
		// scceene2-for about
		Scene scceene2 = new Scene(griidd41, 552, 434);

		solution1.setOnAction(e -> primaryWindow.setScene(scceene2));

		BorderPane bp1 = new BorderPane();
		bp1.setTop(menu1);
		bp1.setMinSize(200, 100);

		MenuItem solveButton = new MenuItem("Solution");
		solveButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : pieces) {
					piece.setInactive();
					timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1),
							new KeyValue(piece.translateXProperty(), 0), new KeyValue(piece.translateYProperty(), 0)));
				}
				timeline.playFromStart();
			}
		});

		help1.getItems().addAll(solveButton, solution1);
		menu1.getMenus().addAll(file1, help1);
		/*
		 * THIS IS SCENE WHICH WILL GIVE US INFO NEXT AND CANCEL BUTTONS
		 */

		GridPane gridFinGame = new GridPane();
		HBox vInf = new HBox(); // this hbox contains a button information
		vInf.setPadding(new Insets(140, 140, 10, 180));
		HBox forVnextAndCancel = new HBox();// this hbox contains "back" and
											// "next" buttons
		forVnextAndCancel.setPadding(new Insets(250, 150, 0, 30));
		Button vnext = new Button("Next");
		vnext.setMinSize(120, 35);
		vnext.setAlignment(Pos.BOTTOM_RIGHT);

		// Adding images FOR BUTTON NEXT
		Image imageForNext = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/green-play-button-icon_228230.png");
		ImageView uploadViewimageForNext = new ImageView(imageForNext);
		uploadViewimageForNext.setFitWidth(35);
		uploadViewimageForNext.setFitHeight(45);
		vnext.setGraphic(uploadViewimageForNext);
		vnext.setFont(new Font("Arial", 20));
		HBox forCancel = new HBox();
		forCancel.setPadding(new Insets(250, 50, 0, -150));
		Button vcancel = new Button("Back");
		vcancel.setMinSize(120, 35);
		vcancel.setAlignment(Pos.BOTTOM_LEFT);
		vcancel.setFont(new Font("Arial", 20));

		// Adding images FOR BUTTON cancel
		Image imageForCancel = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/Previous-Button-PNG-Image.png");
		ImageView uploadViewimageForCancel = new ImageView(imageForCancel);
		uploadViewimageForCancel.setFitWidth(35);
		uploadViewimageForCancel.setFitHeight(45);
		vcancel.setGraphic(uploadViewimageForCancel);
		forCancel.getChildren().add(vcancel);
		forVnextAndCancel.getChildren().addAll(vnext);

		// Setting the linear gradient
		Stop[] stops = new Stop[] { new Stop(0, Color.DARKSLATEBLUE), new Stop(1, Color.DARKRED) };
		LinearGradient linearGradient = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);

		// gettng information
		Button inf = new Button("Dog-It-Köpek\n" + "An adult female \nis a bitch."
				+ "An adult\n male capable of \nreproduction is a \nstud."
				+ "A group of any\n three or more \n  adults is a pack.");
		inf.setFont(Font.font("imprint MT Shadow", FontWeight.BOLD, FontPosture.REGULAR, 25));
		inf.setTextFill(linearGradient);
		inf.setMinSize(250, 300);
		vInf.getChildren().addAll(forCancel, inf, forVnextAndCancel);
		inf.setStyle("-fx-background-radius: 40, 40, 40, 40;");
		gridFinGame.add(vInf, 0, 0);
		gridFinGame.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/PuzzleGame/congratulazioni-gif-congratulations-glitter-611.gif');-fx-background-repeat:stretch;-fx-background-position: bottom ; -fx-background-color:beige");

		Scene finishGamee = new Scene(gridFinGame, 620, 620);

		Button finishGame = new Button("Finish");
		finishGame.setFont(new Font("Times New Roman", 30)); // www.
		finishGame.setStyle("-fx-background-color:gray");// www.
		finishGame.setAlignment(Pos.BOTTOM_RIGHT);

		finishGame.setOnAction(e -> primaryWindow.setScene(finishGamee));
		HBox buttonBox1 = new HBox(8);
		buttonBox1.getChildren().add(finishGame);
		buttonBox1.setPadding(new Insets(0, 0, 0, 220));
		HBox buttonBox = new HBox();
		buttonBox.getChildren().addAll(shuffleButton, buttonBox1);

		// create vbox for desk and buttons
		VBox vbox1 = new VBox(10);
		vbox1.getChildren().addAll(bp1, desk, buttonBox);
		vbox1.setPadding(new Insets(15, 24, 15, 24));
		GridPane mngrid = new GridPane();// mngrid means main grid of scene
		mngrid.add(vbox1, 0, 0);
		mngrid.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/milano-texture-plain-glitter-wallpaper-silver-m95566-p2591-9085_medium.jpg');");
		Scene c = new Scene(mngrid, 560, 560);
		ccanсcel.setOnAction(e -> primaryWindow.setScene(c));
		vcancel.setOnAction(e -> primaryWindow.setScene(c));
		buttonDog.setOnAction(event -> primaryWindow.setScene(c));
		vnext.setOnAction(event -> {
			GridPane vd = new GridPane();
			string = enterName.getText().toUpperCase();
			Text text1 = new Text("\t" + string + "\n,");
			Text text2 = new Text("\n\tyou did it !!!");
			Text cc1 = new Text();
			VBox vc = new VBox();
			Button tryAgain = new Button("Try again");
			Image imgAG = new Image(
					"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/View-refresh_Gion_simple.svg.png");
			ImageView uploadViewAG = new ImageView(imgAG);
			uploadViewAG.setFitWidth(30);
			uploadViewAG.setFitHeight(30);
			tryAgain.setGraphic(uploadViewAG);
			vc.getChildren().add(tryAgain);
			vc.setPadding(new Insets(0, 20, 50, 250));
			tryAgain.setOnAction(e -> primaryWindow.setScene(scene1));

			VBox cv = new VBox();
			cv.getChildren().addAll(text1, text2, cc1);
			text1.setFill(Color.GOLD);
			text2.setFill(Color.GOLD);
			cc1.setFill(Color.BLACK);
			vd.setStyle(
					"-fx-background-image: url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/0_c5883_e9e85875_XL.gif')");
			text1.setFont(Font.font("Bodoni MT Black", 50));
			text2.setFont(Font.font("Bodoni MT Black", 50));
			tryAgain.setFont(Font.font("Bodoni MT Black", 24));

			vd.setPadding(new Insets(100, 50, 70, 100));
			vd.add(cv, 5, 3);
			vd.add(vc, 5, 5);

			Scene vse = new Scene(vd, 650, 406);
			primaryWindow.setScene(vse);
		});

		// for button dif2
		HBox hbAnimal2 = new HBox();
		ImageView imageViewDog = new ImageView(new Image(getClass().getResourceAsStream("panda.jpg")));
		imageViewDog.setFitWidth(230);
		imageViewDog.setFitHeight(180);
		Button buttonPopugai = new Button("", imageViewDog);// panda
		buttonPopugai.setPrefSize(230, 180);

		ImageView imageViewLion = new ImageView(new Image(getClass().getResourceAsStream("жираф.jpg")));
		imageViewLion.setFitHeight(180);
		imageViewLion.setFitWidth(230);
		Button buttonGirraff = new Button("", imageViewLion);// giraffe button
		buttonGirraff.setPrefSize(230, 180);

		ImageView imageViewOrel = new ImageView(new Image(getClass().getResourceAsStream("popugai.jpg")));
		imageViewOrel.setFitWidth(230);
		imageViewOrel.setFitHeight(180);
		Button buttonPoppu = new Button("", imageViewOrel);// popugai button
		buttonPoppu.setPrefSize(230, 180);

		GridPane gridPaneOfAnm2 = new GridPane();
		gridPaneOfAnm2.add(hbAnimal2, 0, 0);
		gridPaneOfAnm2.add(buttonPopugai, 0, 0);
		gridPaneOfAnm2.add(buttonGirraff, 0, 1);
		gridPaneOfAnm2.add(buttonPoppu, 0, 2);
		gridPaneOfAnm2.setAlignment(Pos.TOP_CENTER);
		gridPaneOfAnm2.setVgap(10);
		gridPaneOfAnm2.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/73584f85887791e.jpg')");
		Scene scene4by3 = new Scene(gridPaneOfAnm2, 645, 600);
		// al of buttindif1
		butDif2.setOnAction(event -> primaryWindow.setScene(scene4by3));

		// load puzzle image
		Image image1 = new Image(getClass().getResourceAsStream("panda.jpg"));
		// ImageView image= new ImageView(image1);
		int numOfColumns1 = (int) (image1.getWidth() / Piece.SIZE);
		int numOfRows1 = (int) (image1.getHeight() / Piece.SIZE);
		// create desk
		final Desk desk1 = new Desk(numOfColumns1, numOfRows1);
		// create puzzle pieces
		final List<Piece> pieces1 = new ArrayList<Piece>();
		for (int col = 0; col < numOfColumns1; col++) {
			for (int row = 0; row < numOfRows1; row++) {
				int x = col * Piece.SIZE;
				int y = row * Piece.SIZE;

				final Piece piece = new Piece(image1, x, y, row > 0, col > 0, row < numOfRows1 - 1,
						col < numOfColumns1 - 1, desk1.getWidth(), desk1.getHeight());

				pieces1.add(piece);
			}
		}
		desk1.getChildren().addAll(pieces1);
		// create button box
		Button shuffleButton1 = new Button("Shuffle");
		// shuffleButton.setStyle("-fx-background-color:gray");
		shuffleButton1.setStyle("-fx-font-size: 2em;-fx-background-color:gray");
		shuffleButton1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}

				timeline = new Timeline();
				for (final Piece piece : pieces1) {
					piece.setActive();
					double shuffleX = Math.random() * (desk1.getWidth() - Piece.SIZE + 48f) - 24f - piece.getCorrectX();
					double shuffleY = Math.random() * (desk1.getHeight() - Piece.SIZE + 30f) - 15f
							- piece.getCorrectY();

					timeline.getKeyFrames()
							.add(new KeyFrame(Duration.seconds(1), new KeyValue(piece.translateXProperty(), shuffleX),
									new KeyValue(piece.translateYProperty(), shuffleY)));
				}
				timeline.playFromStart();
			}
		});

		/*
		 * This scene has menu file: file, edit,help
		 * 
		 */

		MenuBar menuAnm = new MenuBar();
		menuAnm.setStyle("-fx-background-color: gray;");
		Menu fileAnm = new Menu("File");
		Menu editAnm = new Menu("Edit");
		Menu helpAnm = new Menu("Help");
		menuAnm.setMinSize(740, 50);
		menuAnm.setStyle("-fx-font-size:25");

		// Adding images
		Image imgAnm = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/icon.png");
		ImageView uploadViewAnm = new ImageView(imgAnm);
		uploadViewAnm.setFitWidth(30);
		uploadViewAnm.setFitHeight(30);
		fileAnm.setGraphic(uploadViewAnm);

		// Adding images
		Image imgAnm2 = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/Actions-help-about-icon.png");
		ImageView uploadView12Anm = new ImageView(imgAnm2);
		uploadView12Anm.setFitWidth(30);
		uploadView12Anm.setFitHeight(30);
		helpAnm.setGraphic(uploadView12Anm);

		// Adding images
		Image imgAnm3 = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/edit.png");
		ImageView uploadView31Anm = new ImageView(imgAnm3);
		uploadView31Anm.setFitWidth(30);
		uploadView31Anm.setFitHeight(30);
		editAnm.setGraphic(uploadView31Anm);

		MenuItem exitAnm = new MenuItem("Exit");
		MenuItem solutionAnm = new MenuItem("About");

		exitAnm.setOnAction(e -> System.exit(0));

		fileAnm.getItems().addAll(exitAnm);
		// edit1.getItems().addAll(cancel11);

		GridPane gridAnm = new GridPane();
		HBox hboxAnm = new HBox();
		Button ccanсcel1 = new Button("Cancel");
		ccanсcel1.setFont(new Font("Arial", 20));
		hboxAnm.setPadding(new Insets(380, 20, 5, 410));
		hboxAnm.getChildren().add(ccanсcel1);
		gridAnm.setStyle("-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/about.jpg')");
		gridAnm.add(hboxAnm, 0, 0);
		// scceene2-for about
		Scene sceneAnm2 = new Scene(gridAnm, 552, 434);

		solutionAnm.setOnAction(e -> primaryWindow.setScene(sceneAnm2));

		BorderPane bpAnm = new BorderPane();
		bpAnm.setTop(menuAnm);
		bpAnm.setMinSize(200, 100);

		MenuItem solveButtonAnm = new MenuItem("Solution");
		solveButtonAnm.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : pieces1) {
					piece.setInactive();
					timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1),
							new KeyValue(piece.translateXProperty(), 0), new KeyValue(piece.translateYProperty(), 0)));
				}
				timeline.playFromStart();
			}
		});

		helpAnm.getItems().addAll(solveButtonAnm, solutionAnm);
		menuAnm.getMenus().addAll(fileAnm, helpAnm);
		/*
		 * THIS IS SCENE WHICH WILL GIVE US INFO NEXT AND CANCEL BUTTONS
		 */

		GridPane gridOfFinishGameAnm = new GridPane();
		HBox vInfAnm = new HBox();
		vInfAnm.setPadding(new Insets(140, 140, 10, 180));

		HBox forVnextAndCancelAnm = new HBox();
		forVnextAndCancelAnm.setPadding(new Insets(250, 150, 0, 30));
		Button vnextAnm = new Button("Next");
		vnextAnm.setMinSize(120, 35);
		vnextAnm.setAlignment(Pos.BOTTOM_RIGHT);
		// Adding images FOR BUTTON NEXT
		Image imageForNextAnm = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/green-play-button-icon_228230.png");
		ImageView uploadViewimageForNextAnm = new ImageView(imageForNextAnm);
		uploadViewimageForNextAnm.setFitWidth(35);
		uploadViewimageForNextAnm.setFitHeight(45);
		vnextAnm.setGraphic(uploadViewimageForNextAnm);
		vnextAnm.setFont(new Font("Arial", 20));
		HBox forCancelAnm = new HBox();
		forCancelAnm.setPadding(new Insets(250, 50, 0, -150));
		Button vcancelAnm = new Button("Back");
		vcancelAnm.setMinSize(120, 35);
		vcancelAnm.setAlignment(Pos.BOTTOM_LEFT);
		vcancelAnm.setFont(new Font("Arial", 20));

		// Adding images FOR BUTTON cancel
		Image imageForCancelAnm = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/Previous-Button-PNG-Image.png");
		ImageView uploadViewimageForCancelAnm = new ImageView(imageForCancelAnm);
		uploadViewimageForCancelAnm.setFitWidth(35);
		uploadViewimageForCancelAnm.setFitHeight(45);
		vcancelAnm.setGraphic(uploadViewimageForCancelAnm);
		forCancelAnm.getChildren().add(vcancelAnm);

		forVnextAndCancelAnm.getChildren().addAll(vnextAnm);

		Button infAnm = new Button(
				"Panda-Panda-Panda\nThese guys are BIG \neaters–every day\n they fill their \ntummies for up to \n12 hours, shifting \nup to 12 kilograms \nof bamboo!");
		infAnm.setFont(Font.font("imprint MT Shadow", FontWeight.BOLD, FontPosture.REGULAR, 25));
		infAnm.setTextFill(linearGradient);
		infAnm.setMinSize(300, 300);
		vInfAnm.getChildren().addAll(forCancelAnm, infAnm, forVnextAndCancelAnm);

		infAnm.setStyle("-fx-background-radius: 40, 40, 40, 40;");
		gridOfFinishGameAnm.add(vInfAnm, 0, 0);
		gridOfFinishGameAnm.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/PuzzleGame/congratulazioni-gif-congratulations-glitter-611.gif');-fx-background-repeat:stretch;-fx-background-position: bottom ; -fx-background-color:beige");

		Scene finishGameeAnm = new Scene(gridOfFinishGameAnm, 660, 620);

		Button finishGameAnm = new Button("Finish");
		finishGameAnm.setFont(new Font("Times New Roman", 30)); // www.
		finishGameAnm.setStyle("-fx-background-color:gray");// www.
		finishGameAnm.setAlignment(Pos.BOTTOM_RIGHT);

		finishGameAnm.setOnAction(e -> primaryWindow.setScene(finishGameeAnm));
		HBox buttonBox1Anm = new HBox(8);
		buttonBox1Anm.getChildren().add(finishGameAnm);
		buttonBox1Anm.setPadding(new Insets(0, 0, 0, 220));
		HBox buttonBoxAnm = new HBox();
		buttonBoxAnm.getChildren().addAll(shuffleButton1, buttonBox1Anm);
		// create vbox for desk and buttons
		VBox vbox1Anm = new VBox(10);
		vbox1Anm.getChildren().addAll(bpAnm, desk1,
				buttonBoxAnm/* ,mLabel,bottomPane */);
		vbox1Anm.setPadding(new Insets(15, 24, 15, 24));
		GridPane mngridAnm = new GridPane();// www.
		mngridAnm.add(vbox1Anm, 0, 0);
		mngridAnm.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/milano-texture-plain-glitter-wallpaper-silver-m95566-p2591-9085_medium.jpg');");
		Scene anm = new Scene(mngridAnm, 560, 560);
		ccanсcel1.setOnAction(event -> primaryWindow.setScene(anm));
		vcancelAnm.setOnAction(event -> primaryWindow.setScene(anm));
		buttonPopugai.setOnAction(event -> primaryWindow.setScene(anm));
		vnextAnm.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				GridPane vd = new GridPane();
				string = enterName.getText().toUpperCase();
				Text text1 = new Text("\t" + string + ",");
				Text text2 = new Text("\n\tyou did it !!!");
				Text cc1 = new Text();
				VBox vc = new VBox();
				Button vc1 = new Button("Try again");
				Image imgAG = new Image(
						"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/View-refresh_Gion_simple.svg.png");
				ImageView uploadViewAG = new ImageView(imgAG);
				uploadViewAG.setFitWidth(30);
				uploadViewAG.setFitHeight(30);
				vc1.setGraphic(uploadViewAG);
				vc.getChildren().add(vc1);
				vc.setPadding(new Insets(0, 20, 50, 250));
				vc1.setOnAction(e -> primaryWindow.setScene(scene1));

				VBox cv = new VBox();
				cv.getChildren().addAll(text1, text2, cc1);
				text1.setFill(Color.GOLD);
				text2.setFill(Color.GOLD);
				cc1.setFill(Color.BLACK);
				vd.setStyle(
						"-fx-background-image: url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/0_c5883_e9e85875_XL.gif')");
				text1.setFont(Font.font("Bodoni MT Black", 50));
				text2.setFont(Font.font("Bodoni MT Black", 50));
				vc1.setFont(Font.font("Bodoni MT Black", 24));

				vd.setPadding(new Insets(100, 50, 70, 100));
				vd.add(cv, 5, 3);
				vd.add(vc, 5, 5);

				Scene vse = new Scene(vd, 650, 406);
				primaryWindow.setScene(vse);
			}
		});

		// for button cat load puzzle image
		Image image53 = new Image(getClass().getResourceAsStream("кошка.jpg"));
		int numOfColumns53 = (int) (image53.getWidth() / Piece.SIZE);
		int numOfRows53 = (int) (image53.getHeight() / Piece.SIZE);
		// create desk
		final Desk desk53 = new Desk(numOfColumns53, numOfRows53);
		// create puzzle pieces
		final List<Piece> pieces53 = new ArrayList<Piece>();
		for (int col = 0; col < numOfColumns53; col++) {
			for (int row = 0; row < numOfRows53; row++) {
				int x = col * Piece.SIZE;
				int y = row * Piece.SIZE;
				final Piece piece = new Piece(image53, x, y, row > 0, col > 0, row < numOfRows53 - 1,
						col < numOfColumns53 - 1, desk53.getWidth(), desk53.getHeight());
				pieces53.add(piece);
			}
		}
		desk53.getChildren().addAll(pieces53);
		// create button box
		Button shuffleButton53 = new Button("Shuffle");
		shuffleButton53.setStyle("-fx-font-size: 2em;-fx-background-color:gray");
		shuffleButton53.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : pieces53) {
					piece.setActive();
					double shuffleX = Math.random() * (desk53.getWidth() - Piece.SIZE + 48f) - 24f
							- piece.getCorrectX();
					double shuffleY = Math.random() * (desk53.getHeight() - Piece.SIZE + 30f) - 15f
							- piece.getCorrectY();
					timeline.getKeyFrames()
							.add(new KeyFrame(Duration.seconds(1), new KeyValue(piece.translateXProperty(), shuffleX),
									new KeyValue(piece.translateYProperty(), shuffleY)));
				}
				timeline.playFromStart();
			}
		});

		// This scene has menu file: file, edit,help * */
		MenuBar menu53 = new MenuBar();
		menu53.setStyle("-fx-background-color: gray;");
		Menu file53 = new Menu("File");
		Menu edit53 = new Menu("Edit");
		Menu help53 = new Menu("Help");
		menu53.setMinSize(740, 50);
		menu53.setStyle("-fx-font-size:25");

		// Adding images
		Image img53 = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/icon.png");
		ImageView uploadView53 = new ImageView(img53);
		uploadView53.setFitWidth(30);
		uploadView53.setFitHeight(30);
		file53.setGraphic(uploadView53);

		// Adding images
		Image image531 = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/Actions-help-about-icon.png");
		ImageView uploadView531 = new ImageView(image531);
		uploadView531.setFitWidth(30);
		uploadView531.setFitHeight(30);
		help53.setGraphic(uploadView12);

		// Adding images
		Image imge53 = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/edit.png");
		ImageView upldView53 = new ImageView(imge53);
		upldView53.setFitWidth(30);
		upldView53.setFitHeight(30);
		edit53.setGraphic(upldView53);
		MenuItem exit53 = new MenuItem("Exit");
		MenuItem solution53 = new MenuItem("About");

		exit53.setOnAction(e -> System.exit(0));

		file53.getItems().addAll(exit53);
		// It is about section for cat
		GridPane grid53 = new GridPane();
		HBox hboxCancel53 = new HBox();
		Button canсel53 = new Button("Cancel");
		canсel53.setFont(new Font("Arial", 20));

		hboxCancel53.setPadding(new Insets(380, 20, 5, 410));
		hboxCancel53.getChildren().add(canсel53);
		grid53.setStyle("-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/about.jpg')");
		grid53.add(hboxCancel53, 0, 0);
		Scene scene5by3 = new Scene(grid53, 552, 434);// scene5by3-for about

		solution53.setOnAction(e -> primaryWindow.setScene(scene5by3));

		BorderPane bp5by3 = new BorderPane();
		bp5by3.setTop(menu53);
		bp5by3.setMinSize(200, 100);

		MenuItem solveButton53 = new MenuItem("Solution");
		solveButton53.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : pieces53) {
					piece.setInactive();
					timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1),
							new KeyValue(piece.translateXProperty(), 0), new KeyValue(piece.translateYProperty(), 0)));
				}
				timeline.playFromStart();
			}
		});

		help53.getItems().addAll(solveButton53, solution53);
		menu53.getMenus().addAll(file53, help53);
		/*
		 * THIS IS SCENE WHICH WILL GIVE US INFO NEXT AND CANCEL BUTTONS
		 */

		GridPane gridOfFinishGame53 = new GridPane();
		HBox vInf53 = new HBox();
		vInf53.setPadding(new Insets(140, 140, 10, 180));

		HBox forVnextAndCancel53 = new HBox();
		forVnextAndCancel53.setPadding(new Insets(250, 150, 0, 30));
		Button vnext53 = new Button("Next");
		vnext53.setMinSize(120, 35);
		vnext53.setAlignment(Pos.BOTTOM_RIGHT);
		// Adding images FOR BUTTON NEXT
		Image imageForNext53 = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/green-play-button-icon_228230.png");
		ImageView uploadViewimgForNext = new ImageView(imageForNext53);
		uploadViewimgForNext.setFitWidth(35);
		uploadViewimgForNext.setFitHeight(45);
		vnext53.setGraphic(uploadViewimgForNext);
		vnext53.setFont(new Font("Arial", 20));
		HBox forCancel53 = new HBox();
		forCancel53.setPadding(new Insets(250, 50, 0, -150));
		Button vcancel53 = new Button("Back");
		vcancel53.setMinSize(120, 35);
		vcancel53.setAlignment(Pos.BOTTOM_LEFT);
		//
		vcancel53.setFont(new Font("Arial", 20));
		// Adding images FOR BUTTON cancel
		Image imageForCancel53 = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/Previous-Button-PNG-Image.png");
		ImageView uploadViewimgForCancel = new ImageView(imageForCancel53);
		uploadViewimgForCancel.setFitWidth(35);
		uploadViewimgForCancel.setFitHeight(45);
		vcancel53.setGraphic(uploadViewimgForCancel);
		forCancel53.getChildren().add(vcancel53);

		forVnextAndCancel53.getChildren().addAll(vnext53);
		Button inf53 = new Button(
				"Cat-Mysyq-Kedi\nCats are extremely\n sensitive to vibra-\ntions.Cats are said \nto detect earthquake \ntremors 10 or 15\n minutes \nbefore humans can.");
		inf53.setFont(Font.font("imprint MT Shadow", FontWeight.BOLD, FontPosture.REGULAR, 25));
		inf53.setTextFill(linearGradient);
		inf53.setMinSize(300, 300);
		vInf53.getChildren().addAll(forCancel53, inf53, forVnextAndCancel53);

		inf53.setStyle("-fx-background-radius: 40, 40, 40, 40;");
		gridOfFinishGame53.add(vInf53, 0, 0);
		gridOfFinishGame53.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/PuzzleGame/congratulazioni-gif-congratulations-glitter-611.gif');-fx-background-repeat:stretch;-fx-background-position: bottom ; -fx-background-color:beige");

		Scene finishGamee53 = new Scene(gridOfFinishGame53, 660, 620);

		Button finishGame53 = new Button("Finish");
		finishGame53.setFont(new Font("Times New Roman", 30)); // www.
		finishGame53.setStyle("-fx-background-color:gray");// www.
		finishGame53.setAlignment(Pos.BOTTOM_RIGHT);
		// finishGame.setPadding(new Insets(0, 0, 0, 0));

		finishGame53.setOnAction(e -> primaryWindow.setScene(finishGamee53));
		HBox buttonBox153 = new HBox(8);
		buttonBox153.getChildren().add(finishGame53);
		buttonBox153.setPadding(new Insets(0, 0, 0, 220));
		HBox buttonBox53 = new HBox();
		buttonBox53.getChildren().addAll(shuffleButton53, buttonBox153);

		// create vbox for desk and buttons
		VBox vbox153 = new VBox(10);
		vbox153.getChildren().addAll(bp5by3, desk53, buttonBox53);
		vbox153.setPadding(new Insets(15, 24, 15, 24));
		GridPane mngrid53 = new GridPane();// www.
		mngrid53.add(vbox153, 0, 0);
		mngrid53.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/milano-texture-plain-glitter-wallpaper-silver-m95566-p2591-9085_medium.jpg');");

		Scene c5by3 = new Scene(mngrid53, 560, 560);
		canсel53.setOnAction(event -> primaryWindow.setScene(c5by3));
		vcancel53.setOnAction(event -> primaryWindow.setScene(c5by3));
		buttonCat.setOnAction(event -> primaryWindow.setScene(c5by3));
		vnext53.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				GridPane vd = new GridPane();
				string = enterName.getText().toUpperCase();
				Text cc = new Text("\t" + string + ",");
				Text c1 = new Text("\n\tyou did it !!!");
				Text cc1 = new Text();
				VBox vc = new VBox();
				Button vc1 = new Button("Try again");
				Image imgAG = new Image(
						"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/View-refresh_Gion_simple.svg.png");
				ImageView uploadViewAG = new ImageView(imgAG);
				uploadViewAG.setFitWidth(30);
				uploadViewAG.setFitHeight(30);
				vc1.setGraphic(uploadViewAG);
				vc.getChildren().add(vc1);
				vc.setPadding(new Insets(0, 20, 50, 250));
				vc1.setOnAction(e -> primaryWindow.setScene(scene1));

				VBox cv = new VBox();
				cv.getChildren().addAll(cc, c1, cc1);
				cc.setFill(Color.GOLD);
				c1.setFill(Color.GOLD);
				cc1.setFill(Color.BLACK);
				vd.setStyle(
						"-fx-background-image: url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/0_c5883_e9e85875_XL.gif')");
				cc.setFont(Font.font("Bodoni MT Black", 50));
				c1.setFont(Font.font("Bodoni MT Black", 50));
				vc1.setFont(Font.font("Bodoni MT Black", 24));

				vd.setPadding(new Insets(100, 50, 70, 100));
				vd.add(cv, 5, 3);
				vd.add(vc, 5, 5);

				Scene vse = new Scene(vd, 650, 406);
				primaryWindow.setScene(vse);
			}
		});
		// for button rabbit load puzzle image
		Image image33Rabbit = new Image(getClass().getResourceAsStream("кролик.jpg"));
		// ImageView image= new ImageView(image1);
		int numOfColumns33Rabbit = (int) (image33Rabbit.getWidth() / Piece.SIZE);
		int numOfRows33Rabbit = (int) (image33Rabbit.getHeight() / Piece.SIZE);
		// create desk
		final Desk des33Rabbit3 = new Desk(numOfColumns33Rabbit, numOfRows33Rabbit);
		// create puzzle pieces
		final List<Piece> pieces33Rabbit = new ArrayList<Piece>();
		for (int col = 0; col < numOfColumns33Rabbit; col++) {
			for (int row = 0; row < numOfRows33Rabbit; row++) {
				int x = col * Piece.SIZE;
				int y = row * Piece.SIZE;
				final Piece piece = new Piece(image33Rabbit, x, y, row > 0, col > 0, row < numOfRows33Rabbit - 1,
						col < numOfColumns33Rabbit - 1, des33Rabbit3.getWidth(), des33Rabbit3.getHeight());
				pieces33Rabbit.add(piece);
			}
		}
		des33Rabbit3.getChildren().addAll(pieces33Rabbit);
		// create button box
		Button shuffleButton33Rabbit = new Button("Shuffle");
		shuffleButton33Rabbit.setStyle("-fx-font-size: 2em;-fx-background-color:gray");
		shuffleButton33Rabbit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : pieces33Rabbit) {
					piece.setActive();
					double shuffleX = Math.random() * (des33Rabbit3.getWidth() - Piece.SIZE + 48f) - 24f
							- piece.getCorrectX();
					double shuffleY = Math.random() * (des33Rabbit3.getHeight() - Piece.SIZE + 30f) - 15f
							- piece.getCorrectY();
					timeline.getKeyFrames()
							.add(new KeyFrame(Duration.seconds(1), new KeyValue(piece.translateXProperty(), shuffleX),
									new KeyValue(piece.translateYProperty(), shuffleY)));
				}
				timeline.playFromStart();
			}
		});

		/*
		 * This scene has menu file: file, edit,help
		 * 
		 */

		MenuBar menu33Rabbit = new MenuBar();
		menu33Rabbit.setStyle("-fx-background-color: gray;");
		Menu file33Rabbit = new Menu("File");
		Menu edit33Rabbit = new Menu("Edit");
		Menu help33Rabbit = new Menu("Help");
		menu33Rabbit.setMinSize(740, 50);
		menu33Rabbit.setStyle("-fx-font-size:25");

		// Adding images
		Image img33Rabbit = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/icon.png");
		ImageView uploadView33Rabbit = new ImageView(img33Rabbit);
		uploadView33Rabbit.setFitWidth(30);
		uploadView33Rabbit.setFitHeight(30);
		file33Rabbit.setGraphic(uploadView33Rabbit);

		// Adding images
		Image image33Rab = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/Actions-help-about-icon.png");
		ImageView uploadView33Rab = new ImageView(image33Rab);
		uploadView33Rab.setFitWidth(30);
		uploadView33Rab.setFitHeight(30);
		help33Rabbit.setGraphic(uploadView12);

		// Adding images
		Image imge33Rabbit = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/edit.png");
		ImageView upldView33Rabbit = new ImageView(imge33Rabbit);
		upldView33Rabbit.setFitWidth(30);
		upldView33Rabbit.setFitHeight(30);
		edit33Rabbit.setGraphic(upldView33Rabbit);

		MenuItem exit33Rabbit = new MenuItem("Exit");
		MenuItem solution33Rabbit = new MenuItem("About");

		exit33Rabbit.setOnAction(event -> System.exit(0));

		file33Rabbit.getItems().addAll(exit33Rabbit);

		// It is about section for rabbit
		GridPane grid33Rabbit = new GridPane();
		HBox hboxCancelRabbit = new HBox();
		Button canсel53Rabbit = new Button("Cancel");
		canсel53Rabbit.setFont(new Font("Arial", 20));

		hboxCancelRabbit.setPadding(new Insets(380, 20, 5, 410));
		hboxCancelRabbit.getChildren().add(canсel53Rabbit);
		grid33Rabbit
				.setStyle("-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/about.jpg')");
		grid33Rabbit.add(hboxCancelRabbit, 0, 0);
		Scene scene3by3Rabbit = new Scene(grid33Rabbit, 552, 434);// scene5by3-for
																	// about

		solution33Rabbit.setOnAction(e -> primaryWindow.setScene(scene3by3Rabbit));

		BorderPane bp3by3Rabbit = new BorderPane();
		bp3by3Rabbit.setTop(menu33Rabbit);
		bp3by3Rabbit.setMinSize(200, 100);

		MenuItem solveButton3by3Rabbit = new MenuItem("Solution");
		solveButton3by3Rabbit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : pieces33Rabbit) {
					piece.setInactive();
					timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1),
							new KeyValue(piece.translateXProperty(), 0), new KeyValue(piece.translateYProperty(), 0)));
				}
				timeline.playFromStart();
			}
		});

		help33Rabbit.getItems().addAll(solveButton3by3Rabbit, solution33Rabbit);
		menu33Rabbit.getMenus().addAll(file33Rabbit, help33Rabbit);
		/*
		 * THIS IS SCENE WHICH WILL GIVE US INFO NEXT AND CANCEL BUTTONS
		 */
		GridPane gridOfFinishGameRabbit = new GridPane();
		HBox vInfRabbit = new HBox();
		vInfRabbit.setPadding(new Insets(140, 140, 10, 180));

		HBox forVnextAndCancelRabbit = new HBox();
		forVnextAndCancelRabbit.setPadding(new Insets(250, 150, 0, 30));
		Button vnextRabbit = new Button("Next");
		vnextRabbit.setMinSize(120, 35);
		vnextRabbit.setAlignment(Pos.BOTTOM_RIGHT);
		// Adding images FOR BUTTON NEXT
		Image imageForNextRabbit = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/green-play-button-icon_228230.png");
		ImageView uploadViewimgForNextRab = new ImageView(imageForNextRabbit);
		uploadViewimgForNextRab.setFitWidth(35);
		uploadViewimgForNextRab.setFitHeight(45);
		vnextRabbit.setGraphic(uploadViewimgForNextRab);
		vnextRabbit.setFont(new Font("Arial", 20));
		HBox forCancel33Rab = new HBox();
		forCancel33Rab.setPadding(new Insets(250, 50, 0, -150));
		Button vcancel33Rab = new Button("Back");
		vcancel33Rab.setMinSize(120, 35);
		vcancel33Rab.setAlignment(Pos.BOTTOM_LEFT);
		//
		vcancel33Rab.setFont(new Font("Arial", 20));
		// Adding images FOR BUTTON cancel
		Image imageForCancel33Rab = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/Previous-Button-PNG-Image.png");
		ImageView uploadViewimgForCancelR = new ImageView(imageForCancel33Rab);
		uploadViewimgForCancelR.setFitWidth(35);
		uploadViewimgForCancelR.setFitHeight(45);
		vcancel33Rab.setGraphic(uploadViewimgForCancelR);
		forCancel33Rab.getChildren().add(vcancel33Rab);

		forVnextAndCancelRabbit.getChildren().addAll(vnextRabbit);
		Button inf33Rab = new Button(
				"Rabbit-Qoyan-Tavşan\nA rabbit’s teeth\nnever stop growing.\nFortunately,they’re \nnaturally kept short \n   by the normal \nwear and tear \n   of chewing.");
		inf33Rab.setFont(Font.font("imprint MT Shadow", FontWeight.BOLD, FontPosture.REGULAR, 25));
		inf33Rab.setTextFill(linearGradient);
		inf33Rab.setMinSize(300, 300);
		vInfRabbit.getChildren().addAll(forCancel33Rab, inf33Rab, forVnextAndCancelRabbit);

		inf33Rab.setStyle("-fx-background-radius: 40, 40, 40, 40;");
		gridOfFinishGameRabbit.add(vInfRabbit, 0, 0);
		gridOfFinishGameRabbit.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/PuzzleGame/congratulazioni-gif-congratulations-glitter-611.gif');-fx-background-repeat:stretch;-fx-background-position: bottom ; -fx-background-color:beige");

		Scene finishGamee33Rab = new Scene(gridOfFinishGameRabbit, 660, 620);

		Button finishGame33Rab = new Button("Finish");
		finishGame33Rab.setFont(new Font("Times New Roman", 30)); // www.
		finishGame33Rab.setStyle("-fx-background-color:gray");// www.
		finishGame33Rab.setAlignment(Pos.BOTTOM_RIGHT);

		finishGame33Rab.setOnAction(e -> primaryWindow.setScene(finishGamee33Rab));
		HBox buttonBoxRabbit = new HBox(8);
		buttonBoxRabbit.getChildren().add(finishGame33Rab);
		buttonBoxRabbit.setPadding(new Insets(0, 0, 0, 220));
		HBox buttonBox53Rabbit = new HBox();
		buttonBox53Rabbit.getChildren().addAll(shuffleButton33Rabbit, buttonBoxRabbit);

		// create vbox for desk and buttons
		VBox vbox1Rabbit = new VBox(10);
		vbox1Rabbit.getChildren().addAll(bp3by3Rabbit, des33Rabbit3, buttonBox53Rabbit);
		vbox1Rabbit.setPadding(new Insets(15, 24, 15, 24));
		GridPane mngrid53Rab = new GridPane();// www.
		mngrid53Rab.add(vbox1Rabbit, 0, 0);
		mngrid53Rab.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/milano-texture-plain-glitter-wallpaper-silver-m95566-p2591-9085_medium.jpg');");
		Scene с3 = new Scene(mngrid53Rab, 560, 560);
		canсel53Rabbit.setOnAction(event -> primaryWindow.setScene(с3));
		buttonRabbit.setOnAction(event -> primaryWindow.setScene(с3));
		vcancel33Rab.setOnAction(event -> primaryWindow.setScene(с3));

		vnextRabbit.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				GridPane vd = new GridPane();
				string = enterName.getText().toUpperCase();
				Text cc = new Text("\t" + string + ",");
				Text c1 = new Text("\n\tyou did it !!!");
				Text cc1 = new Text();
				VBox vc = new VBox();
				Button vc1 = new Button("Try again");
				Image imgAG = new Image(
						"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/View-refresh_Gion_simple.svg.png");
				ImageView uploadViewAG = new ImageView(imgAG);
				uploadViewAG.setFitWidth(30);
				uploadViewAG.setFitHeight(30);
				vc1.setGraphic(uploadViewAG);
				vc.getChildren().add(vc1);
				vc.setPadding(new Insets(0, 20, 50, 250));
				vc1.setOnAction(e -> primaryWindow.setScene(scene1));

				VBox cv = new VBox();
				cv.getChildren().addAll(cc, c1, cc1);
				cc.setFill(Color.GOLD);
				c1.setFill(Color.GOLD);
				cc1.setFill(Color.BLACK);
				vd.setStyle(
						"-fx-background-image: url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/0_c5883_e9e85875_XL.gif')");
				cc.setFont(Font.font("Bodoni MT Black", 50));
				c1.setFont(Font.font("Bodoni MT Black", 50));
				vc1.setFont(Font.font("Bodoni MT Black", 24));

				vd.setPadding(new Insets(100, 50, 70, 100));
				vd.add(cv, 5, 3);
				vd.add(vc, 5, 5);

				Scene vse = new Scene(vd, 650, 406);
				primaryWindow.setScene(vse);
			}
		});

		/*
		 * Button Giraffe
		 */
		// load puzzle image
		Image imageGiraffe = new Image(getClass().getResourceAsStream("жираф.jpg"));
		// ImageView image= new ImageView(image1);
		int numOfColGiraffe = (int) (imageGiraffe.getWidth() / Piece.SIZE);
		int numOfRowsGiraffe = (int) (imageGiraffe.getHeight() / Piece.SIZE);
		// create desk

		final Desk deskGiraffe = new Desk(numOfColGiraffe, numOfRowsGiraffe);
		// create puzzle pieces
		final List<Piece> piecesGiraffe = new ArrayList<Piece>();
		for (int col = 0; col < numOfColGiraffe; col++) {
			for (int row = 0; row < numOfRowsGiraffe; row++) {
				int x = col * Piece.SIZE;
				int y = row * Piece.SIZE;

				final Piece piece = new Piece(imageGiraffe, x, y, row > 0, col > 0, row < numOfRowsGiraffe - 1,
						col < numOfColGiraffe - 1, deskGiraffe.getWidth(), deskGiraffe.getHeight());

				piecesGiraffe.add(piece);
			}
		}
		deskGiraffe.getChildren().addAll(piecesGiraffe);
		// create button box
		Button shuffleButtonGiraffe = new Button("Shuffle");
		// shuffleButton.setStyle("-fx-background-color:gray");
		shuffleButtonGiraffe.setStyle("-fx-font-size: 2em;-fx-background-color:gray");
		shuffleButtonGiraffe.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : piecesGiraffe) {
					piece.setActive();
					double shuffleX = Math.random() * (deskGiraffe.getWidth() - Piece.SIZE + 48f) - 24f
							- piece.getCorrectX();
					double shuffleY = Math.random() * (deskGiraffe.getHeight() - Piece.SIZE + 30f) - 15f
							- piece.getCorrectY();
					timeline.getKeyFrames()
							.add(new KeyFrame(Duration.seconds(1), new KeyValue(piece.translateXProperty(), shuffleX),
									new KeyValue(piece.translateYProperty(), shuffleY)));
				}
				timeline.playFromStart();
			}
		});

		/*
		 * This scene has menu file: file, edit,help
		 * 
		 */

		MenuBar menuGiraffe = new MenuBar();
		menuGiraffe.setStyle("-fx-background-color: gray;");
		Menu fileGiraffe = new Menu("File");
		Menu editGiraffe = new Menu("Edit");
		Menu helpGiraffe = new Menu("Help");
		menuGiraffe.setMinSize(740, 50);
		menuGiraffe.setStyle("-fx-font-size:25");

		// Adding images
		Image imgGiraffe = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/icon.png");
		ImageView uploadViewGiraffe = new ImageView(imgGiraffe);
		uploadViewGiraffe.setFitWidth(30);
		uploadViewGiraffe.setFitHeight(30);
		fileGiraffe.setGraphic(uploadViewGiraffe);

		// Adding images
		Image imageGiraf = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/Actions-help-about-icon.png");
		ImageView uploadViewGir = new ImageView(imageGiraf);
		uploadViewGir.setFitWidth(30);
		uploadViewGir.setFitHeight(30);
		helpGiraffe.setGraphic(uploadView12);

		// Adding images
		Image imgeGiraffe = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/edit.png");
		ImageView upldViewGiraffe = new ImageView(imgeGiraffe);
		upldViewGiraffe.setFitWidth(30);
		upldViewGiraffe.setFitHeight(30);
		editGiraffe.setGraphic(upldViewGiraffe);

		MenuItem exitGiraffe = new MenuItem("Exit");
		MenuItem solutionGiraffe = new MenuItem("About");

		exitGiraffe.setOnAction(e -> System.exit(0));

		fileGiraffe.getItems().addAll(exitGiraffe);
		// It is about application
		GridPane gridGiraffe = new GridPane();
		HBox hboxCancelGir = new HBox();
		Button canсellGir = new Button("Cancel");
		canсellGir.setFont(new Font("Arial", 20));

		hboxCancelGir.setPadding(new Insets(380, 20, 5, 410));
		hboxCancelGir.getChildren().add(canсellGir);
		gridGiraffe
				.setStyle("-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/about.jpg')");
		gridGiraffe.add(hboxCancelGir, 0, 0);
		Scene scene4by3Gir = new Scene(gridGiraffe, 552, 434);// scene4by3Gir-for
																// about

		solutionGiraffe.setOnAction(e -> primaryWindow.setScene(scene4by3Gir));

		BorderPane bp4by3Gir = new BorderPane();
		bp4by3Gir.setTop(menuGiraffe);
		bp4by3Gir.setMinSize(200, 100);

		MenuItem solveButtonGir = new MenuItem("Solution");
		solveButtonGir.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : piecesGiraffe) {
					piece.setInactive();
					timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1),
							new KeyValue(piece.translateXProperty(), 0), new KeyValue(piece.translateYProperty(), 0)));
				}
				timeline.playFromStart();
			}
		});

		helpGiraffe.getItems().addAll(solveButtonGir, solutionGiraffe);
		menuGiraffe.getMenus().addAll(fileGiraffe, helpGiraffe);
		/*
		 * THIS IS SCENE WHICH WILL GIVE US INFO NEXT AND CANCEL BUTTONS
		 */

		GridPane gridOfFinishGameGir = new GridPane();
		HBox vInfGir = new HBox();
		vInfGir.setPadding(new Insets(140, 140, 10, 180));

		HBox forVnextAndCancelGir = new HBox();
		forVnextAndCancelGir.setPadding(new Insets(250, 150, 0, 30));
		Button vnextGir = new Button("Next");
		vnextGir.setMinSize(120, 35);
		vnextGir.setAlignment(Pos.BOTTOM_RIGHT);

		// Adding images FOR BUTTON NEXT
		Image imageForNextGir = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/green-play-button-icon_228230.png");
		ImageView uploadViewimgForNext1 = new ImageView(imageForNextGir);
		uploadViewimgForNext1.setFitWidth(35);
		uploadViewimgForNext1.setFitHeight(45);
		vnextGir.setGraphic(uploadViewimgForNext1);
		vnextGir.setFont(new Font("Arial", 20));
		HBox forCancel1 = new HBox();
		forCancel1.setPadding(new Insets(250, 50, 0, -150));
		Button vcancel1 = new Button("Back");
		vcancel1.setMinSize(120, 35);
		vcancel1.setAlignment(Pos.BOTTOM_LEFT);
		vcancel1.setFont(new Font("Arial", 20));

		// Adding images FOR BUTTON cancel
		Image imageForCancel1 = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/Previous-Button-PNG-Image.png");
		ImageView uploadViewimgForCancel1 = new ImageView(imageForCancel1);
		uploadViewimgForCancel1.setFitWidth(35);
		uploadViewimgForCancel1.setFitHeight(45);
		vcancel1.setGraphic(uploadViewimgForCancel1);
		forCancel1.getChildren().add(vcancel1);

		forVnextAndCancelGir.getChildren().addAll(vnextGir);
		Button infGir = new Button(
				"Giraffe-Kerik-Zürafa \nTheir legs alone are \ntaller than many humans\nabout 6 feet.They even \nsleep and give birth\n standing up.");
		infGir.setFont(Font.font("imprint MT Shadow", FontWeight.BOLD, FontPosture.REGULAR, 25));
		infGir.setTextFill(linearGradient);
		infGir.setMinSize(300, 300);
		vInfGir.getChildren().addAll(forCancel1, infGir, forVnextAndCancelGir);

		infGir.setStyle("-fx-background-radius: 40, 40, 40, 40;");
		gridOfFinishGameGir.add(vInfGir, 0, 0);
		gridOfFinishGameGir.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/PuzzleGame/congratulazioni-gif-congratulations-glitter-611.gif');-fx-background-repeat:stretch;-fx-background-position: bottom ; -fx-background-color:beige");

		Scene finishGameeGir = new Scene(gridOfFinishGameGir, 660, 620);

		Button finishGameGir = new Button("Finish");
		finishGameGir.setFont(new Font("Times New Roman", 30)); // www.
		finishGameGir.setStyle("-fx-background-color:gray");// www.
		finishGameGir.setAlignment(Pos.BOTTOM_RIGHT);

		finishGameGir.setOnAction(e -> primaryWindow.setScene(finishGameeGir));
		HBox buttonBoxGir = new HBox(8);
		buttonBoxGir.getChildren().add(finishGameGir);
		buttonBoxGir.setPadding(new Insets(0, 0, 0, 220));
		HBox buttonBoxGir1 = new HBox();
		buttonBoxGir1.getChildren().addAll(shuffleButtonGiraffe, buttonBoxGir);

		// create vbox for desk and buttons
		VBox vboxGir = new VBox(10);
		vboxGir.getChildren().addAll(bp4by3Gir, deskGiraffe, buttonBoxGir1);
		vboxGir.setPadding(new Insets(15, 24, 15, 24));
		GridPane mngridGir = new GridPane();// www.
		mngridGir.add(vboxGir, 0, 0);
		mngridGir.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/milano-texture-plain-glitter-wallpaper-silver-m95566-p2591-9085_medium.jpg');");

		Scene c4by3Gir = new Scene(mngridGir, 560, 560);
		canсellGir.setOnAction(event -> primaryWindow.setScene(c4by3Gir));
		buttonGirraff.setOnAction(event -> primaryWindow.setScene(c4by3Gir));
		vcancel1.setOnAction(event -> primaryWindow.setScene(c4by3Gir));

		vnextGir.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				GridPane vd = new GridPane();
				string = enterName.getText().toUpperCase();
				Text cc = new Text("\t" + string + ",");
				Text c1 = new Text("\n\tyou did it !!!");
				Text cc1 = new Text();
				VBox vc = new VBox();
				Button vc1 = new Button("Try again");
				Image imgAG = new Image(
						"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/View-refresh_Gion_simple.svg.png");
				ImageView uploadViewAG = new ImageView(imgAG);
				uploadViewAG.setFitWidth(30);
				uploadViewAG.setFitHeight(30);
				vc1.setGraphic(uploadViewAG);
				vc.getChildren().add(vc1);
				vc.setPadding(new Insets(0, 20, 50, 250));
				vc1.setOnAction(e -> primaryWindow.setScene(scene1));

				VBox cv = new VBox();
				cv.getChildren().addAll(cc, c1, cc1);
				cc.setFill(Color.GOLD);
				c1.setFill(Color.GOLD);
				cc1.setFill(Color.BLACK);
				vd.setStyle(
						"-fx-background-image: url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/0_c5883_e9e85875_XL.gif')");
				cc.setFont(Font.font("Bodoni MT Black", 50));
				c1.setFont(Font.font("Bodoni MT Black", 50));
				vc1.setFont(Font.font("Bodoni MT Black", 24));

				vd.setPadding(new Insets(100, 50, 70, 100));
				vd.add(cv, 5, 3);
				vd.add(vc, 5, 5);

				Scene vse = new Scene(vd, 650, 406);
				primaryWindow.setScene(vse);
			}
		});
		/*
		 * Button Popugai
		 * 
		 */
		// load puzzle image
		Image imagePopugai = new Image(getClass().getResourceAsStream("popugai.jpg"));
		// ImageView image= new ImageView(image1);
		int numOfColPopugai = (int) (imagePopugai.getWidth() / Piece.SIZE);
		int numOfRowsPopugai = (int) (imagePopugai.getHeight() / Piece.SIZE);
		// create desk

		final Desk deskPopugai = new Desk(numOfColPopugai, numOfRowsPopugai);
		// create puzzle pieces
		final List<Piece> piecesPopugai = new ArrayList<Piece>();
		for (int col = 0; col < numOfColPopugai; col++) {
			for (int row = 0; row < numOfRowsPopugai; row++) {
				int x = col * Piece.SIZE;
				int y = row * Piece.SIZE;

				final Piece piece = new Piece(imagePopugai, x, y, row > 0, col > 0, row < numOfRowsPopugai - 1,
						col < numOfColPopugai - 1, deskPopugai.getWidth(), deskPopugai.getHeight());

				piecesPopugai.add(piece);
			}
		}
		deskPopugai.getChildren().addAll(piecesPopugai);
		// create button box
		Button shuffleButtonPopugai = new Button("Shuffle");
		// shuffleButton.setStyle("-fx-background-color:gray");
		shuffleButtonPopugai.setStyle("-fx-font-size: 2em;-fx-background-color:gray");
		shuffleButtonPopugai.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : piecesPopugai) {
					piece.setActive();
					double shuffleX = Math.random() * (deskPopugai.getWidth() - Piece.SIZE + 48f) - 24f
							- piece.getCorrectX();
					double shuffleY = Math.random() * (deskPopugai.getHeight() - Piece.SIZE + 30f) - 15f
							- piece.getCorrectY();
					timeline.getKeyFrames()
							.add(new KeyFrame(Duration.seconds(1), new KeyValue(piece.translateXProperty(), shuffleX),
									new KeyValue(piece.translateYProperty(), shuffleY)));
				}
				timeline.playFromStart();
			}
		});

		/*
		 * This scene has menu file: file, edit,help
		 * 
		 */

		MenuBar menuPopugai = new MenuBar();
		menuPopugai.setStyle("-fx-background-color: gray;");
		Menu filePopugai = new Menu("File");
		Menu editPopugai = new Menu("Edit");
		Menu helpPopugai = new Menu("Help");
		menuPopugai.setMinSize(740, 50);
		menuPopugai.setStyle("-fx-font-size:25");

		// Adding images
		Image imgPopugai = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/icon.png");
		ImageView uploadViewPopugai = new ImageView(imgPopugai);
		uploadViewPopugai.setFitWidth(30);
		uploadViewPopugai.setFitHeight(30);
		filePopugai.setGraphic(uploadViewPopugai);

		// Adding images
		Image imagePopugai1 = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/Actions-help-about-icon.png");
		ImageView uploadViewPop = new ImageView(imagePopugai1);
		uploadViewPop.setFitWidth(30);
		uploadViewPop.setFitHeight(30);
		helpPopugai.setGraphic(uploadView12);

		// Adding images
		Image imgePop = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/edit.png");
		ImageView upldViewPopugai = new ImageView(imgePop);
		upldViewPopugai.setFitWidth(30);
		upldViewPopugai.setFitHeight(30);
		editPopugai.setGraphic(upldViewPopugai);
		MenuItem exitPopugai = new MenuItem("Exit");
		MenuItem solutionPopugai = new MenuItem("About");

		exitPopugai.setOnAction(event -> System.exit(0));

		filePopugai.getItems().addAll(exitPopugai);
		// It is about application for popugai
		GridPane gridPopugai = new GridPane();
		HBox hboxCancelPop = new HBox();
		Button canсelPopugai = new Button("Cancel");
		canсelPopugai.setFont(new Font("Arial", 20));

		hboxCancelPop.setPadding(new Insets(380, 20, 5, 410));
		hboxCancelPop.getChildren().add(canсelPopugai);
		gridPopugai
				.setStyle("-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/about.jpg')");
		gridPopugai.add(hboxCancelPop, 0, 0);
		Scene scene4by3Pop = new Scene(gridPopugai, 552, 434);// scene4by3Pop-for
																// about

		solutionPopugai.setOnAction(event -> primaryWindow.setScene(scene4by3Pop));

		BorderPane bp4by3Pop = new BorderPane();
		bp4by3Pop.setTop(menuPopugai);
		bp4by3Pop.setMinSize(200, 100);

		MenuItem solveButtonPop = new MenuItem("Solution");
		solveButtonPop.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : piecesPopugai) {
					piece.setInactive();
					timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1),
							new KeyValue(piece.translateXProperty(), 0), new KeyValue(piece.translateYProperty(), 0)));
				}
				timeline.playFromStart();
			}
		});

		helpPopugai.getItems().addAll(solveButtonPop, solutionPopugai);
		menuPopugai.getMenus().addAll(filePopugai, helpPopugai);
		/*
		 * THIS IS SCENE WHICH WILL GIVE US INFO NEXT AND CANCEL BUTTONS
		 */

		GridPane gridOfFinishGamePop = new GridPane();
		HBox vInfPop = new HBox();
		vInfPop.setPadding(new Insets(140, 140, 10, 180));

		HBox forVnextAndCancelPop = new HBox();
		forVnextAndCancelPop.setPadding(new Insets(250, 150, 0, 30));
		Button vnextPop = new Button("Next");
		vnextPop.setMinSize(120, 35);
		vnextPop.setAlignment(Pos.BOTTOM_RIGHT);
		// Adding images FOR BUTTON NEXT
		Image imageForNextPop = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/green-play-button-icon_228230.png");
		ImageView uploadViewimgForNextPop = new ImageView(imageForNextPop);
		uploadViewimgForNextPop.setFitWidth(35);
		uploadViewimgForNextPop.setFitHeight(45);
		vnextPop.setGraphic(uploadViewimgForNextPop);
		vnextPop.setFont(new Font("Arial", 20));
		HBox forCancelPop = new HBox();
		forCancelPop.setPadding(new Insets(250, 50, 0, -150));
		Button vcancelPop = new Button("Back");
		vcancelPop.setMinSize(120, 35);
		vcancelPop.setAlignment(Pos.BOTTOM_LEFT);
		vcancelPop.setFont(new Font("Arial", 20));
		// Adding images FOR BUTTON cancel
		Image imageForCancelPop = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/Previous-Button-PNG-Image.png");
		ImageView uploadViewimgForCancel2 = new ImageView(imageForCancelPop);
		uploadViewimgForCancel2.setFitWidth(35);
		uploadViewimgForCancel2.setFitHeight(45);
		vcancelPop.setGraphic(uploadViewimgForCancel2);
		forCancelPop.getChildren().add(vcancelPop);

		forVnextAndCancelPop.getChildren().addAll(vnextPop);
		Button infPop = new Button(
				"Parrot-Totyqu's-\n   Papağan\nParrots are the \nonly birds that can \neat with their feet.");
		infPop.setFont(Font.font("imprint MT Shadow", FontWeight.BOLD, FontPosture.REGULAR, 30));
		infPop.setTextFill(linearGradient);
		infPop.setMinSize(320, 300);
		vInfPop.getChildren().addAll(forCancelPop, infPop, forVnextAndCancelPop);
		infPop.setStyle("-fx-background-radius: 40, 40, 40, 40;");
		gridOfFinishGamePop.add(vInfPop, 0, 0);
		gridOfFinishGamePop.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/PuzzleGame/congratulazioni-gif-congratulations-glitter-611.gif');-fx-background-repeat:stretch;-fx-background-position: bottom ; -fx-background-color:beige");

		Scene finishGameePop = new Scene(gridOfFinishGamePop, 680, 620);

		Button finishGamePop = new Button("Finish");
		finishGamePop.setFont(new Font("Times New Roman", 30)); // www.
		finishGamePop.setStyle("-fx-background-color:gray");// www.
		finishGamePop.setAlignment(Pos.BOTTOM_RIGHT);

		finishGamePop.setOnAction(e -> primaryWindow.setScene(finishGameePop));
		HBox buttonBoxPop = new HBox(8);
		buttonBoxPop.getChildren().add(finishGamePop);
		buttonBoxPop.setPadding(new Insets(0, 0, 0, 220));
		HBox buttonBoxPop1 = new HBox();
		buttonBoxPop1.getChildren().addAll(shuffleButtonPopugai, buttonBoxPop);

		// create vbox for desk and buttons
		VBox vboxPop = new VBox(10);
		vboxPop.getChildren().addAll(bp4by3Pop, deskPopugai, buttonBoxPop1);
		vboxPop.setPadding(new Insets(15, 24, 15, 24));
		GridPane mngridPopugai = new GridPane();// www.
		mngridPopugai.add(vboxPop, 0, 0);
		mngridPopugai.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/milano-texture-plain-glitter-wallpaper-silver-m95566-p2591-9085_medium.jpg');");
		Scene c4by3Popugai = new Scene(mngridPopugai, 660, 560);
		canсelPopugai.setOnAction(event -> primaryWindow.setScene(c4by3Popugai));
		vcancelPop.setOnAction(event -> primaryWindow.setScene(c4by3Popugai));
		buttonPoppu.setOnAction(event -> primaryWindow.setScene(c4by3Popugai));
		vnextPop.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				GridPane vd = new GridPane();
				string = enterName.getText().toUpperCase();
				Text cc = new Text("\t " + string + ",");
				Text c1 = new Text("\n\tyou did it !!!");
				Text cc1 = new Text();
				VBox vc = new VBox();
				Button vc1 = new Button("Try again");
				Image imgAG = new Image(
						"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/View-refresh_Gion_simple.svg.png");
				ImageView uploadViewAG = new ImageView(imgAG);
				uploadViewAG.setFitWidth(30);
				uploadViewAG.setFitHeight(30);
				vc1.setGraphic(uploadViewAG);
				vc.getChildren().add(vc1);
				vc.setPadding(new Insets(0, 20, 50, 250));
				vc1.setOnAction(e -> primaryWindow.setScene(scene1));

				VBox cv = new VBox();
				cv.getChildren().addAll(cc, c1, cc1);
				cc.setFill(Color.GOLD);
				c1.setFill(Color.GOLD);
				cc1.setFill(Color.BLACK);
				vd.setStyle(
						"-fx-background-image: url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/0_c5883_e9e85875_XL.gif')");
				cc.setFont(Font.font("Bodoni MT Black", 50));
				c1.setFont(Font.font("Bodoni MT Black", 50));
				vc1.setFont(Font.font("Bodoni MT Black", 24));

				vd.setPadding(new Insets(100, 50, 70, 100));
				vd.add(cv, 5, 3);
				vd.add(vc, 5, 5);

				Scene vse = new Scene(vd, 650, 406);
				primaryWindow.setScene(vse);
			}
		});
		// for button dif3
		HBox hbAnimal3 = new HBox();
		ImageView imageViewLio = new ImageView(new Image(getClass().getResourceAsStream("лев.jpg")));
		imageViewLio.setFitWidth(230);
		imageViewLio.setFitHeight(180);
		Button buttonLio = new Button("", imageViewLio);
		buttonLio.setPrefSize(230, 180);

		ImageView imageViewLio1 = new ImageView(new Image(getClass().getResourceAsStream("eagle.jpg")));
		imageViewLio1.setFitHeight(180);
		imageViewLio1.setFitWidth(230);
		Button buttonEagle = new Button("", imageViewLio1);
		buttonEagle.setPrefSize(230, 180);

		ImageView imageViewLio2 = new ImageView(new Image(getClass().getResourceAsStream("лошадь.jpg")));
		imageViewLio2.setFitWidth(230);
		imageViewLio2.setFitHeight(180);
		Button buttonHorse = new Button("", imageViewLio2);
		buttonHorse.setPrefSize(230, 180);

		GridPane gridPaneOfAnm3 = new GridPane();
		gridPaneOfAnm3.add(buttonLio, 0, 0);
		gridPaneOfAnm3.add(buttonEagle, 0, 1);
		gridPaneOfAnm3.add(buttonHorse, 0, 2);
		gridPaneOfAnm3.setAlignment(Pos.TOP_CENTER);
		gridPaneOfAnm3.setVgap(10);
		gridPaneOfAnm3.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/73584f85887791e.jpg')");
		Scene scene5by3Lio = new Scene(gridPaneOfAnm3, 648, 600);
		// al of buttindif11
		butDif3.setOnAction(event -> primaryWindow.setScene(scene5by3Lio));

		// load puzzle image
		Image image2 = new Image(getClass().getResourceAsStream("лошадь.jpg"));
		int numOfColumns2 = (int) (image2.getWidth() / Piece.SIZE);
		int numOfRows2 = (int) (image2.getHeight() / Piece.SIZE);
		// create desk
		final Desk desk2 = new Desk(numOfColumns2, numOfRows2);
		// create puzzle pieces
		final List<Piece> pieces2 = new ArrayList<Piece>();
		for (int col = 0; col < numOfColumns2; col++) {
			for (int row = 0; row < numOfRows2; row++) {
				int x = col * Piece.SIZE;
				int y = row * Piece.SIZE;
				final Piece piece = new Piece(image2, x, y, row > 0, col > 0, row < numOfRows2 - 1,
						col < numOfColumns2 - 1, desk2.getWidth(), desk2.getHeight());
				pieces2.add(piece);
			}
		}
		desk2.getChildren().addAll(pieces2);
		// create button box
		Button shuffleButton2 = new Button("Shuffle");
		shuffleButton2.setStyle("-fx-font-size: 2em;-fx-background-color:gray");
		shuffleButton2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : pieces2) {
					piece.setActive();
					double shuffleX = Math.random() * (desk2.getWidth() - Piece.SIZE + 48f) - 24f - piece.getCorrectX();
					double shuffleY = Math.random() * (desk2.getHeight() - Piece.SIZE + 30f) - 15f
							- piece.getCorrectY();
					timeline.getKeyFrames()
							.add(new KeyFrame(Duration.seconds(1), new KeyValue(piece.translateXProperty(), shuffleX),
									new KeyValue(piece.translateYProperty(), shuffleY)));
				}
				timeline.playFromStart();
			}
		});
		// This scene has menu file: file, edit,help
		MenuBar menuAnm2 = new MenuBar();
		menuAnm2.setStyle("-fx-background-color: gray;");
		Menu fileAnm2 = new Menu("File");
		Menu editAnm2 = new Menu("Edit");
		Menu helpAnm2 = new Menu("Help");
		menuAnm2.setMinSize(740, 50);
		menuAnm2.setStyle("-fx-font-size:25");

		// Adding images
		Image imgAnm21 = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/icon.png");
		ImageView uploadViewAnm2 = new ImageView(imgAnm21);
		uploadViewAnm2.setFitWidth(30);
		uploadViewAnm2.setFitHeight(30);
		fileAnm2.setGraphic(uploadViewAnm2);

		// Adding images
		Image imgAnm22 = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/Actions-help-about-icon.png");
		ImageView uploadViewAnm3 = new ImageView(imgAnm22);
		uploadViewAnm3.setFitWidth(30);
		uploadViewAnm3.setFitHeight(30);
		helpAnm2.setGraphic(uploadViewAnm3);

		// Adding images
		Image imgAnm33 = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/edit.png");
		ImageView uploadVieAnm3 = new ImageView(imgAnm33);
		uploadVieAnm3.setFitWidth(30);
		uploadVieAnm3.setFitHeight(30);
		editAnm2.setGraphic(uploadVieAnm3);

		MenuItem exitAnm3 = new MenuItem("Exit");
		MenuItem solutionAnm3 = new MenuItem("About");

		exitAnm3.setOnAction(event -> System.exit(0));

		fileAnm2.getItems().addAll(exitAnm3);
		// It is about for main
		GridPane gridAnm3 = new GridPane();
		HBox hboxCancelAnm3 = new HBox();
		Button cancelAnm3 = new Button("Cancel");
		cancelAnm3.setFont(new Font("Arial", 20));

		hboxCancelAnm3.setPadding(new Insets(380, 20, 5, 410));
		hboxCancelAnm3.getChildren().add(cancelAnm3);
		gridAnm3.setStyle("-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/about.jpg')");
		gridAnm3.add(hboxCancelAnm3, 0, 0);
		Scene sceneAnm3 = new Scene(gridAnm3, 552, 434);// scne2-for about

		solutionAnm3.setOnAction(e -> primaryWindow.setScene(sceneAnm3));

		BorderPane bpAnm3 = new BorderPane();
		bpAnm3.setTop(menuAnm2);
		bpAnm3.setMinSize(200, 100);

		MenuItem solveButtonAnm3 = new MenuItem("Solution");
		solveButtonAnm3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : pieces2) {
					piece.setInactive();
					timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1),
							new KeyValue(piece.translateXProperty(), 0), new KeyValue(piece.translateYProperty(), 0)));
				}
				timeline.playFromStart();
			}
		});

		helpAnm2.getItems().addAll(solveButtonAnm3, solutionAnm3);
		menuAnm2.getMenus().addAll(fileAnm2, helpAnm2);
		// THIS IS SCENE WHICH WILL GIVE US INFO NEXT AND CANCEL BUTTONS
		GridPane gridOfFinishGameAnm3 = new GridPane();
		HBox vInfAnm3 = new HBox();
		vInfAnm3.setPadding(new Insets(140, 140, 10, 180));

		HBox forVnextAndCancelAnm3 = new HBox();
		forVnextAndCancelAnm3.setPadding(new Insets(250, 150, 0, 30));
		Button vnextAnm3 = new Button("Next");
		vnextAnm3.setMinSize(120, 35);
		vnextAnm3.setAlignment(Pos.BOTTOM_RIGHT);
		// Adding images FOR BUTTON NEXT
		Image imageForNextAnm3 = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/green-play-button-icon_228230.png");
		ImageView uploadViewimageForNextAnm3 = new ImageView(imageForNextAnm3);
		uploadViewimageForNextAnm3.setFitWidth(35);
		uploadViewimageForNextAnm3.setFitHeight(45);
		vnextAnm3.setGraphic(uploadViewimageForNextAnm3);
		vnextAnm3.setFont(new Font("Arial", 20));
		HBox forCancelAnm3 = new HBox();
		forCancelAnm3.setPadding(new Insets(250, 50, 0, -150));
		Button vcancelAnm3 = new Button("Back");
		vcancelAnm3.setMinSize(120, 35);
		vcancelAnm3.setAlignment(Pos.BOTTOM_LEFT);
		vcancelAnm3.setFont(new Font("Arial", 20));
		// Adding images FOR BUTTON cancel
		Image imageForCancelAnm3 = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/Previous-Button-PNG-Image.png");
		ImageView uploadViewimageForCancelAnm3 = new ImageView(imageForCancelAnm3);
		uploadViewimageForCancelAnm3.setFitWidth(35);
		uploadViewimageForCancelAnm3.setFitHeight(45);
		vcancelAnm3.setGraphic(uploadViewimageForCancelAnm3);
		forCancelAnm3.getChildren().add(vcancelAnm3);

		forVnextAndCancelAnm3.getChildren().addAll(vnextAnm3);

		Button infAnm3 = new Button(
				"Horse-Jylqy-At\nAncient Kazakhs \nwere the first \npeople in the \nworld to domesticate \nand ride horses.");
		infAnm3.setFont(Font.font("imprint MT Shadow", FontWeight.BOLD, FontPosture.REGULAR, 27));
		infAnm3.setTextFill(linearGradient);
		infAnm3.setMinSize(270, 300);
		vInfAnm3.getChildren().addAll(forCancelAnm3, infAnm3, forVnextAndCancelAnm3);
		infAnm3.setStyle("-fx-background-radius: 40, 40, 40, 40;");
		gridOfFinishGameAnm3.add(vInfAnm3, 0, 0);
		gridOfFinishGameAnm3.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/PuzzleGame/congratulazioni-gif-congratulations-glitter-611.gif');-fx-background-repeat:stretch;-fx-background-position: bottom ; -fx-background-color:beige");

		Scene finishGameeAnm3 = new Scene(gridOfFinishGameAnm3, 640, 620);

		Button finishGameAnm3 = new Button("Finish");
		finishGameAnm3.setFont(new Font("Times New Roman", 30)); // www.
		finishGameAnm3.setStyle("-fx-background-color:gray");// www.
		finishGameAnm3.setAlignment(Pos.BOTTOM_RIGHT); //

		finishGameAnm3.setOnAction(event -> primaryWindow.setScene(finishGameeAnm3));
		HBox buttonBox1Anm3 = new HBox(8);
		buttonBox1Anm3.getChildren().add(finishGameAnm3);
		buttonBox1Anm3.setPadding(new Insets(0, 0, 0, 220));
		HBox buttonBoxAnm3 = new HBox();
		buttonBoxAnm3.getChildren().addAll(shuffleButton2, buttonBox1Anm3);
		// create vbox for desk and buttons
		VBox vbox1Anm3 = new VBox(10);
		vbox1Anm3.getChildren().addAll(bpAnm3, desk2, buttonBoxAnm3);
		vbox1Anm3.setPadding(new Insets(15, 24, 15, 24));
		GridPane mngridAnm3 = new GridPane();// www.
		mngridAnm3.add(vbox1Anm3, 0, 0);
		mngridAnm3.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/milano-texture-plain-glitter-wallpaper-silver-m95566-p2591-9085_medium.jpg');");
		Scene anm3 = new Scene(mngridAnm3, 660, 560);
		vcancelAnm3.setOnAction(event -> primaryWindow.setScene(anm3));
		cancelAnm3.setOnAction(event -> primaryWindow.setScene(anm3));
		buttonHorse.setOnAction(event -> primaryWindow.setScene(anm3));
		vnextAnm3.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				GridPane vd = new GridPane();
				string = enterName.getText().toUpperCase();
				Text cc = new Text("\t" + string + ",");
				Text c1 = new Text("\n\tyou did it !!!");
				Text cc1 = new Text();
				VBox vc = new VBox();
				Button vc1 = new Button("Try again");
				Image imgAG = new Image(
						"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/View-refresh_Gion_simple.svg.png");
				ImageView uploadViewAG = new ImageView(imgAG);
				uploadViewAG.setFitWidth(30);
				uploadViewAG.setFitHeight(30);
				vc1.setGraphic(uploadViewAG);
				vc.getChildren().add(vc1);
				vc.setPadding(new Insets(0, 20, 50, 250));
				vc1.setOnAction(e -> primaryWindow.setScene(scene1));

				VBox cv = new VBox();
				cv.getChildren().addAll(cc, c1, cc1);
				cc.setFill(Color.GOLD);
				c1.setFill(Color.GOLD);
				cc1.setFill(Color.BLACK);
				vd.setStyle(
						"-fx-background-image: url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/0_c5883_e9e85875_XL.gif')");
				cc.setFont(Font.font("Bodoni MT Black", 50));
				c1.setFont(Font.font("Bodoni MT Black", 50));
				vc1.setFont(Font.font("Bodoni MT Black", 24));

				vd.setPadding(new Insets(100, 50, 70, 100));
				vd.add(cv, 5, 3);
				vd.add(vc, 5, 5);

				Scene vse = new Scene(vd, 650, 406);
				primaryWindow.setScene(vse);
			}
		});

		// for button cat load puzzle image
		Image imageEagle = new Image(getClass().getResourceAsStream("eagle.jpg"));
		int numOfColEagle = (int) (imageEagle.getWidth() / Piece.SIZE);
		int numOfRowsEagle = (int) (imageEagle.getHeight() / Piece.SIZE);
		// create desk
		final Desk deskEagle = new Desk(numOfColEagle, numOfRowsEagle);
		// create puzzle pieces
		final List<Piece> pieceEagle = new ArrayList<Piece>();
		for (int col = 0; col < numOfColEagle; col++) {
			for (int row = 0; row < numOfRowsEagle; row++) {
				int x = col * Piece.SIZE;
				int y = row * Piece.SIZE;

				final Piece piece = new Piece(imageEagle, x, y, row > 0, col > 0, row < numOfRowsEagle - 1,
						col < numOfColEagle - 1, deskEagle.getWidth(), deskEagle.getHeight());

				pieceEagle.add(piece);
			}
		}
		deskEagle.getChildren().addAll(pieceEagle);
		// create button box
		Button shuffleButtonEagle = new Button("Shuffle");
		shuffleButtonEagle.setStyle("-fx-font-size: 2em;-fx-background-color:gray");
		shuffleButtonEagle.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : pieceEagle) {
					piece.setActive();
					double shuffleX = Math.random() * (deskEagle.getWidth() - Piece.SIZE + 48f) - 24f
							- piece.getCorrectX();
					double shuffleY = Math.random() * (deskEagle.getHeight() - Piece.SIZE + 30f) - 15f
							- piece.getCorrectY();
					timeline.getKeyFrames()
							.add(new KeyFrame(Duration.seconds(1), new KeyValue(piece.translateXProperty(), shuffleX),
									new KeyValue(piece.translateYProperty(), shuffleY)));
				}
				timeline.playFromStart();
			}
		});
		// This scene has menu file: file, edit,help
		MenuBar menuEagle = new MenuBar();
		menuEagle.setStyle("-fx-background-color: gray;");
		Menu fileEagle = new Menu("File");
		Menu editEagle = new Menu("Edit");
		Menu helpEagle = new Menu("Help");
		menuEagle.setMinSize(740, 50);
		menuEagle.setStyle("-fx-font-size:25");

		// Adding images
		Image imgEagle = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/icon.png");
		ImageView uploadViewEagle = new ImageView(imgEagle);
		uploadViewEagle.setFitWidth(30);
		uploadViewEagle.setFitHeight(30);
		fileEagle.setGraphic(uploadViewEagle);

		// Adding images
		Image imageEagle1 = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/Actions-help-about-icon.png");
		ImageView uploadViewEagle1 = new ImageView(imageEagle1);
		uploadViewEagle1.setFitWidth(30);
		uploadViewEagle1.setFitHeight(30);
		helpEagle.setGraphic(uploadView12);

		// Adding images
		Image imgeEagle2 = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/edit.png");
		ImageView upldViewEagle2 = new ImageView(imgeEagle2);
		upldViewEagle2.setFitWidth(30);
		upldViewEagle2.setFitHeight(30);
		editEagle.setGraphic(upldViewEagle2);

		MenuItem exitEagle = new MenuItem("Exit");
		MenuItem solutionEagle = new MenuItem("About");
		exitEagle.setOnAction(event -> System.exit(0));

		fileEagle.getItems().addAll(exitEagle);
		// It is about for main
		GridPane gridEagle = new GridPane();
		HBox hboxCancelEagle = new HBox();
		Button canсelEagle = new Button("Cancel");
		canсelEagle.setFont(new Font("Arial", 20));

		hboxCancelEagle.setPadding(new Insets(380, 20, 5, 410));
		hboxCancelEagle.getChildren().add(canсelEagle);
		gridEagle
				.setStyle("-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/about.jpg')");
		gridEagle.add(hboxCancelEagle, 0, 0);
		Scene scene5by3Eagle = new Scene(gridEagle, 552, 434);// scne2-for about

		solutionEagle.setOnAction(event -> primaryWindow.setScene(scene5by3Eagle));

		BorderPane bp5by3Eagle = new BorderPane();
		bp5by3Eagle.setTop(menuEagle);
		bp5by3Eagle.setMinSize(200, 100);

		MenuItem solveButtonEagle = new MenuItem("Solution");
		solveButtonEagle.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : pieceEagle) {
					piece.setInactive();
					timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1),
							new KeyValue(piece.translateXProperty(), 0), new KeyValue(piece.translateYProperty(), 0)));
				}
				timeline.playFromStart();
			}
		});

		helpEagle.getItems().addAll(solveButtonEagle, solutionEagle);
		menuEagle.getMenus().addAll(fileEagle, helpEagle);
		// * THIS IS SCENE WHICH WILL GIVE US INFO NEXT AND CANCEL BUTTONS
		GridPane gridOfFinishGameEagle = new GridPane();
		HBox vInfEagle = new HBox();
		vInfEagle.setPadding(new Insets(140, 140, 10, 180));

		HBox forVnextAndCancelEagle = new HBox();
		forVnextAndCancelEagle.setPadding(new Insets(250, 150, 0, 30));
		Button vnextEagle = new Button("Next");
		vnextEagle.setMinSize(120, 35);
		vnextEagle.setAlignment(Pos.BOTTOM_RIGHT);

		// Adding images FOR BUTTON NEXT
		Image imageForNextEagle = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/green-play-button-icon_228230.png");
		ImageView uploadViewimgForNextEagle = new ImageView(imageForNextEagle);
		uploadViewimgForNextEagle.setFitWidth(35);
		uploadViewimgForNextEagle.setFitHeight(45);
		vnextEagle.setGraphic(uploadViewimgForNextEagle);
		vnextEagle.setFont(new Font("Arial", 20));
		HBox forCancelEagle = new HBox();
		forCancelEagle.setPadding(new Insets(250, 50, 0, -150));

		Button vcancelEagle = new Button("Back");
		vcancelEagle.setMinSize(120, 35);
		vcancelEagle.setAlignment(Pos.BOTTOM_LEFT);
		vcancelEagle.setFont(new Font("Arial", 20));

		// Adding images FOR BUTTON cancel
		Image imageForCancelEagle = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/Previous-Button-PNG-Image.png");
		ImageView uploadViewimgForCancelEagle = new ImageView(imageForCancelEagle);
		uploadViewimgForCancelEagle.setFitWidth(35);
		uploadViewimgForCancelEagle.setFitHeight(45);
		vcancelEagle.setGraphic(uploadViewimgForCancelEagle);
		forCancelEagle.getChildren().add(vcancelEagle);

		forVnextAndCancelEagle.getChildren().addAll(vnextEagle);
		Button infEagle = new Button("Eagle-Qyran-Kartal\nWith maximum air \nspeed of 320 km/h,"
				+ "an \neagle the second fastest \nbird in the world \n(after the peregrine \nfalcon "
				+ "who can fly \nas fast as 389 km/h )");
		infEagle.setFont(Font.font("imprint MT Shadow", FontWeight.BOLD, FontPosture.REGULAR, 25));
		infEagle.setTextFill(linearGradient);
		infEagle.setMinSize(300, 300);
		vInfEagle.getChildren().addAll(forCancelEagle, infEagle, forVnextAndCancelEagle);
		infEagle.setStyle("-fx-background-radius: 40, 40, 40, 40;");
		gridOfFinishGameEagle.add(vInfEagle, 0, 0);
		gridOfFinishGameEagle.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/PuzzleGame/congratulazioni-gif-congratulations-glitter-611.gif');-fx-background-repeat:stretch;-fx-background-position: bottom ; -fx-background-color:beige");
		Scene finishGameeEagle = new Scene(gridOfFinishGameEagle, 660, 620);

		Button finishGameEagle = new Button("Finish");
		finishGameEagle.setFont(new Font("Times New Roman", 30)); // www.
		finishGameEagle.setStyle("-fx-background-color:gray");// www.
		finishGameEagle.setAlignment(Pos.BOTTOM_RIGHT);
		finishGameEagle.setOnAction(e -> primaryWindow.setScene(finishGameeEagle));
		HBox buttonBoxEagle = new HBox(8);
		buttonBoxEagle.getChildren().add(finishGameEagle);
		buttonBoxEagle.setPadding(new Insets(0, 0, 0, 220));
		HBox buttonBox5Eagle = new HBox();
		buttonBox5Eagle.getChildren().addAll(shuffleButtonEagle, buttonBoxEagle);

		// create vbox for desk and buttons
		VBox vbox1Eagle = new VBox(10);
		vbox1Eagle.getChildren().addAll(bp5by3Eagle, deskEagle, buttonBox5Eagle);
		vbox1Eagle.setPadding(new Insets(15, 24, 15, 24));
		GridPane mngridEagle = new GridPane();// www.
		mngridEagle.add(vbox1Eagle, 0, 0);
		mngridEagle.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/milano-texture-plain-glitter-wallpaper-silver-m95566-p2591-9085_medium.jpg');");
		Scene c5by3Eagle = new Scene(mngridEagle, 660, 600);
		canсelEagle.setOnAction(event -> primaryWindow.setScene(c5by3Eagle));
		vcancelEagle.setOnAction(event -> primaryWindow.setScene(c5by3Eagle));
		buttonEagle.setOnAction(event -> primaryWindow.setScene(c5by3Eagle));

		vnextEagle.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				GridPane vd = new GridPane();
				string = enterName.getText().toUpperCase();
				Text cc = new Text("\t" + string + ",");
				Text c1 = new Text("\n\tyou did it !!!");
				Text cc1 = new Text();
				VBox vc = new VBox();
				Button vc1 = new Button("Try again");
				Image imgAG = new Image(
						"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/View-refresh_Gion_simple.svg.png");
				ImageView uploadViewAG = new ImageView(imgAG);
				uploadViewAG.setFitWidth(30);
				uploadViewAG.setFitHeight(30);
				vc1.setGraphic(uploadViewAG);
				vc.getChildren().add(vc1);
				vc.setPadding(new Insets(0, 20, 50, 250));
				vc1.setOnAction(e -> primaryWindow.setScene(scene1));

				VBox cv = new VBox();
				cv.getChildren().addAll(cc, c1, cc1);
				cc.setFill(Color.GOLD);
				c1.setFill(Color.GOLD);
				cc1.setFill(Color.BLACK);
				vd.setStyle(
						"-fx-background-image: url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/0_c5883_e9e85875_XL.gif')");
				cc.setFont(Font.font("Bodoni MT Black", 50));
				c1.setFont(Font.font("Bodoni MT Black", 50));
				vc1.setFont(Font.font("Bodoni MT Black", 24));
				vd.setPadding(new Insets(100, 50, 70, 100));
				vd.add(cv, 5, 3);
				vd.add(vc, 5, 5);
				Scene vse = new Scene(vd, 650, 406);
				primaryWindow.setScene(vse);
			}
		});
		// for button lion load puzzle image
		Image image33Lio = new Image(getClass().getResourceAsStream("лев.jpg"));
		int numOfColumns33Lio = (int) (image33Lio.getWidth() / Piece.SIZE);
		int numOfRows33Lio = (int) (image33Lio.getHeight() / Piece.SIZE);
		// create desk
		final Desk des33Lio3 = new Desk(numOfColumns33Lio, numOfRows33Lio);
		// create puzzle pieces
		final List<Piece> pieces33Lio = new ArrayList<Piece>();
		for (int col = 0; col < numOfColumns33Lio; col++) {
			for (int row = 0; row < numOfRows33Lio; row++) {
				int x = col * Piece.SIZE;
				int y = row * Piece.SIZE;

				final Piece piece = new Piece(image33Lio, x, y, row > 0, col > 0, row < numOfRows33Lio - 1,
						col < numOfColumns33Lio - 1, des33Lio3.getWidth(), des33Lio3.getHeight());

				pieces33Lio.add(piece);
			}
		}
		des33Lio3.getChildren().addAll(pieces33Lio);
		// create button box
		Button shuffleButton33Lio = new Button("Shuffle");
		shuffleButton33Lio.setStyle("-fx-font-size: 2em;-fx-background-color:gray");
		shuffleButton33Lio.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : pieces33Lio) {
					piece.setActive();
					double shuffleX = Math.random() * (des33Lio3.getWidth() - Piece.SIZE + 48f) - 24f
							- piece.getCorrectX();
					double shuffleY = Math.random() * (des33Lio3.getHeight() - Piece.SIZE + 30f) - 15f
							- piece.getCorrectY();
					timeline.getKeyFrames()
							.add(new KeyFrame(Duration.seconds(1), new KeyValue(piece.translateXProperty(), shuffleX),
									new KeyValue(piece.translateYProperty(), shuffleY)));
				}
				timeline.playFromStart();
			}
		});
		// This scene has menu file: file, edit,help
		MenuBar menu33Lio = new MenuBar();
		menu33Lio.setStyle("-fx-background-color: gray;");
		Menu file33Lio = new Menu("File");
		Menu edit33Lio = new Menu("Edit");
		Menu help33Lio = new Menu("Help");
		menu33Lio.setMinSize(740, 50);
		menu33Lio.setStyle("-fx-font-size:25");

		// Adding images
		Image img33Lio = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/icon.png");
		ImageView uploadView33Lio = new ImageView(img33Lio);
		uploadView33Lio.setFitWidth(30);
		uploadView33Lio.setFitHeight(30);
		file33Lio.setGraphic(uploadView33Lio);

		// Adding images
		Image image33Lio1 = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/Actions-help-about-icon.png");
		ImageView uploadView33Lio1 = new ImageView(image33Lio1);
		uploadView33Lio1.setFitWidth(30);
		uploadView33Lio1.setFitHeight(30);
		help33Lio.setGraphic(uploadView12);
		// Adding images
		Image imge33Lio2 = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/edit.png");
		ImageView upldView33Lio2 = new ImageView(imge33Lio2);
		upldView33Lio2.setFitWidth(30);
		upldView33Lio2.setFitHeight(30);
		edit33Lio.setGraphic(upldView33Lio2);
		MenuItem exit33Lio2 = new MenuItem("Exit");
		MenuItem solution33Lio2 = new MenuItem("About");
		exit33Lio2.setOnAction(e -> System.exit(0));
		file33Lio.getItems().addAll(exit33Lio2);
		// It is about for main
		GridPane grid33Lio = new GridPane();
		HBox hboxCancelLio = new HBox();
		Button canсel33Lio = new Button("Cancel");
		canсel33Lio.setFont(new Font("Arial", 20));

		hboxCancelLio.setPadding(new Insets(380, 20, 5, 410));
		hboxCancelLio.getChildren().add(canсel33Lio);
		grid33Lio
				.setStyle("-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/about.jpg')");
		grid33Lio.add(hboxCancelLio, 0, 0);
		Scene scene3by3Lio = new Scene(grid33Lio, 552, 434);// scne2-for about

		solution33Lio2.setOnAction(e -> primaryWindow.setScene(scene3by3Lio));

		BorderPane bp3by3Lio = new BorderPane();
		bp3by3Lio.setTop(menu33Lio);
		bp3by3Lio.setMinSize(200, 100);

		MenuItem solveButton3by3Lio = new MenuItem("Solution");
		solveButton3by3Lio.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : pieces33Lio) {
					piece.setInactive();
					timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1),
							new KeyValue(piece.translateXProperty(), 0), new KeyValue(piece.translateYProperty(), 0)));
				}
				timeline.playFromStart();
			}
		});

		help33Lio.getItems().addAll(solveButton3by3Lio, solution33Lio2);
		menu33Lio.getMenus().addAll(file33Lio, help33Lio);

		// THIS IS SCENE WHICH WILL GIVE US INFO NEXT AND CANCEL BUTTONS
		GridPane gridOfFinishGameLio = new GridPane();
		HBox vInfLio = new HBox();
		vInfLio.setPadding(new Insets(140, 140, 10, 180));
		HBox forVnextAndCancelLio = new HBox();
		forVnextAndCancelLio.setPadding(new Insets(250, 150, 0, 30));
		Button vnextLio = new Button("Next");
		vnextLio.setMinSize(120, 35);
		vnextLio.setAlignment(Pos.BOTTOM_RIGHT);

		// Adding images FOR BUTTON NEXT
		Image imageForNextLio = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/green-play-button-icon_228230.png");
		ImageView uploadViewimgForNextLio = new ImageView(imageForNextLio);
		uploadViewimgForNextLio.setFitWidth(35);
		uploadViewimgForNextLio.setFitHeight(45);
		vnextLio.setGraphic(uploadViewimgForNextLio);
		vnextLio.setFont(new Font("Arial", 20));

		HBox forCancel33Lio = new HBox();
		forCancel33Lio.setPadding(new Insets(250, 50, 0, -150));

		Button vcancel33Lio = new Button("Back");
		vcancel33Lio.setMinSize(120, 35);
		vcancel33Lio.setAlignment(Pos.BOTTOM_LEFT);
		vcancel33Lio.setFont(new Font("Arial", 20));

		// Adding images FOR BUTTON cancel
		Image imageForCancel33Lio = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/Previous-Button-PNG-Image.png");
		ImageView uploadViewimgForCancelLio = new ImageView(imageForCancel33Lio);
		uploadViewimgForCancelLio.setFitWidth(35);
		uploadViewimgForCancelLio.setFitHeight(45);
		vcancel33Lio.setGraphic(uploadViewimgForCancelLio);
		forCancel33Lio.getChildren().add(vcancel33Lio);
		forVnextAndCancelLio.getChildren().addAll(vnextLio);
		Button inf33Lio = new Button(
				"Lion-Arystan-Aslan\n A lion’s roar \ncan be heard from \n  as far as 5 miles\n    away.");
		inf33Lio.setFont(Font.font("imprint MT Shadow", FontWeight.BOLD, FontPosture.REGULAR, 25));
		inf33Lio.setTextFill(linearGradient);
		inf33Lio.setMinSize(250, 300);
		vInfLio.getChildren().addAll(forCancel33Lio, inf33Lio, forVnextAndCancelLio);
		inf33Lio.setStyle("-fx-background-radius: 40, 40, 40, 40;");
		gridOfFinishGameLio.add(vInfLio, 0, 0);
		gridOfFinishGameLio.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/PuzzleGame/congratulazioni-gif-congratulations-glitter-611.gif');-fx-background-repeat:stretch;-fx-background-position: bottom ; -fx-background-color:beige");
		Scene finishGamee33Lio = new Scene(gridOfFinishGameLio, 620, 620);

		Button finishGame33Lio = new Button("Finish");
		finishGame33Lio.setFont(new Font("Times New Roman", 30)); // www.
		finishGame33Lio.setStyle("-fx-background-color:gray");// www.
		finishGame33Lio.setAlignment(Pos.BOTTOM_RIGHT);
		finishGame33Lio.setOnAction(e -> primaryWindow.setScene(finishGamee33Lio));

		HBox buttonBoxLio = new HBox(8);
		buttonBoxLio.getChildren().add(finishGame33Lio);
		buttonBoxLio.setPadding(new Insets(0, 0, 0, 220));
		HBox buttonBox53Lio = new HBox();
		buttonBox53Lio.getChildren().addAll(shuffleButton33Lio, buttonBoxLio);

		// create vbox for desk and buttons
		VBox vbox1Lio = new VBox(10);
		vbox1Lio.getChildren().addAll(bp3by3Lio, des33Lio3, buttonBox53Lio);
		vbox1Lio.setPadding(new Insets(15, 24, 15, 24));
		GridPane mngrid53Lio = new GridPane();// www.
		mngrid53Lio.add(vbox1Lio, 0, 0);
		mngrid53Lio.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/milano-texture-plain-glitter-wallpaper-silver-m95566-p2591-9085_medium.jpg');");
		Scene с3Lio = new Scene(mngrid53Lio, 660, 560);
		canсel33Lio.setOnAction(event -> primaryWindow.setScene(с3Lio));
		vcancel33Lio.setOnAction(event -> primaryWindow.setScene(с3Lio));
		buttonLio.setOnAction(event -> primaryWindow.setScene(с3Lio));

		vnextLio.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				GridPane vd = new GridPane();
				string = enterName.getText().toUpperCase();
				Text cc = new Text("\t" + string + ",");
				Text c1 = new Text("\n\tyou did it !!!");
				Text cc1 = new Text();
				VBox vc = new VBox();
				Button vc1 = new Button("Try again");
				Image imgAG = new Image(
						"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/View-refresh_Gion_simple.svg.png");
				ImageView uploadViewAG = new ImageView(imgAG);
				uploadViewAG.setFitWidth(30);
				uploadViewAG.setFitHeight(30);
				vc1.setGraphic(uploadViewAG);
				vc.getChildren().add(vc1);
				vc.setPadding(new Insets(0, 20, 50, 250));
				vc1.setOnAction(e -> primaryWindow.setScene(scene1));

				VBox cv = new VBox();
				cv.getChildren().addAll(cc, c1, cc1);
				cc.setFill(Color.GOLD);
				c1.setFill(Color.GOLD);
				cc1.setFill(Color.BLACK);
				vd.setStyle(
						"-fx-background-image: url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/0_c5883_e9e85875_XL.gif')");
				cc.setFont(Font.font("Bodoni MT Black", 50));
				c1.setFont(Font.font("Bodoni MT Black", 50));
				vc1.setFont(Font.font("Bodoni MT Black", 24));

				vd.setPadding(new Insets(100, 50, 70, 100));
				vd.add(cv, 5, 3);
				vd.add(vc, 5, 5);

				Scene vse = new Scene(vd, 650, 406);
				primaryWindow.setScene(vse);
			}
		});
		/*
		 * Scene -II(1)
		 * 
		 */

		// levels
		GridPane gridLevel2 = new GridPane();
		VBox vboxLevel2 = new VBox(22);
		vboxLevel2.setPadding(new Insets(130, 100, 0, 180));
		Button butLev1 = new Button("        3x3       ");
		Button butLev2 = new Button("        4x3       ");
		Button butLev3 = new Button("        5x3       ");
		butLev1.setStyle(
				" -fx-background-color: linear-gradient(#686868 0%, #232723 25%, #373837 75%, #757575 100%),linear-gradient(#020b02, #3a3a3a),linear-gradient(#9d9e9d 0%, #6b6a6b 20%, #343534 80%, #242424 100%),linear-gradient(#8a8a8a 0%, #6b6a6b 20%, #343534 80%, #262626 100%),linear-gradient(#777777 0%, #606060 50%, #505250 51%, #2a2b2a 100%);-fx-background-insets: 0,1,4,5,6;-fx-background-radius: 9,8,5,4,3;-fx-padding: 15 30 15 30; "
						+ " -fx-font-size: 26px;-fx-font-weight: bold;-fx-text-fill: white;-fx-effect: dropshadow( three-pass-box , rgba(255,255,255,0.2) , 1, 0.0 , 0 , 1);");
		butLev2.setStyle(
				" -fx-background-color: linear-gradient(#686868 0%, #232723 25%, #373837 75%, #757575 100%),linear-gradient(#020b02, #3a3a3a),linear-gradient(#9d9e9d 0%, #6b6a6b 20%, #343534 80%, #242424 100%),linear-gradient(#8a8a8a 0%, #6b6a6b 20%, #343534 80%, #262626 100%),linear-gradient(#777777 0%, #606060 50%, #505250 51%, #2a2b2a 100%);-fx-background-insets: 0,1,4,5,6;-fx-background-radius: 9,8,5,4,3;-fx-padding: 15 30 15 30; "
						+ " -fx-font-size: 26px;-fx-font-weight: bold;-fx-text-fill: white;-fx-effect: dropshadow( three-pass-box , rgba(255,255,255,0.2) , 1, 0.0 , 0 , 1);");
		butLev3.setStyle(
				" -fx-background-color: linear-gradient(#686868 0%, #232723 25%, #373837 75%, #757575 100%),linear-gradient(#020b02, #3a3a3a),linear-gradient(#9d9e9d 0%, #6b6a6b 20%, #343534 80%, #242424 100%),linear-gradient(#8a8a8a 0%, #6b6a6b 20%, #343534 80%, #262626 100%),linear-gradient(#777777 0%, #606060 50%, #505250 51%, #2a2b2a 100%);-fx-background-insets: 0,1,4,5,6;-fx-background-radius: 9,8,5,4,3;-fx-padding: 15 30 15 30; "
						+ " -fx-font-size: 26px;-fx-font-weight: bold;-fx-text-fill: white;-fx-effect: dropshadow( three-pass-box , rgba(255,255,255,0.2) , 1, 0.0 , 0 , 1);");
		vboxLevel2.getChildren().addAll(butLev1, butLev2, butLev3);
		gridLevel2.getChildren().addAll(vboxLevel2);
		gridLevel2.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/Hack/puzzle.jpg')");
		Scene chooseDif2 = new Scene(gridLevel2, 560, 500);

		// for button dif1
		HBox hbLev = new HBox();
		ImageView imageViewBaikonur = new ImageView(new Image(getClass().getResourceAsStream("байконур.jpg")));
		imageViewBaikonur.setFitWidth(230);
		imageViewBaikonur.setFitHeight(180);
		Button buttonBaikonur = new Button("", imageViewBaikonur);
		buttonBaikonur.setPrefSize(230, 180);

		ImageView imageViewMost = new ImageView(new Image(getClass().getResourceAsStream("мост.jpg")));
		imageViewMost.setFitHeight(180);
		imageViewMost.setFitWidth(230);
		Button buttonMost = new Button("", imageViewMost);
		buttonMost.setPrefSize(230, 180);

		ImageView imageViewBorovoe = new ImageView(new Image(getClass().getResourceAsStream("Боровое.jpg")));
		imageViewBorovoe.setFitWidth(230);
		imageViewBorovoe.setFitHeight(180);
		Button buttonBorovoe = new Button("", imageViewBorovoe);
		buttonBorovoe.setPrefSize(230, 180);

		GridPane gridPaneKZ1 = new GridPane();
		gridPaneKZ1.add(hbLev, 0, 0);
		gridPaneKZ1.add(buttonBaikonur, 0, 0);
		gridPaneKZ1.add(buttonMost, 0, 1);
		gridPaneKZ1.add(buttonBorovoe, 0, 2);
		gridPaneKZ1.setAlignment(Pos.TOP_CENTER);
		gridPaneKZ1.setVgap(10);
		gridPaneKZ1.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/73584f85887791e.jpg')");
		Scene scene3by3KZ = new Scene(gridPaneKZ1, 645, 600);
		// action listener of buttindif2
		butLev1.setOnAction(event -> primaryWindow.setScene(scene3by3KZ));
		// load puzzle image
		Image imageBaik = new Image(getClass().getResourceAsStream("байконур.jpg"));
		// ImageView image= new ImageView(image1);
		int numOfColumnsBaik = (int) (imageBaik.getWidth() / Piece.SIZE);
		int numOfRowsBaik = (int) (imageBaik.getHeight() / Piece.SIZE);
		// create desk
		final Desk deskKz = new Desk(numOfColumnsBaik, numOfRowsBaik);
		// create puzzle pieces
		final List<Piece> piecesKz = new ArrayList<Piece>();
		for (int col = 0; col < numOfColumnsBaik; col++) {
			for (int row = 0; row < numOfRowsBaik; row++) {
				int x = col * Piece.SIZE;
				int y = row * Piece.SIZE;

				final Piece piece = new Piece(imageBaik, x, y, row > 0, col > 0, row < numOfRowsBaik - 1,
						col < numOfColumnsBaik - 1, deskKz.getWidth(), deskKz.getHeight());

				piecesKz.add(piece);
			}
		}
		deskKz.getChildren().addAll(piecesKz);
		// create button box
		Button shuffleButtonBaikonur = new Button("Shuffle");
		// shuffleButton.setStyle("-fx-background-color:gray");
		shuffleButtonBaikonur.setStyle("-fx-font-size: 2em;-fx-background-color:gray");
		shuffleButtonBaikonur.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : piecesKz) {
					piece.setActive();
					double shuffleX = Math.random() * (deskKz.getWidth() - Piece.SIZE + 48f) - 24f
							- piece.getCorrectX();
					double shuffleY = Math.random() * (deskKz.getHeight() - Piece.SIZE + 30f) - 15f
							- piece.getCorrectY();
					timeline.getKeyFrames()
							.add(new KeyFrame(Duration.seconds(1), new KeyValue(piece.translateXProperty(), shuffleX),
									new KeyValue(piece.translateYProperty(), shuffleY)));
				}
				timeline.playFromStart();
			}
		});

		/*
		 * This scene has menu file: file, edit,help
		 * 
		 */

		MenuBar menuBaik = new MenuBar();
		menuBaik.setStyle("-fx-background-color: gray;");
		Menu file1Baik = new Menu("File");
		Menu edit1Baik = new Menu("Edit");
		Menu help1Baik = new Menu("Help");
		menuBaik.setMinSize(740, 50);
		menuBaik.setStyle("-fx-font-size:25");

		// Adding images
		Image img11Baik = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/icon.png");
		ImageView uploadView11Baikonur = new ImageView(img11Baik);
		uploadView11Baikonur.setFitWidth(30);
		uploadView11Baikonur.setFitHeight(30);
		file1Baik.setGraphic(uploadView11Baikonur);

		// Adding images
		Image img21Baik = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/Actions-help-about-icon.png");
		ImageView uploadView12Baik = new ImageView(img21Baik);
		uploadView12Baik.setFitWidth(30);
		uploadView12Baik.setFitHeight(30);
		help1Baik.setGraphic(uploadView12Baik);

		// Adding images
		Image img31baik = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/edit.png");
		ImageView uploadView3baik = new ImageView(img31baik);
		uploadView3baik.setFitWidth(30);
		uploadView3baik.setFitHeight(30);
		edit1Baik.setGraphic(uploadView3baik);

		MenuItem exit1Baik = new MenuItem("Exit");
		// MenuItem cancel11 = new MenuItem("Cancel");
		MenuItem solution1Baik = new MenuItem("About");

		exit1Baik.setOnAction(e -> System.exit(0));

		file1Baik.getItems().addAll(exit1Baik);
		// It is about for main
		GridPane griiddBaik = new GridPane();
		HBox hboxCancelBaik = new HBox();
		Button canсelBaik = new Button("Cancel");
		canсelBaik.setFont(new Font("Arial", 20));

		hboxCancelBaik.setPadding(new Insets(380, 20, 5, 410));
		hboxCancelBaik.getChildren().add(canсelBaik);
		griiddBaik
				.setStyle("-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/about.jpg')");
		griiddBaik.add(hboxCancelBaik, 0, 0);
		Scene sccene2Baik = new Scene(griiddBaik, 552, 434);// scne2-for about
		solution1Baik.setOnAction(e -> primaryWindow.setScene(sccene2Baik));

		BorderPane bp1Baik = new BorderPane();
		bp1Baik.setTop(menuBaik);
		bp1Baik.setMinSize(200, 100);

		MenuItem solveButtonBaik = new MenuItem("Solution");
		solveButtonBaik.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : piecesKz) {
					piece.setInactive();
					timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1),
							new KeyValue(piece.translateXProperty(), 0), new KeyValue(piece.translateYProperty(), 0)));
				}
				timeline.playFromStart();
			}
		});

		help1Baik.getItems().addAll(solveButtonBaik, solution1Baik);
		menuBaik.getMenus().addAll(file1Baik, help1Baik);
		/*
		 * THIS IS SCENE WHICH WILL GIVE US INFO NEXT AND CANCEL BUTTONS
		 */

		GridPane gridOfFinishGameBaik = new GridPane();
		HBox vInfBaik = new HBox();
		vInfBaik.setPadding(new Insets(140, 140, 10, 180));

		HBox forVnextAndCancelBaik = new HBox();
		forVnextAndCancelBaik.setPadding(new Insets(250, 150, 0, 30));
		Button vnextBaik = new Button("Next");
		vnextBaik.setMinSize(120, 35);
		vnextBaik.setAlignment(Pos.BOTTOM_RIGHT);

		// Adding images FOR BUTTON NEXT
		Image imageForNextBaik = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/green-play-button-icon_228230.png");
		ImageView uploadViewimageForNextBaik = new ImageView(imageForNextBaik);
		uploadViewimageForNextBaik.setFitWidth(35);
		uploadViewimageForNextBaik.setFitHeight(45);
		vnextBaik.setGraphic(uploadViewimageForNextBaik);
		vnextBaik.setFont(new Font("Arial", 20));
		HBox forCancelBaik = new HBox();
		forCancelBaik.setPadding(new Insets(250, 50, 0, -150));
		Button vcancelBaik = new Button("Back");
		vcancelBaik.setMinSize(120, 35);
		vcancelBaik.setAlignment(Pos.BOTTOM_LEFT);
		vcancelBaik.setFont(new Font("Arial", 20));

		// Adding images FOR BUTTON cancel
		Image imageForCancelBaik = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/Previous-Button-PNG-Image.png");
		ImageView uploadViewimageForCancelBaik = new ImageView(imageForCancelBaik);
		uploadViewimageForCancelBaik.setFitWidth(35);
		uploadViewimageForCancelBaik.setFitHeight(45);
		vcancelBaik.setGraphic(uploadViewimageForCancelBaik);
		forCancelBaik.getChildren().add(vcancelBaik);

		forVnextAndCancelBaik.getChildren().addAll(vnextBaik);

		Button infBaik = new Button(
				"Baikonur\nBaikonur Cosmodrome \nis the world's first and \nlargest operational \nspace launch facility.");
		infBaik.setFont(Font.font("imprint MT Shadow", FontWeight.BOLD, FontPosture.REGULAR, 25));
		infBaik.setTextFill(linearGradient);
		infBaik.setMinSize(300, 300);
		vInfBaik.getChildren().addAll(forCancelBaik, infBaik, forVnextAndCancelBaik);
		infBaik.setStyle("-fx-background-radius: 40, 40, 40, 40;");
		gridOfFinishGameBaik.add(vInfBaik, 0, 0);
		gridOfFinishGameBaik.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/PuzzleGame/congratulazioni-gif-congratulations-glitter-611.gif');-fx-background-repeat:stretch;-fx-background-position: bottom ; -fx-background-color:beige");

		Scene finishGameeBaik = new Scene(gridOfFinishGameBaik, 655, 610);

		Button finishGameBaik = new Button("Finish");
		finishGameBaik.setFont(new Font("Times New Roman", 30));// www.
		finishGameBaik.setStyle("-fx-background-color:gray");// www.
		finishGameBaik.setAlignment(Pos.BOTTOM_RIGHT);

		finishGameBaik.setOnAction(e -> primaryWindow.setScene(finishGameeBaik));

		HBox buttonBox1Baik = new HBox(8);
		buttonBox1Baik.getChildren().add(finishGameBaik);
		buttonBox1Baik.setPadding(new Insets(0, 0, 0, 220));
		HBox buttonBoxBaik = new HBox();
		buttonBoxBaik.getChildren().addAll(shuffleButtonBaikonur, buttonBox1Baik);

		// create vbox for desk and buttons
		VBox vbox1Baik = new VBox(10);
		vbox1Baik.getChildren().addAll(bp1Baik, deskKz, buttonBoxBaik);
		vbox1Baik.setPadding(new Insets(15, 24, 15, 24));
		GridPane mngridBaik = new GridPane();// www.
		mngridBaik.add(vbox1Baik, 0, 0);
		mngridBaik.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/milano-texture-plain-glitter-wallpaper-silver-m95566-p2591-9085_medium.jpg');");
		// scene of baikonur
		Scene cBaik = new Scene(mngridBaik, 560, 560);
		vcancelBaik.setOnAction(event -> primaryWindow.setScene(cBaik));
		canсelBaik.setOnAction(event -> primaryWindow.setScene(cBaik));
		buttonBaikonur.setOnAction(event -> primaryWindow.setScene(cBaik));

		vnextBaik.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				GridPane vd = new GridPane();
				string = enterName1.getText().toUpperCase();
				Text cc = new Text("\t" + string + ",");
				Text c1 = new Text("\n\tyou did it !!!");
				Text cc1 = new Text();
				VBox vc = new VBox();
				Button vc1 = new Button("Try again");
				Image imgAG = new Image(
						"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/View-refresh_Gion_simple.svg.png");
				ImageView uploadViewAG = new ImageView(imgAG);
				uploadViewAG.setFitWidth(30);
				uploadViewAG.setFitHeight(30);
				vc1.setGraphic(uploadViewAG);
				vc.getChildren().add(vc1);
				vc.setPadding(new Insets(0, 20, 50, 250));
				vc1.setOnAction(e -> primaryWindow.setScene(scene1));

				VBox cv = new VBox();
				cv.getChildren().addAll(cc, c1, cc1);
				cc.setFill(Color.GOLD);
				c1.setFill(Color.GOLD);
				cc1.setFill(Color.BLACK);
				vd.setStyle(
						"-fx-background-image: url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/0_c5883_e9e85875_XL.gif')");
				cc.setFont(Font.font("Bodoni MT Black", 50));
				c1.setFont(Font.font("Bodoni MT Black", 50));
				vc1.setFont(Font.font("Bodoni MT Black", 24));

				vd.setPadding(new Insets(100, 50, 70, 100));
				vd.add(cv, 5, 3);
				vd.add(vc, 5, 5);

				Scene vse = new Scene(vd, 650, 406);
				primaryWindow.setScene(vse);
			}
		});

		// for button dif2
		HBox hbKZ2 = new HBox();
		ImageView imageViewKaspi = new ImageView(new Image(getClass().getResourceAsStream("каспийй.jpg")));
		imageViewKaspi.setFitWidth(230);
		imageViewKaspi.setFitHeight(180);
		Button buttonKaspi = new Button("", imageViewKaspi);// kaspi
		buttonKaspi.setPrefSize(230, 180);

		ImageView imageViewTau = new ImageView(new Image(getClass().getResourceAsStream("танири.jpg")));
		imageViewTau.setFitHeight(180);
		imageViewTau.setFitWidth(230);
		Button buttonTau = new Button("", imageViewTau);// han taniri button
		buttonTau.setPrefSize(230, 180);

		ImageView imageViewIassaui = new ImageView(new Image(getClass().getResourceAsStream("йассауи.jpg")));
		imageViewIassaui.setFitWidth(230);
		imageViewIassaui.setFitHeight(180);
		Button buttonIassaui = new Button("", imageViewIassaui);
		buttonIassaui.setPrefSize(230, 180);// mavzolei

		GridPane gridPaneOfKZ2 = new GridPane();
		gridPaneOfKZ2.add(hbKZ2, 0, 0);
		gridPaneOfKZ2.add(buttonKaspi, 0, 0);
		gridPaneOfKZ2.add(buttonTau, 0, 1);
		gridPaneOfKZ2.add(buttonIassaui, 0, 2);
		gridPaneOfKZ2.setAlignment(Pos.TOP_CENTER);
		gridPaneOfKZ2.setVgap(10);
		gridPaneOfKZ2.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/73584f85887791e.jpg')");
		Scene scene4by3Kz = new Scene(gridPaneOfKZ2, 645, 600);
		// action list. of butLev2
		butLev2.setOnAction(event -> primaryWindow.setScene(scene4by3Kz));

		// load puzzle image
		Image image1Kaspi = new Image(getClass().getResourceAsStream("каспийй.jpg"));
		// ImageView image= new ImageView(image1);
		int numOfColumns1Kaspi = (int) (image1Kaspi.getWidth() / Piece.SIZE);
		int numOfRows1Kaspi = (int) (image1Kaspi.getHeight() / Piece.SIZE);
		// create desk
		final Desk desk1Kaspi = new Desk(numOfColumns1Kaspi, numOfRows1Kaspi);
		// create puzzle pieces
		final List<Piece> pieces1Kaspi = new ArrayList<Piece>();
		for (int col = 0; col < numOfColumns1Kaspi; col++) {
			for (int row = 0; row < numOfRows1Kaspi; row++) {
				int x = col * Piece.SIZE;
				int y = row * Piece.SIZE;
				final Piece piece = new Piece(image1Kaspi, x, y, row > 0, col > 0, row < numOfRows1Kaspi - 1,
						col < numOfColumns1Kaspi - 1, desk1Kaspi.getWidth(), desk1Kaspi.getHeight());
				pieces1Kaspi.add(piece);
			}
		}
		desk1Kaspi.getChildren().addAll(pieces1Kaspi);
		// create button box
		Button shuffleButton1Kaspi = new Button("Shuffle");
		shuffleButton1Kaspi.setStyle("-fx-font-size: 2em;-fx-background-color:gray");
		shuffleButton1Kaspi.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : pieces1Kaspi) {
					piece.setActive();
					double shuffleX = Math.random() * (desk1Kaspi.getWidth() - Piece.SIZE + 48f) - 24f
							- piece.getCorrectX();
					double shuffleY = Math.random() * (desk1Kaspi.getHeight() - Piece.SIZE + 30f) - 15f
							- piece.getCorrectY();
					timeline.getKeyFrames()
							.add(new KeyFrame(Duration.seconds(1), new KeyValue(piece.translateXProperty(), shuffleX),
									new KeyValue(piece.translateYProperty(), shuffleY)));
				}
				timeline.playFromStart();
			}
		});

		/*
		 * This scene has menu file: file, edit,help
		 * 
		 */

		MenuBar menuKaspi = new MenuBar();
		menuKaspi.setStyle("-fx-background-color: gray;");
		Menu fileKaspi = new Menu("File");
		Menu editKaspi = new Menu("Edit");
		Menu helpKaspi = new Menu("Help");
		menuKaspi.setMinSize(740, 50);
		menuKaspi.setStyle("-fx-font-size:25");

		// Adding images
		Image imgKaspi = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/icon.png");
		ImageView uploadViewKaspi = new ImageView(imgKaspi);
		uploadViewKaspi.setFitWidth(30);
		uploadViewKaspi.setFitHeight(30);
		fileKaspi.setGraphic(uploadViewKaspi);

		// Adding images
		Image imgKaspi2 = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/Actions-help-about-icon.png");
		ImageView uploadView12Kaspi = new ImageView(imgKaspi2);
		uploadView12Kaspi.setFitWidth(30);
		uploadView12Kaspi.setFitHeight(30);
		helpKaspi.setGraphic(uploadView12Kaspi);

		// Adding images
		Image imgKaspi3 = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/edit.png");
		ImageView uploadView3Kaspi = new ImageView(imgKaspi3);
		uploadView3Kaspi.setFitWidth(30);
		uploadView3Kaspi.setFitHeight(30);
		editKaspi.setGraphic(uploadView3Kaspi);

		MenuItem exitKaspi = new MenuItem("Exit");
		MenuItem solutionKaspi = new MenuItem("About");

		exitKaspi.setOnAction(e -> System.exit(0));

		fileKaspi.getItems().addAll(exitKaspi);
		// It is about for main
		GridPane gridKaspi = new GridPane();
		HBox hboxCancelKaspi = new HBox();
		Button ccanсcel1Kaspi = new Button("Cancel");
		ccanсcel1Kaspi.setFont(new Font("Arial", 20));
		hboxCancelKaspi.setPadding(new Insets(380, 20, 5, 410));
		hboxCancelKaspi.getChildren().add(ccanсcel1Kaspi);
		gridKaspi
				.setStyle("-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/about.jpg')");
		gridKaspi.add(hboxCancelKaspi, 0, 0);
		Scene sceneKaspi = new Scene(gridKaspi, 552, 434);// scne2-for about
		solutionKaspi.setOnAction(e -> primaryWindow.setScene(sceneKaspi));
		BorderPane bpKaspi = new BorderPane();
		bpKaspi.setTop(menuKaspi);
		bpKaspi.setMinSize(200, 100);

		MenuItem solveButtonKaspi = new MenuItem("Solution");
		solveButtonKaspi.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : pieces1Kaspi) {
					piece.setInactive();
					timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1),
							new KeyValue(piece.translateXProperty(), 0), new KeyValue(piece.translateYProperty(), 0)));
				}
				timeline.playFromStart();
			}
		});

		helpKaspi.getItems().addAll(solveButtonKaspi, solutionKaspi);
		menuKaspi.getMenus().addAll(fileKaspi, helpKaspi);
		/*
		 * THIS IS SCENE WHICH WILL GIVE US INFO NEXT AND CANCEL BUTTONS
		 */

		GridPane gridOfFinishGameKaspi = new GridPane();
		HBox vInfKaspi = new HBox();
		vInfKaspi.setPadding(new Insets(140, 140, 10, 180));

		HBox forVnextAndCancelKaspi = new HBox();
		forVnextAndCancelKaspi.setPadding(new Insets(250, 150, 0, 30));
		Button vnextKaspi = new Button("Next");
		vnextKaspi.setMinSize(120, 35);
		vnextKaspi.setAlignment(Pos.BOTTOM_RIGHT);

		// Adding images FOR BUTTON NEXT
		Image imageForNextKaspi = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/green-play-button-icon_228230.png");
		ImageView uploadViewimageForNextKaspi = new ImageView(imageForNextKaspi);
		uploadViewimageForNextKaspi.setFitWidth(35);
		uploadViewimageForNextKaspi.setFitHeight(45);
		vnextKaspi.setGraphic(uploadViewimageForNextKaspi);
		vnextKaspi.setFont(new Font("Arial", 20));
		HBox forCancelKaspi = new HBox();
		forCancelKaspi.setPadding(new Insets(250, 50, 0, -150));

		Button vcancelKaspi = new Button("Back");
		vcancelKaspi.setMinSize(120, 35);
		vcancelKaspi.setAlignment(Pos.BOTTOM_LEFT);
		vcancelKaspi.setFont(new Font("Arial", 20));
		// Adding images FOR BUTTON cancel
		Image imageForCancelKaspi = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/Previous-Button-PNG-Image.png");
		ImageView uploadViewimageForCancelKaspi = new ImageView(imageForCancelKaspi);
		uploadViewimageForCancelKaspi.setFitWidth(35);
		uploadViewimageForCancelKaspi.setFitHeight(45);
		vcancelKaspi.setGraphic(uploadViewimageForCancelKaspi);
		forCancelKaspi.getChildren().add(vcancelKaspi);

		forVnextAndCancelKaspi.getChildren().addAll(vnextKaspi);
		// information about caspean sea
		Button infKaspi = new Button(
				"Caspian Sea (Aktau)\nThe Caspian Sea is the\n largest enclosed inland \nbody of water on Earth by \narea, variously classed \nas the world's largest \nlake or a full-fledged\n  sea.");
		infKaspi.setFont(Font.font("imprint MT Shadow", FontWeight.BOLD, FontPosture.REGULAR, 25));
		infKaspi.setTextFill(linearGradient);
		infKaspi.setMinSize(300, 300);
		vInfKaspi.getChildren().addAll(forCancelKaspi, infKaspi, forVnextAndCancelKaspi);
		infKaspi.setStyle("-fx-background-radius: 40, 40, 40, 40;");
		gridOfFinishGameKaspi.add(vInfKaspi, 0, 0);
		gridOfFinishGameKaspi.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/PuzzleGame/congratulazioni-gif-congratulations-glitter-611.gif');-fx-background-repeat:stretch;-fx-background-position: bottom ; -fx-background-color:beige");

		Scene finishGameeKaspi = new Scene(gridOfFinishGameKaspi, 660, 620);

		Button finishGameKaspi = new Button("Finish");
		finishGameKaspi.setFont(new Font("Times New Roman", 30)); // www.
		finishGameKaspi.setStyle("-fx-background-color:gray");// www.
		finishGameKaspi.setAlignment(Pos.BOTTOM_RIGHT);

		finishGameKaspi.setOnAction(e -> primaryWindow.setScene(finishGameeKaspi));

		HBox buttonBox1Kaspi = new HBox(8);
		buttonBox1Kaspi.getChildren().add(finishGameKaspi);
		buttonBox1Kaspi.setPadding(new Insets(0, 0, 0, 220));
		HBox buttonBoxKaspi = new HBox();
		buttonBoxKaspi.getChildren().addAll(shuffleButton1Kaspi, buttonBox1Kaspi);

		// create vbox for desk and buttons
		VBox vbox1Kaspi = new VBox(10);
		vbox1Kaspi.getChildren().addAll(bpKaspi, desk1Kaspi, buttonBoxKaspi);
		vbox1Kaspi.setPadding(new Insets(15, 24, 15, 24));

		GridPane mngridKaspi = new GridPane();// www.
		mngridKaspi.add(vbox1Kaspi, 0, 0);
		mngridKaspi.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/milano-texture-plain-glitter-wallpaper-silver-m95566-p2591-9085_medium.jpg');");

		Scene kaspi = new Scene(mngridKaspi, 560, 560);
		ccanсcel1Kaspi.setOnAction(event -> primaryWindow.setScene(kaspi));
		vcancelKaspi.setOnAction(event -> primaryWindow.setScene(kaspi));
		buttonKaspi.setOnAction(event -> primaryWindow.setScene(kaspi));

		vnextKaspi.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				GridPane vd = new GridPane();
				string = enterName1.getText().toUpperCase();
				Text cc = new Text("\t" + string + ",");
				Text c1 = new Text("\n\tyou did it !!!");
				Text cc1 = new Text();
				VBox vc = new VBox();
				Button vc1 = new Button("Try again");
				Image imgAG = new Image(
						"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/View-refresh_Gion_simple.svg.png");
				ImageView uploadViewAG = new ImageView(imgAG);
				uploadViewAG.setFitWidth(30);
				uploadViewAG.setFitHeight(30);
				vc1.setGraphic(uploadViewAG);
				vc.getChildren().add(vc1);
				vc.setPadding(new Insets(0, 20, 50, 250));
				vc1.setOnAction(e -> primaryWindow.setScene(scene1));

				VBox cv = new VBox();
				cv.getChildren().addAll(cc, c1, cc1);
				cc.setFill(Color.GOLD);
				c1.setFill(Color.GOLD);
				cc1.setFill(Color.BLACK);
				vd.setStyle(
						"-fx-background-image: url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/0_c5883_e9e85875_XL.gif')");
				cc.setFont(Font.font("Bodoni MT Black", 50));
				c1.setFont(Font.font("Bodoni MT Black", 50));
				vc1.setFont(Font.font("Bodoni MT Black", 24));

				vd.setPadding(new Insets(100, 50, 70, 100));
				vd.add(cv, 5, 3);
				vd.add(vc, 5, 5);

				Scene vse = new Scene(vd, 650, 406);
				primaryWindow.setScene(vse);
			}
		});

		// for button bridge(most) load puzzle image
		Image image53Most = new Image(getClass().getResourceAsStream("мост.jpg"));
		int numOfColMost = (int) (image53Most.getWidth() / Piece.SIZE);
		int numOfRowsMost = (int) (image53Most.getHeight() / Piece.SIZE);
		// create desk
		final Desk deskMost = new Desk(numOfColMost, numOfRowsMost);
		// create puzzle pieces
		final List<Piece> piecesMost = new ArrayList<Piece>();
		for (int col = 0; col < numOfColMost; col++) {
			for (int row = 0; row < numOfRowsMost; row++) {
				int x = col * Piece.SIZE;
				int y = row * Piece.SIZE;
				final Piece piece = new Piece(image53Most, x, y, row > 0, col > 0, row < numOfRowsMost - 1,
						col < numOfColMost - 1, deskMost.getWidth(), deskMost.getHeight());
				piecesMost.add(piece);
			}
		}
		deskMost.getChildren().addAll(piecesMost);
		// create button box
		Button shuffleButtonMost = new Button("Shuffle");
		// shuffleButton.setStyle("-fx-background-color:gray");
		shuffleButtonMost.setStyle("-fx-font-size: 2em;-fx-background-color:gray");
		shuffleButtonMost.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : piecesMost) {
					piece.setActive();
					double shuffleX = Math.random() * (deskMost.getWidth() - Piece.SIZE + 48f) - 24f
							- piece.getCorrectX();
					double shuffleY = Math.random() * (deskMost.getHeight() - Piece.SIZE + 30f) - 15f
							- piece.getCorrectY();
					timeline.getKeyFrames()
							.add(new KeyFrame(Duration.seconds(1), new KeyValue(piece.translateXProperty(), shuffleX),
									new KeyValue(piece.translateYProperty(), shuffleY)));
				}
				timeline.playFromStart();
			}
		});

		// This scene has menu file: file, edit,help * */
		MenuBar menuMost = new MenuBar();
		menuMost.setStyle("-fx-background-color: gray;");
		Menu fileMost = new Menu("File");
		Menu editMost = new Menu("Edit");
		Menu helpMost = new Menu("Help");
		menuMost.setMinSize(740, 50);
		menuMost.setStyle("-fx-font-size:25");

		// Adding images
		Image img53Most = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/icon.png");
		ImageView uploadView53Most = new ImageView(img53Most);
		uploadView53Most.setFitWidth(30);
		uploadView53Most.setFitHeight(30);
		fileMost.setGraphic(uploadView53Most);

		// Adding images
		Image image531Most = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/Actions-help-about-icon.png");
		ImageView uploadView531Most = new ImageView(image531Most);
		uploadView531Most.setFitWidth(30);
		uploadView531Most.setFitHeight(30);
		helpMost.setGraphic(uploadView12Baik);

		// Adding images
		Image imge53Most = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/edit.png");
		ImageView upldView5Most3 = new ImageView(imge53Most);
		upldView5Most3.setFitWidth(30);
		upldView5Most3.setFitHeight(30);
		editMost.setGraphic(upldView5Most3);
		MenuItem exitMost = new MenuItem("Exit");
		MenuItem solutionMost = new MenuItem("About");

		exitMost.setOnAction(e -> System.exit(0));

		fileMost.getItems().addAll(exitMost);
		// It is about for main
		GridPane grid53Most = new GridPane();
		HBox hboxCancelMost = new HBox();
		Button caanсcelMost = new Button("Cancel");
		caanсcelMost.setFont(new Font("Arial", 20));

		hboxCancelMost.setPadding(new Insets(380, 20, 5, 410));
		hboxCancelMost.getChildren().add(caanсcelMost);
		grid53Most
				.setStyle("-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/about.jpg')");
		grid53Most.add(hboxCancelMost, 0, 0);
		Scene scene3by3Most = new Scene(grid53Most, 552, 434);// scne2-for about
		solutionMost.setOnAction(e -> primaryWindow.setScene(scene3by3Most));

		BorderPane bp3by3Most = new BorderPane();
		bp3by3Most.setTop(menuMost);
		bp3by3Most.setMinSize(200, 100);

		MenuItem solveButton53Most = new MenuItem("Solution");
		solveButton53Most.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : piecesMost) {
					piece.setInactive();
					timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1),
							new KeyValue(piece.translateXProperty(), 0), new KeyValue(piece.translateYProperty(), 0)));
				}
				timeline.playFromStart();
			}
		});

		helpMost.getItems().addAll(solveButton53Most, solutionMost);
		menuMost.getMenus().addAll(fileMost, helpMost);
		/*
		 * THIS IS SCENE WHICH WILL GIVE US INFO NEXT AND CANCEL BUTTONS
		 */
		GridPane gridOfFinishGame53Most = new GridPane();
		HBox vInf53Most = new HBox();
		vInf53Most.setPadding(new Insets(140, 140, 10, 180));

		HBox forVnextAndCancel53Most = new HBox();
		forVnextAndCancel53Most.setPadding(new Insets(250, 150, 0, 30));
		Button vnext53Most = new Button("Next");
		vnext53Most.setMinSize(120, 35);
		vnext53Most.setAlignment(Pos.BOTTOM_RIGHT);
		// Adding images FOR BUTTON NEXT
		Image imageForNext53Most = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/green-play-button-icon_228230.png");
		ImageView uploadViewimgForNexMost = new ImageView(imageForNext53Most);
		uploadViewimgForNexMost.setFitWidth(35);
		uploadViewimgForNexMost.setFitHeight(45);
		vnext53Most.setGraphic(uploadViewimgForNexMost);
		vnext53Most.setFont(new Font("Arial", 20));
		HBox forCancel53Most = new HBox();
		forCancel53Most.setPadding(new Insets(250, 50, 0, -150));
		Button vcancel53Most = new Button("Back");
		vcancel53Most.setMinSize(120, 35);
		vcancel53Most.setAlignment(Pos.BOTTOM_LEFT);
		vcancel53Most.setFont(new Font("Arial", 20));

		// Adding images FOR BUTTON cancel
		Image imageForCancel53Most = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/Previous-Button-PNG-Image.png");
		ImageView uploadViewimgForCancelMost = new ImageView(imageForCancel53Most);
		uploadViewimgForCancelMost.setFitWidth(35);
		uploadViewimgForCancelMost.setFitHeight(45);
		vcancel53Most.setGraphic(uploadViewimgForCancelMost);
		forCancel53Most.getChildren().add(vcancel53Most);

		forVnextAndCancel53Most.getChildren().addAll(vnext53Most);
		Button inf53Most = new Button(
				"Pedestrian bridge\n    (Atyrau)\nBuilt in 2001, this\n bridge, 551 meters long,\n is listed in the \nGuinness Book of \nRecords as the world's \nlongest pedestrian bridge");
		inf53Most.setFont(Font.font("imprint MT Shadow", FontWeight.BOLD, FontPosture.REGULAR, 25));
		inf53Most.setTextFill(linearGradient);
		inf53Most.setMinSize(300, 300);
		vInf53Most.getChildren().addAll(forCancel53Most, inf53Most, forVnextAndCancel53Most);
		inf53Most.setStyle("-fx-background-radius: 40, 40, 40, 40;");
		gridOfFinishGame53Most.add(vInf53Most, 0, 0);
		gridOfFinishGame53Most.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/PuzzleGame/congratulazioni-gif-congratulations-glitter-611.gif');-fx-background-repeat:stretch;-fx-background-position: bottom ; -fx-background-color:beige");

		Scene finishGamee53Most = new Scene(gridOfFinishGame53Most, 655, 610);

		Button finishGame53Most = new Button("Finish");
		finishGame53Most.setFont(new Font("Times New Roman", 30)); // www.
		finishGame53Most.setStyle("-fx-background-color:gray");// www.
		finishGame53Most.setAlignment(Pos.BOTTOM_RIGHT);
		finishGame53Most.setOnAction(e -> primaryWindow.setScene(finishGamee53Most));

		HBox buttonBox153Most = new HBox(8);
		buttonBox153Most.getChildren().add(finishGame53Most);
		buttonBox153Most.setPadding(new Insets(0, 0, 0, 220));
		HBox buttonBox53Most = new HBox();
		buttonBox53Most.getChildren().addAll(shuffleButtonMost, buttonBox153Most);

		// create vbox for desk and buttons
		VBox vbox153Most = new VBox(10);
		vbox153Most.getChildren().addAll(bp3by3Most, deskMost, buttonBox53Most);
		vbox153Most.setPadding(new Insets(15, 24, 15, 24));
		GridPane mngrid53Most = new GridPane();// www.
		mngrid53Most.add(vbox153Most, 0, 0);
		mngrid53Most.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/milano-texture-plain-glitter-wallpaper-silver-m95566-p2591-9085_medium.jpg');");

		Scene c3by3Most = new Scene(mngrid53Most, 560, 560);
		buttonMost.setOnAction(event -> primaryWindow.setScene(c3by3Most));
		caanсcelMost.setOnAction(event -> primaryWindow.setScene(c3by3Most));
		vcancel53Most.setOnAction(event -> primaryWindow.setScene(c3by3Most));

		vnext53Most.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				GridPane vd = new GridPane();
				string = enterName1.getText().toUpperCase();
				Text cc = new Text("\t" + string + ",");
				Text c1 = new Text("\n\tyou did it !!!");
				Text cc1 = new Text();
				VBox vc = new VBox();
				Button vc1 = new Button("Try again");
				Image imgAG = new Image(
						"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/View-refresh_Gion_simple.svg.png");
				ImageView uploadViewAG = new ImageView(imgAG);
				uploadViewAG.setFitWidth(30);
				uploadViewAG.setFitHeight(30);
				vc1.setGraphic(uploadViewAG);
				vc.getChildren().add(vc1);
				vc.setPadding(new Insets(0, 20, 50, 250));
				vc1.setOnAction(e -> primaryWindow.setScene(scene1));

				VBox cv = new VBox();
				cv.getChildren().addAll(cc, c1, cc1);
				cc.setFill(Color.GOLD);
				c1.setFill(Color.GOLD);
				cc1.setFill(Color.BLACK);
				vd.setStyle(
						"-fx-background-image: url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/0_c5883_e9e85875_XL.gif')");
				cc.setFont(Font.font("Bodoni MT Black", 50));
				c1.setFont(Font.font("Bodoni MT Black", 50));
				vc1.setFont(Font.font("Bodoni MT Black", 24));

				vd.setPadding(new Insets(100, 50, 70, 100));
				vd.add(cv, 5, 3);
				vd.add(vc, 5, 5);

				Scene vse = new Scene(vd, 650, 406);
				primaryWindow.setScene(vse);
			}
		});
		// for button borovoe load puzzle image
		Image image33Borovoe = new Image(getClass().getResourceAsStream("Боровое.jpg"));
		// ImageView image= new ImageView(image1);
		int numOfColumns33Borovoe = (int) (image33Borovoe.getWidth() / Piece.SIZE);
		int numOfRows33Borovoe = (int) (image33Borovoe.getHeight() / Piece.SIZE);
		// create desk
		final Desk des33Borovoe = new Desk(numOfColumns33Borovoe, numOfRows33Borovoe);
		// create puzzle pieces
		final List<Piece> pieces33Borovoe = new ArrayList<Piece>();
		for (int col = 0; col < numOfColumns33Borovoe; col++) {
			for (int row = 0; row < numOfRows33Borovoe; row++) {
				int x = col * Piece.SIZE;
				int y = row * Piece.SIZE;
				final Piece piece = new Piece(image33Borovoe, x, y, row > 0, col > 0, row < numOfRows33Borovoe - 1,
						col < numOfColumns33Borovoe - 1, des33Borovoe.getWidth(), des33Borovoe.getHeight());
				pieces33Borovoe.add(piece);
			}
		}
		des33Borovoe.getChildren().addAll(pieces33Borovoe);
		// create button box
		Button shuffleButton33Borovoe = new Button("Shuffle");
		// shuffleButton.setStyle("-fx-background-color:gray");
		shuffleButton33Borovoe.setStyle("-fx-font-size: 2em;-fx-background-color:gray");
		shuffleButton33Borovoe.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : pieces33Borovoe) {
					piece.setActive();
					double shuffleX = Math.random() * (des33Borovoe.getWidth() - Piece.SIZE + 48f) - 24f
							- piece.getCorrectX();
					double shuffleY = Math.random() * (des33Borovoe.getHeight() - Piece.SIZE + 30f) - 15f
							- piece.getCorrectY();
					timeline.getKeyFrames()
							.add(new KeyFrame(Duration.seconds(1), new KeyValue(piece.translateXProperty(), shuffleX),
									new KeyValue(piece.translateYProperty(), shuffleY)));
				}
				timeline.playFromStart();
			}
		});

		/*
		 * This scene has menu file: file, edit,help
		 * 
		 */

		MenuBar menu33Borovoe = new MenuBar();
		menu33Borovoe.setStyle("-fx-background-color: gray;");
		Menu file33Borovoe = new Menu("File");
		Menu edit33Borovoe = new Menu("Edit");
		Menu help33Borovoe = new Menu("Help");
		menu33Borovoe.setMinSize(740, 50);
		menu33Borovoe.setStyle("-fx-font-size:25");

		// Adding images
		Image img33Borovoe = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/icon.png");
		ImageView uploadView33Borovoe = new ImageView(img33Borovoe);
		uploadView33Borovoe.setFitWidth(30);
		uploadView33Borovoe.setFitHeight(30);
		file33Borovoe.setGraphic(uploadView33Borovoe);

		// Adding images
		Image image31Borovoe = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/Actions-help-about-icon.png");
		ImageView uploadView31Borovoe = new ImageView(image31Borovoe);
		uploadView31Borovoe.setFitWidth(30);
		uploadView31Borovoe.setFitHeight(30);
		help33Borovoe.setGraphic(uploadView12Baik);

		// Adding images
		Image imge33Borovoe = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/edit.png");
		ImageView upldView33Borovoe = new ImageView(imge33Borovoe);
		upldView33Borovoe.setFitWidth(30);
		upldView33Borovoe.setFitHeight(30);
		edit33Borovoe.setGraphic(upldView33Borovoe);

		MenuItem exit33Borovoe = new MenuItem("Exit");
		MenuItem solution33Borovoe = new MenuItem("About");

		exit33Borovoe.setOnAction(event -> System.exit(0));

		file33Borovoe.getItems().addAll(exit33Borovoe);
		// It is about for main
		GridPane grid33Borovoe = new GridPane();
		HBox hboxCancelBorovoe = new HBox();
		Button canсel33Borovoe = new Button("Cancel");
		canсel33Borovoe.setFont(new Font("Arial", 20));

		hboxCancelBorovoe.setPadding(new Insets(380, 20, 5, 410));
		hboxCancelBorovoe.getChildren().add(canсel33Borovoe);
		grid33Borovoe
				.setStyle("-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/about.jpg')");
		grid33Borovoe.add(hboxCancelBorovoe, 0, 0);
		Scene scene3by3Borovoe = new Scene(grid33Borovoe, 552, 434);// scne2-for
																	// about
		solution33Borovoe.setOnAction(e -> primaryWindow.setScene(scene3by3Borovoe));

		BorderPane bp3by3Borovoe = new BorderPane();
		bp3by3Borovoe.setTop(menu33Borovoe);
		bp3by3Borovoe.setMinSize(200, 100);

		MenuItem solveButton3by3Borovoe = new MenuItem("Solution");
		solveButton3by3Borovoe.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : pieces33Borovoe) {
					piece.setInactive();
					timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1),
							new KeyValue(piece.translateXProperty(), 0), new KeyValue(piece.translateYProperty(), 0)));
				}
				timeline.playFromStart();
			}
		});

		help33Borovoe.getItems().addAll(solveButton3by3Borovoe, solution33Borovoe);
		menu33Borovoe.getMenus().addAll(file33Borovoe, help33Borovoe);
		/*
		 * THIS IS SCENE WHICH WILL GIVE US INFO NEXT AND CANCEL BUTTONS
		 */

		GridPane gridOfFinishGameBorovoe = new GridPane();
		HBox vInfBorovoe = new HBox();
		vInfBorovoe.setPadding(new Insets(140, 140, 10, 180));

		HBox forVnextAndCancelBorovoe = new HBox();
		forVnextAndCancelBorovoe.setPadding(new Insets(250, 150, 0, 30));
		Button vnextBorovoe = new Button("Next");
		vnextBorovoe.setMinSize(120, 35);
		vnextBorovoe.setAlignment(Pos.BOTTOM_RIGHT);
		// Adding images FOR BUTTON NEXT
		Image imageForNextBorovoe = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/green-play-button-icon_228230.png");
		ImageView uploadViewimgForNextBorovoe = new ImageView(imageForNextBorovoe);
		uploadViewimgForNextBorovoe.setFitWidth(35);
		uploadViewimgForNextBorovoe.setFitHeight(45);
		vnextBorovoe.setGraphic(uploadViewimgForNextBorovoe);
		vnextBorovoe.setFont(new Font("Arial", 20));
		HBox forCancel33Borovoe = new HBox();
		forCancel33Borovoe.setPadding(new Insets(250, 50, 0, -150));
		Button vcancel33Borovoe = new Button("Back");
		vcancel33Borovoe.setMinSize(120, 35);
		vcancel33Borovoe.setAlignment(Pos.BOTTOM_LEFT);
		//
		vcancel33Borovoe.setFont(new Font("Arial", 20));
		// Adding images FOR BUTTON cancel
		Image imageForCancel33Borovoe = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/Previous-Button-PNG-Image.png");
		ImageView uploadViewimgForCancelB = new ImageView(imageForCancel33Borovoe);
		uploadViewimgForCancelB.setFitWidth(35);
		uploadViewimgForCancelB.setFitHeight(45);
		vcancel33Borovoe.setGraphic(uploadViewimgForCancelB);
		forCancel33Borovoe.getChildren().add(vcancel33Borovoe);

		forVnextAndCancelBorovoe.getChildren().addAll(vnextBorovoe);
		Button inf33Borovoe = new Button(
				"Burabay National Park\n       (Akmola)\nThe park counts 757 \nsorts of plants,of which \n119 should be protected,\n and 12 are registered \nin the Red Book");
		inf33Borovoe.setFont(Font.font("imprint MT Shadow", FontWeight.BOLD, FontPosture.REGULAR, 25));
		inf33Borovoe.setTextFill(linearGradient);
		inf33Borovoe.setMinSize(300, 300);
		vInfBorovoe.getChildren().addAll(forCancel33Borovoe, inf33Borovoe, forVnextAndCancelBorovoe);
		inf33Borovoe.setStyle("-fx-background-radius: 40, 40, 40, 40;");
		gridOfFinishGameBorovoe.add(vInfBorovoe, 0, 0);
		gridOfFinishGameBorovoe.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/PuzzleGame/congratulazioni-gif-congratulations-glitter-611.gif');-fx-background-repeat:stretch;-fx-background-position: bottom ; -fx-background-color:beige");

		Scene finishGamee33Bor = new Scene(gridOfFinishGameBorovoe, 660, 620);

		Button finishGame33Bor = new Button("Finish");
		finishGame33Bor.setFont(new Font("Times New Roman", 30)); // www.
		finishGame33Bor.setStyle("-fx-background-color:gray");// www.
		finishGame33Bor.setAlignment(Pos.BOTTOM_RIGHT);
		finishGame33Bor.setOnAction(e -> primaryWindow.setScene(finishGamee33Bor));
		HBox buttonBoxBorovoe = new HBox(8);
		buttonBoxBorovoe.getChildren().add(finishGame33Bor);
		buttonBoxBorovoe.setPadding(new Insets(0, 0, 0, 220));
		HBox buttonBox53Borovoe = new HBox();
		buttonBox53Borovoe.getChildren().addAll(shuffleButton33Borovoe, buttonBoxBorovoe);
		// create vbox for desk and buttons
		VBox vbox1Borovoe = new VBox(10);
		vbox1Borovoe.getChildren().addAll(bp3by3Borovoe, des33Borovoe, buttonBox53Borovoe);
		vbox1Borovoe.setPadding(new Insets(15, 24, 15, 24));
		GridPane mngrid53Borovoe = new GridPane();// www.
		mngrid53Borovoe.add(vbox1Borovoe, 0, 0);
		mngrid53Borovoe.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/milano-texture-plain-glitter-wallpaper-silver-m95566-p2591-9085_medium.jpg');");
		Scene с3Borovoe = new Scene(mngrid53Borovoe, 560, 560);
		canсel33Borovoe.setOnAction(event -> primaryWindow.setScene(с3Borovoe));
		vcancel33Borovoe.setOnAction(event -> primaryWindow.setScene(с3Borovoe));
		buttonBorovoe.setOnAction(event -> primaryWindow.setScene(с3Borovoe));
		vnextBorovoe.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				GridPane vd = new GridPane();
				string = enterName1.getText().toUpperCase();
				Text cc = new Text("\t" + string + ",");
				Text c1 = new Text("\n\tyou did it !!!");
				Text cc1 = new Text();
				VBox vc = new VBox();
				Button vc1 = new Button("Try again");
				Image imgAG = new Image(
						"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/View-refresh_Gion_simple.svg.png");
				ImageView uploadViewAG = new ImageView(imgAG);
				uploadViewAG.setFitWidth(30);
				uploadViewAG.setFitHeight(30);
				vc1.setGraphic(uploadViewAG);
				vc.getChildren().add(vc1);
				vc.setPadding(new Insets(0, 20, 50, 250));
				vc1.setOnAction(e -> primaryWindow.setScene(scene1));

				VBox cv = new VBox();
				cv.getChildren().addAll(cc, c1, cc1);
				cc.setFill(Color.GOLD);
				c1.setFill(Color.GOLD);
				cc1.setFill(Color.BLACK);
				vd.setStyle(
						"-fx-background-image: url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/0_c5883_e9e85875_XL.gif')");
				cc.setFont(Font.font("Bodoni MT Black", 50));
				c1.setFont(Font.font("Bodoni MT Black", 50));
				vc1.setFont(Font.font("Bodoni MT Black", 24));

				vd.setPadding(new Insets(100, 50, 70, 100));
				vd.add(cv, 5, 3);
				vd.add(vc, 5, 5);

				Scene vse = new Scene(vd, 650, 406);
				primaryWindow.setScene(vse);
			}
		});

		/*
		 * Button tau
		 */
		// load puzzle image
		Image imageTau = new Image(getClass().getResourceAsStream("танири.jpg"));
		// ImageView image= new ImageView(image1);
		int numOfColTau = (int) (imageTau.getWidth() / Piece.SIZE);
		int numOfRowsTau = (int) (imageTau.getHeight() / Piece.SIZE);
		// create desk
		final Desk deskTau = new Desk(numOfColTau, numOfRowsTau);
		// create puzzle pieces
		final List<Piece> piecesTau = new ArrayList<Piece>();
		for (int col = 0; col < numOfColTau; col++) {
			for (int row = 0; row < numOfRowsTau; row++) {
				int x = col * Piece.SIZE;
				int y = row * Piece.SIZE;

				final Piece piece = new Piece(imageTau, x, y, row > 0, col > 0, row < numOfRowsTau - 1,
						col < numOfColTau - 1, deskTau.getWidth(), deskTau.getHeight());

				piecesTau.add(piece);
			}
		}
		deskTau.getChildren().addAll(piecesTau);
		// create button box
		Button shuffleButtTau = new Button("Shuffle");
		shuffleButtTau.setStyle("-fx-font-size: 2em;-fx-background-color:gray");
		shuffleButtTau.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : piecesTau) {
					piece.setActive();
					double shuffleX = Math.random() * (deskTau.getWidth() - Piece.SIZE + 48f) - 24f
							- piece.getCorrectX();
					double shuffleY = Math.random() * (deskTau.getHeight() - Piece.SIZE + 30f) - 15f
							- piece.getCorrectY();
					timeline.getKeyFrames()
							.add(new KeyFrame(Duration.seconds(1), new KeyValue(piece.translateXProperty(), shuffleX),
									new KeyValue(piece.translateYProperty(), shuffleY)));
				}
				timeline.playFromStart();
			}
		});

		/*
		 * This scene has menu file: file, edit,help
		 * 
		 */

		MenuBar menuTau = new MenuBar();
		menuTau.setStyle("-fx-background-color: gray;");
		Menu fileTau = new Menu("File");
		Menu editTau = new Menu("Edit");
		Menu helpTau = new Menu("Help");
		menuTau.setMinSize(740, 50);
		menuTau.setStyle("-fx-font-size:25");

		// Adding images
		Image imgTau = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/icon.png");
		ImageView uploadViewTau = new ImageView(imgTau);
		uploadViewTau.setFitWidth(30);
		uploadViewTau.setFitHeight(30);
		fileTau.setGraphic(uploadViewTau);

		// Adding images
		Image imageTau1 = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/Actions-help-about-icon.png");
		ImageView uploadVwTau = new ImageView(imageTau1);
		uploadVwTau.setFitWidth(30);
		uploadVwTau.setFitHeight(30);
		helpTau.setGraphic(uploadView12Baik);

		// Adding images
		Image imgeTau = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/edit.png");
		ImageView upldViewTau = new ImageView(imgeTau);
		upldViewTau.setFitWidth(30);
		upldViewTau.setFitHeight(30);
		editTau.setGraphic(upldViewTau);

		MenuItem exitTau = new MenuItem("Exit");
		MenuItem solutionTau = new MenuItem("About");

		exitTau.setOnAction(e -> System.exit(0));

		fileTau.getItems().addAll(exitTau);
		// It is about for main
		GridPane gridTau = new GridPane();
		HBox hboxCancelTau = new HBox();
		Button canсelTau = new Button("Cancel");
		canсelTau.setFont(new Font("Arial", 20));

		hboxCancelTau.setPadding(new Insets(380, 20, 5, 410));
		hboxCancelTau.getChildren().add(canсelTau);
		gridTau.setStyle("-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/about.jpg')");
		gridTau.add(hboxCancelTau, 0, 0);
		Scene scene4by3Tau = new Scene(gridTau, 552, 434);// scne2-for about

		solutionTau.setOnAction(e -> primaryWindow.setScene(scene4by3Tau));

		BorderPane bp4by3Tau = new BorderPane();
		bp4by3Tau.setTop(menuTau);
		bp4by3Tau.setMinSize(200, 100);

		MenuItem solveButtonTau = new MenuItem("Solution");
		solveButtonTau.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : piecesTau) {
					piece.setInactive();
					timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1),
							new KeyValue(piece.translateXProperty(), 0), new KeyValue(piece.translateYProperty(), 0)));
				}
				timeline.playFromStart();
			}
		});

		helpTau.getItems().addAll(solveButtonTau, solutionTau);
		menuTau.getMenus().addAll(fileTau, helpTau);
		/*
		 * THIS IS SCENE WHICH WILL GIVE US INFO NEXT AND CANCEL BUTTONS
		 */

		GridPane gridOfFinishGameTau = new GridPane();
		HBox vInfTau = new HBox();
		vInfTau.setPadding(new Insets(140, 140, 10, 180));

		HBox forVnextAndCancelTau = new HBox();
		forVnextAndCancelTau.setPadding(new Insets(250, 150, 0, 30));
		Button vnextTau = new Button("Next");
		vnextTau.setMinSize(120, 35);
		vnextTau.setAlignment(Pos.BOTTOM_RIGHT);

		// Adding images FOR BUTTON NEXT
		Image imageForNextTau = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/green-play-button-icon_228230.png");
		ImageView uploadViewimgForNext1Tau = new ImageView(imageForNextTau);
		uploadViewimgForNext1Tau.setFitWidth(35);
		uploadViewimgForNext1Tau.setFitHeight(45);
		vnextTau.setGraphic(uploadViewimgForNext1Tau);
		vnextTau.setFont(new Font("Arial", 20));
		HBox forCancel1Tau = new HBox();
		forCancel1Tau.setPadding(new Insets(250, 50, 0, -150));

		Button vcancel1Tau = new Button("Back");
		vcancel1Tau.setMinSize(120, 35);
		vcancel1Tau.setAlignment(Pos.BOTTOM_LEFT);
		vcancel1Tau.setFont(new Font("Arial", 20));

		// Adding images FOR BUTTON cancel
		Image imageForCancel1Tau = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/Previous-Button-PNG-Image.png");
		ImageView uploadViewimgForCancel1Tau = new ImageView(imageForCancel1Tau);
		uploadViewimgForCancel1Tau.setFitWidth(35);
		uploadViewimgForCancel1Tau.setFitHeight(45);
		vcancel1Tau.setGraphic(uploadViewimgForCancel1Tau);
		forCancel1Tau.getChildren().add(vcancel1Tau);

		forVnextAndCancelTau.getChildren().addAll(vnextTau);
		Button infTau = new Button(
				"Khan Tengri\n It is the highest point\n in Kazakhstan.\nKhan Tangiri is a\npyramidal peak in the \nTien Shan in the \nTengri-Tag range on \nthe border");
		infTau.setFont(Font.font("imprint MT Shadow", FontWeight.BOLD, FontPosture.REGULAR, 25));
		infTau.setTextFill(linearGradient);
		infTau.setMinSize(300, 300);
		vInfTau.getChildren().addAll(forCancel1Tau, infTau, forVnextAndCancelTau);

		// inf.setMinSize(180, 80);
		infTau.setStyle("-fx-background-radius: 40, 40, 40, 40;");
		gridOfFinishGameTau.add(vInfTau, 0, 0);
		gridOfFinishGameTau.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/PuzzleGame/congratulazioni-gif-congratulations-glitter-611.gif');-fx-background-repeat:stretch;-fx-background-position: bottom ; -fx-background-color:beige");

		Scene finishGameeTau = new Scene(gridOfFinishGameTau, 660, 620);

		Button finishGameTau = new Button("Finish");
		finishGameTau.setFont(new Font("Times New Roman", 30)); // www.
		finishGameTau.setStyle("-fx-background-color:gray");// www.
		finishGameTau.setAlignment(Pos.BOTTOM_RIGHT);
		finishGameTau.setOnAction(e -> primaryWindow.setScene(finishGameeTau));

		HBox buttonBoxTau = new HBox(8);
		buttonBoxTau.getChildren().add(finishGameTau);
		buttonBoxTau.setPadding(new Insets(0, 0, 0, 220));
		HBox buttonBoxTau1 = new HBox();
		buttonBoxTau1.getChildren().addAll(shuffleButtTau, buttonBoxTau);

		// create vbox for desk and buttons
		VBox vboxTau = new VBox(10);
		vboxTau.getChildren().addAll(bp4by3Tau, deskTau, buttonBoxTau1);
		vboxTau.setPadding(new Insets(15, 24, 15, 24));
		GridPane mngridTau = new GridPane();// www.
		mngridTau.add(vboxTau, 0, 0);
		mngridTau.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/milano-texture-plain-glitter-wallpaper-silver-m95566-p2591-9085_medium.jpg');");

		Scene c4by3Tau = new Scene(mngridTau, 560, 560);
		canсelTau.setOnAction(event -> primaryWindow.setScene(c4by3Tau));
		vcancel1Tau.setOnAction(event -> primaryWindow.setScene(c4by3Tau));
		buttonTau.setOnAction(event -> primaryWindow.setScene(c4by3Tau));

		vnextTau.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				GridPane vd = new GridPane();
				string = enterName1.getText().toUpperCase();
				Text cc = new Text("\t" + string + ",");
				Text c1 = new Text("\n\tyou did it !!!");
				Text cc1 = new Text();
				VBox vc = new VBox();
				Button vc1 = new Button("Try again");
				Image imgAG = new Image(
						"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/View-refresh_Gion_simple.svg.png");
				ImageView uploadViewAG = new ImageView(imgAG);
				uploadViewAG.setFitWidth(30);
				uploadViewAG.setFitHeight(30);
				vc1.setGraphic(uploadViewAG);
				vc.getChildren().add(vc1);
				vc.setPadding(new Insets(0, 20, 50, 250));
				vc1.setOnAction(e -> primaryWindow.setScene(scene1));

				VBox cv = new VBox();
				cv.getChildren().addAll(cc, c1, cc1);
				cc.setFill(Color.GOLD);
				c1.setFill(Color.GOLD);
				cc1.setFill(Color.BLACK);
				vd.setStyle(
						"-fx-background-image: url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/0_c5883_e9e85875_XL.gif')");
				cc.setFont(Font.font("Bodoni MT Black", 50));
				c1.setFont(Font.font("Bodoni MT Black", 50));
				vc1.setFont(Font.font("Bodoni MT Black", 24));

				vd.setPadding(new Insets(100, 50, 70, 100));
				vd.add(cv, 5, 3);
				vd.add(vc, 5, 5);

				Scene vse = new Scene(vd, 650, 406);
				primaryWindow.setScene(vse);
			}
		});
		/*
		 * Button iassaui
		 * 
		 */
		// load puzzle image
		Image imageIassaui = new Image(getClass().getResourceAsStream("йассауи.jpg"));
		// ImageView image= new ImageView(image1);
		int numOfColIassaui = (int) (imageIassaui.getWidth() / Piece.SIZE);
		int numOfRowsIassaui = (int) (imageIassaui.getHeight() / Piece.SIZE);

		// create desk
		final Desk deskIassaui = new Desk(numOfColIassaui, numOfRowsIassaui);
		// create puzzle pieces
		final List<Piece> pieceIassaui = new ArrayList<Piece>();
		for (int col = 0; col < numOfColIassaui; col++) {
			for (int row = 0; row < numOfRowsIassaui; row++) {
				int x = col * Piece.SIZE;
				int y = row * Piece.SIZE;

				final Piece piece = new Piece(imageIassaui, x, y, row > 0, col > 0, row < numOfRowsIassaui - 1,
						col < numOfColIassaui - 1, deskIassaui.getWidth(), deskIassaui.getHeight());

				pieceIassaui.add(piece);
			}
		}
		deskIassaui.getChildren().addAll(pieceIassaui);
		// create button box
		Button shuffleButtonIassaui = new Button("Shuffle");
		// shuffleButton.setStyle("-fx-background-color:gray");
		shuffleButtonIassaui.setStyle("-fx-font-size: 2em;-fx-background-color:gray");
		shuffleButtonIassaui.setOnAction(e -> {
			if (timeline != null) {
				timeline.stop();
			}
			timeline = new Timeline();
			for (final Piece piece : pieceIassaui) {
				piece.setActive();
				double shuffleX = Math.random() * (deskIassaui.getWidth() - Piece.SIZE + 48f) - 24f
						- piece.getCorrectX();
				double shuffleY = Math.random() * (deskIassaui.getHeight() - Piece.SIZE + 30f) - 15f
						- piece.getCorrectY();
				timeline.getKeyFrames()
						.add(new KeyFrame(Duration.seconds(1), new KeyValue(piece.translateXProperty(), shuffleX),
								new KeyValue(piece.translateYProperty(), shuffleY)));
			}
			timeline.playFromStart();
		});

		/*
		 * This scene has menu file: file, edit,help
		 */

		MenuBar menuIassaui = new MenuBar();
		menuIassaui.setStyle("-fx-background-color: gray;");
		Menu fileIassaui = new Menu("File");
		Menu editIassaui = new Menu("Edit");
		Menu helpIassaui = new Menu("Help");
		menuIassaui.setMinSize(740, 50);
		menuIassaui.setStyle("-fx-font-size:25");

		// Adding images
		Image imgIassaui = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/icon.png");
		ImageView uploadViewIassaui = new ImageView(imgIassaui);
		uploadViewIassaui.setFitWidth(30);
		uploadViewIassaui.setFitHeight(30);
		fileIassaui.setGraphic(uploadViewIassaui);

		// Adding images
		Image imageIassaui1 = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/Actions-help-about-icon.png");
		ImageView uploadViewIas = new ImageView(imageIassaui1);
		uploadViewIas.setFitWidth(30);
		uploadViewIas.setFitHeight(30);
		helpIassaui.setGraphic(uploadView12Baik);

		// Adding images
		Image imgeIas = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/edit.png");
		ImageView upldViewIassaui = new ImageView(imgeIas);
		upldViewIassaui.setFitWidth(30);
		upldViewIassaui.setFitHeight(30);
		editIassaui.setGraphic(upldViewIassaui);
		MenuItem exitIassaui = new MenuItem("Exit");
		MenuItem solutionIassaui = new MenuItem("About");

		exitIassaui.setOnAction(event -> System.exit(0));

		fileIassaui.getItems().addAll(exitIassaui);
		// It is about for main
		GridPane gridIassaui = new GridPane();
		HBox hboxCancelIas = new HBox();
		Button canсelIassaui = new Button("Cancel");
		canсelIassaui.setFont(new Font("Arial", 20));

		hboxCancelIas.setPadding(new Insets(380, 20, 5, 410));
		hboxCancelIas.getChildren().add(canсelIassaui);
		gridIassaui
				.setStyle("-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/about.jpg')");
		gridIassaui.add(hboxCancelIas, 0, 0);
		Scene scene4by3Ias = new Scene(gridIassaui, 552, 434);// scne2-for about

		solutionIassaui.setOnAction(e -> primaryWindow.setScene(scene4by3Ias));
		BorderPane bp4by3ias = new BorderPane();
		bp4by3ias.setTop(menuIassaui);
		bp4by3ias.setMinSize(200, 100);

		MenuItem solveButtonIas = new MenuItem("Solution");
		solveButtonIas.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : pieceIassaui) {
					piece.setInactive();
					timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1),
							new KeyValue(piece.translateXProperty(), 0), new KeyValue(piece.translateYProperty(), 0)));
				}
				timeline.playFromStart();
			}
		});

		helpIassaui.getItems().addAll(solveButtonIas, solutionIassaui);
		menuIassaui.getMenus().addAll(fileIassaui, helpIassaui);
		/*
		 * THIS IS SCENE WHICH WILL GIVE US INFO NEXT AND CANCEL BUTTONS
		 */

		GridPane gridOfFinishGameias = new GridPane();
		HBox vInfias = new HBox();
		vInfias.setPadding(new Insets(140, 140, 10, 180));

		HBox forVnextAndCancelias = new HBox();
		forVnextAndCancelias.setPadding(new Insets(250, 150, 0, 30));
		Button vnextIas = new Button("Next");
		vnextIas.setMinSize(120, 35);
		vnextIas.setAlignment(Pos.BOTTOM_RIGHT);

		// Adding images FOR BUTTON NEXT
		Image imageForNextIas = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/green-play-button-icon_228230.png");
		ImageView uploadViewimgForNextIas = new ImageView(imageForNextIas);
		uploadViewimgForNextIas.setFitWidth(35);
		uploadViewimgForNextIas.setFitHeight(45);
		vnextIas.setGraphic(uploadViewimgForNextIas);
		vnextIas.setFont(new Font("Arial", 20));
		HBox forCancelIas = new HBox();
		forCancelIas.setPadding(new Insets(250, 50, 0, -150));
		Button vcancelIas = new Button("Back");
		vcancelIas.setMinSize(120, 35);
		vcancelIas.setAlignment(Pos.BOTTOM_LEFT);
		//
		vcancelIas.setFont(new Font("Arial", 20));
		// Adding images FOR BUTTON cancel
		Image imageForCancelIas = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/Previous-Button-PNG-Image.png");
		ImageView uploadViewimgForCancel2Ias = new ImageView(imageForCancelIas);
		uploadViewimgForCancel2Ias.setFitWidth(35);
		uploadViewimgForCancel2Ias.setFitHeight(45);
		vcancelIas.setGraphic(uploadViewimgForCancel2Ias);
		forCancelIas.getChildren().add(vcancelIas);

		forVnextAndCancelias.getChildren().addAll(vnextIas);
		Button infIas = new Button(
				"Mausoleum of Khoja \n  Ahmed Yasawi\n(Turkistan)\nThe mausoleum has\n one of the largest brick \ndomes in Central Asia.\nThe dome for Muslims \nwas a symbol of unity\n and hospitality");
		infIas.setFont(Font.font("imprint MT Shadow", FontWeight.BOLD, FontPosture.REGULAR, 25));
		infIas.setTextFill(linearGradient);
		infIas.setMinSize(320, 300);
		vInfias.getChildren().addAll(forCancelIas, infIas, forVnextAndCancelias);

		infIas.setStyle("-fx-background-radius: 40, 40, 40, 40;");
		gridOfFinishGameias.add(vInfias, 0, 0);
		gridOfFinishGameias.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/PuzzleGame/congratulazioni-gif-congratulations-glitter-611.gif');-fx-background-repeat:stretch;-fx-background-position: bottom ; -fx-background-color:beige");

		Scene finishGameeIas = new Scene(gridOfFinishGameias, 690, 620);

		Button finishGameIas = new Button("Finish");
		finishGameIas.setFont(new Font("Times New Roman", 30)); // www.
		finishGameIas.setStyle("-fx-background-color:gray");// www.
		finishGameIas.setAlignment(Pos.BOTTOM_RIGHT);

		finishGameIas.setOnAction(e -> primaryWindow.setScene(finishGameeIas));
		HBox buttonBoxIas = new HBox(8);
		buttonBoxIas.getChildren().add(finishGameIas);
		buttonBoxIas.setPadding(new Insets(0, 0, 0, 220));
		HBox buttonBoxIassaui1 = new HBox();
		buttonBoxIassaui1.getChildren().addAll(shuffleButtonIassaui, buttonBoxIas);

		// create vbox for desk and buttons
		VBox vboxIas = new VBox(10);
		vboxIas.getChildren().addAll(bp4by3ias, deskIassaui, buttonBoxIassaui1);
		vboxIas.setPadding(new Insets(15, 24, 15, 24));
		GridPane mngridIassaui = new GridPane();// www.
		mngridIassaui.add(vboxIas, 0, 0);
		mngridIassaui.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/milano-texture-plain-glitter-wallpaper-silver-m95566-p2591-9085_medium.jpg');");

		Scene c4by3Iassaui = new Scene(mngridIassaui, 560, 560);
		canсelIassaui.setOnAction(event -> primaryWindow.setScene(c4by3Iassaui));
		vcancelIas.setOnAction(event -> primaryWindow.setScene(c4by3Iassaui));
		buttonIassaui.setOnAction(event -> primaryWindow.setScene(c4by3Iassaui));

		vnextIas.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				GridPane vd = new GridPane();
				string = enterName1.getText().toUpperCase();
				Text cc = new Text("\t " + string + ",");
				Text c1 = new Text("\n\tyou did it !!!");
				Text cc1 = new Text();
				VBox vc = new VBox();
				Button vc1 = new Button("Try again");
				Image imgAG = new Image(
						"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/View-refresh_Gion_simple.svg.png");
				ImageView uploadViewAG = new ImageView(imgAG);
				uploadViewAG.setFitWidth(30);
				uploadViewAG.setFitHeight(30);
				vc1.setGraphic(uploadViewAG);
				vc.getChildren().add(vc1);
				vc.setPadding(new Insets(0, 20, 50, 250));
				vc1.setOnAction(e -> primaryWindow.setScene(scene1));

				VBox cv = new VBox();
				cv.getChildren().addAll(cc, c1, cc1);
				cc.setFill(Color.GOLD);
				c1.setFill(Color.GOLD);
				cc1.setFill(Color.BLACK);
				vd.setStyle(
						"-fx-background-image: url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/0_c5883_e9e85875_XL.gif')");
				cc.setFont(Font.font("Bodoni MT Black", 50));
				c1.setFont(Font.font("Bodoni MT Black", 50));
				vc1.setFont(Font.font("Bodoni MT Black", 24));

				vd.setPadding(new Insets(100, 50, 70, 100));
				vd.add(cv, 5, 3);
				vd.add(vc, 5, 5);

				Scene vse = new Scene(vd, 650, 406);
				primaryWindow.setScene(vse);
			}
		});
		// for button dif3
		HBox hbKZ3 = new HBox();
		ImageView imageViewCharyn = new ImageView(new Image(getClass().getResourceAsStream("чарын.jpg")));
		imageViewCharyn.setFitWidth(230);
		imageViewCharyn.setFitHeight(180);
		Button buttonCharyn = new Button("", imageViewCharyn);
		buttonCharyn.setPrefSize(230, 180);

		ImageView imageViewKaiyndy = new ImageView(new Image(getClass().getResourceAsStream("каинды.jpg")));
		imageViewKaiyndy.setFitHeight(180);
		imageViewKaiyndy.setFitWidth(230);
		Button buttonKaiyndy = new Button("", imageViewKaiyndy);
		buttonKaiyndy.setPrefSize(230, 180);

		ImageView imageViewBaiterek = new ImageView(new Image(getClass().getResourceAsStream("байтерек.jpg")));
		imageViewBaiterek.setFitWidth(230);
		imageViewBaiterek.setFitHeight(180);
		Button buttonBaiterek = new Button("", imageViewBaiterek);
		buttonBaiterek.setPrefSize(230, 180);

		GridPane gridPaneOfKaz3 = new GridPane();
		gridPaneOfKaz3.add(buttonCharyn, 0, 0);
		gridPaneOfKaz3.add(buttonKaiyndy, 0, 1);
		gridPaneOfKaz3.add(buttonBaiterek, 0, 2);
		gridPaneOfKaz3.setAlignment(Pos.TOP_CENTER);
		gridPaneOfKaz3.setVgap(10);
		gridPaneOfKaz3.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/73584f85887791e.jpg')");
		Scene scene3by3KZ1 = new Scene(gridPaneOfKaz3, 645, 600);
		// al of buttindif1
		butLev3.setOnAction(event -> primaryWindow.setScene(scene3by3KZ1));

		// load puzzle image
		Image imageCharyn = new Image(getClass().getResourceAsStream("чарын.jpg"));
		int numOfColumns2Charyn = (int) (imageCharyn.getWidth() / Piece.SIZE);
		int numOfRows2Charyn = (int) (imageCharyn.getHeight() / Piece.SIZE);
		// create desk
		final Desk desk2Charyn = new Desk(numOfColumns2Charyn, numOfRows2Charyn);
		// create puzzle pieces
		final List<Piece> pieces2Charyn = new ArrayList<Piece>();
		for (int col = 0; col < numOfColumns2Charyn; col++) {
			for (int row = 0; row < numOfRows2Charyn; row++) {
				int x = col * Piece.SIZE;
				int y = row * Piece.SIZE;
				final Piece piece = new Piece(imageCharyn, x, y, row > 0, col > 0, row < numOfRows2Charyn - 1,
						col < numOfColumns2Charyn - 1, desk2Charyn.getWidth(), desk2Charyn.getHeight());
				pieces2Charyn.add(piece);
			}
		}
		desk2Charyn.getChildren().addAll(pieces2Charyn);
		// create button box
		Button shuffleButton2Charyn = new Button("Shuffle");
		shuffleButton2Charyn.setStyle("-fx-font-size: 2em;-fx-background-color:gray");
		shuffleButton2Charyn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : pieces2Charyn) {
					piece.setActive();
					double shuffleX = Math.random() * (desk2Charyn.getWidth() - Piece.SIZE + 48f) - 24f
							- piece.getCorrectX();
					double shuffleY = Math.random() * (desk2Charyn.getHeight() - Piece.SIZE + 30f) - 15f
							- piece.getCorrectY();
					timeline.getKeyFrames()
							.add(new KeyFrame(Duration.seconds(1), new KeyValue(piece.translateXProperty(), shuffleX),
									new KeyValue(piece.translateYProperty(), shuffleY)));
				}
				timeline.playFromStart();
			}
		});
		// This scene has menu file: file, edit,help
		MenuBar menuCharyn2 = new MenuBar();
		menuCharyn2.setStyle("-fx-background-color: gray;");
		Menu fileCharyn2 = new Menu("File");
		Menu editCharyn2 = new Menu("Edit");
		Menu helpCharyn2 = new Menu("Help");
		menuCharyn2.setMinSize(740, 50);
		menuCharyn2.setStyle("-fx-font-size:25");

		// Adding images
		Image imgCharyn21 = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/icon.png");
		ImageView uploadViewCharyn2 = new ImageView(imgCharyn21);
		uploadViewCharyn2.setFitWidth(30);
		uploadViewCharyn2.setFitHeight(30);
		fileCharyn2.setGraphic(uploadViewCharyn2);

		// Adding images
		Image imgCharyn22 = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/Actions-help-about-icon.png");
		ImageView uploadViewCharyn3 = new ImageView(imgCharyn22);
		uploadViewCharyn3.setFitWidth(30);
		uploadViewCharyn3.setFitHeight(30);
		helpCharyn2.setGraphic(uploadViewCharyn3);

		// Adding images
		Image imgCharyn33 = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/edit.png");
		ImageView uploadVieCharyn3 = new ImageView(imgCharyn33);
		uploadVieCharyn3.setFitWidth(30);
		uploadVieCharyn3.setFitHeight(30);
		editCharyn2.setGraphic(uploadVieCharyn3);

		MenuItem exitCharyn3 = new MenuItem("Exit");
		MenuItem solutionCharyn3 = new MenuItem("About");

		exitCharyn3.setOnAction(event -> System.exit(0));

		fileCharyn2.getItems().addAll(exitCharyn3);
		// It is about for main
		GridPane gridCharyn3 = new GridPane();
		HBox hboxCancelChar = new HBox();
		Button cancelCharyn3 = new Button("Cancel");
		cancelCharyn3.setFont(new Font("Arial", 20));

		hboxCancelChar.setPadding(new Insets(380, 20, 5, 410));
		hboxCancelChar.getChildren().add(cancelCharyn3);
		gridCharyn3
				.setStyle("-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/about.jpg')");
		gridCharyn3.add(hboxCancelChar, 0, 0);
		Scene sceneCharyn3 = new Scene(gridCharyn3, 552, 434);// scne2-for about
		solutionCharyn3.setOnAction(e -> primaryWindow.setScene(sceneCharyn3));

		BorderPane bpCharyn3 = new BorderPane();
		bpCharyn3.setTop(menuCharyn2);
		bpCharyn3.setMinSize(200, 100);

		MenuItem solveButtonCharyn3 = new MenuItem("Solution");
		solveButtonCharyn3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : pieces2Charyn) {
					piece.setInactive();
					timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1),
							new KeyValue(piece.translateXProperty(), 0), new KeyValue(piece.translateYProperty(), 0)));
				}
				timeline.playFromStart();
			}
		});

		helpCharyn2.getItems().addAll(solveButtonCharyn3, solutionCharyn3);
		menuCharyn2.getMenus().addAll(fileCharyn2, helpCharyn2);

		// THIS IS SCENE WHICH WILL GIVE US INFO NEXT AND CANCEL BUTTONS
		GridPane gridOfFinishGameCharyn3 = new GridPane();
		HBox vInfCharyn3 = new HBox();
		vInfCharyn3.setPadding(new Insets(140, 140, 10, 180));

		HBox forVnextAndCancelCharyn3 = new HBox();
		forVnextAndCancelCharyn3.setPadding(new Insets(250, 150, 0, 30));
		Button vnextCharyn3 = new Button("Next");
		vnextCharyn3.setMinSize(120, 35);
		vnextCharyn3.setAlignment(Pos.BOTTOM_RIGHT);

		// Adding images FOR BUTTON NEXT
		Image imageForNextCharyn3 = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/green-play-button-icon_228230.png");
		ImageView uploadViewimageForNextCharyn3 = new ImageView(imageForNextCharyn3);
		uploadViewimageForNextCharyn3.setFitWidth(35);
		uploadViewimageForNextCharyn3.setFitHeight(45);
		vnextCharyn3.setGraphic(uploadViewimageForNextCharyn3);
		vnextCharyn3.setFont(new Font("Arial", 20));
		HBox forCancelCharyn3 = new HBox();
		forCancelCharyn3.setPadding(new Insets(250, 50, 0, -150));

		Button vcancelCharyn3 = new Button("Back");
		vcancelCharyn3.setMinSize(120, 35);
		vcancelCharyn3.setAlignment(Pos.BOTTOM_LEFT);
		vcancelCharyn3.setFont(new Font("Arial", 20));

		// Adding images FOR BUTTON cancel
		Image imageForCancelCharyn3 = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/Previous-Button-PNG-Image.png");
		ImageView uploadViewimageForCancelch3 = new ImageView(imageForCancelCharyn3);
		uploadViewimageForCancelch3.setFitWidth(35);
		uploadViewimageForCancelch3.setFitHeight(45);
		vcancelCharyn3.setGraphic(uploadViewimageForCancelch3);
		forCancelCharyn3.getChildren().add(vcancelCharyn3);

		forVnextAndCancelCharyn3.getChildren().addAll(vnextCharyn3);
		Button infCh3 = new Button(
				"Charyn Canyon(Almaty)\nIt is a national park in\n KZ.The Canyon, with \nits thinly stratified \nred sedimentary rock, it \nis said to resemble \nthe Grand Canyon \n  in the US");
		infCh3.setFont(Font.font("imprint MT Shadow", FontWeight.BOLD, FontPosture.REGULAR, 25));
		infCh3.setTextFill(linearGradient);
		infCh3.setMinSize(300, 300);
		vInfCharyn3.getChildren().addAll(forCancelCharyn3, infCh3, forVnextAndCancelCharyn3);
		infCh3.setStyle("-fx-background-radius: 40, 40, 40, 40;");
		gridOfFinishGameCharyn3.add(vInfCharyn3, 0, 0);
		gridOfFinishGameCharyn3.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/PuzzleGame/congratulazioni-gif-congratulations-glitter-611.gif');-fx-background-repeat:stretch;-fx-background-position: bottom ; -fx-background-color:beige");

		Scene finishGameeCh3 = new Scene(gridOfFinishGameCharyn3, 660, 620);

		Button finishGameCh3 = new Button("Finish");
		finishGameCh3.setFont(new Font("Times New Roman", 30)); // www.
		finishGameCh3.setStyle("-fx-background-color:gray");// www.
		finishGameCh3.setAlignment(Pos.BOTTOM_RIGHT); //

		finishGameCh3.setOnAction(event -> primaryWindow.setScene(finishGameeCh3));
		HBox buttonBox1char3 = new HBox(8);
		buttonBox1char3.getChildren().add(finishGameCh3);
		buttonBox1char3.setPadding(new Insets(0, 0, 0, 220));
		HBox buttonBoxChar3 = new HBox();
		buttonBoxChar3.getChildren().addAll(shuffleButton2Charyn, buttonBox1char3);

		// create vbox for desk and buttons
		VBox vbox1Char3 = new VBox(10);
		vbox1Char3.getChildren().addAll(bpCharyn3, desk2Charyn, buttonBoxChar3);
		vbox1Char3.setPadding(new Insets(15, 24, 15, 24));
		GridPane mngridChar3 = new GridPane();// www.
		mngridChar3.add(vbox1Char3, 0, 0);
		mngridChar3.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/milano-texture-plain-glitter-wallpaper-silver-m95566-p2591-9085_medium.jpg');");

		Scene char3 = new Scene(mngridChar3, 660, 560);
		cancelCharyn3.setOnAction(event -> primaryWindow.setScene(char3));
		vcancelCharyn3.setOnAction(event -> primaryWindow.setScene(char3));
		buttonCharyn.setOnAction(event -> primaryWindow.setScene(char3));

		vnextCharyn3.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				GridPane vd = new GridPane();
				string = enterName1.getText().toUpperCase();
				Text cc = new Text("\t" + string + ",");
				Text c1 = new Text("\n\tyou did it !!!");
				Text cc1 = new Text();
				VBox vc = new VBox();
				Button vc1 = new Button("Try again");
				Image imgAG = new Image(
						"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/View-refresh_Gion_simple.svg.png");
				ImageView uploadViewAG = new ImageView(imgAG);
				uploadViewAG.setFitWidth(30);
				uploadViewAG.setFitHeight(30);
				vc1.setGraphic(uploadViewAG);
				vc.getChildren().add(vc1);
				vc.setPadding(new Insets(0, 20, 50, 250));
				vc1.setOnAction(e -> primaryWindow.setScene(scene1));

				VBox cv = new VBox();
				cv.getChildren().addAll(cc, c1, cc1);
				cc.setFill(Color.GOLD);
				c1.setFill(Color.GOLD);
				cc1.setFill(Color.BLACK);
				vd.setStyle(
						"-fx-background-image: url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/0_c5883_e9e85875_XL.gif')");
				cc.setFont(Font.font("Bodoni MT Black", 50));
				c1.setFont(Font.font("Bodoni MT Black", 50));
				vc1.setFont(Font.font("Bodoni MT Black", 24));

				vd.setPadding(new Insets(100, 50, 70, 100));
				vd.add(cv, 5, 3);
				vd.add(vc, 5, 5);

				Scene vse = new Scene(vd, 650, 406);
				primaryWindow.setScene(vse);
			}
		});

		// for button кайынды load puzzle image
		Image imageKaiyndy = new Image(getClass().getResourceAsStream("каинды.jpg"));
		int numOfColKaiyndy = (int) (imageKaiyndy.getWidth() / Piece.SIZE);
		int numOfRowsKaiyndy = (int) (imageKaiyndy.getHeight() / Piece.SIZE);
		// create desk
		final Desk deskKaiyndy = new Desk(numOfColKaiyndy, numOfRowsKaiyndy);
		// create puzzle pieces
		final List<Piece> pieceKaiyndy = new ArrayList<Piece>();
		for (int col = 0; col < numOfColKaiyndy; col++) {
			for (int row = 0; row < numOfRowsKaiyndy; row++) {
				int x = col * Piece.SIZE;
				int y = row * Piece.SIZE;
				final Piece piece = new Piece(imageKaiyndy, x, y, row > 0, col > 0, row < numOfRowsKaiyndy - 1,
						col < numOfColKaiyndy - 1, deskKaiyndy.getWidth(), deskKaiyndy.getHeight());
				pieceKaiyndy.add(piece);
			}
		}
		deskKaiyndy.getChildren().addAll(pieceKaiyndy);
		// create button box
		Button shuffleButtonKaiyndy = new Button("Shuffle");
		shuffleButtonKaiyndy.setStyle("-fx-font-size: 2em;-fx-background-color:gray");
		shuffleButtonKaiyndy.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : pieceKaiyndy) {
					piece.setActive();
					double shuffleX = Math.random() * (deskKaiyndy.getWidth() - Piece.SIZE + 48f) - 24f
							- piece.getCorrectX();
					double shuffleY = Math.random() * (deskKaiyndy.getHeight() - Piece.SIZE + 30f) - 15f
							- piece.getCorrectY();
					timeline.getKeyFrames()
							.add(new KeyFrame(Duration.seconds(1), new KeyValue(piece.translateXProperty(), shuffleX),
									new KeyValue(piece.translateYProperty(), shuffleY)));
				}
				timeline.playFromStart();
			}
		});
		// This scene has menu file: file, edit,help
		MenuBar menuKaiyndy = new MenuBar();
		menuKaiyndy.setStyle("-fx-background-color: gray;");
		Menu fileKaiyndy = new Menu("File");
		Menu editKaiyndy = new Menu("Edit");
		Menu helpKaiyndy = new Menu("Help");
		menuKaiyndy.setMinSize(740, 50);
		menuKaiyndy.setStyle("-fx-font-size:25");

		// Adding images
		Image imgKaiyndy = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/icon.png");
		ImageView uploadViewKaiyndy = new ImageView(imgKaiyndy);
		uploadViewKaiyndy.setFitWidth(30);
		uploadViewKaiyndy.setFitHeight(30);
		fileKaiyndy.setGraphic(uploadViewKaiyndy);

		// Adding images
		Image imageKaiyndy1 = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/Actions-help-about-icon.png");
		ImageView uploadViewKaiyndy1 = new ImageView(imageKaiyndy1);
		uploadViewKaiyndy1.setFitWidth(30);
		uploadViewKaiyndy1.setFitHeight(30);
		helpKaiyndy.setGraphic(uploadView12Baik);

		// Adding images
		Image imgeKaiyndy2 = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/edit.png");
		ImageView upldViewKaiyndy2 = new ImageView(imgeKaiyndy2);
		upldViewKaiyndy2.setFitWidth(30);
		upldViewKaiyndy2.setFitHeight(30);
		editKaiyndy.setGraphic(upldViewKaiyndy2);

		MenuItem exitKaiyndy = new MenuItem("Exit");
		MenuItem solutionKaiyndy = new MenuItem("About");
		exitKaiyndy.setOnAction(event -> System.exit(0));

		fileKaiyndy.getItems().addAll(exitKaiyndy);
		// It is about for main
		GridPane gridKaiyndy = new GridPane();
		HBox hboxCancelKaiyndy = new HBox();
		Button canсelKaiyndy = new Button("Cancel");
		canсelKaiyndy.setFont(new Font("Arial", 20));
		hboxCancelKaiyndy.setPadding(new Insets(380, 20, 5, 410));
		hboxCancelKaiyndy.getChildren().add(canсelKaiyndy);
		gridKaiyndy
				.setStyle("-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/about.jpg')");
		gridKaiyndy.add(hboxCancelKaiyndy, 0, 0);
		Scene scene5by3Kaiyndy = new Scene(gridKaiyndy, 552, 434);// scne2-for
																	// about

		solutionKaiyndy.setOnAction(event -> primaryWindow.setScene(scene5by3Kaiyndy));

		BorderPane bp5by3Kaiyndy = new BorderPane();
		bp5by3Kaiyndy.setTop(menuKaiyndy);
		bp5by3Kaiyndy.setMinSize(200, 100);

		MenuItem solveButtonKaiyndy = new MenuItem("Solution");
		solveButtonKaiyndy.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : pieceKaiyndy) {
					piece.setInactive();
					timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1),
							new KeyValue(piece.translateXProperty(), 0), new KeyValue(piece.translateYProperty(), 0)));
				}
				timeline.playFromStart();
			}
		});

		helpKaiyndy.getItems().addAll(solveButtonKaiyndy, solutionKaiyndy);
		menuKaiyndy.getMenus().addAll(fileKaiyndy, helpKaiyndy);

		// * THIS IS SCENE WHICH WILL GIVE US INFO NEXT AND CANCEL BUTTONS
		GridPane gridOfFinishGameKaiyndy = new GridPane();
		HBox vInfKaiyndy = new HBox();
		vInfKaiyndy.setPadding(new Insets(140, 140, 10, 180));

		HBox forVnextAndCancelKaiyndy = new HBox();
		forVnextAndCancelKaiyndy.setPadding(new Insets(250, 150, 0, 30));
		Button vnextKaiyndy = new Button("Next");
		vnextKaiyndy.setMinSize(120, 35);
		vnextKaiyndy.setAlignment(Pos.BOTTOM_RIGHT);

		// Adding images FOR BUTTON NEXT
		Image imageForNextKaiyndy = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/green-play-button-icon_228230.png");
		ImageView uploadViewimgForNextKaiyndy = new ImageView(imageForNextKaiyndy);
		uploadViewimgForNextKaiyndy.setFitWidth(35);
		uploadViewimgForNextKaiyndy.setFitHeight(45);
		vnextKaiyndy.setGraphic(uploadViewimgForNextKaiyndy);
		vnextKaiyndy.setFont(new Font("Arial", 20));
		HBox forCancelKaiyndy = new HBox();
		forCancelKaiyndy.setPadding(new Insets(250, 50, 0, -150));

		Button vcancelKaiyndy = new Button("Back");
		vcancelKaiyndy.setMinSize(120, 35);
		vcancelKaiyndy.setAlignment(Pos.BOTTOM_LEFT);
		vcancelKaiyndy.setFont(new Font("Arial", 20));

		// Adding images FOR BUTTON cancel
		Image imageForCancelKaiyndy = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/Previous-Button-PNG-Image.png");
		ImageView uploadViewimgForCancelKaiyndy = new ImageView(imageForCancelKaiyndy);
		uploadViewimgForCancelKaiyndy.setFitWidth(35);
		uploadViewimgForCancelKaiyndy.setFitHeight(45);
		vcancelKaiyndy.setGraphic(uploadViewimgForCancelKaiyndy);
		forCancelKaiyndy.getChildren().add(vcancelKaiyndy);

		forVnextAndCancelKaiyndy.getChildren().addAll(vnextKaiyndy);
		Button infKaiyndy = new Button(
				"Lake Kaindy(Almaty)\nThe lake was formed as\n the result of a major\n limestone landslide \nforming a natural dam. \nIt blocked the gorge \nand was filled by \nmountain river water.\nThis was  triggered \nby the 1911\n Kebin earthquake.");
		infKaiyndy.setFont(Font.font("imprint MT Shadow", FontWeight.BOLD, FontPosture.REGULAR, 25));
		infKaiyndy.setTextFill(linearGradient);
		infKaiyndy.setMinSize(310, 300);
		vInfKaiyndy.getChildren().addAll(forCancelKaiyndy, infKaiyndy, forVnextAndCancelKaiyndy);
		infKaiyndy.setStyle("-fx-background-radius: 40, 40, 40, 40;");
		gridOfFinishGameKaiyndy.add(vInfKaiyndy, 0, 0);
		gridOfFinishGameKaiyndy.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/PuzzleGame/congratulazioni-gif-congratulations-glitter-611.gif');-fx-background-repeat:stretch;-fx-background-position: bottom ; -fx-background-color: beige");
		Scene finishGameeKaiyndy = new Scene(gridOfFinishGameKaiyndy, 675, 640);

		Button finishGameKaiyndy = new Button("Finish");
		finishGameKaiyndy.setFont(new Font("Times New Roman", 30)); // www.
		finishGameKaiyndy.setStyle("-fx-background-color:gray");// www.
		finishGameKaiyndy.setAlignment(Pos.BOTTOM_RIGHT);
		finishGameKaiyndy.setOnAction(e -> primaryWindow.setScene(finishGameeKaiyndy));
		HBox buttonBoxKaiyndy = new HBox(8);
		buttonBoxKaiyndy.getChildren().add(finishGameKaiyndy);
		buttonBoxKaiyndy.setPadding(new Insets(0, 0, 0, 220));
		HBox buttonBox5Kaiyndy = new HBox();
		buttonBox5Kaiyndy.getChildren().addAll(shuffleButtonKaiyndy, buttonBoxKaiyndy);

		// create vbox for desk and buttons
		VBox vbox1Kaiyndy = new VBox(10);
		vbox1Kaiyndy.getChildren().addAll(bp5by3Kaiyndy, deskKaiyndy, buttonBox5Kaiyndy);
		vbox1Kaiyndy.setPadding(new Insets(15, 24, 15, 24));
		GridPane mngridKaiyndy = new GridPane();// www.
		mngridKaiyndy.add(vbox1Kaiyndy, 0, 0);
		mngridKaiyndy.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/milano-texture-plain-glitter-wallpaper-silver-m95566-p2591-9085_medium.jpg');");

		Scene c5by3Kaiyndy = new Scene(mngridKaiyndy, 660, 560);
		vcancelKaiyndy.setOnAction(event -> primaryWindow.setScene(c5by3Kaiyndy));
		canсelKaiyndy.setOnAction(event -> primaryWindow.setScene(c5by3Kaiyndy));
		buttonKaiyndy.setOnAction(event -> primaryWindow.setScene(c5by3Kaiyndy));

		vnextKaiyndy.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				GridPane vd = new GridPane();
				string = enterName1.getText().toUpperCase();
				Text cc = new Text("\t" + string + ",");
				Text c1 = new Text("\n\tyou did it !!!");
				Text cc1 = new Text();
				VBox vc = new VBox();
				Button vc1 = new Button("Try again");
				Image imgAG = new Image(
						"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/View-refresh_Gion_simple.svg.png");
				ImageView uploadViewAG = new ImageView(imgAG);
				uploadViewAG.setFitWidth(30);
				uploadViewAG.setFitHeight(30);
				vc1.setGraphic(uploadViewAG);
				vc.getChildren().add(vc1);
				vc.setPadding(new Insets(0, 20, 50, 250));
				vc1.setOnAction(e -> primaryWindow.setScene(scene1));

				VBox cv = new VBox();
				cv.getChildren().addAll(cc, c1, cc1);
				cc.setFill(Color.GOLD);
				c1.setFill(Color.GOLD);
				cc1.setFill(Color.BLACK);
				vd.setStyle(
						"-fx-background-image: url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/0_c5883_e9e85875_XL.gif')");
				cc.setFont(Font.font("Bodoni MT Black", 50));
				c1.setFont(Font.font("Bodoni MT Black", 50));
				vc1.setFont(Font.font("Bodoni MT Black", 24));
				vd.setPadding(new Insets(100, 50, 70, 100));
				vd.add(cv, 5, 3);
				vd.add(vc, 5, 5);
				Scene vse = new Scene(vd, 650, 406);
				primaryWindow.setScene(vse);
			}
		});
		// for button байтерек load puzzle image
		Image image33Baiterek = new Image(getClass().getResourceAsStream("байтерек.jpg"));
		int numOfColumns33Bait = (int) (image33Baiterek.getWidth() / Piece.SIZE);
		int numOfRows33Bait = (int) (image33Baiterek.getHeight() / Piece.SIZE);
		// create desk
		final Desk deskBaiterek = new Desk(numOfColumns33Bait, numOfRows33Bait);
		// create puzzle pieces
		final List<Piece> piecesBaiterek = new ArrayList<Piece>();
		for (int col = 0; col < numOfColumns33Bait; col++) {
			for (int row = 0; row < numOfRows33Bait; row++) {
				int x = col * Piece.SIZE;
				int y = row * Piece.SIZE;

				final Piece piece = new Piece(image33Baiterek, x, y, row > 0, col > 0, row < numOfRows33Bait - 1,
						col < numOfColumns33Bait - 1, deskBaiterek.getWidth(), deskBaiterek.getHeight());

				piecesBaiterek.add(piece);
			}
		}
		deskBaiterek.getChildren().addAll(piecesBaiterek);
		// create button box
		Button shuffleButtonBait = new Button("Shuffle");
		shuffleButtonBait.setStyle("-fx-font-size: 2em;-fx-background-color:gray");
		shuffleButtonBait.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : piecesBaiterek) {
					piece.setActive();
					double shuffleX = Math.random() * (deskBaiterek.getWidth() - Piece.SIZE + 48f) - 24f
							- piece.getCorrectX();
					double shuffleY = Math.random() * (deskBaiterek.getHeight() - Piece.SIZE + 30f) - 15f
							- piece.getCorrectY();
					timeline.getKeyFrames()
							.add(new KeyFrame(Duration.seconds(1), new KeyValue(piece.translateXProperty(), shuffleX),
									new KeyValue(piece.translateYProperty(), shuffleY)));
				}
				timeline.playFromStart();
			}
		});
		// This scene has menu file: file, edit,help
		MenuBar menuBaiterek = new MenuBar();
		menuBaiterek.setStyle("-fx-background-color: gray;");
		Menu fileBaiterek = new Menu("File");
		Menu editBaiterek = new Menu("Edit");
		Menu helpBaiterek = new Menu("Help");
		menuBaiterek.setMinSize(740, 50);
		menuBaiterek.setStyle("-fx-font-size:25");

		// Adding images
		Image imgBaiterek = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/icon.png");
		ImageView uploadViewBaiterek = new ImageView(imgBaiterek);
		uploadViewBaiterek.setFitWidth(30);
		uploadViewBaiterek.setFitHeight(30);
		fileBaiterek.setGraphic(uploadViewBaiterek);

		// Adding images
		Image image33Bait = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/Actions-help-about-icon.png");
		ImageView uploadView33Bait = new ImageView(image33Bait);
		uploadView33Bait.setFitWidth(30);
		uploadView33Bait.setFitHeight(30);
		helpBaiterek.setGraphic(uploadView12Baik);
		// Adding images
		Image imge33Baiter = new Image("file:///C:/Users/Asus/workspace/semestr2/src/Calculator/src/edit.png");
		ImageView upldView33Bait2 = new ImageView(imge33Baiter);
		upldView33Bait2.setFitWidth(30);
		upldView33Bait2.setFitHeight(30);
		editBaiterek.setGraphic(upldView33Bait2);
		MenuItem exit33bait = new MenuItem("Exit");
		MenuItem solution33Bait = new MenuItem("About");
		exit33bait.setOnAction(e -> System.exit(0));
		fileBaiterek.getItems().addAll(exit33bait);

		// It is about for main
		GridPane grid33Bait = new GridPane();
		HBox hboxCancelait = new HBox();
		Button canсel33Bait = new Button("Cancel");
		canсel33Bait.setFont(new Font("Arial", 20));
		hboxCancelait.setPadding(new Insets(380, 20, 5, 410));
		hboxCancelait.getChildren().add(canсel33Bait);
		grid33Bait
				.setStyle("-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/about.jpg')");
		grid33Bait.add(hboxCancelait, 0, 0);

		Scene scene3by3Bait = new Scene(grid33Bait, 552, 434);// scne2-for about
		solution33Bait.setOnAction(e -> primaryWindow.setScene(scene3by3Bait));

		BorderPane bp3by3Baiterek = new BorderPane();
		bp3by3Baiterek.setTop(menuBaiterek);
		bp3by3Baiterek.setMinSize(200, 100);

		MenuItem solveButton3by3Bait = new MenuItem("Solution");
		solveButton3by3Bait.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (timeline != null) {
					timeline.stop();
				}
				timeline = new Timeline();
				for (final Piece piece : piecesBaiterek) {
					piece.setInactive();
					timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1),
							new KeyValue(piece.translateXProperty(), 0), new KeyValue(piece.translateYProperty(), 0)));
				}
				timeline.playFromStart();
			}
		});

		helpBaiterek.getItems().addAll(solveButton3by3Bait, solution33Bait);
		menuBaiterek.getMenus().addAll(fileBaiterek, helpBaiterek);

		// THIS IS SCENE WHICH WILL GIVE US INFO NEXT AND CANCEL BUTTONS
		GridPane gridOfFinishGameBait = new GridPane();
		HBox vInfBaiterek = new HBox();
		vInfBaiterek.setPadding(new Insets(140, 140, 10, 180));
		HBox forVnextAndCancelBaiterek = new HBox();
		forVnextAndCancelBaiterek.setPadding(new Insets(250, 150, 0, 30));
		Button vnextBaiterek = new Button("Next");
		vnextBaiterek.setMinSize(120, 35);
		vnextBaiterek.setAlignment(Pos.BOTTOM_RIGHT);

		// Adding images FOR BUTTON NEXT
		Image imageForNextBaiterek = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/green-play-button-icon_228230.png");
		ImageView uploadViewimgForNextBaiterek = new ImageView(imageForNextBaiterek);
		uploadViewimgForNextBaiterek.setFitWidth(35);
		uploadViewimgForNextBaiterek.setFitHeight(45);
		vnextBaiterek.setGraphic(uploadViewimgForNextBaiterek);
		vnextBaiterek.setFont(new Font("Arial", 20));
		HBox forCancel33Bait = new HBox();
		forCancel33Bait.setPadding(new Insets(250, 50, 0, -150));
		Button vcancel33Baiterek = new Button("Back");
		vcancel33Baiterek.setMinSize(120, 35);
		vcancel33Baiterek.setAlignment(Pos.BOTTOM_LEFT);
		vcancel33Baiterek.setFont(new Font("Arial", 20));

		// Adding images FOR BUTTON cancel
		Image imageForCancel33Bait = new Image(
				"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/Previous-Button-PNG-Image.png");
		ImageView uploadViewimgForCancelBait = new ImageView(imageForCancel33Bait);
		uploadViewimgForCancelBait.setFitWidth(35);
		uploadViewimgForCancelBait.setFitHeight(45);
		vcancel33Baiterek.setGraphic(uploadViewimgForCancelBait);
		forCancel33Bait.getChildren().add(vcancel33Baiterek);
		forVnextAndCancelBaiterek.getChildren().addAll(vnextBaiterek);

		Button inf33Bait = new Button("Bayterek Tower\nThe monument is meant to \n"
				+ "embody a folktale about\n a mythical tree of life\n and a magic bird of\n happiness: the bird, named\n Samruk, had laid its\n egg in the crevice between\n two branches of a\n poplar tree.");
		inf33Bait.setFont(Font.font("imprint MT Shadow", FontWeight.BOLD, FontPosture.REGULAR, 25));
		inf33Bait.setTextFill(linearGradient);
		inf33Bait.setMinSize(360, 300);
		vInfBaiterek.getChildren().addAll(forCancel33Bait, inf33Bait, forVnextAndCancelBaiterek);
		inf33Bait.setStyle("-fx-background-radius: 40, 40, 40, 40;");
		gridOfFinishGameBait.add(vInfBaiterek, 0, 0);
		gridOfFinishGameBait.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/PuzzleGame/congratulazioni-gif-congratulations-glitter-611.gif');-fx-background-repeat:stretch;-fx-background-position: bottom ; -fx-background-color:beige");

		Scene finishGamee33Baiterek = new Scene(gridOfFinishGameBait, 730, 620);

		Button finishGame33Bait = new Button("Finish");
		finishGame33Bait.setFont(new Font("Times New Roman", 30)); // www.
		finishGame33Bait.setStyle("-fx-background-color:gray");// www.
		finishGame33Bait.setAlignment(Pos.BOTTOM_RIGHT);
		finishGame33Bait.setOnAction(e -> primaryWindow.setScene(finishGamee33Baiterek));
		HBox buttonBoxBaiterek = new HBox(8);
		buttonBoxBaiterek.getChildren().add(finishGame33Bait);
		buttonBoxBaiterek.setPadding(new Insets(0, 0, 0, 220));
		HBox buttonBox53Baiterek = new HBox();
		buttonBox53Baiterek.getChildren().addAll(shuffleButtonBait, buttonBoxBaiterek);

		// create vbox for desk and buttons
		VBox vbox1Baiterek = new VBox(10);
		vbox1Baiterek.getChildren().addAll(bp3by3Baiterek, deskBaiterek, buttonBox53Baiterek);
		vbox1Baiterek.setPadding(new Insets(15, 24, 15, 24));
		GridPane mngrid53Baiterek = new GridPane();// www.
		mngrid53Baiterek.add(vbox1Baiterek, 0, 0);
		mngrid53Baiterek.setStyle(
				"-fx-background-image:url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/milano-texture-plain-glitter-wallpaper-silver-m95566-p2591-9085_medium.jpg');");

		Scene с3Baiterek = new Scene(mngrid53Baiterek, 660, 560);
		canсel33Bait.setOnAction(event -> primaryWindow.setScene(с3Baiterek));
		vcancel33Baiterek.setOnAction(event -> primaryWindow.setScene(с3Baiterek));
		buttonBaiterek.setOnAction(event -> primaryWindow.setScene(с3Baiterek));

		vnextBaiterek.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				GridPane vd = new GridPane();
				string = enterName1.getText().toUpperCase();
				Text cc = new Text("\t" + string + ",");
				Text c1 = new Text("\n\tyou did it !!!");
				Text cc1 = new Text();
				VBox vc = new VBox();
				Button vc1 = new Button("Try again");
				Image imgAG = new Image(
						"file:///C:/Users/Asus/workspace/semestr2/src/Try/src/View-refresh_Gion_simple.svg.png");
				ImageView uploadViewAG = new ImageView(imgAG);
				uploadViewAG.setFitWidth(30);
				uploadViewAG.setFitHeight(30);
				vc1.setGraphic(uploadViewAG);
				vc.getChildren().add(vc1);
				vc.setPadding(new Insets(0, 20, 50, 250));
				vc1.setOnAction(e -> primaryWindow.setScene(scene1));

				VBox cv = new VBox();
				cv.getChildren().addAll(cc, c1, cc1);
				cc.setFill(Color.GOLD);
				c1.setFill(Color.GOLD);
				cc1.setFill(Color.BLACK);
				vd.setStyle(
						"-fx-background-image: url('file:///C:/Users/Asus/workspace/semestr2/src/Try/src/0_c5883_e9e85875_XL.gif')");
				cc.setFont(Font.font("Bodoni MT Black", 50));
				c1.setFont(Font.font("Bodoni MT Black", 50));
				vc1.setFont(Font.font("Bodoni MT Black", 24));

				vd.setPadding(new Insets(100, 50, 70, 100));
				vd.add(cv, 5, 3);
				vd.add(vc, 5, 5);

				Scene vse = new Scene(vd, 650, 406);
				primaryWindow.setScene(vse);
			}
		});
		/*
		 * ACTION LISTENER OF TEXTfIELD - 1
		 */
		enter1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				string = enterName.getText();
				if (string.isEmpty()) {
					Alert alert = new Alert(Alert.AlertType.INFORMATION);
					alert.setTitle("Information");
					alert.setHeaderText(null);
					alert.setContentText("Please, enter your name...");
					alert.showAndWait();
				} else
					primaryWindow.setScene(chooseDif);
			}
		});

		enter2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				string = enterName1.getText();
				if (string.isEmpty()) {
					Alert alert = new Alert(Alert.AlertType.INFORMATION);
					alert.setTitle("Information");
					alert.setHeaderText(null);
					alert.setContentText("Please, enter your name...");
					alert.showAndWait();
				} else
					primaryWindow.setScene(chooseDif2);
			}
		});
		section1.setOnAction(e -> primaryWindow.setScene(scene2));

		primaryWindow.setScene(scene);
		primaryWindow.show();
		primaryWindow.show();
	}

	@Override
	public void actionPerformed(java.awt.event.ActionEvent arg0) {
		// TODO Auto-generated method stub
	}
}
