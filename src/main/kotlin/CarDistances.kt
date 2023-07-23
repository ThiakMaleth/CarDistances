/*
A person is moving to his village with a car moving at 20km/h, and he has many
alternative routes.
If he uses route1, he'll move a distance of 5000km
If he uses route2, he'll move a distance of 25000km
If he uses route3, he'll move a distance of 50000km
If he uses another, he'll move a distance of 10000km

Find the time it will take him to reach the village using the separate routes
-using an if statement
-using a when statement
*/

fun main() {

    val route1Distance = 5000  // km
    val route2Distance = 25000 // km
    val route3Distance = 50000 // km
    val route4Distance = 10000 // km

    val carSpeed = 20 // km/h

    print("Enter the route: ")

    when (readln()) {
        "route1" -> println("It will take him " + route1Distance / carSpeed + " hrs")
        "route2" -> println("It will take him " + route2Distance / carSpeed + " hrs")
        "route3" -> println("It will take him " +  route3Distance / carSpeed + " hrs")
        "route4" -> println(" It will take him " + route4Distance/carSpeed + " hrs")
        else -> println("you're taking a wrong route")
    }
}
