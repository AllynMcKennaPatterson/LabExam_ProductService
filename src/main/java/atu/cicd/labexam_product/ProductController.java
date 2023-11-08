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
    public String addProduct(@RequestBody ProductDetails productDetails){
        WarehouseDetails confirmCapacity = productServiceClient.warehouseDetail(productDetails);
        if(confirmCapacity.getCapacity() > 0){
            return("Product added to warehouse: " + productDetails);
        }
        return("No space available to add product");
    }

    @GetMapping("get-product/{productId}")
    public ProductDetails getProduct(@PathVariable int productId){
        return productService.getProductById(productId);
    }
}
