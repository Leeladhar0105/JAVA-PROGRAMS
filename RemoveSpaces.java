import java.util.Scanner;
public class RemoveSpaces {

    static void remove(String str){
        char[] ch=str.toCharArray();
        int cnt=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]!=' '){
                ch[cnt]=ch[i];
                cnt++;

            }
        }
        System.out.println(String.valueOf(ch).substring(0,cnt));

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter String:");
       String str=sc.nextLine();
       remove(str);
    }
}