public class Example{
    private static class Person<T>{
        T name;
        //static T name; 报错

        T getName(){
            return name;
        }
        //static T getAge(){}  报错

        class Node{
            T age;
        }
        //static class StaticNode{
        //    T age;
        //}
        //普通的属性、方法、类可以使用
        //静态 static 无法使用 T
    }

    public static void main(String[] args) {
        Person<String> p=new Person<>();
        String ps=p.getName();
        Person<Integer> q=new Person<>();
        Integer qs=q.getName();
    }
}
