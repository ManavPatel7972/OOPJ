
public class Main {

    public static void main(String[] args) {
        PayrollSystem payroll1 = new PayrollSystem();
        FullTimeEmployee femp1 = new FullTimeEmployee("Manav",101,10000.0);
        PartTimeEmployee pemp1 = new PartTimeEmployee("Another",201,12,100);

        FullTimeEmployee femp2 = new FullTimeEmployee("Random",102,5000.0);
        PartTimeEmployee pemp2 = new PartTimeEmployee("mi",202,10,200);

        payroll1.addEmployee(femp1);
        payroll1.addEmployee(pemp1);
        payroll1.addEmployee(femp2);
        payroll1.addEmployee(pemp2);

        System.out.println("Initial Employee Details : ");
        payroll1.displayEmployees();

        System.out.println("Remove Employees");
        payroll1.removeEmployee(201);
        System.out.println("Remaining Employee Details:");
        payroll1.displayEmployees();


    }
   }