package com.pluralsight;
import java.util.*;

public class BlackJackGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        deck.shuffle();

        System.out.print("Kaç oyuncu var? ");
        int numPlayers = Integer.parseInt(scanner.nextLine());

        List<Player> players = new ArrayList<>();
        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Oyuncu " + (i + 1) + " adı: ");
            String name = scanner.nextLine();
            players.add(new Player(name));
        }

        // 2 kart dağıt
        for (Player player : players) {
            player.getHand().addCard(deck.dealCard());
            player.getHand().addCard(deck.dealCard());
        }

        // Oyuncuların ellerini göster
        for (Player player : players) {
            System.out.println(player.getName() + ": " + player.getHand());
        }

        // Kazananı bul
        Player winner = null;
        int highest = 0;

        for (Player player : players) {
            int total = player.getHand().getTotalValue();
            if (total <= 21 && total > highest) {
                highest = total;
                winner = player;
            }
        }

        if (winner != null) {
            System.out.println("Kazanan: " + winner.getName() + " (" + highest + " puan)");
        } else {
            System.out.println("Herkes battı. Kazanan yok!");
        }
    }
}