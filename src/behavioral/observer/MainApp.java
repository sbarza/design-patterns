package behavioral.observer;

/**
 * Role: Client / Demo / Driver
 *
 * Sets up the Subject and the Observer, then simulates score changes.
 */
public class MainApp {

    public static void main(String[] args) {

        GameScoreboardServer scoreboard = new GameScoreboardServer();

        ScoreObserver jumbotron = new JumbotronDisplay();
        ScoreObserver mobileApp = new MobileAppDisplay();
        ScoreObserver discordSportsBot = new DiscordSportsBot();

        // Observers subscribe
         System.out.println("Registering observers");
         scoreboard.registerObserver(jumbotron);
         scoreboard.registerObserver(mobileApp);
         scoreboard.registerObserver(discordSportsBot);

        System.out.println("Setting the score");
        scoreboard.setScore(3, 2);
        System.out.println();

        System.out.println("Setting the score");
        scoreboard.setScore(6, 3);
        System.out.println();

        // One observer leaves
        System.out.println("Removing observer: mobileApp");
        scoreboard.removeObserver(mobileApp);

        // mobileApp no longer receives the updates
        System.out.println("Setting the score");
        scoreboard.setScore(9, 4);
    }
}
