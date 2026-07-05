package week3;
import java.util.*;

public class StudentMarksRecord {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(85);
        list.add(98);
        list.add(55);
        list.add(88);
        list.add(97);

        System.out.println(list);

        int highest=list.get(0);
        int lowest=list.get(0);

        for(int e:list){
            if(e>highest){
                highest=e;
            }
            if(e<lowest){
                lowest=e;
            }
        }
        System.out.println("Student Highest mark:"+highest);
        System.out.println("Student Lowest mark:"+lowest);
    }
    
}
