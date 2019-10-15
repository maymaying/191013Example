interface List<E>{
    E get();
    E put(E e);
}

class MyList<F> implements List<String>{

    @Override
    public String get() {
        return null;
    }

    @Override
    public String put(String s) {
        return null;
    }
}

class MyList2<F> implements List<F>{

    @Override
    public F get() {
        return null;
    }

    @Override
    public F put(F f) {
        return null;
    }
}
public class Example2 {
    public static void main(String[] args) {
        MyList2<Iterable> l;
    }
}
