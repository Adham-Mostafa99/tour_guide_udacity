package com.example.tourguide;

public class ViewData {
    private int image_res;
    private String image_name, image_info, image_location;

    public ViewData(int image_res, String image_name, String image_info, String image_location) {
        this.image_res = image_res;
        this.image_name = image_name;
        this.image_info = image_info;
        this.image_location = image_location;
    }


    public int getImage_res() {
        return image_res;
    }

    public String getImage_name() {
        return image_name;
    }

    public String getImage_info() {
        return image_info;
    }

    public String getImage_location() {
        return image_location;
    }
}
