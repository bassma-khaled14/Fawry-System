package jmv;

public class orange_net implements service_provider {
	public String provider_name="orange internet payment";
	@Override
	public String getproviderName() {
		// TODO Auto-generated method stub
		return provider_name;
	}
	public boolean aggrement(int telephone, int amount) {
		
		return true;
	}

}
