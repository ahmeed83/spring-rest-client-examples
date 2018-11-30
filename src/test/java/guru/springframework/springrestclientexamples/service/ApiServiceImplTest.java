package guru.springframework.springrestclientexamples.service;

import guru.springframework.api.model.user.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    ApiServiceImpl apiService;

    @Test
    public void getUsers() {
        List<User> users = apiService.getUsers(2);
        assertEquals(3, users.size());
    }
}