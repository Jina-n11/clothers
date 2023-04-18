package com.example.weather.data.fake_data

 class ClothesList {
    fun getList(): List<ClothesSuggester> {
        return listOf(
            //WINTER under 15ْ
            ClothesSuggester(
                id = 1,
                image = "https://www.google.com/imgres?imgurl=https%3A%2F%2Ftravelfashiongirlpostphotos.s3.us-east-2.amazonaws.com%2F2014%2FWhat%2Bto%2BWear%2Bin%2BCold%2BWeather%253A%2BClothing%252C%2BGear%252C%2Band%2BOnion%2BStrategy%2Fwhat-to-wear-in-cold-weather-1.3.jpeg&tbnid=GsttoqK93XkJrM&vet=12ahUKEwi3qqCb-6v-AhVlkScCHdb1BIwQMygCegUIARC6AQ..i&imgrefurl=https%3A%2F%2Fwww.travelfashiongirl.com%2Fwhat-to-wear-in-cold-weather-clothing-gear-and-strategy%2F&docid=0RYjSWfiv7YrCM&w=2000&h=2000&q=clothes%20is%20wear%20in%20temperature%205%20degree&ved=2ahUKEwi3qqCb-6v-AhVlkScCHdb1BIwQMygCegUIARC6AQ",
                season = "WINTER",
                maxTemperature = 15,
                minTemperature = -50
            ),
            ClothesSuggester(
                id = 2,
                image = "https://www.collegefashion.net/wp-content/uploads/2021/10/freezing-cold-weather-outfit-2-1.webp",
                season = "WINTER",
                maxTemperature = 15,
                minTemperature = -50,
            ),
            ClothesSuggester(
                id = 3,
                image = "https://www.collegefashion.net/wp-content/uploads/2021/10/freezing-cold-weather-outfit-4-1.webp",
                season = "WINTER",
                maxTemperature = 15,
                minTemperature = -50,
            ),

            /// SPRING 15 to 25
            ClothesSuggester(
                id = 4,
                image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSFIL3U0OcXtYEcp2aZvAbvObhvvLk4Zti0XKgHW9SQFbbXkIz-_crAMNjpL8pwqxcw3AA&usqp=CAU",
                season = "SPRING",
                maxTemperature = 25,
                minTemperature = 15,
            ),
            ClothesSuggester(
                id = 5,
                image = "https://i0.wp.com/www.vintagekilowholesale.com/wp-content/uploads/2020/06/MIX-ZARA.jpg?w=1200&ssl=1",
                season = "SPRING",
                maxTemperature = 25,
                minTemperature = 15,
            ),
            ClothesSuggester(
                id = 6,
                image = "https://s.alicdn.com/@sc04/kf/Ha8f39c99194d4d47afb5e50ab1da292d7.jpg_300x300.jpg",
                season = "SPRING",
                maxTemperature = 25,
                minTemperature = 15,
            ),

            // SUMMER above 25ْ
            ClothesSuggester(
                id = 7,
                image = "https://cdn.shopify.com/s/files/1/0086/0281/2493/products/cool-summer-coldwater-creek-hibiscus-button-down-crinkle-shirt-PhotoRoom-2_780bf107-cf5d-404c-9b16-8005b45f6594_1600x.png?v=1671831678",
                season = "SUMMER",
                maxTemperature = 50,
                minTemperature = 25,
            ),
            ClothesSuggester(
                id = 8,
                image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSM3xtRhkmv77dy0rIvBPLJmPKDUaklOb-R6A&usqp=CAU",
                season = "SUMMER",
                maxTemperature = 50,
                minTemperature = 25,
            ),
            ClothesSuggester(
                id = 9,
                image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSA30Bmy14Y8oBI3-maMmM3Mmvaaz93pZTQ7A&usqp=CAU",
                season = "SUMMER",
                maxTemperature = 50,
                minTemperature = 25,
            ),
            ClothesSuggester(
                id = 10,
                image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4Zc65E0U8A8l7KImEuxinwiFZpGZi2GNf_Q&usqp=CAU",
                season = "SUMMER",
                maxTemperature = 50,
                minTemperature = 25,
            ),
            )
    }
}
