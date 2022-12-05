package jmv;

public class we_net implements service_provider {
	public String provider_name="we internet payment";
	@Override
	public String getproviderName() {
		// TODO Auto-generated method stub
		return provider_name;
	}
	public boolean aggrement(int telephone, int amount) {
		
		return true;
	}

}