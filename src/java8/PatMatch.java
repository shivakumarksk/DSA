package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PatMatch {
    public static void main(String[] args) {
        String[] chars={"123f","1dsa12","1212ds","65fd","sadfa","asdasd"};
       List<String> results=Arrays.stream(chars).map(s->s.replaceAll("\\D+","")).collect(Collectors.toList());
System.out.println(results);
        String input="Hello 123 world shiva 567";
        Pattern getnumbers=Pattern.compile("\\d+");
        Matcher getnummatcher=getnumbers.matcher(input);
        while(getnummatcher.find()) {
            System.out.println(getnummatcher.group());
        }
        int sum=0;
        System.out.println(results);
        Pattern pat=Pattern.compile("\\D");
        for(String str: chars) {
            Matcher matcher=pat.matcher(str);
            String num=matcher.replaceAll("");
            if(!num.isEmpty() &&num.matches("\\d+")) {
                sum = sum + Integer.parseInt(num);
            }
        }
        System.out.println(sum);

       String emailaddress="kshiva083@gmail.com";
       Pattern emailpat=Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
       Matcher mats=emailpat.matcher(emailaddress);
       if(mats.matches()) {
           System.out.println("Valid email");
       }
Pattern removechars=Pattern.compile("[^a-zA-Z]+");
       Matcher removecharsmat=removechars.matcher(input);
       List<String> nameslist=new ArrayList<>();
       while(removecharsmat.find()) {
           nameslist.add(removecharsmat.group());
       }
        System.out.println(nameslist);
    }
}
