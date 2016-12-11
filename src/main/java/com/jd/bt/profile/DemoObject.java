package com.jd.bt.profile;

/**
 * User: 吴海旭
 * Date: 2016-12-11
 * Time: 下午4:32
 */
public class DemoObject {

    private String something;

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }

    @Override
    public String toString() {
        return "DemoObject{" +
                "something='" + something + '\'' +
                '}';
    }
}
