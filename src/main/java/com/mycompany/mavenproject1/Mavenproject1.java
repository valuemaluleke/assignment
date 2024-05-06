package com.mycompany.mavenproject1;

class Vehicle {
private String myBrand, myModel;
public Vehicle() {
myBrand = "unknown";
myModel = "unknown";
}
public Vehicle(String brand, String model) {
setBrand(brand);
setModel(model);
}
public String getBrand() {
return myBrand;
}
public String getModel() {
return myModel;
}
public void setBrand(String brand) {
myBrand = brand;
}
public void setModel(String model) {
myModel = model;
}
public String toString() {
return getBrand() + " " + getModel();
}
}
