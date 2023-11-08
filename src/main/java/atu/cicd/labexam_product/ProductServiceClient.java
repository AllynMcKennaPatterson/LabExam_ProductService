package atu.cicd.labexam_product;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@FeignClient(name="product-service", url="http://localhost:8081")
public interface ProductServiceClient {
    @PostMapping("/confirmCapacity")
    WarehouseDetails warehouseDetail (@RequestBody ProductDetails productDetails);
}
