package guru.springframework.api.model.user;

import java.util.List;

public class UserData {
    private List<User> data;

    public List<User> getData() {
        return data;
    }

    public void setData(final List<User> data) {
        this.data = data;
    }
}
