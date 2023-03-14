fun main() {
    var name: String
    name="Qozeem Odeniran"
    var major="Information Technology"
    var country="Nigeria"

    println(name)
    println("The first elemt of the string "+name+" is "+name[0])
    println("The length of the string "+name+" is "+name.length)
    println("Converting "+name+" to uppercase "+name.uppercase())
    println("Converting "+name+" to lowercase "+name.lowercase())

    // string template/interpolation
    println("My name is $name. I am from $country, majoring in $major in Georgia Southern University")
}