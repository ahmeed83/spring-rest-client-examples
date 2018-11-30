package guru.springframework.api.model.user;

public class Name {
    String title;
    String first;
    String last;

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(final String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(final String last) {
        this.last = last;
    }
}