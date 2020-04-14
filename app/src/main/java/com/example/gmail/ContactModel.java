package com.example.gmail;

public class ContactModel {
    String fullName;
    int avatarResource;
    boolean isSelected;
    String time;
    String description;

    public ContactModel(String fullName, int avatarResource,String time,String des) {
        this.fullName = fullName;
        this.avatarResource = avatarResource;
        this.isSelected = false;
        this.time = time;
        this.description = des;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAvatarResource() {
        return avatarResource;
    }

    public void setAvatarResource(int avatarResource) {
        this.avatarResource = avatarResource;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
