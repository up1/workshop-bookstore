package solid;

public class DemoInterface {
}

class A {
    void doSth() {
        B b = new B();
        b.call();
    }
}

class B {

    public void call() {
        C c = new C();
        c.call();
    }
}

class C {

    public void call() {
    }
}

interface Service {
    void a();
    void b();
    void c();
}

class V2 implements Service {

    @Override
    public void a() {
        
    }

    @Override
    public void b() {
        throw  new RuntimeException("Method not allow to use");
    }

    @Override
    public void c() {
        throw  new RuntimeException("Method not allow to use");
    }
}

class V1 implements Service {
    @Override
    public void a() {
        
    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }
}
