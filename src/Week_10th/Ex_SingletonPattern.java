package Week_10th;

// 教臂沛 菩畔

class EarlySingleton {
    private static EarlySingleton uniqueInstance = new EarlySingleton();  
  
    private EarlySingleton() { /* 积己磊 */ }

    public static EarlySingleton getInstance() {
        return uniqueInstance;
    }
}

class LateSingleton {
    private static LateSingleton uniqueInstance;  
  
    private LateSingleton() { /* 积己磊 */ }

    public static LateSingleton getInstance() {
    if(uniqueInstance == null)
        uniqueInstance = new LateSingleton();

        return uniqueInstance;
    }
}

public class Ex_SingletonPattern {

}
