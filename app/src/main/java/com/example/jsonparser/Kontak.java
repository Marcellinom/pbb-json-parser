package com.example.jsonparser;

public class Kontak {
    private String id;
    private String nama;
    private String email;
    private String mobile;

    public Kontak(String id, String nama, String email, String mobile) {
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.mobile = mobile;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }
}
