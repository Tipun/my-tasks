package OOP_12;

public class User {
    private String login;
    private String password;
    private Basket obj;

    public User(String login, String password, Basket obj) {
        this.login = login;
        this.password = password;
        this.obj = obj;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getObj() {
        return obj;
    }

    public void setObj(Basket obj) {
        this.obj = obj;
    }
}
