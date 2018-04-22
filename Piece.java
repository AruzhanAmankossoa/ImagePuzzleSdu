/*
 * 
 * @author Aruzhan Amankossova
 * @e-mail: aru_-2000@mail.ru
 * @Description: This class represents a puzzle piece
 * */
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Parent;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
   /**
     * Node that represents a puzzle piece
    **/
public class Piece extends Parent{
        public  static final int SIZE = 100;//if you divide size of image(height,width) by this size 
                                            //then you can take size of puzzle (Eg.3x3,4x5)
        private final double correctX; //x and y coordinate of piece
        private final double correctY;
        //this attributes special for creating images like jigsaw 
        private final boolean hasTopTab;
        private final boolean hasLeftTab;
        private final boolean hasBottomTab;
        private final boolean hasRightTab;
        private double startDragX;
        private double startDragY;
        private Shape pieceStroke;
        private Shape pieceClip;
        private Point2D dragAnchor;
        //for loading image
        private ImageView imageView = new ImageView();                        
        //Parametric constructor 
        public  Piece(Image image, final double correctX, final double correctY,boolean topTab, boolean leftTab, boolean bottomTab, boolean rightTab,final double deskWidth, final double deskHeight) {
            this.correctX = correctX;
            this.correctY = correctY;
            this.hasTopTab = topTab;
            this.hasLeftTab = leftTab;
            this.hasBottomTab = bottomTab;
            this.hasRightTab = rightTab;
           
            // configure clip
            pieceClip = createPiece();
            pieceClip.setFill(Color.WHITE);
            pieceClip.setStroke(null);
            
            // adding  a stroke
            pieceStroke = createPiece();
            pieceStroke.setFill(null);
            pieceStroke.setStroke(Color.BLACK);
                                    
            // creating image view
            imageView.setImage(image);//setImage(image);
            imageView.setClip(pieceClip);
            setFocusTraversable(true);
            getChildren().addAll(imageView, pieceStroke);
           
            //it will  turn on caching so piece is fasr to draw when dragging
            setCache(true);
           
            // start in inactive state
            setInactive();
          
            // adding action  listeners to support dragging
            setOnMousePressed(new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    toFront();
                    startDragX = getTranslateX();
                    startDragY = getTranslateY();
                    dragAnchor = new Point2D(me.getSceneX(), me.getSceneY());
                }
            });
            setOnMouseReleased(new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    if (getTranslateX() < (10) && getTranslateX() > (- 10) &&
                        getTranslateY() < (10) && getTranslateY() > (- 10)) {
                        setTranslateX(0);
                        setTranslateY(0);
                        setInactive();
                    }
                }
            });
            setOnMouseDragged(new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    double newTranslateX = startDragX+ me.getSceneX() - dragAnchor.getX();
                    double newTranslateY = startDragY+ me.getSceneY() - dragAnchor.getY();
                    double minTranslateX = - 45f - correctX;
                    double maxTranslateX = (deskWidth - Piece.SIZE + 50f ) - correctX;
                    double minTranslateY = - 30f - correctY;
                    double maxTranslateY = (deskHeight - Piece.SIZE + 70f ) - correctY;
                    if ((newTranslateX> minTranslateX ) &&
                            (newTranslateX< maxTranslateX) &&
                            (newTranslateY> minTranslateY) &&
                            (newTranslateY< maxTranslateY)) {
                        setTranslateX(newTranslateX);
                        setTranslateY(newTranslateY);
                    }
                }
            });
        }

        //creating pieces like jigsaw
        private Shape createPiece() {
            Shape shape = createPieceRectangle();
            //Returns a new Shape which is created as a union of the specified input shapes.
            if (hasRightTab) {
                shape = Shape.union(shape,createPieceTab(69.5f, 0f, 10f, 17.5f, 50f, -12.5f, 11.5f,25f, 56.25f, -14f, 6.25f, 56.25f, 14f, 6.25f));
            }
            if (hasBottomTab) {
                shape = Shape.union(shape,createPieceTab(0f, 69.5f, 17.5f, 10f, -12.5f, 50f, 25f,11f, -14f, 56.25f, 6.25f, 14f, 56.25f, 6.25f));
            }
            //Returns a new Shape which is created by subtracting the specified second shape from the first shape.
            if (hasLeftTab) {
                shape = Shape.subtract(shape,createPieceTab(-31f, 0f, 10f, 17.5f, -50f, -12.5f, 11f,25f, -43.75f, -14f, 6.25f, -43.75f, 14f, 6.25f));
            }
            if (hasTopTab) {
                shape = Shape.subtract(shape,createPieceTab(0f, -31f, 17.5f, 10f, -12.5f, -50f, 25f,12.5f, -14f, -43.75f, 6.25f, 14f, -43.75f, 6.25f));
            }
            shape.setTranslateX(correctX);
            shape.setTranslateY(correctY);
            shape.setLayoutX(50f);
            shape.setLayoutY(50f);
            return shape;
        }

     //in this method we  Crop the image 
        private Rectangle createPieceRectangle() {
            Rectangle rec = new Rectangle();
            rec.setX(-50);//The x coordinate of the upper-left corner of the Rectangle
            rec.setY(-50);//The y coordinate of the upper-left corner of the Rectangle
            rec.setWidth(SIZE);//The width of the Rectangle
            rec.setHeight(SIZE);//The height of the Rectangle
            return rec;
        }

        private Shape createPieceTab(double eclipseCenterX, double eclipseCenterY, double eclipseRadiusX, double eclipseRadiusY,double rectangleX, double rectangleY, double rectangleWidth, double rectangleHeight,double circle1CenterX, double circle1CenterY, double circle1Radius,double circle2CenterX, double circle2CenterY, double circle2Radius) {
            Ellipse ellipse = new Ellipse(eclipseCenterX, eclipseCenterY, eclipseRadiusX, eclipseRadiusY);
            Rectangle rectsngle = new Rectangle(rectangleX, rectangleY, rectangleWidth, rectangleHeight);
            Shape tab = Shape.union(ellipse, rectsngle);
            Circle circle1 = new Circle(circle1CenterX, circle1CenterY, circle1Radius);
            tab = Shape.subtract(tab, circle1);
            Circle circle2 = new Circle(circle2CenterX, circle2CenterY, circle2Radius);
            tab = Shape.subtract(tab, circle2);
            return tab;
        }

        public void setActive() {
            setDisable(false);
            setEffect(new DropShadow());
            toFront();
        }

        public void setInactive() {
            setEffect(null);
            setDisable(true);
            toBack();
        }

        public double getCorrectX() { 
        	return correctX; 
        	}

        public double getCorrectY() { 
        	return correctY;
        	}    
}