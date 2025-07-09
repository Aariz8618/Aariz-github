data class WeatherData(
    var date: String,
    var temperature: Double,
    var humidity: Double,
    var windSpeed: Double
)

fun calculateAverage(data: List<WeatherData>): Double{
    var average = if (data.isNotEmpty()){
        data.sumOf { it.temperature } / data.size
    }else{
        0.0
    }
    return average
}

fun findHottestDay(data: List<WeatherData>): WeatherData?{
    if (data.isEmpty()){
        return null
    }
    var hottest = data[0]
    for (current in data){
        if(current.temperature > hottest.temperature){
            hottest = current
        }
    }
    return hottest
}

fun findColdestDay(data: List<WeatherData>): WeatherData?{
    if(data.isEmpty()){
        return null
    }
    var coldest = data[0]
    for (current in data){
        if (current.temperature < coldest.temperature){
            coldest = current
        }
    }
    return coldest
}

fun filterDays(data: List<WeatherData>, threshold: Double): List<WeatherData>{
    var filteredDays = data.filter{ it .temperature > threshold }
    return filteredDays
}
fun main() {
    val weatherList = listOf(
        WeatherData("01/01/2025", 34.5, 56.4, 12.0 ),
        WeatherData("02/01/2025", 34.4, 58.7, 11.0),
        WeatherData("03/01/2025", 40.0, 67.7, 10.9),
        WeatherData("04/01/2025", 29.5, 66.5, 14.5)
    )
    val avg = calculateAverage(weatherList)
    println("Average Temperature: $avg")

    val hottestDay = findHottestDay(weatherList)
    println("Hottest Day: ${hottestDay?.date} - ${hottestDay?.temperature}")

    val coldestDay = findColdestDay(weatherList)
    println("Coldest Day: ${coldestDay?.date} -  ${coldestDay?.temperature}")

    val threshold = 30.0
    val filtered = filterDays(weatherList, threshold)
    println("Days with temperature above $threshold:  ")
    for (day in filtered){
        println("${day.date} - ${day.temperature}")
    }
}
