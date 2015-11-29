/**
 * /codeone/Manager.java
 * author: iamaprin
 * date: 2015/11/29
 * time: 20:42
 * description:
 */
package codeone;

class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {
    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int getSalary() {
        return super.getSalary() + bonus;
    }
}

public class IsaTest {

    public static void main(String[] args) {
        Employee manager = new Manager("ZhangSan", 5000, 2000);
        System.out.println(manager.getName());
        System.out.println(manager.getSalary());

        //can employee use the method getBouns()? no
        //System.out.println(employee.getBouns());
    }
}