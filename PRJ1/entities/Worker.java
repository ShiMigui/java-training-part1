package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
    private WorkerLevel workerLevel;
    private Double baseSalary;
    private String name;

    private List<HourContract> contracts = new ArrayList<>();
    private Departament departament;

    public Worker() {
    }

    public Worker(WorkerLevel workerLevel, Double baseSalary, String name, Departament departament) {
        setDepartament(departament);
        setWorkerLevel(workerLevel);
        setBaseSalary(baseSalary);
        setName(name);
    }

    public void addContract(HourContract hourContract) {
        contracts.add(hourContract);
    }

    public void removeContract(HourContract hourContract) {
        contracts.remove(hourContract);
    }

    public Double income(int year, int month){
        Double sum = baseSalary;

        for(HourContract contract : contracts){
            int yContract = contract.getDate().getYear();
            int mContract = contract.getDate().getMonthValue();
            if(yContract == year && month == mContract){
                sum += contract.totalValue();
            }
        }

        return sum;
    }

    //#region Getters e setters
    public WorkerLevel getWorkerLevel() {
        return workerLevel;
    }

    public void setWorkerLevel(WorkerLevel workerLevel) {
        this.workerLevel = workerLevel;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }
    //#endregion
}
