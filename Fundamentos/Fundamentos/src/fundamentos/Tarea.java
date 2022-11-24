


package fundamentos;

public class Tarea {
    public static void main(String[] args) {
        
       Thread t=Thread.currentThread();
       t.setName("Mi tarea");//cambiar nombre
        System.out.println(t);
        for (int i = 5; i >= 0; i--) {
            System.out.println(i);
            try{
                t.sleep(1000);
                if(i==3){
                    t.interrupt();
                }
            }catch(InterruptedException ie){
                System.out.println("Interrumpido el sueño");
            }
        }//for
        System.out.println("BOOOOOM!!!");
    }
    
}
