
/**
 *Luis Oliver Juarez
 *LoopOne
 */
public class LoopOne
{
    // instance variables - replace the example below with your own
    int[] loadarray = new int[10];

    
    public LoopOne()
    {
        
    }

    
    public void loadArray()
    {
        int var = 0;
        for(int i = 0; i < 10; i++){
            var = (i+1)*5;
            loadarray[i] = var;}
    }
    public void printArray(){
        for(int i = 0; i < 10; i++){
            System.out.println("" + loadarray[i]);}
    }
}