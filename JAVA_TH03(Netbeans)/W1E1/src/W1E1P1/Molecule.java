/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W1E1P1;

/**
 *
 * @author DELL
 */
public class Molecule {
    private String structure;
    private  String name;
    private double weight;

    public String getStructure() {
        return structure;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Molecule() {
    }

    public Molecule(String structure, String name, double weight) {
        this.structure = structure;
        this.name = name;
        this.weight = weight;
    }
    
  
    public void display()
    {
      //  System.out.println(this.getName()+"\t\t" +this.getStructure()+"\t\t\t"+this.getWeight());
        System.out.printf("%-15s%-30s%-15f%n",this.getName(),this.getStructure(),this.getWeight());//format width string
    }
    
}
