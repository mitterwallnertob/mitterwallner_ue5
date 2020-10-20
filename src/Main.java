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

        EventHandler<MouseEvent> fc_conv = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {}
        };

        EventHandler<MouseEvent> cf_conv = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {}
        };

        Button c_f = new Button("°C  ->  °F");
        c_f.setPrefWidth(250);
        c_f.setMaxHeight(25);
        c_f.setStyle("-fx-font-weight: bold;" +
                "-fx-font-size: 20px;");
        root_list.add(c_f);

        Button f_c = new Button("°F  ->  °C");
        f_c.setPrefWidth(250);
        f_c.setMaxHeight(25);
        f_c.setStyle("-fx-font-weight: bold;" +
                "-fx-font-size: 20px;");
        root_list.add(f_c);

        GridPane gridPane = new GridPane();

        // adding buttons to the Gridpane
        gridPane.add(root,0,0);
        gridPane.add(c_f, 0, 1);
        gridPane.add(f_c, 0, 2);
        gridPane.setStyle("-fx-background-color: #d15415;");

        // spacing the buttons
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        Scene scene = new Scene (gridPane,600,400);
        st.setTitle("Temperature Converter v0.01");
        st.setScene(scene);
        st.getIcons().add(new Image("Icon.png"));
        st.show();
    }
}
