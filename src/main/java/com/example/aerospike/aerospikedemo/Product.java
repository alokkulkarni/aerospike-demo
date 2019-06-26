package com.example.aerospike.aerospikedemo;


import org.springframework.data.annotation.Id;

public class Product {

    @Id
    private Integer id;
    private String productId;
    private String description;
    private String imageUrl;
    private double price;


    /**
     * Getter for property 'id'.
     *
     * @return Value for property 'id'.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Setter for property 'id'.
     *
     * @param id Value to set for property 'id'.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for property 'productId'.
     *
     * @return Value for property 'productId'.
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Setter for property 'productId'.
     *
     * @param productId Value to set for property 'productId'.
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * Getter for property 'description'.
     *
     * @return Value for property 'description'.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter for property 'description'.
     *
     * @param description Value to set for property 'description'.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for property 'imageUrl'.
     *
     * @return Value for property 'imageUrl'.
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Setter for property 'imageUrl'.
     *
     * @param imageUrl Value to set for property 'imageUrl'.
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * Getter for property 'price'.
     *
     * @return Value for property 'price'.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Setter for property 'price'.
     *
     * @param price Value to set for property 'price'.
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
