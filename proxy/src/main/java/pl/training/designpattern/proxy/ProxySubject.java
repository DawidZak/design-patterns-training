package pl.training.designpattern.proxy;

import pl.training.designpattern.real.RealSubject;
import pl.training.designpattern.subject.Subject;

/**
 * Created by dawid on 07.05.18.
 */
public class ProxySubject implements Subject {

    private String password;
    private RealSubject realSubject;

    public ProxySubject(String password) {
        this.password = password;
    }

    public void someMethod() {
        if ("PASSWD".equals(password)) {
            if (realSubject == null){
                realSubject = new RealSubject();
            }
            System.out.println("correct password");
            realSubject.someMethod();
        }else{
            System.out.println("wrong password");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
