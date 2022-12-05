package jmv;

public class monthly_land implements service_provider {
	public String provider_name="monthly landline";
	
	@Override
	public String getproviderName() {
		// TODO Auto-generated method stub
		return provider_name;
	}
	public boolean aggrement(int telephone, int amount) {
		
		return true;
	}

}
