package exercise.pac.application;

import exercise.pac.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Psychology");

        Company.Employee employee = company.new Employee();
        employee.setName("John Constantin");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company2 = new Company();
        company2.setName("Markuso");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Rijal");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());
    }
}
