import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;

import Entities.Company;
import Entities.Product;
import Entities.Responsible;

public class App {
    public static void main(String[] args) throws Exception 
    {
        List <Company> Companies = new ArrayList<Company>();
        
        //Register Companies:
        String ConfirmCompany = JOptionPane.showInputDialog("Register new company (Y/N)? ");
        while (ConfirmCompany.equals("Y"))
        {
            String NameCompany = JOptionPane.showInputDialog("Name: ");
            String CNPJ = JOptionPane.showInputDialog("CNPJ: ");
            String NamePersonResponsible = JOptionPane.showInputDialog("Name of the responsible person: ");
            String PhoneNumber = JOptionPane.showInputDialog("Responsible person number: ");
            
            //Instances:
            Responsible InputPersonResponsible = new Responsible(NamePersonResponsible, PhoneNumber); 
            Company InputCompany = new Company(NameCompany, CNPJ, InputPersonResponsible);
            
            //Register products:
            String ConfirmProduct = JOptionPane.showInputDialog("Register a new product of the company (Y/N)? ");
            while (ConfirmProduct.equals("Y")) 
            {
                String NameProduct = JOptionPane.showInputDialog("Product name: ");
                String Size = JOptionPane.showInputDialog("Product Size: ");
                String Type = JOptionPane.showInputDialog("Product type: ");
                String Color = JOptionPane.showInputDialog("Product color: ");
                String Specification = JOptionPane.showInputDialog("Product specification: ");

                Product InputProduct = new Product(NameProduct, Size, Type, Color, Specification);
                InputCompany.AdicionarProduto(InputProduct);
                ConfirmProduct = JOptionPane.showInputDialog("Register a new product of the company (Y/N)? ");
            }
            Companies.add(InputCompany);
            ConfirmCompany = JOptionPane.showInputDialog("Register new company (Y/N)? ");
        }
        
        //Show Companies and products:
        for (Company company : Companies) 
        {
            //Show Companies.
            JOptionPane.showMessageDialog(null, company);
            //Show Products.
            JOptionPane.showMessageDialog(null, "Product list: \n");
            for (Product product : company.Products) 
            {
                JOptionPane.showMessageDialog(null, product + "\n");
            }
        }        
    }
}
