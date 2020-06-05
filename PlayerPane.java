package blackjack;

import javafx.application.Application; import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane; import javafx.stage.Stage;

//03 Make a new class PlayerPane that is a subclass of HandPane.
// Add a Label(“Current Bet”)
// a Button(“Place Bet”)
// and two TextFields with the same dimensions as the previous TextFields,
public class PlayerPane extends HandPane {
    Label label3;
    TextField field3 = new TextField();
    TextField field4 = new TextField();
    Button button1 = new Button("Place Bet");

    public PlayerPane(String name) {
        super(name);

        // Create the labels and text fields
        label3 = new Label("Current Bet");
        label3.relocate(10, 90);
        label3.setPrefSize(100, 30);


        button1.relocate(10, 125);
        button1.setPrefSize(100, 30);

        field3.relocate(100, 90);
        field3.setPrefSize(200, 30);


        field4.relocate(100, 125);
        field4.setPrefSize(200, 30);

        innerPane.getChildren().addAll(label3,button1,field3,field4);

        //4 action event
        //When the player clicks the “Place Bet” button, have the contents of TextField 4 written into TextField 3
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                String t4 = field3.getText();
                field2.setText(t4);
            }
        };

        button1.setOnAction(event);

    }

//    public void HandPane(String title) {
//        Pane innerPane = new Pane();
//
//        // Set style
////        innerPane.setStyle("-fx-background-color: white; " +
////                "-fx-border-color: gray; " +
////                "-fx-padding: 4 4;");
//
//        // Create the labels
//        Label label3 = new Label("Current Bet");
//        label3.relocate(10, 90);
//        label3.setPrefSize(100, 30);
//
//        // Add the button
//        Button placeButton = new Button("Place Bet");
//        placeButton.relocate(10,125);
//        placeButton.setPrefSize(100, 30);
//
//        // Create the textFiles 3 - 4
//        TextField textFiles3 = new TextField();
//        textFiles3.relocate(120, 90);
//        textFiles3.setPrefSize(200, 30);
//
//        TextField textFiles4 = new TextField();
//        textFiles4.relocate(120, 125);
//        textFiles4.setPrefSize(200, 30);
//
//        // Add all components to the pane
//        innerPane.getChildren().addAll(label3, placeButton, textFiles3, textFiles4);
//
//        //04 When the player clicks the “Place Bet” button, have the contents of TextField 4 written into TextField 3.
//        placeButton.setOnAction(new EventHandler<ActionEvent>() {
//            public void handle(ActionEvent actionEvent) {
//                textFiles4.setText(textFiles3.getText());
//            }
//        });
//
//    }
}
