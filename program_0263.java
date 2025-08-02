import java.util.Scanner;

class program_52 {
   public static void main(String A[])
   {
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sobj.nextLine();

        System.out.print("Enter your age : ");
        int age = sobj.nextInt();

        System.out.print("Enter your marks : ");
        float marks = sobj.nextFloat();

        System.out.println("Name : "+name);
        System.out.println("age : "+age);
        System.out.println("Marks : "+marks);

        sobj.close();

   } 
}
