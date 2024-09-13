package model

class Team(
    val name: String,
    val city: String
){
    override fun toString(): String {
        return "$name - $city"
    }
}