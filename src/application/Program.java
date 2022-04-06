package application;

import model.entities.*;
import model.services.CostsService;
import model.services.FipeService;
import model.services.SP_Costs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String name, email, telephone, CPF, CNPJ;
        Client client;

        System.out.println("Inform your name, your email and your telephone, please.");
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Email: ");
        email = sc.nextLine();
        System.out.print("Telephone: ");
        telephone = sc.nextLine();

        System.out.print("Individual Registry or National Registry(i/n)? ");
        char typePerson = sc.next().charAt(0);

        if (typePerson == 'i') {
            System.out.print("CPF: ");
            CPF = sc.next();
            System.out.print("Birth date (dd/MM/yyyy): ");
            Date birthDate = sdf.parse(sc.next());
            client = new Individual(name, email, telephone, CPF, birthDate);
        } else {
            System.out.print("CNPJ: ");
            CNPJ = sc.nextLine();
            System.out.println("Foundation date (dd/MM/yyyy): ");
            Date foundationDate = sdf.parse(sc.next());
            client = new Company(name, email, telephone, CNPJ, foundationDate);
        }

        String automaker, model, color, plate, modelYearOfManufacture;
        double valueFipeVehicle, debtsVehicle;

        System.out.println("Provide vehicle data");
        System.out.print("Automaker: ");
        automaker = sc.next();
        System.out.print("Model: ");
        model = sc.next();
        System.out.print("Color: ");
        color = sc.next();
        System.out.print("Plate: ");
        plate = sc.next();
        System.out.print("Year of manufacture and model: ");
        modelYearOfManufacture = sc.next();
        System.out.print("Fipe value: ");
        valueFipeVehicle = sc.nextDouble();
        System.out.print("Debts vehicle: ");
        debtsVehicle = sc.nextDouble();

        Vehicle vehicle = new Vehicle(automaker, model, color, plate, modelYearOfManufacture, valueFipeVehicle);

        int number;
        Date dateContract;
        double valueContract;

        System.out.print("Contract number: ");
        number = sc.nextInt();
        System.out.print("Contract date (dd/MM/yyyy): ");
        dateContract = sdf.parse(sc.next());
        System.out.print("Contract value: ");
        valueContract = sc.nextDouble();

        Contract contract = new Contract(number, dateContract, valueContract,client, vehicle);

        System.out.print("Today's date (dd/MM/yyyy): ");
        Date consultationDate = sdf.parse(sc.next());


        CostsService costsService = new CostsService(new SP_Costs());
        FipeService fipeService = new FipeService();
        SP_Costs sp_costs = new SP_Costs();

        String validateQuery = fipeService.validateQuery(consultationDate);
        String viabilityContract = sp_costs.viabilityContract(valueFipeVehicle, debtsVehicle);

        double finalCosts = sp_costs.valueTotalCosts() + costsService.federalTax(sp_costs);
        
        System.out.println(viabilityContract);
        System.out.println(finalCosts);
        System.out.println(validateQuery);

    }
}
