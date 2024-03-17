package com.spring.ProductEntity;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import jakarta.persistence.*;


@Entity
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer categoryId;
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", referencedColumnName = "categoryId") 
    private List<ProductEntity> products = new ArrayList<>();

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<ProductEntity> getProducts() {
        return products;
    }

    public void setProducts(List<ProductEntity> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "CategoryEntity [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
    }

    public CategoryEntity() {
        
    }

    public CategoryEntity(String categoryName, List<ProductEntity> products) {
        super();
        this.categoryName = categoryName;
        this.products = products;
    }

	public Optional<CategoryEntity> findById(Integer categoryId2) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(Integer categoryId2) {
		// TODO Auto-generated method stub
		
	}

	public CategoryEntity save(CategoryEntity cat) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<CategoryEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}

