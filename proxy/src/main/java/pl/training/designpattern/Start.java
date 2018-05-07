package pl.training.designpattern;

import pl.training.designpattern.proxy.ProxySubject;

/**
 * Created by dawid on 07.05.18.
 */
public class Start {

    //access level proxy
    public static void main(String[] args) {
        ProxySubject proxySubject = new ProxySubject("dummy");
        proxySubject.someMethod();
        proxySubject.setPassword("PASSWD");
        proxySubject.someMethod();
    }
}
