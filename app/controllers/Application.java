package controllers;

import play.mvc.*;
import play.data.validation.*;

import models.*;

import java.util.List ;

public class Application extends Controller {
     


/**

* This method will render the homepage of selltics .


*/
    public static void index() {
        render();
    }



    public static void add(){

     List<Categories> categories = null;
     categories = Categories.all().fetch();
     
     render(categories) ;

    }
 
    public static void addProduct(@Valid Product product){

	if(validation.hasErrors()){
	flash.error("Trying to be smart ! aah ?? ");
	index();

        }
	else{
	product.create();
	flash.success(product.name + " -- Added to Selltics");
	add();
	}

   } 



}
