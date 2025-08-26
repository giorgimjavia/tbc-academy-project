package tests;

import data.Constants;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import runners.BaseTest;
import steps.HomeSteps;

import java.io.File;

@Test(groups = {"[Verify user interaction with Chatbot (MSP-T7)]"})
public class ChatbotInteractionTest extends BaseTest {
    HomeSteps homeSteps;

    @BeforeClass
    public void setUpSteps() {
        homeSteps = new HomeSteps();
    }

    @Test
    public void chatbotInteractionAndUploadTest() {
        File file = new File(Constants.FILE_LOCATION);
        homeSteps
                .openHomePage()
                .rejectCookies()
                .openQuickAction()
                .openChatBot()
                .sendMessageToChatbot(Constants.CHATBOT_MESSAGE)
                .uploadingFile(file)
                .closeChatbot();
    }
}
