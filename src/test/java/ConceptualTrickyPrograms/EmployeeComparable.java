package ConceptualTrickyPrograms;

import java.util.*;

public class EmployeeComparable
        implements Comparable<EmployeeComparable>{

    int id;
    String name;

    EmployeeComparable(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int compareTo(EmployeeComparable e){

        return this.id - e.id;
    }

    public static void main(String[] args) {

        List<EmployeeComparable> list =
                new ArrayList<>();

        list.add(new EmployeeComparable(103, "Rahul"));
        list.add(new EmployeeComparable(101, "Rohit"));
        list.add(new EmployeeComparable(102, "Raju"));

        Collections.sort(list);

        for(EmployeeComparable e : list){
            System.out.println(e.id+ ", "+ e.name);
        }
    }
}