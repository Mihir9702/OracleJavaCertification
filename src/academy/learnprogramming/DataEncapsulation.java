package academy.learnprogramming;

public class DataEncapsulation {
  
  public static void main(String[] args) {
    DataEncapsulationCompany company = new DataEncapsulationCompany();
    company.setName("MyCompany");
    company.addEmployee("John");
    company.addEmployee("Anthony");
    company.addEmployee("Jimmy");
    company.printSorted();


    // company.addEmployee(null);
    // company.addEmployee("Jimmy"); // NullPointerException
 
    company.printSorted(); // NullPointerException because Collections.sort(null) throws NullPointerException
  }
}
