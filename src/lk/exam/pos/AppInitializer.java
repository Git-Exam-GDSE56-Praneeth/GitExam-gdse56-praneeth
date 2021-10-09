package lk.exam.pos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @auther Praneeth Geethanjana <geethanjana10@gmail.com>
 * @Since 10/9/2021
 */
public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
       primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/CustomerSaveForm.fxml"))));
      // primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/ItemSaveForm.fxml"))));
        primaryStage.show();
        
      


    }
}
