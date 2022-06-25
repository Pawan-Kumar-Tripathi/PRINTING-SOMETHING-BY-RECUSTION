import java.io.*;
import java.util.*;
class printMyName 
    {
        public static void printMYNAME(String name)
        {
            System.out.println(name);
            return;
        }
        
        public static void main()
        {
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            
            printMYNAME(name);
        }
    }