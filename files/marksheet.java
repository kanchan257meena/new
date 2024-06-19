import java.util.Scanner;
class HelloWorld {
    
    public static void rollno( ){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter roll number: ");
        int n=sc.nextInt();
     }
     
    
      public static void name( ){
          Scanner sc=new Scanner(System.in);
        System.out.println("enter name: ");
        String a=sc.nextLine();
     }
       public static void attendance( ){
        Scanner sc=new Scanner(System.in);
       // System.out.println("total number of classes: ");
       // int y=sc.nextInt();
        System.out.println("total number of classes attended out of 400: ");
        float z=sc.nextInt();
        System.out.println("your attendence is: "+(z/400)*100+"%");
    
     }
     
    public static void inputSubjectsAndMarks(){ 
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter the number of subjects: ");
        int size = sc.nextInt();
        
        String[] subjects = new String[size];
        int[] marks = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter subject " + (i+1) + ": ");
            subjects[i] = sc.next();
            
            System.out.print("Enter marks obtained in " + subjects[i] + ": ");
            marks[i] = sc.nextInt();
        }
    
        System.out.println("Subjects and Marks:");
        for (int i = 0; i < size; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);}
            
            float avg =0f;
            
            for (int j = 0; j < size; j++) {
                
             avg =avg+ marks[j];}
            
           System.out.println("your percentage is"+(avg/size)) ;
    }
    
public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the number of students: ");
    int std=sc.nextInt();
    for(int i=1;i<=std;i++){
    rollno();
    name();
    attendance();
    inputSubjectsAndMarks();}
}
}