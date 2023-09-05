package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataEncapsulationCompany {
  private String name;
  private List<String> employees = new ArrayList<>();

  public void printSorted() {
    System.out.println("company name = " + name);
    Collections.sort(employees);
    System.out.println("sorted = " + employees);
  }

  public void setName(String name) {
    if (name == null || name.isEmpty()) { throw new NullPointerException("name cannot be null"); }
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void addEmployee(String name) {
    if (name == null || name.isEmpty()) { throw new NullPointerException("name cannot be null"); }
    employees.add(name);
  }


}
