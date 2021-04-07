package ex_3;

public class User {
    String login;
    String password;
    Basket basket;
    User(String login,String password,Basket basket){
        this.basket = basket;
        this.password = password;
        this.login = login;
    }
}
