import java.util.ArrayList

/**
 * Created by patrickrills on 3/9/15.
 */
object MealSummaryDataService {


    fun getMealSummaryData(): ArrayList<DaySummary> {
        val data1 = arrayOf(
                FoodData("coffee", 1, 5.0, MealType.Breakfast),
                FoodData("sandwich", 1, 500.0, MealType.Lunch),
                FoodData("diet coke", 1, 0.0, MealType.Lunch),
                FoodData("chips", 1, 150.0, MealType.Lunch),
                FoodData("steak", 1, 900.0, MealType.Dinner),
                FoodData("potato", 1, 450.0, MealType.Dinner),
                FoodData("sourcream", 1, 90.0, MealType.Dinner),
                FoodData("butter", 1, 110.0, MealType.Dinner),
                FoodData("wine", 1, 250.0, MealType.Dinner),
                FoodData("candy", 1, 300.0, MealType.Snacks))
        val day1 = DaySummary(1, 800.0, data1)

        val data2 = arrayOf(
                FoodData("coffee", 2, 5.0, MealType.Breakfast),
                FoodData("donut", 2, 385.0, MealType.Breakfast),
                FoodData("soup", 2, 300.0, MealType.Lunch),
                FoodData("diet coke", 2, 0.0, MealType.Lunch),
                FoodData("crackers", 2, 124.0, MealType.Lunch),
                FoodData("steak", 2, 750.0, MealType.Dinner),
                FoodData("broccoli", 2, 35.0, MealType.Dinner),
                FoodData("sourcream", 2, 90.0, MealType.Dinner),
                FoodData("butter", 2, 110.0, MealType.Dinner),
                FoodData("wine", 2, 315.0, MealType.Dinner))
        val day2 = DaySummary(2, -400.0, data2)

        val data3 = arrayOf(
                FoodData("coffee", 3, 5.0, MealType.Breakfast),
                FoodData("donut", 3, 385.0, MealType.Breakfast),
                FoodData("sandwich", 3, 425.0, MealType.Lunch),
                FoodData("diet coke", 3, 0.0, MealType.Lunch),
                FoodData("carrots", 3, 45.0, MealType.Lunch),
                FoodData("hamburger", 3, 639.0, MealType.Dinner),
                FoodData("fries", 3, 485.0, MealType.Dinner),
                FoodData("beer", 3, 119.0, MealType.Dinner),
                FoodData("candy", 3, 234.0, MealType.Snacks))
        val day3 = DaySummary(3, -100.0, data3)

        val data4 = arrayOf(
                FoodData("coffee", 4, 5.0, MealType.Breakfast),
                FoodData("donut", 4, 385.0, MealType.Breakfast),
                FoodData("hamburger", 4, 598.0, MealType.Lunch),
                FoodData("diet coke", 4, 0.0, MealType.Lunch),
                FoodData("fries", 4, 375.0, MealType.Lunch),
                FoodData("pasta", 4, 898.0, MealType.Dinner),
                FoodData("bread", 4, 156.0, MealType.Dinner),
                FoodData("wine", 4, 250.0, MealType.Dinner),
                FoodData("candy", 4, 298.0, MealType.Snacks))
        val day4 = DaySummary(4, -50.0, data4)

        val data5 = arrayOf(
                FoodData("orangejuice", 5, 267.0, MealType.Breakfast),
                FoodData("donut", 5, 385.0, MealType.Breakfast),
                FoodData("sandwich", 5, 500.0, MealType.Lunch),
                FoodData("diet coke", 5, 0.0, MealType.Lunch),
                FoodData("fries", 5, 375.0, MealType.Lunch),
                FoodData("chicken", 5, 200.0, MealType.Dinner),
                FoodData("bread", 5, 156.0, MealType.Dinner),
                FoodData("wine", 5, 250.0, MealType.Dinner),
                FoodData("carrots", 5, 49.0, MealType.Snacks))
        val day5 = DaySummary(5, -250.0, data5)

        val data6 = arrayOf(
                FoodData("orangejuice", 6, 267.0, MealType.Breakfast),
                FoodData("bagel", 6, 347.0, MealType.Breakfast),
                FoodData("sandwich", 6, 500.0, MealType.Lunch),
                FoodData("diet coke", 6, 0.0, MealType.Lunch),
                FoodData("fries", 6, 375.0, MealType.Lunch),
                FoodData("steak", 6, 945.0, MealType.Dinner),
                FoodData("broccoli", 6, 35.0, MealType.Dinner),
                FoodData("butter", 6, 157.0, MealType.Dinner),
                FoodData("beer", 6, 166.0, MealType.Dinner),
                FoodData("candy", 6, 150.0, MealType.Snacks))
        val day6 = DaySummary(6, 300.0, data6)

        val data7 = arrayOf(
                FoodData("coffee", 7, 5.0, MealType.Breakfast),
                FoodData("bagel", 7, 347.0, MealType.Breakfast),
                FoodData("hamburger", 7, 598.0, MealType.Lunch),
                FoodData("diet coke", 7, 0.0, MealType.Lunch),
                FoodData("chips", 7, 210.0, MealType.Lunch),
                FoodData("pasta", 7, 1154.0, MealType.Dinner),
                FoodData("broccoli", 7, 35.0, MealType.Dinner),
                FoodData("butter", 7, 115.0, MealType.Dinner),
                FoodData("wine", 7, 300.0, MealType.Dinner),
                FoodData("candy", 7, 265.0, MealType.Snacks))
        val day7 = DaySummary(7, 498.0, data7)


        return arrayListOf(day1, day2, day3, day4, day5, day6, day7)
    }
}
