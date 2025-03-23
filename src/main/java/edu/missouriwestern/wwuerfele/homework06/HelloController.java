package edu.missouriwestern.wwuerfele.homework06;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

import java.util.ArrayList;

import static edu.missouriwestern.wwuerfele.homework06.HelloApplication.*;



public class HelloController {
    @FXML
    private HBox enemyAttackPile;

    @FXML
    private HBox playerAttackPile;

    @FXML
    private HBox playerCardsRemaining;

    @FXML
    private HBox enemyCardsRemaining;

    @FXML
    private HBox playerWarPile;

    @FXML
    private HBox enemyWarPile;

    @FXML
    private HBox header;

    @FXML
    private HBox attackButton;
    private ArrayList<Card> tempDeck = new ArrayList<>();

    @FXML
    private void onButtonClick() {
        //pause(0.2);

        Label enemyLabel = new Label(enemyDeck.getFirst().getFace());
        enemyLabel.setStyle("-fx-font-size: 70px;");
        enemyAttackPile.getChildren().clear();
        enemyAttackPile.getChildren().add(enemyLabel);

        Label userLabel = new Label(playerDeck.getFirst().getFace());
        userLabel.setStyle("-fx-font-size: 70px;");
        playerAttackPile.getChildren().clear();
        playerAttackPile.getChildren().add(userLabel);

        //check game winner

        //player wins
        if(enemyDeck.getFirst().getValue() < playerDeck.getFirst().getValue()){
            //give enemies card to player and move players first card to bottom of deck
            playerDeck.addAll(tempDeck);
            tempDeck.clear();
            playerDeck.add(enemyDeck.getFirst());
            playerDeck.add(playerDeck.getFirst());

            enemyDeck.removeFirst();
            playerDeck.removeFirst();

            //update card count
            Label playerCards = new Label("Cards Remaining: " + playerDeck.size());
            playerCardsRemaining.getChildren().clear();
            playerCardsRemaining.getChildren().add(playerCards);

            Label enemyCards = new Label("Cards Remaining: " + enemyDeck.size());
            enemyCardsRemaining.getChildren().clear();
            enemyCardsRemaining.getChildren().add(enemyCards);
        }
        //enemy wins
        else if(enemyDeck.getFirst().getValue() > playerDeck.getFirst().getValue()){
            //give players card to enemy and move enemies first card to bottom of deck
            enemyDeck.addAll(tempDeck);
            tempDeck.clear();
            enemyDeck.add(playerDeck.getFirst());
            enemyDeck.add(enemyDeck.getFirst());

            enemyDeck.removeFirst();
            playerDeck.removeFirst();

            //update card count
            Label playerCards = new Label("Cards Remaining: " + playerDeck.size());
            playerCardsRemaining.getChildren().clear();
            playerCardsRemaining.getChildren().add(playerCards);

            Label enemyCards = new Label("Cards Remaining: " + enemyDeck.size());
            enemyCardsRemaining.getChildren().clear();
            enemyCardsRemaining.getChildren().add(enemyCards);
        }
        //WAR!!!!!
        else if(enemyDeck.getFirst().getValue() == playerDeck.getFirst().getValue()){
           tempDeck.add(enemyDeck.getFirst());
           tempDeck.add(playerDeck.getFirst());

           enemyDeck.removeFirst();
           playerDeck.removeFirst();
        }


        if(playerDeck.isEmpty()){
            Label headerLabel = new Label("YOU LOSE");
            headerLabel.setStyle("-fx-font-size: 100px;");
            header.getChildren().add(headerLabel);
            playerWarPile.getChildren().clear();
            attackButton.getChildren().clear();
        }
        else if (enemyDeck.isEmpty()) {
            Label headerLabel = new Label("ENEMY FELLED");
            headerLabel.setStyle("-fx-font-size: 100px;");
            header.getChildren().add(headerLabel);
            enemyWarPile.getChildren().clear();
            attackButton.getChildren().clear();
        }

    }

    static public void pause(double seconds) {
        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}