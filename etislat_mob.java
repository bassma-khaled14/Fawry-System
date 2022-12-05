package jmv;

public class etislat_mob implements service_provider {
	 public String provider_name="etislat mobile recharge";
	@Override
	public String getproviderName() {
		// TODO Auto-generated method stub
		return provider_name;
	}
	@Override
	public boolean aggrement(int telephone, int amount) {
	
		return true;
	}

}
