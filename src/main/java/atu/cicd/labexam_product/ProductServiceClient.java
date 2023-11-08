package atu.cicd.labexam_product;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="product-service", url="http://localhost:8081")
public interface ProductServiceClient {
    @PostMapping("/confirm-capacity")
    WarehouseDetails warehouseDetail (@RequestBody ProductDetails productDetails);
}
