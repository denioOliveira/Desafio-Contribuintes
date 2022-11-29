package taxImposto;

public class TaxPayer {
	private Double salaryIncome;
	private Double serviceIncome;
	private Double capitalIncome;
	private Double healthSpending;
	private Double educationSpending;
	
	public TaxPayer(Double salaryIncome, Double serviceIncome, Double capitalIncome, Double healthSpending,
			Double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.serviceIncome = serviceIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public Double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(Double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public Double getServiceIncome() {
		return serviceIncome;
	}

	public void setServiceIncome(Double serviceIncome) {
		this.serviceIncome = serviceIncome;
	}

	public Double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(Double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public Double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(Double educationSpending) {
		this.educationSpending = educationSpending;
	}
	public Double salaryTax() {
		double aux = salaryIncome;
		if (aux < 36000.0) {
			aux = 0.0;
		}
		else if (aux < 60000.0 ) {
			aux *= 0.1;
		}
		else {
			aux *= 0.2;
		}
		return aux;
	}
	
	public Double servicesTax() {
		double aux = serviceIncome;
		aux *= 0.15;
		return aux;
	}
	
	public Double capitalTax() {
		double aux = capitalIncome;
		aux *= 0.2;
		return aux;
	}
	
	public Double grossTax() {
		Double aux = salaryTax() + servicesTax() + capitalTax();
		return aux; 
	}
	
	public Double taxRebate() {
		Double aux2 = healthSpending + educationSpending;
		 Double aux = grossTax() * 0.3;
		if (aux < aux2) {
			return aux;
		}
		return aux2;
	}
	
	public Double netTax() {
		 Double aux = grossTax();
		 aux -= taxRebate();
		 return aux;
	}
}
