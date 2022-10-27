class EmployeeDetails {
    int emp_id, salary;
    String name, address, email;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee [emp_id= " + emp_id + ", name = "
                + name + ", salary = $" + salary + ", address = " + address + ", Email= " + email + "]";
    }
}

public class Employee {
    public static void main(String[] args) {
        EmployeeDetails emp = new EmployeeDetails();

        emp.setEmp_id(101);
        emp.setName("Tony Stark");
        emp.setSalary(150000);
        emp.setAddress("New Delhi, 110001");
        emp.setEmail("tonystark.avenger@gmail.com");

        System.out.println(emp);

    }
}
