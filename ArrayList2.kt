fun main(){
    var citiesName = arrayListOf("MUMBAI","CHENNAI","DELHI","KOLKATA","BENGALURU")
    println(citiesName)

    //adding the element in the list at index 2
    citiesName.add(2,"HYDERABAD")
    println("List after adding :$citiesName")

    //updating the element at index 4
    citiesName[4]="JAIPUR"
    println("List after updating :$citiesName")

}