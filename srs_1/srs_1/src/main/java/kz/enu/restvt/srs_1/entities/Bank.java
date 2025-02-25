package kz.enu.restvt.srs_1.entities;

import java.util.ArrayList;
import java.util.List;

public class Bank
{
    int id;
    private String name;                // имя банка
    private String registrationNumber;  // БИН
    private String address;             // адрес
    private double capital;             // уставный капитал

    // список клиентов банка
    private List<Client> clients;

    // добавление клиента в банк
    public void addClient(Client client)
    {
        clients.add(client);
    }

    public Bank()
    {

    }

    public Bank(int id, String name, String registrationNumber, String address, double capital, List<Client> clients)
    {
        this.id = id;
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.address = address;
        this.capital = capital;
        this.clients = clients;
    }

    public Bank(int id, String name, String registrationNumber, String address, double capital)
    {
        this.id = id;
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.address = address;
        this.capital = capital;
        this.clients = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getRegistrationNumber()
    {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber)
    {
        this.registrationNumber = registrationNumber;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public double getCapital()
    {
        return capital;
    }

    public void setCapital(double capital)
    {
        this.capital = capital;
    }

    public List<Client> getClients()
    {
        return clients;
    }

    public void setClients(List<Client> clients)
    {
        this.clients = clients;
    }

    @Override
    public String toString()
    {
        return "Bank{" +
                "name='" + name + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", address='" + address + '\'' +
                ", capital=" + capital +
                ", clients=" + clients +
                '}';
    }
}
