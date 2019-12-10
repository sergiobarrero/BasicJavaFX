package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class BlurController {
	
	@FXML
	private AnchorPane mypane;
	
	@FXML
    private ImageView imageView;   


	@FXML
    public void setblur() {           
             imageView.setEffect(new GaussianBlur(20));

    }
	public void setFocus() {           
        imageView.setEffect(new GaussianBlur(0));

}
	
	
	@FXML
	private void handleClose() {
		System.exit(0);
	}
	
	@FXML
	private void openStage() {
	
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("forest.fxml"));
			mypane = (AnchorPane) loader.load();
			Scene scene = new Scene(mypane);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
