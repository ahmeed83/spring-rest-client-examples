package guru.springframework.api.model.user;

public class ExpirationDate {
    String date;
    String timezoneType;
    String timezone;

    public String getDate() {
        return date;
    }

    public void setDate(final String date) {
        this.date = date;
    }

    public String getTimezoneType() {
        return timezoneType;
    }

    public void setTimezoneType(final String timezoneType) {
        this.timezoneType = timezoneType;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(final String timezone) {
        this.timezone = timezone;
    }
}