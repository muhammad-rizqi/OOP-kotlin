package data

class Person(
    var firstName: String,  // constructor langsung properties
    var middleName: String?,
    var lastName: String
) {
    // dipanggil di awal instansiasi
    init {
        println("Objek  $firstName dibuat")
    }
}