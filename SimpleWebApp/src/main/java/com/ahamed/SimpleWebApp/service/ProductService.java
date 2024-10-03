package com.ahamed.SimpleWebApp.service;

import com.ahamed.SimpleWebApp.model.Product;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products= new ArrayList<>(Arrays.asList(new Product(101,"Redmi",20000),new Product(102,"Motorola",30000)));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodId){
//        return  products.stream().filter(product -> product.getProdId() == prodId).findFirst().get(); //If item present it will give if not not present use the anotehr method to handle this orElse
        return  products.stream().filter(product -> product.getProdId() == prodId).findFirst().orElse(new Product(100,"no item",0));
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void updateProduct(Product product) {
        products.set(findIndex(product),product);
    }

    public void deleteProductById(int prodId) {
        products.remove(findIndexbyId(prodId));
    }

    public int findIndex(Product product){
        int index=0;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdId()==product.getProdId()){
                index=i;
            }
        }
        return index;
    }
    public int findIndexbyId(int prodId){
        int index=0;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdId()==prodId){
                index=i;
            }
        }
        return index;
    }


}
