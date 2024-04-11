package org.example.products;

public enum SizeEnum {
    SMALL("petit"),
    MEDIUM("moyen"),
    LARGE("grand"),
    NORMAL("normal"),
    SPECIAL("special"),
    DISH("assiette"),
    YES("yes");

    private String size;

    SizeEnum(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public static SizeEnum fromSize(String size) {
        for (SizeEnum sizeEnum: values()) {
            if (sizeEnum.getSize().equals(size)) {
                return sizeEnum;
            }
        }
        throw new IllegalArgumentException("No enum constant org.example.products.SizeEnum." + size);
    }

}
