package spring.learning.aop;

/**
 * @author liubo
 * @date 2020-01-04 15:36
 * @description
 **/
public class TestBean {

    private String testStr = "panda";

    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }

    public void test() {
        System.out.println("test : " + testStr);
    }
}
