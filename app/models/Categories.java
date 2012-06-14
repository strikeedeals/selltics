package models;

import play.db.jpa.*;
import play.data.validation.*;
import javax.persistence.*;


@Entity
@Table(name="Categories")

public class Categories extends Model {

@Required
public String catID ;

@Required
public String parentId ;


@Required
public String catName ;

public String catDesc ;


public Categories(String catID ,String parentId ,String catName ,String catDesc){

this.catID = catID ;
this.parentId = parentId ;
this.catName = catName ;
this.catDesc = catDesc ;

}


public String toString() {

        return "Category name = " + catName + " and Parent ID is = " + parentId;

    }





}
