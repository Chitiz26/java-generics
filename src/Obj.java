public class Obj<T>
{
    private T data;

    public T get()
    {
        return data;
    }

    public void set(T data)
    {
        this.data = data;
    }

    public static void main(String[] args)
    {
        Obj<String> obj1 = new Obj<>();
        obj1.set("Hello");

        Obj<Integer> obj2 = new Obj<>();
        obj2.set(100);

        Obj<Boolean> obj3 = new Obj<>();
        obj3.set(true);

        System.out.println(obj1.get());
        System.out.println(obj2.get());
        System.out.println(obj3.get());
    }
}
