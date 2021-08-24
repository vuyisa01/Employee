
/*
    Employee.java
    Entity for employees
    Aurthor: Vuyisa Nkangana(218192215)
    Date: 24 August
 */
package za.ac.cput.Entity;

public class Employee {
    private String employeeNumb, firstName, lastName;

    private Employee(Builder builder) {
        this.employeeNumb = builder.employeeNumb;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }
    @Override
    public String toString() {
        return "Builder{" +
                "employeeNumb='" + employeeNumb + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static class Builder{
    private String employeeNumb, firstName, lastName;

    public Builder setEmployeeNumb(String employeeNumb){
        this.employeeNumb = employeeNumb;

        return this;
    }

    public Builder setFirstName(String firstName){
        this.firstName = firstName;

        return this;
    }

    private Builder setLastName(String lastName){
        this.lastName = lastName;

        return this;
    }
    public Employee build(){
        return new Employee(this);
    }
    public Builder copy(Employee employee){
        this.employeeNumb = employee.employeeNumb;
        this.firstName = employee.firstName;
        this.lastName = employee.lastName;

        return this;
    }


    }

}
