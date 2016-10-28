package praktikum11;

public class javaf {
	
import javafx.scene.shape-Rectangle;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
	
	public class Main extends Application {
		@Override
		public void start(Stage primaryStage) throws Exception {
			Pane pane = new Pane();
			
			Rectangle kast = new Rectangle(100, 100, 300, 200);
			pane.getChildren().add(kast);
			
			Scene stseen = new Scene(pane, 600, 400);
			primaryStage.show();
			primaryStage.setScene(stseen);
		}
	}
}
