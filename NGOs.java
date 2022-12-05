package jmv;

public class NGOs implements service_provider {
	public String provider_name="NGOs";

	@Override
	public String getproviderName() {
	
		return provider_name;
	}
	public boolean aggrement(int telephone, int amount) {
		
		return true;
	}
}
