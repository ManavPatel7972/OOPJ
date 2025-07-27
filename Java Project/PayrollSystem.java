import java.util.ArrayList;



class PayrollSystem{

private ArrayList<Employee> employeeList;

public PayrollSystem(){
    employeeList = new ArrayList<>();
}

public void addEmployee(Employee employee){
    employeeList.add(employee);
}

// id is sufficient to remove Employee;
public void removeEmployee(int id){

    Employee employeeToRemove = null;

    for(Employee index : employeeList){
        if(index.getId() == id){
            employeeToRemove = index;
            break;
        }
    }
    if(employeeToRemove != null){
        employeeList.remove(employeeToRemove);
    }
}

public void displayEmployees(){

    for(Employee i : employeeList){
        System.out.println(i);
    }
}
}