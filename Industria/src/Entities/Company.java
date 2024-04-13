package Entities;
import java.util.ArrayList;
import java.util.List;

public class Company 
{
    
    public List <Product> Products = new ArrayList<Product>();

    public String Name;
    public String CNPJ;
    public Responsible ResponsiblePerson;

    public Company()
    {
    }

    public Company(String name, String cnpj, Responsible resPerson)
    {
        Name = name;
        CNPJ = cnpj;
        ResponsiblePerson = resPerson;
    }

    public void AdicionarProduto(Product product)
    {
        Products.add(product);
    }

    @Override
    public String toString() 
    {
        return "Company: "
        + Name
        + "\nCNPJ: "
        + CNPJ
        + "\n"
        + ResponsiblePerson.toString();
    }
}
