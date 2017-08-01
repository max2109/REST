import models.User;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

public class ApiTestCase {

    @Test
    public void testUserInfoResponse() {
        RestTemplate restTemplate = new RestTemplate();
        User user = restTemplate.getForObject("https://api.github.com/users/max2109", User.class);
        System.out.println(user);


    }


}