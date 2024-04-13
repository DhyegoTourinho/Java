package Entities;

public class Product 
{
    public String Name;
    public String Size;
    public String Type;
    public String Color;  
    public String Specification;

    public Product()
    {
    }
    
    public Product(String name, String size, String type, String color, String specification)
    {
        Name = name;
        Size = size;
        Type = type;
        Color = color;
        Specification = specification;
    }

    @Override
    public String toString() 
    {
        return "Name: " 
        + Name 
        + "\nSize: "
        + Size 
        + "\nType: "
        + Type
        + "\nColor: "
        + Color
        + "\nSpecification: "
        + Specification;
    }
}
