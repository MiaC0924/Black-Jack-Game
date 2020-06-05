package blackjack;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class BlackJackApplication extends Application{

	/*
	 These are the 'model' elements.
	 */

	//06 Instantiate two Hand objects,
	// one for a dealer and one for a player,
	// and a Deck object
	private Hand dealerHand, playerHand;
	private Deck deck;
	private HandPane handPane;
	private PlayerPane playerPane;


	@Override
	public void start(Stage primaryStage) throws Exception {
		dealerHand = new Hand();
		playerHand = new Hand();
		deck = new Deck();

		primaryStage.setTitle("BlackJack!");

        //05 HandPane and PlayerPane
		//two types of Panes that you have made, one
		//for the dealer and one for the player. You want it to display their
		//respective hands
		handPane = new HandPane("Dealer");

		playerPane = new PlayerPane("Player 1");

		playerPane.relocate(0,90);

		handPane.getChildren().add(playerPane);


		//5 a Button(“Deal Card”)
        //Make a dealCard button that, when clicked, deals one card to the dealer and
		//one to the player. Don't forget to update the view.
		Button dealerBtn = new Button("Deal Card");
		dealerBtn.relocate(10, 280);
		dealerBtn.setPrefSize(100, 30);

		//8 action event Deal Card
		EventHandler<ActionEvent> eventD = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e)
			{
				//dealer deal card
				dealerHand.dealCard(deck.dealCard());
				//player deal card
				playerHand.dealCard(deck.dealCard());
				//update UI
				update();
			}
		};

		dealerBtn.setOnAction(eventD); //let dealer button action this eventD

		handPane.getChildren().add(dealerBtn);




        //5 a Button(“New Game”)
        //Make a newGame Button that, when clicked, resets the player and
        //dealer hands to empty hands and updates the view.

		Button newBtn = new Button("New Game");
		newBtn.relocate(120, 280);
		newBtn.setPrefSize(100, 30);

		//8 action event New Game
		EventHandler<ActionEvent> eventN = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e)
			{
				//call newHand()
				dealerHand.newHand();
				playerHand.newHand();
				//set current bet to 0
				playerPane.field3.setText("0");
				//update
				update();
			}
		};

		newBtn.setOnAction(eventN);

		handPane.getChildren().add(newBtn);
        
        
        FlowPane aPane = new FlowPane();
        //add elements to the FlowPane in the order you wish them to appear

		Scene scene1 = new Scene(handPane,400,400);

		primaryStage.setScene(scene1);
        //primaryStage.setScene(new Scene(aPane, 400, 400));
        primaryStage.show();
		
	}
	
	public void update() {
		//07 HandPane and PlayerPane objects using the two Hand objects
		// (that is, the cards in the Hand and the total
		// should both be displayed in the appropriate pane).
		//update the GUI. Presumably the dealer's and player's hands have
		//changed since this was last called.
		handPane.HandPane(dealerHand);
		playerPane.HandPane(playerHand);

	}

	public static void main(String[] args) {
		launch(args);
	}

}
