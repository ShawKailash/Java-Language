// Write a java program to find out the type of website from the url
// .com -> commercial website
// .org -> organization website
// .in -> indian website

import java.util.Scanner;
public class Java_6_WebSite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("use this website .com , .org , .in ");
        String website = sc.next();
        if(website.endsWith(".com"))
        {
            System.out.println("this is an commercial website");
        }
        else if(website.endsWith(".org"))
        {
            System.out.println("this is an organizational website");
        }
        else if(website.endsWith(".in"))
        {
            System.out.println("this is an indian website");
        }
    }
}
