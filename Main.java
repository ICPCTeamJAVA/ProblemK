package main;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Noah's PC
 */
public class Main {
    public static void main(String[] args) 
    {
       Scanner Input = new Scanner(System.in);
       String[] ICPCList = new String[2000];
       int x = 0;
       outerloop:
       while(x < 2000)
       {
         if(Input.nextLine().isBlank())
         {
             break outerloop;
         }
         ICPCList[x] = Input.nextLine();
         x++;
       }
       
       String[] OutsideList = new String[2000];
       int y = 0;
       outerloop2:
       while(y < 2000)
       {
           if(Input.nextLine().isBlank())
           {
               break outerloop2;
           }
           OutsideList[x] = Input.nextLine();
           y++;
       }
       int z = 0;
       while(z < ICPCList.length - 3)
       {
           if(!ICPCList[z].equals(OutsideList[z]) && !ICPCList[z+1].equals(OutsideList[z+1]) || !ICPCList[z+2].equals(OutsideList[z+2]))
           {
               System.out.println("I" + " " + ICPCList[z+3] +" "+ ICPCList[z+2] +" "+ ICPCList[z]);
               z = z +3;
           }
       }
       
       int a = 0;
       while(a < OutsideList.length - 3)
       {
           if(!ICPCList[z].equals(OutsideList[z]) && !ICPCList[z+1].equals(OutsideList[z+1]) || !ICPCList[z+2].equals(OutsideList[z+2]))
           {
               System.out.println("O" + " " + OutsideList[z+3] + " " + OutsideList[z+2] + " " + OutsideList[z]);
               a = a + 3;
           }
       }
    }
    
}
