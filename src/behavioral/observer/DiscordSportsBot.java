package behavioral.observer;

/**
 * Role: Concrete Observer.
 *
 * Represents a Discord bot that posts score updates.
 */
public class DiscordSportsBot implements ScoreObserver {

    @Override
    public void updateScore(int homeTeamScore, int awayTeamScore) {
        System.out.println("[Discord Sports Bot] Posting update - Home: "
                + homeTeamScore + " | Away: " + awayTeamScore);
    }
}
