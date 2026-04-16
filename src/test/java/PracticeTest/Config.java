package PracticeTest;

class Config implements Cloneable {

    String browser;
    int timeout;

    Config(String b, int t) {
        browser = b;
        timeout = t;
    }

    public Object clone()
            throws CloneNotSupportedException {

        return super.clone();
    }
}