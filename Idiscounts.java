package jmv;

public interface Idiscounts extends Iservice{
    public static final Iservice desserv = null;
    public  abstract void add_discount( String typedisc, int discprecty);
    public  abstract void execute(service_provider providername, int telephone,  int amount);
}
