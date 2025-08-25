package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import runners.BaseTest;
import steps.HomeSteps;

public class ChatbotInteractionTest extends BaseTest {
    HomeSteps homeSteps;

    @BeforeClass
    public void setUpSteps() {
        homeSteps = new HomeSteps();
    }

    @Test
    public void chatbotInteractionAndUploadTest() {
        homeSteps
                .openHomePage()
                .rejectCookies()
                .openQuickAction()
                .openChatBot()
                .sendMessageToChatbot();
    }
}
