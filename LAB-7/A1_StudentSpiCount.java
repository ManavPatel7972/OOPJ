/*
 Declare a class called Student having following data members:id_no, 
no_of_subjects_registered, subject_code, subject_credits, grade_obtained and spi. 
Define constructor and calculate_spi methods. Define main to instantiate an array for 
objects of class student to process data of n students to be given as command line 
arguments. [A] 
 */

import java.util.Scanner;

public class A1_StudentSpiCount {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no_of_subject_registered:");
        int no_of_subject_registered = sc.nextInt();

        String[] subject_code = new String[no_of_subject_registered];
        System.out.println("Enter a Subject code Details:");

        for(int i=0;i<subject_code.length;i++){
            System.out.println("Enter a Subject code of Subject No  " + (i+1) + " = ");
            subject_code[i] = sc.next();
        }

        int[] subject_credits = new int[no_of_subject_registered];
        System.out.println("Enter a Subject Credits:");

        for(int i=0;i<subject_credits.length;i++){
            System.out.println("Enter a Subject Credit of " + subject_code[i] + " = ");
            subject_credits[i] = sc.nextInt();
        }

        System.out.println("Enter a Grade Obtaine by Student:");
        char[] grade_obtained = new char[no_of_subject_registered];

        for(int i=0;i<grade_obtained.length;i++){
            System.out.println("Enter a Grade Obtaine of " + subject_code[i] + " = ");
            grade_obtained[i] = sc.next().charAt(0);
        }


        Student s1 = new Student(101, no_of_subject_registered, subject_code, subject_credits, grade_obtained);

            System.out.println("Spi of Student = " + s1.claculateSpi());

        Student s2 = new Student(102, no_of_subject_registered, subject_code, subject_credits, grade_obtained)
        
    }
}

class Student{

    int id_no;
    int no_of_subjects_registered;
    String[] subject_code;
    int[] subject_credits;
    char[] grade_obtained;
    double spi;
  

    Student(int id_no,int no_of_subjects_registered,String[] subject_code,int[] subject_credits,char[] grade_obtained){
        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        this.subject_code = subject_code;
        this.subject_credits = subject_credits;
        this.grade_obtained = grade_obtained;
    }

    public double claculateSpi(){

        int total_Obtaine_Credits = 0,total_gradepoint=0;

        for(int i=0;i<no_of_subjects_registered;i++){
          total_Obtaine_Credits += subject_credits[i];
        }

        for(int i=0;i<no_of_subjects_registered;i++){
         total_gradepoint += ( subject_credits[i] * creditCount(grade_obtained[i]));
        }
        this.spi=(double)total_gradepoint/total_Obtaine_Credits;
        return this.spi;
    }

    public int creditCount(char grade){
            if(grade == 'A'){
                return 10;
            }
            if(grade == 'B'){
                return 8;
            }
            if(grade == 'C'){
                return 6;
            }
            return 0;
    }

}
