Black Jack
JavaFX

1.
- Maked a new class HandPane that is a subclass of Pane on HandPane.java
- Simply added all components into HandPane, didn't use automatic resizing using layouts


2.
- A method in HandPane, ¡°setHand(Hand hand)¡±


3.
- Make a new class PlayerPane that is a subclass of HandPane on PlayerPane.java
- Add a Label(¡°Current Bet¡±)
- a Button(¡°Place Bet¡±)
- and two TextFields with the same dimensions as the previous TextFields

4.
- On PlayerPane.java
- When the player clicks the ¡°Place Bet¡± button, have the contents of TextField 4 written into TextField 3

5.
- On BlackJackApplication.java
- Display a HandPane, followed by a PlayerPane, and two Buttons, a Button(¡°Deal Card¡±) and a Button(¡°New Game¡±)

6.
- Instantiate two Hand objects, one for a dealer and one for a player, and a Deck object.

7.
- On BlackJackApplication.java
- HandPane and PlayerPane objects using the two Hand objects
- that is, the cards in the Hand and the total should both be displayed in the appropriate pane

8.
- On BlackJackApplication.java
- Event Handlers for the Deal Card and New Game buttons.