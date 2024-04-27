package machine_coding.snakes_and_ladders;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/*sample input:
9
62 5
33 6
49 9
88 16
41 20
56 53
98 64
93 73
95 75
8
2 37
27 46
10 32
51 68
61 79
65 84
71 91
81 94
*/
public class GameDriver {

    static GameBoard gb = null;
    static List<Player> players = new ArrayList<>();
    static int position = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        gb = generateBoard();
        System.out.print("Enter number of players: ");
        int p = Integer.parseInt(br.readLine());
        for(int i=0;i<p;i++){
            System.out.print("Enter name of player " + (i+1) + ": ");
            String name = br.readLine();
            players.add(new Player(name));
        }

//        String winner = startGame();
        String loser = startGame();

        //System.out.println(winner + " wins the game.");
        System.out.println(loser + " is last in the game.");
    }

    private static GameBoard generateBoard() {

        HashMap<Integer,Integer>  snakes = new HashMap<>();
        HashMap<Integer,Integer> ladders = new HashMap<>();

        snakes.put(62, 5);
        snakes.put(33, 6);
        snakes.put(49, 9);
        snakes.put(88, 16);
        snakes.put(41, 20);
        snakes.put(56, 53);
        snakes.put(98, 64);
        snakes.put(93, 73);
        snakes.put(95, 75);

        ladders.put(2, 37);
        ladders.put(27, 46);
        ladders.put(10, 32);
        ladders.put(51, 68);
        ladders.put(61, 79);
        ladders.put(65, 84);
        ladders.put(71, 91);
        ladders.put(81, 94);

        return new GameBoard(snakes, ladders);

    }

    private static String startGame() {

        while(players.size() > 1) {
            for (Player p : players) {
                int dieValue = Die.roll();
                int pos = p.getPosition();
                int newPos = pos + dieValue;
                if (newPos == 100) {
                    System.out.println(p.getName() + " rolled a " + dieValue + " and moved from " + pos + " to " + newPos);
                    System.out.println("******************************************");
                    System.out.println(p.getName() + " completed the game with position " + position++);
                    System.out.println("******************************************");
                    players.remove(p);
                    break;
                }
                if (newPos > 100) {
                    System.out.println(p.getName() + " rolled a " + dieValue + " and moved above 100 so he doesn't move.");
                    continue;
                }
                while (gb.getSnakes().containsKey(newPos) || gb.getLadders().containsKey(newPos)) {
                    if (gb.getSnakes().containsKey(newPos)) {
                        newPos = gb.getSnakes().get(newPos);
                    } else {
                        newPos = gb.getLadders().get(newPos);
                    }
                }
                p.setPosition(newPos);
                System.out.println(p.getName() + " rolled a " + dieValue + " and moved from " + pos + " to " + newPos);
            }
        }
        return players.get(0).getName();
    }

}
