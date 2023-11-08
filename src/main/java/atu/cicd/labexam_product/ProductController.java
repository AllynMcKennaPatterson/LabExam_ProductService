package atu.cicd.labexam_product;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ProductController {
    private ProductServiceClient productServiceClient;
    private ProductService productService;
    ArrayList<ProductDetails> allProducts = new ArrayList<ProductDetails>();
    public ProductController(ProductServiceClient productServiceClient, ProductService productService){
        this.productServiceClient = productServiceClient;
        this.productService = productService;
    }

    @PostMapping("add-product")
    public ArrayList<ProductDetails> addProduct(@RequestBody ProductDetails productDetails){
        return productService.addProduct(productDetails);
    }

    @GetMapping("get-product/{productId}")
    public ProductDetails getProduct(@PathVariable int productId){
        return productService.getProduct(productId);
    }
}
