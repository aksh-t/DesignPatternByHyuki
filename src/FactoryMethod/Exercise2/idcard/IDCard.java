package FactoryMethod.Exercise2.idcard;

import FactoryMethod.Exercise2.framework.Product;

public class IDCard extends Product {
    private String owner;
    private int serialNumber;

    IDCard(String owner, int serialNumber) {
        System.out.println(owner + "のカード(通し番号:" + serialNumber + ")を作ります。");
        this.owner = owner;
        this.serialNumber = serialNumber;
    }

    public void use() {
        System.out.println(owner + "のカード(通し番号:" + serialNumber + ")を使います。");
    }

    public String getOwner() {
        return owner;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}
