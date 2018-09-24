package com.shalomhalbert.popup.loseit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

/**
 * Todo: Recommend two foods. Output one good food for continued consumption, and one bad which shouldn't be consumed
 * First: Recommend a good food to the user from what they eat the previous week.
 * E.g. If user is under calorie intake limit, pick a common food form those days
 * Second: Same, but for a bad food. E.g. You ate donuts everyday you went over the limit, so don't eat donuts.
 *
 * Todo: Track how many days in which a food is consumed, and calculate the net benefit (benefit = underLimitDays - overLimitDays)
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weekOfData = MealSummaryDataService.getMealSummaryData()

        val foods = hashMapOf<String, Int?>() //Keys are food names, and values are their net benefit
        var goodFood = "" //Name of good food being recommended
        var badFood = "" //Name of bad food being recommended

        //Food tracked
        for(day in weekOfData) {
            day.items.forEach {

                //Ensure foodName has a key associated with it
                if(!foods.containsKey(it.foodName)) foods[it.foodName] = 0

                //Sets benefit value
                var foodBenefit = foods[it.foodName]!!
                if (day.overUnderCalories >= 0) foodBenefit++
                else foodBenefit--
                foods[it.foodName] = foodBenefit
            }
        }

        //Make good recommendation
        //Make bad recommendation
        foods.forEach{

            if (goodFood == "") {
                goodFood = it.key
                badFood = it.key
            }

            when {
                it.value!! > foods[goodFood]!! -> goodFood = it.key
                it.value!! < foods[badFood]!! -> badFood = it.key
            }
        }

        Log.e("Main",  "Keep eating $goodFood\n Stop eating $badFood")



        Log.e("MainActivity", "Count: " + weekOfData.size)
    }
}
