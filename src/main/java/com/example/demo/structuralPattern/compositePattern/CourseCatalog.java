package com.example.demo.structuralPattern.compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName : CourseCatalog
 * @Description: TODO
 * @Author: jilvke
 * @CreateDate: 2019/12/09
 * @Version: 1.0
 */
public class CourseCatalog extends CatalogComponent {
    //目录组件
    private List<CatalogComponent> items = new ArrayList<CatalogComponent>();
    private String                 name;  //目录名称
    private Integer                level;  //目录级别


    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent catalogComponent : items) {
            if (this.level != null) {
                for (int i = 0; i < this.level; i++) {
                    System.out.print("  ");
                }
            }
            catalogComponent.print();
        }
    }

}
