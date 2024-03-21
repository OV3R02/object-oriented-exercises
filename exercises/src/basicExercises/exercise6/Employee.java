package basicExercises.exercise6;

public class Employee {
    private String name;
    private String jobTitle;
    private double salary;
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", jobTitle=" + jobTitle + ", salary=" + salary + "]";
    }

    public void raiseSalary(double percentage){
        salary = salary+salary*percentage / 100;
    }

    public void printEmployeeInfo(){
        
        System.out.println("\nEmployee name: "+name);
        System.out.println("Job title: "+jobTitle);
        System.out.println("Salary: "+salary);
    }
}
