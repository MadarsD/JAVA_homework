package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;


public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        String[] scoresArr = scores.split(" ");
        int[] scoresAsIntegers = Arrays.stream(scoresArr).mapToInt(Integer::parseInt).toArray();

        StringBuilder zeroToNine = new StringBuilder("00-09: ");
        StringBuilder tenToNineteen = new StringBuilder("10-19: ");
        StringBuilder twentyToTwentyNine = new StringBuilder("20-29: ");
        StringBuilder thirtyToThirtyNine = new StringBuilder("30-39: ");
        StringBuilder fortyToFortyNine = new StringBuilder("40-49: ");
        StringBuilder fiftyToFiftyNine = new StringBuilder("50-59: ");
        StringBuilder sixtyToSixtyNine = new StringBuilder("60-69: ");
        StringBuilder seventyToSeventyNine = new StringBuilder("70-79: ");
        StringBuilder eightyToEightyNine = new StringBuilder("80-89: ");
        StringBuilder ninetyToNinetyNine = new StringBuilder("90-99: ");
        StringBuilder hundred = new StringBuilder("  100: ");

        for (int score : scoresAsIntegers) {
            if (score < 10) {
                zeroToNine.append("*");
            } else if (score < 20) {
                tenToNineteen.append("*");
            } else if (score < 30) {
                twentyToTwentyNine.append("*");
            } else if (score < 40) {
                thirtyToThirtyNine.append("*");
            } else if (score < 50) {
                fortyToFortyNine.append("*");
            } else if (score < 60) {
                fiftyToFiftyNine.append("*");
            } else if (score < 70) {
                sixtyToSixtyNine.append("*");
            } else if (score < 80) {
                seventyToSeventyNine.append("*");
            } else if (score < 90) {
                eightyToEightyNine.append("*");
            } else if (score < 100) {
                ninetyToNinetyNine.append("*");
            } else {
                hundred.append("*");
            }
        }

        System.out.println(zeroToNine + "\n" + tenToNineteen + "\n" + twentyToTwentyNine + "\n" +
                thirtyToThirtyNine + "\n" + fortyToFortyNine + "\n" + fiftyToFiftyNine + "\n" +
                sixtyToSixtyNine + "\n" + seventyToSeventyNine + "\n" + eightyToEightyNine + "\n" +
                ninetyToNinetyNine + "\n" + hundred);

    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}
