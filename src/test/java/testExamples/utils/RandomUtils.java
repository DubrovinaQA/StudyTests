package testExamples.utils;

//import org.apache.commons.lang3.StringUtils;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class RandomUtils {
    public static String getRandomNumberString(int length) {
        String SALTCHARS = "0123456789";
        StringBuilder result = new StringBuilder();
        Random rnd = new Random();
        while (result.length() < length) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            result.append(SALTCHARS.charAt(index));
        }
        return result.toString();
    }

    public static String getRandomString(int length) {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder result = new StringBuilder();
        Random rnd = new Random();
        while (result.length() < length) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            result.append(SALTCHARS.charAt(index));
        }

        return result.toString();
    }
//
//    public static String getRandomMessage(int min, int max) {
//        String[] words = {"and", "or", "but", "because",
//                "red", "white", "Jane", "John", "Bobby",
//                "man", "woman", "fish", "elephant", "unicorn",
//                "a", "the", "every", "some", "any", "all",
//                "big", "tiny", "pretty", "bald", "small",
//                "runs", "jumps", "talks", "sleeps", "walks",
//                "loves", "hates", "sees", "knows", "looks for", "finds",
//                ", ", ", ", ", ", ". ", ". "};
//
//        StringBuilder message = new StringBuilder();
//        int messageLength = getRandomInt(min, max);
//        while (message.length() < messageLength) {
//            int wordIndex = getRandomInt(0, words.length - 1);
//            message.append(words[wordIndex] + " ");
//        }
//
//        String readyMessage = StringUtils.capitalize(message.toString())
//                .replace(" ,", ",")
//                .replace(" .", ".").trim();
//        return readyMessage;
//    }

    public static int getRandomInt(int min, int max) {
        Random r = new Random();

        return r.nextInt((max - min) + 1) + min;
    }

    public static String getRandomPhone() {
        return getRandomLong(11111111111111111L, 99999999999999999L) + "";
    }

    public static String getRandomPhone(String code) {
        return code + getRandomLong(11111111111111111L, 99999999999999999L);
    }

    public static String getDifficultRandomPhone(String code) {
        return code + " (" + getRandomLong(111L, 999L) + ") " + getRandomLong(11111L, 999999L) + "-" + getRandomLong(111L, 999999L);
    }

    public static Long getRandomLong(Long min, Long max) {
        return ThreadLocalRandom.current().nextLong(min, max);
    }

    public static String getRandomEmail() {
        String emailDomain = "@gmail.com";
        return getRandomString(10) + emailDomain;
    }
}
