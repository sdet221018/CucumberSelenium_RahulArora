package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class LoginStepsProduction {

    @And("user validates captcha image")
    public void user_validates_captcha_image() {
        System.out.println("@And -- user validates captcha image");
    }

    @Then("user enters firstname and lastname")
    public void user_enters_firstname_and_lastname(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        List<List<String>> data =  dataTable.asLists();

        // First Row and First Column
        System.out.println("First Name is: " + data.get(0).get(0) + " Second Name is: " + data.get(0).get(1));

        // Second Row and First Column
        System.out.println("First Name is: " + data.get(1).get(0) + " Second Name is: " + data.get(1).get(1));
    }

    @Then("user enters title, firstname and lastname")
    public void user_enters_title_firstname_and_lastname(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

//        List<Map<String, String>> map = dataTable.asMaps();

//        // First Row and First Column
//        System.out.println("\n\n"+ map.get(0).get("Title") + map.get(0).get("FirstName") + "--LastName is " + map.get(0).get("LastName"));
//
//        // Second Row and Second Column
//        System.out.println(map.get(1).get("Title") + map.get(1).get("FirstName") + "--LastName is " + map.get(1).get("LastName"));
//
//        // Third Row and Third Column
//        System.out.println(map.get(2).get("Title") + map.get(2).get("FirstName") + "--LastName is " + map.get(2).get("LastName"));

//        System.out.println(map.get(0).get("FirstName") + "--LastName is " + map.get(0).get("LastName"));

//        for (int i = 0; i < map.size(); i++) {
//            System.out.println(map.get(i).get("Title") + " " + map.get(i).get("FirstName") + " " + map.get(i).get("LastName"));
//        }

        for (Map<String, String> data: dataTable.asMaps(String.class, String.class)) {
            System.out.println(data.get("Title") + " " + data.get("FirstName") + " " + data.get("LastName"));
        }

    }
}
