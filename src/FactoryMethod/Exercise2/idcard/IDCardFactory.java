package FactoryMethod.Exercise2.idcard;

import java.util.LinkedHashMap;
import java.util.Map;

import FactoryMethod.Exercise2.framework.Factory;
import FactoryMethod.Exercise2.framework.Product;

public class IDCardFactory extends Factory {
    // 挿入順序保証するために LinkedHashMap を使ってみた
    private Map<String, Integer> ownersMap = new LinkedHashMap<String, Integer>();
    private int lastSerialNumber = 0;

    protected synchronized Product createProduct(String owner) {
        this.lastSerialNumber++;
        return new IDCard(owner, this.lastSerialNumber);
    }

    protected void registerProduct(Product product) {
        IDCard card = (IDCard) product;
        ownersMap.put((card).getOwner(), Integer.valueOf((card).getSerialNumber()));
        System.out.println(ownersMap);
    }
}
