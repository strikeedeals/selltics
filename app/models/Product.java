package models;

import play.db.jpa.*;
import play.data.validation.*;
import javax.persistence.*;


@Entity
@Table(name="Product")

public class Product extends Model {

@Required
public String category ;

@Required
public String subCategory ;

@Required
public String name ;

@Required
public String dateTill ;

@Required
public double rent ;


public String genre ;

@Required
public String anyKnownFaults ;


public Product(String category ,String subCategory ,String name ,String dateTill ,double rent ,String genre ,String anyKnownFaults){

this.category = category ;
this.subCategory = subCategory ;
this.name = name ;
this.dateTill = dateTill ;
this.rent = rent ;
this.genre = genre ;
this.anyKnownFaults = anyKnownFaults ;

}


}

