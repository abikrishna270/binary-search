import java.util.Scanner;

public class binarysearch {
    public static void main(String args[]){
        System.out.println("HOW MANY SORTED NUMBERS");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int array[]=new int[num];
        System.out.println("ENTER THE SORTED NUMBER");
        for(int i=0;i<=num-1;i++)
        {
            if(i>num-1){
                break;
            }
            array[i]=sc.nextInt();
        }
        System.out.println("ENTER THE NUMBER TO SEARCH");
        int search=sc.nextInt();
        int first=0;
        int last=num-1;
        int mid;
        mid=(first+last)/2;
      for(int j=0;j<=last;j++,mid=((first+last)/2)){
        if (array[mid]<search)
              {
            first=mid+1;
              }
     else if(array[mid]==search){
              System.out.println("SEARCHED ELEMENT IS IN " + (mid+1)  +"th POSITION");
              break;
              }
         else {
              last=mid-1;
              }
    }
}}
