fun main(){
    var names= arrayListOf("Alex","Rohan","Rahul","Sam","John")
     var len = ArrayList<Int>()

    //finding the length of the names
    for(i in names){
        len.add(i.length)
    }
    println("Original List :$names")
    println("Lengths of the element :$len")

    println(SingletonExample.a)
    SingletonExample.a = 30
}