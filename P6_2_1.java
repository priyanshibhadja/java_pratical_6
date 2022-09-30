import java.util.Random;
import java.util.*;

public class P6_2_1 {
      public static void main(String []args) 
      {
            Random rand = new Random();
            int[] arr = new int[15];
            for (int j = 0; j < arr.length; j++) 
            {
            arr[j] = rand.nextInt(100);
            }
            for (int i = 0; i < arr.length; i++) 
            {
                System.out.println("Index" + i + " = " + arr[i]);
            }
            P1 t1 = new P1(arr);
            P2 t2 = new P2(arr);
            t1.run();//for odd entries
            t2.run();//for even entries
}
}

class P1 extends Thread  {
        int[] array;
        public P1(int[] array) 
        {
            this.array = array;
        }
        void odd(int[] array)
        {
        this.array = array;
        start();
        }
        public void run() 
        {
            System.out.println("odd :");
            for (int j = 0; j < array.length; j++)
            {
            if (j % 2 == 1) 
            {
                System.out.println(array[j]);
            }
            }
        }
}
class P2 extends Thread{
        int[] array;
        public P2(int[] array) 
        {
            this.array = array;
        }
        void even(int[] arrAay) 
        {
        this.array = array;
        start();
        }
        public void run()
        {
        System.out.println("Even :");
        for (int j = 0; j < array.length; j++) 
        {
        if (j % 2 == 0) 
        {
        System.out.println(array[j]);
        }
        }
}


}
