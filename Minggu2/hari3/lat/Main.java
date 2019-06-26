class ObjectWithPureFunction{

    public int sum(int a, int b) {
        return a + b;
    }
}

class ObjectWithNonPureFunction{
    private int value = 0;

    public int add(int nextValue) {
        this.value += nextValue;
        return this.value;
    }
}

class HigherOrderFunctionClass {
    public <T> IFactory<T> createFactory(IProducer<T> producer, IConfigurator<T> configurator) {
        return () -> {
           T instance = producer.produce();
           configurator.configure(instance);
           return instance;
        };
    }
}
	interface IFactory<T> {
   		T create();
	}
	interface IProducer<T> {
   		T produce();
	}
	interface IConfigurator<T> {
   		void configure(T t);
	}

class Calculator1 {
    public int sum(int a, int b) {
       return a + b;
    }
}

class Calculator2 {
    private int initVal = 5;
    public int sum(int a) {
       return initVal + a;
    }
}

interface MyInterface2 {
    public void run();

    public default void doIt() {
        System.out.println("doing it");
    }

    public static void doItStatically() {
        System.out.println("doing it statically");
    }
}

class Face implements MyInterface2{
	public void run(){
		System.out.println("anu");
	}

    public void doIt() {
        System.out.println("doing it");
    }

    public static void doItStatically() {
        System.out.println("doing it statically");
    }
}

public class Main{
	public static void main(String[] args) {
		// ObjectWithPureFunction anu = new ObjectWithPureFunction();
		// ObjectWithNonPureFunction anu2 = new ObjectWithNonPureFunction();
		// Calculator1 cal1 = new Calculator1();
		// Calculator2 cal2 = new Calculator2();
		// Face face = new Face();
		HigherOrderFunctionClass anu3 = new HigherOrderFunctionClass();

		IFactory a = anu3.createFactory(()-> "anu", (String hasil)->{
			System.out.println(hasil);
		} );

		a.create();
		// System.out.println(anu.sum(6,5));
		// System.out.println(anu2.add(6));
		// System.out.println(cal1.sum(6,6));
		// System.out.println(cal2.sum(5));
		// face.run();
		// face.doIt();
		// face.doItStatically();

	}
}

