package src.app;

import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;

public class app extends Application {
    @Override
    public void start(Stage Stage) throws IOException {
        Stage stage2 = new Stage();
        stage2.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
