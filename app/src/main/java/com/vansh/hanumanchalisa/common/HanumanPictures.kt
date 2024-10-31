package com.vansh.hanumanchalisa.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

private val hanumanImage = listOf(
    "https://idolkart.com/cdn/shop/articles/How_Many_Years_Did_Lord_Hanuman_Live.jpg?v=1700116689&width=1000",
    "https://images.indianexpress.com/2024/01/Jai-Hanuman-22012024.jpeg?w=640",
    "https://as1.ftcdn.net/v2/jpg/07/71/16/98/1000_F_771169855_DGfwxiKoQHZeKltieXg5k85XosqqNT5b.jpg",
    "https://t4.ftcdn.net/jpg/08/08/95/71/240_F_808957144_BGCC6yTLiajTyUaMn9bbWUiGLoTiLV8p.jpg",
    "https://as2.ftcdn.net/v2/jpg/09/54/24/47/1000_F_954244750_9d1XAvIjqfCYXceE4xpaTlblsjxJzUUu.jpg",
    "https://as2.ftcdn.net/v2/jpg/08/06/59/45/1000_F_806594568_C2mxSPie0WGPi9JBIoS4vSsLs04VS2hV.jpg",
    "https://as1.ftcdn.net/v2/jpg/07/82/80/48/1000_F_782804867_oA3SvyCVGCkh8TOdYOPM5BIUPMc4snHT.jpg",
    "https://as2.ftcdn.net/v2/jpg/08/14/04/17/1000_F_814041742_juuQkI2NyDFoVvgZKmdDEWhWvGDiqzb0.jpg",
    "https://as2.ftcdn.net/v2/jpg/04/00/83/01/1000_F_400830168_MLzmS8mEKGvTYUVW9en1ksgNtHiKiB3u.jpg",
    "https://as2.ftcdn.net/v2/jpg/08/96/78/79/1000_F_896787980_QnwelAna1e2M5VKRdFEas7iMSdfYRq84.jpg"
)

@Composable
fun HanumanPictures(
    count: Int,
    text: String
) {
    val imageUrl = hanumanImage.getOrNull(count) ?: hanumanImage.first()

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AsyncImage(
            model = imageUrl,
            contentDescription = "Hanuman",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = text,
            fontSize = 40.sp,
            color = MaterialTheme.colorScheme.primary
        )
    }
}

