package guru.springframework.api.model.user;

public class Login {
    String userName;
    String password;
    String md5;
    String sha1;
    String sha256;

    public String getUserName() {
        return userName;
    }

    public void setUserName(final String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(final String md5) {
        this.md5 = md5;
    }

    public String getSha1() {
        return sha1;
    }

    public void setSha1(final String sha1) {
        this.sha1 = sha1;
    }

    public String getSha256() {
        return sha256;
    }

    public void setSha256(final String sha256) {
        this.sha256 = sha256;
    }
}