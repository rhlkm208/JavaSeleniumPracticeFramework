package ConceptualTrickyPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeComparator implements Comparator<EmployeeComparable>{

    public int compare(EmployeeComparable e1,
                       EmployeeComparable e2){

        return e1.name.compareTo(e2.name);
    }
    
    public static void main(String[] args) {

        List<EmployeeComparable> list = new ArrayList<>();

        list.add(new EmployeeComparable(1,"Rahul"));
        list.add(new EmployeeComparable(2,"Amit"));
        list.add(new EmployeeComparable(3,"John"));

        Collections.sort(list, new EmployeeComparator());

        for(EmployeeComparable e : list){
            System.out.println(e.name);
        }
    }
}