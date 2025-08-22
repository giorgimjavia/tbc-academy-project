package utils;

import org.openqa.selenium.StaleElementReferenceException;

public class Retry {
    public static void retryAction(Runnable action, int max) {
        int index = 0;
        while (index < max) {
            try {
                action.run();
                return;
            }
            catch (StaleElementReferenceException e) {
                index++;
                if (index == max) {
                    throw e;
                }
            }
        }
    }
}
