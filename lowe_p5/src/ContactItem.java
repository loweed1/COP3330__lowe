public class ContactItem {

    private String firstname;
    private String lastname;
    private String phonenumber;
    private String emailAddress;

    public boolean ContactItem(String fn,String ln,String pn,String em)
    {
        boolean b = (setFirstName(fn) || setLastName(ln)  || setPhoneNumber(pn))|| setEmailAddress(em) ;
        return b;
    }

    public boolean canAddItem(String fn,String ln,String pn,String em)
    {
        boolean b1 = setFirstName(fn);
        boolean b2= setLastName(ln);
        boolean b3 = setPhoneNumber(pn);
        boolean b4 = setEmailAddress(em);
        boolean b = (b1 || b2 ) || b3 || b4 ;
        return b;
    }
    public String getFirstName()
    {
        return this.firstname;
    }

    public String getLastName()
    {
        return this.lastname;
    }

    public String getPhoneNumber()
    {
        return this.phonenumber;
    }

    public String getEmailAddress()
    {
        return this.emailAddress;
    }
    public boolean setFirstName(String s)
    {
        this.firstname = s;
        if(s.isEmpty())
            return false;
        else
        {

            return true;
        }

    }

    public boolean setLastName(String str)
    {
        this.lastname = str;
        if(str.isEmpty())
            return false;
        else
        {

            return true;
        }

    }

    public boolean setPhoneNumber(String num)
    {
        if(num.isEmpty())
            return false;
        else
        {
            this.phonenumber = num;
            return true;
        }

    }

    public boolean setEmailAddress(String email)
    {
        if(email.isEmpty())
            return false;
        else
        {
            this.emailAddress = email;
            return true;
        }

    }

    public String ToString()
    {
        return "Name:"+this.firstname+this.lastname+"Phone:"+this.phonenumber+"Email:"+this.emailAddress;
    }
}