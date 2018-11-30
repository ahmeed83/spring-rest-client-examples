package guru.springframework.api.model.user;

public class Billing {
    Card card;

    public Card getCard() {
        return card;
    }

    public void setCard(final Card card) {
        this.card = card;
    }
}