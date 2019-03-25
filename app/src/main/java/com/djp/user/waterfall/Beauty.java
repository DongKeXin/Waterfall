package com.djp.user.waterfall;

/**
 * Created by Mr.Dong on 2019/3/10.
 */

public class Beauty {
    /**
     * 名字
     */
    private String name;
    /**
     * 图片id
     */
    private int imageId;

    public Beauty(String name, int imageId){
        this.name = name;
        this.imageId = imageId;

    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
