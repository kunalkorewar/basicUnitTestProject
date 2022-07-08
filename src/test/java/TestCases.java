import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@SpringBootTest
public class TestCases {

    @Test
    public  void addEmployeeAPI() throws URISyntaxException {
        RestTemplate restTemplate=new RestTemplate();
        String baseUrl="http://localhost:8080/addEmployee";
        URI uri=new URI(baseUrl);
        ResponseEntity result=restTemplate.getForEntity(uri,String.class);
        Assertions.assertEquals(200,result.getStatusCodeValue());
    }
}
