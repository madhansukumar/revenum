import java.util.*;
public class Reversen {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int st=s.nextInt();
        int r=0,s1=0;
        while(st!=0)
        {
            r=r*10;
            r=r+st%10;
            st=st/10;
        }
        System.out.print(r);
    }
    
}
