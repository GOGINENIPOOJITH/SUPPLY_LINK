package com.wecp.progressive.entity;

public class Supplier {
    private int supplier_id;
    private String supplier_nmae;
    private String contact_email;
    private String contact_phone;
    private String address;
    private String role;
    public Supplier(int supplier_id, String supplier_nmae, String contact_email, String contact_phone, String address,
            String role) {
        this.supplier_id = supplier_id;
        this.supplier_nmae = supplier_nmae;
        this.contact_email = contact_email;
        this.contact_phone = contact_phone;
        this.address = address;
        this.role = role;
    }
    public int getSupplier_id() {
        return supplier_id;
    }
    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }
    public String getSupplier_nmae() {
        return supplier_nmae;
    }
    public void setSupplier_nmae(String supplier_nmae) {
        this.supplier_nmae = supplier_nmae;
    }
    public String getContact_email() {
        return contact_email;
    }
    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }
    public String getContact_phone() {
        return contact_phone;
    }
    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    

}