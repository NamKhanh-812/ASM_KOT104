package com.example.assignment_ph43678.Model

class CategoryModel(
    var cateID : Int,
    var cateName : String,
    var imageCate : Int
) {
    override fun toString(): String {
        return "CategoryModel(cateID='$cateID', cateName='$cateName', imageCate=$imageCate)"
    }
}