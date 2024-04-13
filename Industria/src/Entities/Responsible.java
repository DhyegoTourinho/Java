package Entities;

public class Responsible
{
    public String Name;
    public String PhoneNumber;

    public Responsible ()
    {
    }

    public Responsible (String name, String phoneNumber)
    {
        Name = name;
        PhoneNumber = phoneNumber;
    }
    
    @Override
    public String toString() 
    {
        return "Responsible person name: "
        + Name 
        + " \nResponsible phone Number: "
        + PhoneNumber;
    }
}
