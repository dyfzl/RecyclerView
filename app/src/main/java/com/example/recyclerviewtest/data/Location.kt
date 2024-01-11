package com.example.recyclerviewtest.data

import java.sql.Timestamp

data class Location (
    val id: Int,
    val name: String,
    val latitude : Double,
    val longtime: Double,
    val timestamp: Long
)

fun createRealJejuLocationData(): List<Location>{
    val jejuLocation = listOf(
        Location(1, "제주국제공항" , 33.51135, 126.49277, System.currentTimeMillis()),
        Location(2, "한라산" , 33.362500, 126.94260, System.currentTimeMillis()),
        Location(3, "성산일출봉" , 33.52873, 126.77163, System.currentTimeMillis()),
        Location(4, "만장굴" , 33.52873, 126.77163, System.currentTimeMillis()),
        Location(5, "우도" , 33.50649, 126.95300, System.currentTimeMillis()),
        Location(6, "천지연폭포" , 33.24605, 126.55432, System.currentTimeMillis()),
        Location(7, "중문관광단지" , 33.25468, 126.41256, System.currentTimeMillis()),
        Location(8, "섭지코지" , 33.43411, 126.92770, System.currentTimeMillis()),
        Location(9, "한림공원" , 33.39656, 126.23961, System.currentTimeMillis()),
        Location(11, "비자림" , 33.48894, 126.80959, System.currentTimeMillis()),
        Location(12, "오설록 티 뮤지엄" , 33.30599, 126.28947, System.currentTimeMillis()),
        Location(13, "사려니숲길" , 33.422633, 126.62675, System.currentTimeMillis()),
        Location(14, "제주올레길" , 33.48902, 126.49830, System.currentTimeMillis()),
        Location(15, "에코랜드" , 33.44785, 126.80959, System.currentTimeMillis()),
        Location(16, "테디베어뮤지엄" , 33.25046, 126.62675, System.currentTimeMillis()),
        Location(17, "카멜리아 힐" , 33.28959, 126.37053, System.currentTimeMillis()),
        Location(18, "협재해수욕장" , 33.39363, 126.23986, System.currentTimeMillis()),
        Location(19, "함덕해수욕장" , 33.54306, 126.66822, System.currentTimeMillis()),
        Location(20, "소인국테마파크" , 33.25318, 126.40823, System.currentTimeMillis()),
        Location(21, "이호테우해변" , 33.47772, 126.45677, System.currentTimeMillis()),
        Location(22, "정방폭포" , 33.23700, 126.62005, System.currentTimeMillis()),
        Location(23, "마라도" , 33.118881, 126.26855, System.currentTimeMillis()),
        Location(24, "산방산" , 33.24681, 126.57082, System.currentTimeMillis()),
        Location(25, "용두암" , 33.51622, 126.51448, System.currentTimeMillis()),
        Location(26, "비자림" , 33.48894, 126.80959, System.currentTimeMillis()),
        Location(27, "절물자연휴양림" , 33.44000, 126.62520, System.currentTimeMillis()),
        Location(28, "노루생태관찰원" , 33.44432, 126.62669, System.currentTimeMillis()),
        Location(29, "제주별빛누리공원" , 33.44455, 126.54918, System.currentTimeMillis()),
        Location(30, "비자림" , 33.48894, 126.80959, System.currentTimeMillis()),
        Location(31, "비자림" , 33.48894, 126.80959, System.currentTimeMillis()),
        Location(32, "비자림" , 33.48894, 126.80959, System.currentTimeMillis()),
        Location(33, "비자림" , 33.48894, 126.80959, System.currentTimeMillis()),
        Location(34, "비자림" , 33.48894, 126.80959, System.currentTimeMillis()),
        Location(35, "비자림" , 33.48894, 126.80959, System.currentTimeMillis()),
        Location(36, "비자림" , 33.48894, 126.80959, System.currentTimeMillis()),
        Location(37, "비자림" , 33.48894, 126.80959, System.currentTimeMillis()),
        Location(38, "비자림" , 33.48894, 126.80959, System.currentTimeMillis()),
        Location(39, "비자림" , 33.48894, 126.80959, System.currentTimeMillis()),
        Location(40, "비자림" , 33.48894, 126.80959, System.currentTimeMillis()),
        )
    return jejuLocation
}