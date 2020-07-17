package com.example.fiegnexample;

import com.example.fiegnexample.model.Message;
import feign.FeignException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TestAppContextConfiguration.class)
@TestPropertySource(properties = {
        "example.client.url:http://localhost",
        "example.client.logger.level:FULL"
})
public class ClientApplicationTests {

    @Autowired
    private Client client;

    @Test(expected = FeignException.class)
    public void testSendMessageErrorResponse() {
        Message cdbusPostMessage = new Message();
        client.sendMessage("", cdbusPostMessage, "");
    }

}
