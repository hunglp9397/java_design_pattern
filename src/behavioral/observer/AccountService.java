package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// Concreate Subject, thông báo tới tất cả các service khác khi có sự thay đổi
public class AccountService implements Subject {
    private User user;

    private List<Observer> observerList = new ArrayList<>();

    public AccountService(String email, String ip){

        user = new User();
        user.setEmail(email);
        user.setIp(ip);

    }



    // Thêm observer
    @Override
    public void attach(Observer observer) {
        if(!observerList.contains(observer)){
            observerList.add(observer);
        }
    }

    // Xóa Observer
    @Override
    public void detach(Observer observer) {
        if(observerList.contains(observer)){
            observerList.remove(observer);
        }

    }

    @Override
    public void notifyAllObserver() {
        for(Observer observer : observerList){
            observer.update(user);
        }
    }

    public void changeStatus(LoginStatus status){
        user.setStatus(status);
        System.out.println("Status is changed");
        this.notifyAllObserver();
    }

    public void login() {

        if (!this.isValidIP()) {
            user.setStatus(LoginStatus.INVALID);
        } else if (this.isValidEmail()) {
            user.setStatus(LoginStatus.SUCCESS);
        } else {
            user.setStatus(LoginStatus.FAILURE);
        }

        System.out.println("Login is handled");
        this.notifyAllObserver();
    }

    private boolean isValidIP() {
        return "127.0.0.1".equals(user.getIp());
    }

    private boolean isValidEmail() {
        return "contact@gpcoder.com".equalsIgnoreCase(user.getEmail());
    }
}
