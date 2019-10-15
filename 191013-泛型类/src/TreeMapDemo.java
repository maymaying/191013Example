import java.util.TreeMap;

public class TreeMapDemo{
    static class Person{
        String name;
        int age;
    }

    public static void main(String[] args) {
        TreeMap<Person,String> map=new TreeMap<>();
        map.put(new Person(),"1999999");
    }
}
