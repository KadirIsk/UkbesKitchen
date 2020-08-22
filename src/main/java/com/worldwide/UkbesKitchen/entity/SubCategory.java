package com.worldwide.UkbesKitchen.entity;

import com.worldwide.UkbesKitchen.entity.baseEntity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "SUBCATEGORY")
public class SubCategory extends BaseEntity {

    @Column(name = "CATEGORYID")
    private String categoryId;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}
