package java8;

import java.util.Comparator;

public class Cmpratr implements Comparator<CmprblCmprtr> {


    @Override
    public int compare(CmprblCmprtr o1, CmprblCmprtr o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
