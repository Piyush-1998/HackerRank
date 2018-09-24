
class Singleton{
    
    private static Singleton singleInstance = null;
    public String str;
    
    private Singleton() {
        
        str = "Hello I am a singleton! Let me say hello world to you";
    }
    
    public static Singleton getSingleInstance() {

        if(singleInstance == null) {
            
            singleInstance = new Singleton();
        }
        
        return singleInstance;
    }
}