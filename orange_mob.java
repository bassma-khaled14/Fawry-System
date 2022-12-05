package jmv;

public class orange_mob implements service_provider {
	public String provider_name="orange mobile recharge";
	@Override
	public String getproviderName() {
		// TODO Auto-generated method stub
		return provider_name;
	}
	public boolean aggrement(int telephone, int amount) {
		
		return true;
	}
}
