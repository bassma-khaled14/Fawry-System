package os;

public interface service_provider {
	public String provider_name = "";
	 abstract String getproviderName() ;
	 public  abstract boolean aggrement( int telephone, int amount);
}
