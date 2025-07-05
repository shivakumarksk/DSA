package java8;

public class CmprMn {

    public static void main(String[] args) {
        CmprblCmprtr e1 = new CmprblCmprtr("John", 30);
        CmprblCmprtr e2 = new CmprblCmprtr("Blice", 30);

        // Using Comparable
        int result = e1.compareTo(e2);
        System.out.println("Comparable result: " + result);
        //Using Comparator
        Cmpratr comparator=new Cmpratr();
        System.out.println(comparator.compare(e1,e2));
    }
}
