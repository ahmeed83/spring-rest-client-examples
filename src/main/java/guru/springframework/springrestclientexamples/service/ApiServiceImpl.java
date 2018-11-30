package guru.springframework.springrestclientexamples.service;

import guru.springframework.api.model.user.User;
import guru.springframework.api.model.user.UserData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService  {

    private String url;
    private RestTemplate restTemplate;

    public ApiServiceImpl(final RestTemplate restTemplate,  @Value("${api.url}") String url) {
        this.url = url;
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(final Integer limit) {
        UriComponentsBuilder uri = UriComponentsBuilder
                .fromUriString(url)
                .queryParam("limit", limit);
        UserData userData = restTemplate.getForObject(uri.toUriString(), UserData.class);
        return userData.getData();
    }
}
