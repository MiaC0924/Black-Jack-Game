package blackjack;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

//1 HandPane as a subclass of Pane
public class HandPane extends Pane {
    Label label1;
    Label label2;
    TextField field1 = new TextField();
    TextField field2 = new TextField();
    Pane innerPane  = new Pane();

    public HandPane(String name){

        innerPane.setStyle("-fx-background-color: white;\n" +
                "  -fx-border-color: gray;  -fx-padding: 4 4;");

        // Create the labels and text fields
        label1 = new Label(name + " Hand");
        label1.relocate(10, 20);
        label1.setPrefSize(100, 30);

        label2 = new Label("Total");
        label2.relocate(10, 55);
        label2.setPrefSize(100, 30);


        field1.relocate(100, 20);
        field1.setPrefSize(200, 30);


        field2.relocate(100, 55);
        field2.setPrefSize(200, 30);

        // Add all labels and text fields to the pane
        innerPane.getChildren().addAll(label1, label2, field1, field2);

        getChildren().addAll(innerPane);
    }

    public void HandPane(Hand hand){
        field1.setText(hand.toString());
        field2.setText(Integer.toString(hand.getTotal()));
    }



}
