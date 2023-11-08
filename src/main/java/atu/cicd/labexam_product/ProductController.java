package atu.cicd.labexam_product;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping("get-product/{productId}")
    public ProductDetails getProduct(@PathVariable int productId){
        for(int i =0; i < allProducts.size(); i++){
            if(allProducts.get(i).getProductId() == productId) {
                System.out.println(allProducts.get(i));
                return allProducts.get(i);
            }
        }
        ProductDetails errorProduct = new ProductDetails(productId, "Product not found", 0, 0);
        System.out.println(errorProduct);
        return  errorProduct;
    }
}
