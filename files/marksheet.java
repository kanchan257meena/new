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
            System.out.println(subjects[i] + ": " + marks[i]);
         
            
    }}
    
public static void main(String[] args){
    rollno();
    name();
    inputSubjectsAndMarks();
    //displaySubjectsAndMarks();
    
    
}


     
}