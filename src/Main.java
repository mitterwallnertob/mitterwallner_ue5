import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/*******************************
 * @class: Main
 * @author: Tobias Mitterwallner
 * @date: 15.10.2020
 ******************************/

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage st) throws Exception {

        VBox root = new VBox();
        ObservableList root_list = root.getChildren();

        Label l1 = new Label("Grad Celsius");
        l1.setStyle("-fx-font-size: 20px;" + "-fx-font-weight: bold;");
        root_list.add(l1);

        TextField txtf1 = new TextField();
        txtf1.setPromptText("Wert eingeben");
        txtf1.setPrefHeight(20);
        txtf1.setMaxWidth(250);
        txtf1.setStyle("-fx-font-size: 16px;");
        root_list.add(txtf1);

        Label l2 = new Label("Grad Fahrenheit");
        l2.setStyle("-fx-font-size: 20px;" + "-fx-font-weight: bold;");
        root_list.add(l2);

        TextField txtf2 = new TextField();
        txtf2.setPromptText("Wert eingeben");
        txtf2.setPrefHeight(20);
        txtf2.setMaxWidth(250);
        txtf2.setStyle("-fx-font-size: 16px;");
        root_list.add(txtf2);

        Scene scene = new Scene (root,600,400);
        st.setTitle("Temperature Converter v0.01");
        st.setScene(scene);
        st.getIcons().add(new Image("Icon.png"));
        st.show();
    }
}
