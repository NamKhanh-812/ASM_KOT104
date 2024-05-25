package com.example.assignment_ph43678.Model

class ProductModel(
    var productId : String,
    var productName : String,
    var description : String,
    var price : Float,
    var cateID : Int,
    var imageProduct : Int
) {
    override fun toString(): String {
        return "ProductModel(productId='$productId', productName='$productName', description='$description', price=$price, cateID='$cateID', imageProduct=$imageProduct)"
    }
}