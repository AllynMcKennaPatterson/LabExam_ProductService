package atu.cicd.labexam_product;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ProductController {
    private ProductServiceClient productServiceClient;
    ArrayList<ProductDetails> allProducts = new ArrayList<ProductDetails>();
    public ProductController(ProductServiceClient productServiceClient){
        this.productServiceClient = productServiceClient;
    }

    @PostMapping("add-product")
    public ArrayList<ProductDetails> addProduct(@RequestBody ProductDetails productDetails){

        allProducts.add(productDetails);
        System.out.println(allProducts);
        return allProducts;
    }
}
