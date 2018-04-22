
/*
 * @author:Aruzhan Amankossova
 * @email:aru_-2000@mail.ru
 * @Date:19.03.2018
 * @Venue:Kaskelen,st. Abylaikhan 7/1;
 * Description:This class represents the playing desktop where the puzzle pieces sit
 * */

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

public class Desk extends Pane {
	
	/*
	 * Node that represents the playing desktop where the puzzle pieces sit
	 */
	
	public Desk(int numOfColumns, int numOfRows) {
		setStyle("-fx-background-color: gray; " + "-fx-border-color: #464646; -fx-effect: innershadow( two-pass-box , rgba(0,0,0,0.8) , 15, 0.0 , 0 , 4 );");
		double DESK_WIDTH = Piece.SIZE * numOfColumns;
		double DESK_HEIGHT = Piece.SIZE * numOfRows;
		setPrefSize(DESK_WIDTH, DESK_HEIGHT);
		setMaxSize(DESK_WIDTH, DESK_HEIGHT);
		autosize();

		// creating path for lines
		Path grid = new Path();
		grid.setStroke(Color.rgb(70, 70, 70));
		getChildren().add(grid);
		
		// creating vertical lines
		for (int col = 0; col < numOfColumns - 1; col++) {
			grid.getElements().addAll(new MoveTo(Piece.SIZE + Piece.SIZE * col, 5),
					new LineTo(Piece.SIZE + Piece.SIZE * col, Piece.SIZE * numOfRows - 5));
		}
		// creating horizontal lines
		for (int row = 0; row < numOfRows - 1; row++) {
			grid.getElements().addAll(new MoveTo(5, Piece.SIZE + Piece.SIZE * row),
					new LineTo(Piece.SIZE * numOfColumns - 5, Piece.SIZE + Piece.SIZE * row));
		}			
	}

	
	
    @Override protected void layoutChildren() {}
}