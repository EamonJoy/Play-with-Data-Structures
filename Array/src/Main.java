public class Main {

    public static void main(String[] args) {

        int[] scores = new int[]{56,12,54,100};

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        System.out.println();

        scores[2] = 100;
        for (int score: scores) {
            System.out.println(score);
        }
    }
}
