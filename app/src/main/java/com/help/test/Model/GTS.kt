package com.help.test.Model

data class GTS(
    var category_name: String,
    var eggless: String,
    var is_favorite: Int,
    var product_id: String,
    var product_image: String,
    var product_name: String,
    var product_offer: String,
    var product_price: List<ProductPrice>,
    var product_recommended: String,
    var product_type: String,
    var timeslot: String
)