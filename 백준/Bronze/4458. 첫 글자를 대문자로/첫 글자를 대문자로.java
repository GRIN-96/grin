import java.util.Scanner;
public class Main {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int N= Integer.parseInt(sc.nextLine());
        
    while(N-->0){
        StringBuffer sb = new StringBuffer();
        String s = sc.nextLine();
        
          if(s.charAt(0)>='a' && s.charAt(0)<='z'){
              sb.append((char)(s.charAt(0)-32));
             }
          else{
            sb.append(s.charAt(0));
          }
        System.out.println(sb.append(s.substring(1)));
        }
        sc.close();
    }
  }

