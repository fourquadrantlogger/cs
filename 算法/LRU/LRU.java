
import java.util.Scanner;
import java.util.Stack;

public class LRU<E> {
    public LRU(int max) {
        this.max = max;
        this.buffer=new Stack<E>();
    }

    int max;
    Stack<E> buffer;
    E get(int i){
        E e=buffer.get(i);
        buffer.remove(i);
        buffer.push(e);
        return e;
    }
    void set(E e){
        if(buffer.size()>max){
            E r=buffer.remove(buffer.size()-1);
            System.out.println(">>>"+r.toString());
        }

        buffer.push(e);
    }

    public  static void main(String[] args){
        LRU<Integer> charlru=new LRU<>(10);
        Scanner s = new Scanner(System.in);
        while (true) {
            String line = s.next();

            for (int i=0;i<line.length();i++){
                charlru.set( (int)line.charAt(i));
            }
        }
    }
}