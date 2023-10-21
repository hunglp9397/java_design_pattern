package behavioral.observer;

public class Mailer implements Observer{
    @Override
    public void update(User user) {
        if(user.getStatus().equals(LoginStatus.EXPIRED)){
            System.out.println();
        }
    }
}
