package Oops;

public class MthdPolyOvrTest extends MthdPoly {

    public int test() {
        return 13;
    }

    public static void main(String[] args) {
        MthdPoly obj = new MthdPolyOvrTest();
        MthdPoly obj1 = new MthdPoly();
        MthdPolyOvrTest obj3 = new MthdPolyOvrTest();
        System.out.println(obj1.test());
        System.out.println(obj.test());
        System.out.println(obj3.test());
    }
}
