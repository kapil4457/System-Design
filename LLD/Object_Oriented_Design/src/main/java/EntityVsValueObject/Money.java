package EntityVsValueObject;

public final class Money {

    private final double amount;
    private final String currency;

    public Money(double _amount, String _currency){
        this.amount = _amount;
        this.currency = _currency;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)return true;
        if(!(obj instanceof Money)) return false;
        Money other = (Money)obj;

        return other.currency.equals(this.currency) && other.amount == this.amount;
    }

    @Override
    public int hashCode(){
        return Double.hashCode(amount ) * 31 * currency.hashCode();
    }


    @Override
    public String toString(){
        return currency+" "+amount;
    }
}
