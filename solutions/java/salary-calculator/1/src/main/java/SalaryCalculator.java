public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double salary = (daysSkipped < 5) ? 1.0 : 0.85 ;
        return salary;
    }

    public int bonusMultiplier(int productsSold) {
       int multipler = (productsSold >= 20) ? 13 : 10 ;
        return multipler;
        
    }

    public double bonusForProductsSold(int productsSold) {
       double son = productsSold * bonusMultiplier(productsSold) ;
        return son ;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double base_salary = 1000.00;
        base_salary *= salaryMultiplier(daysSkipped);
        base_salary += bonusForProductsSold(productsSold);

        return (base_salary <= 2000.00) ? base_salary : 2000.00 ;
    } 
}



