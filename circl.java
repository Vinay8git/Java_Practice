import java.util.Scanner;

public class circl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String: ");
        String st= sc.nextLine();
        System.out.println("Enter Character To Be Searched");
        char ch=sc.next().charAt(0);
        for(int i=0;i<st.length();i++)
        {
            if(st.charAt(i)==ch)
            {
                System.out.println("Character Found At Index: "+i);
            }
        }
        sc.close();
    }
}
