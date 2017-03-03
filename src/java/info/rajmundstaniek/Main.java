package info.rajmundstaniek;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.util.Optional;

import static info.rajmundstaniek.gui.SplashScreen.*;

public class Main extends Application {

    private Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception{
        //viewSplashScreen(3000, Style.FADE, Style.FADE);
        window = primaryStage;
        //TODO: add an icon
        //window.getIcons().add(Drawable.getImage(this.getClass(), Drawable.Drawables.ICON));

        Parent root = FXMLLoader.load(getClass().getResource("/layout/mainWindow.fxml"));
        primaryStage.setTitle("Text Changer");

        primaryStage.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void closeProgram() {
        Alert a = new Alert(Alert.AlertType.CONFIRMATION);
        a.setHeaderText("Confirm Exit");
        a.setContentText("There might be unsaved changes. Are you sure you want to close the application?");
        Button exitButton = (Button) a.getDialogPane().lookupButton(ButtonType.OK);
        exitButton.setText("Exit");
        Optional<ButtonType> closeResponse = a.showAndWait();
        if (closeResponse.isPresent()) {
            if (ButtonType.OK.equals(closeResponse.get())) {
                window.close();
            }
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
