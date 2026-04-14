public class WordMatch {

    private String secret;

    public WordMatch(String word) {
        secret = word;

    }

    public int scoreGuess(String guess) {
        int count = 0;
        for (int i = 0; i < secret.length() - guess.length(); i++) {
            if (secret.substring(i, i + guess.length()).equals(guess))
                count++;
        }
        return (int) (count * Math.pow(guess.length(), 2));
    }

    public String findBetterGuess(String first, String second) {
        return (scoreGuess(first) > scoreGuess(second)) ? first : second;
    }

}
