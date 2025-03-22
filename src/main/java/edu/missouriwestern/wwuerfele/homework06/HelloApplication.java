package edu.missouriwestern.wwuerfele.homework06;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;


public class HelloApplication extends Application {
    protected static ArrayList<Card> playerDeck = new ArrayList<>();
    protected static ArrayList<Card> enemyDeck = new ArrayList();
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 800);
        stage.setTitle("War");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        assignCards(playerDeck, enemyDeck);
        launch();

    }

    private static void assignCards(ArrayList<Card> playerDeck, ArrayList<Card> enemyDeck) {
        //create cards
        ArrayList<Card> deck = new ArrayList<>();
        Card AS = new Card("\uD83C\uDCA1", "Ace of Spades", 14);
        Card AH = new Card("\uD83C\uDCB1", "Ace of Hearts", 14);
        Card AD = new Card("\uD83C\uDCC1", "Ace of Diamonds", 14);
        Card AC = new Card("\uD83C\uDCD1", "Ace of Clubs", 14);
        deck.add(AS);
        deck.add(AH);
        deck.add(AD);
        deck.add(AC);

        Card TS = new Card("\uD83C\uDCA2", "Two of Spades", 2);
        Card TH = new Card("\uD83C\uDCB2", "Two of Hearts", 2);
        Card TD = new Card("\uD83C\uDCC2", "Two of Diamonds", 2);
        Card TC = new Card("\uD83C\uDCD2", "Two of Clubs", 2);
        deck.add(TS);
        deck.add(TH);
        deck.add(TD);
        deck.add(TC);

        Card ThS = new Card("\uD83C\uDCA3", "Three of Spades", 3);
        Card ThH = new Card("\uD83C\uDCB3", "Three of Hearts", 3);
        Card ThD = new Card("\uD83C\uDCC3", "Three of Diamonds", 3);
        Card ThC = new Card("\uD83C\uDCD3", "Three of Clubs", 3);
        deck.add(ThS);
        deck.add(ThH);
        deck.add(ThD);
        deck.add(ThC);

        Card FS = new Card("\uD83C\uDCA4", "Four of Spades", 4);
        Card FH = new Card("\uD83C\uDCB4", "Four of Hearts", 4);
        Card FD = new Card("\uD83C\uDCC4", "Four of Diamonds", 4);
        Card FC = new Card("\uD83C\uDCD4", "Four of Clubs", 4);
        deck.add(FS);
        deck.add(FH);
        deck.add(FD);
        deck.add(FC);

        Card FvS = new Card("\uD83C\uDCA5", "Five of Spades", 5);
        Card FvH = new Card("\uD83C\uDCB5", "Five of Hearts", 5);
        Card FvD = new Card("\uD83C\uDCC5", "Five of Diamonds", 5);
        Card FvC = new Card("\uD83C\uDCD5", "Five of Clubs", 5);
        deck.add(FvS);
        deck.add(FvH);
        deck.add(FvD);
        deck.add(FvC);

        Card SS = new Card("\uD83C\uDCA6", "Six of Spades", 6);
        Card SH = new Card("\uD83C\uDCB6", "Six of Hearts", 6);
        Card SD = new Card("\uD83C\uDCC6", "Six of Diamonds", 6);
        Card SC = new Card("\uD83C\uDCD6", "Six of Clubs", 6);
        deck.add(SS);
        deck.add(SH);
        deck.add(SD);
        deck.add(SC);

        Card SvS = new Card("\uD83C\uDCA7", "Seven of Spades", 7);
        Card SvH = new Card("\uD83C\uDCB7", "Seven of Hearts", 7);
        Card SvD = new Card("\uD83C\uDCC7", "Seven of Diamonds", 7);
        Card SvC = new Card("\uD83C\uDCD7", "Seven of Clubs", 7);
        deck.add(SvS);
        deck.add(SvH);
        deck.add(SvD);
        deck.add(SvC);

        Card ES = new Card("\uD83C\uDCA8", "Eight of Spades", 8);
        Card EH = new Card("\uD83C\uDCB8", "Eight of Hearts", 8);
        Card ED = new Card("\uD83C\uDCC8", "Eight of Diamonds", 8);
        Card EC = new Card("\uD83C\uDCD8", "Eight of Clubs", 8);
        deck.add(ES);
        deck.add(EH);
        deck.add(ED);
        deck.add(EC);

        Card NS = new Card("\uD83C\uDCA9", "Nine of Spades", 9);
        Card NH = new Card("\uD83C\uDCB9", "Nine of Hearts", 9);
        Card ND = new Card("\uD83C\uDCC9", "Nine of Diamonds", 9);
        Card NC = new Card("\uD83C\uDCD9", "Nine of Clubs", 9);
        deck.add(NS);
        deck.add(NH);
        deck.add(ND);
        deck.add(NC);

        Card TnS = new Card("\uD83C\uDCAA", "Ten of Spades", 10);
        Card TnH = new Card("\uD83C\uDCBA", "Ten of Hearts", 10);
        Card TnD = new Card("\uD83C\uDCCA", "Ten of Diamonds", 10);
        Card TnC = new Card("\uD83C\uDCDA", "Ten of Clubs", 10);
        deck.add(TnS);
        deck.add(TnH);
        deck.add(TnD);
        deck.add(TnC);

        Card JS = new Card("\uD83C\uDCAB", "Jack of Spades", 11);
        Card JH = new Card("\uD83C\uDCBB", "Jack of Hearts", 11);
        Card JD = new Card("\uD83C\uDCCB", "Jack of Diamonds", 11);
        Card JC = new Card("\uD83C\uDCDB", "Jack of Clubs", 11);
        deck.add(JS);
        deck.add(JH);
        deck.add(JD);
        deck.add(JC);

        Card QS = new Card("\uD83C\uDCAD", "Queen of Spades", 12);
        Card QH = new Card("\uD83C\uDCBD", "Queen of Hearts", 12);
        Card QD = new Card("\uD83C\uDCCD", "Queen of Diamonds", 12);
        Card QC = new Card("\uD83C\uDCDD", "Queen of Clubs", 12);
        deck.add(QS);
        deck.add(QH);
        deck.add(QD);
        deck.add(QC);

        Card KS = new Card("\uD83C\uDCAE", "King of Spades", 13);
        Card KH = new Card("\uD83C\uDCBE", "King of Hearts", 13);
        Card KD = new Card("\uD83C\uDCCE", "King of Diamonds", 13);
        Card KC = new Card("\uD83C\uDCDE", "King of Clubs", 13);
        deck.add(KS);
        deck.add(KH);
        deck.add(KD);
        deck.add(KC);

        //assign cards
        for(int i = 0; i<deck.size();){
            Random rand = new Random();
            int cardSelectPlayer = rand.nextInt(deck.size());
            int cardSelectEnemy = rand.nextInt(deck.size());

            //loop to prevent overlapping indices
            while(cardSelectPlayer == cardSelectEnemy){
                cardSelectEnemy = rand.nextInt(deck.size());
            }

            playerDeck.add(deck.get(cardSelectPlayer));
            enemyDeck.add(deck.get(cardSelectEnemy));

            deck.remove(playerDeck.getLast());
            deck.remove(enemyDeck.getLast());

        }
    }//end of assignCards
}//end of HelloApplication