package com.example.aerospike.aerospikedemo;

import com.example.aerospike.aerospikedemo.repository.ProductRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
@Log4j2
public class ProductLoader implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        productRepository.deleteAll();
        Product shirt = new Product();
        shirt.setId(10001);
        shirt.setDescription("Aerospike Shirt");
        shirt.setPrice(18.95);
        shirt.setImageUrl("http://hunt4freebies.com/wp-content/uploads/2014/07/Aerospike-T-shirt.png");
        shirt.setProductId("235268845711068308");
        productRepository.save(shirt);

        log.info("Saved Shirt - id: " + shirt.getId());

        Product mug = new Product();
        mug.setId(10002);
        mug.setDescription("Aerospike Mug");
        mug.setPrice(4.99);

        mug.setImageUrl(
                "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcR3TPM0daB-aXKfxdYqlHHgQrz67bSCPKUcpbmzPXtvo3GillfR");
        mug.setProductId("168639393495335947");
        productRepository.save(mug);

        log.info("Saved Mug - id:" + mug.getId());

        productRepository.findAll().forEach(product -> log.info(product.getId() + " " + product.getDescription()));
    }
}
