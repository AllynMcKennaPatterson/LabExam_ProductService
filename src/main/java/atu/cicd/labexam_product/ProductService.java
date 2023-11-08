package atu.cicd.labexam_product;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService {
    public ArrayList<ProductDetails> allProducts = new ArrayList<ProductDetails>();
    public ArrayList<ProductDetails> addProduct(ProductDetails productDetails){
        allProducts.add(productDetails);
        System.out.println("Product added: " + productDetails);
        return allProducts;
    }

    public ProductDetails getProductById(int productId){
        for(int i = 0; i < allProducts.size(); i++){
            if(allProducts.get(i).getProductId() == productId){
                System.out.println("Product found: " + allProducts.get(i));
                return allProducts.get(i);
            }
        }
        ProductDetails errorProduct = new ProductDetails(productId, "Product not found", 0, 0);
        System.out.println("Product not found: " + errorProduct);
        return errorProduct;
    }
}
