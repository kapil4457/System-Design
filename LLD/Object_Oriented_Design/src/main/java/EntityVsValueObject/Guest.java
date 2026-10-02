package EntityVsValueObject;

public class Guest {

    private final String guestId;
    private String name;
    private String emailId;
    private String phoneNumber;


    public Guest(String _guestId, String _name, String _emailId, String _phoneNumber){
        this.guestId = _guestId;
        this.name = _name;
        this.emailId = _emailId;
        this.phoneNumber = _phoneNumber;
    }


    public String getGuestId(){
        return guestId;
    }

    public String getName(){
        return name;
    }

    public void updateEmail(String _newEmailId){
        this.emailId = _newEmailId;
    }

    public void updateName(String _newName){
        this.name = _newName;
    }


    @Override
    public boolean equals(Object obj){
        if(this == obj)return true;
        if(!(obj instanceof  Guest))return false;
        Guest other  = (Guest) obj;
        return this.guestId.equals(other.getGuestId());
    }

    @Override
    public int hashCode(){
        return guestId.hashCode();
    }
}
