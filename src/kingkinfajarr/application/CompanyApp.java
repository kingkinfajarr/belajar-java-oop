package kingkinfajarr.application;

import kingkinfajarr.data.Company;

public class CompanyApp {

    public static void main(String[] args) {
        Company company = new Company();
        company.setName("PT Garuda");

        Company.Employee employee = company.new Employee();
        employee.setName("Kingkin");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }

}
