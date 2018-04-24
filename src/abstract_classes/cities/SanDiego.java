package abstract_classes.cities;

public class SanDiego extends City {
	int population1;
	double growthRate1;
	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
		population1 = population;
		growthRate1 = growthRate;
	}
	@Override
	double getAnnualTaxes() {
		// TODO Auto-generated method stub
		return population1 * growthRate1 + 1000000;
	}
}
