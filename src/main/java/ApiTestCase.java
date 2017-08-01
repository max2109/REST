import models.User;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;
import static org.junit.Assert.*;
public class ApiTestCase {

    @Test
    public void testUserInfoResponse() {
        RestTemplate restTemplate = new RestTemplate();
        User remoteUser = restTemplate.getForObject("https://api.github.com/users/max2109", User.class);
        assertTrue(remoteUser.getHtml_url().contains("https://github.com/max2109"));
        //System.out.println(remoteUser);

    }


}