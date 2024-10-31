package com.vansh.hanumanchalisa.feature_Hanuman

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.vansh.hanumanchalisa.common.Buttons
import com.vansh.hanumanchalisa.common.Chaupai
import com.vansh.hanumanchalisa.common.HanumanPictures

private val hanumanChalisa = listOf(
    "जय हनुमान ज्ञान गुन सागर।" + "\n" + "जय कपीस तिहुं लोक उजागर।।",
    "राम दूत अतुलित बल धामा।" + "\n" + "अंजनि-पुत्र पवनसुत नामा।।",
    "महाबीर बिक्रम बजरंगी।" + "\n" + "कुमति निवार सुमति के संगी।।",
    "कंचन बरन बिराज सुबेसा।" + "\n" + "कानन कुण्डल कुँचित केसा।।",
    "हाथ बज्र औ ध्वजा बिराजे।" + "\n" + "कांधे मूंज जनेउ साजे।।",
    "शंकर सुवन केसरी नंदन।" + "\n" + "तेज प्रताप महा जग वंदन।।",
    "बिद्यावान गुनी अति चातुर।" + "\n" + "राम काज करिबे को आतुर।।",
    "प्रभु चरित्र सुनिबे को रसिया।" + "\n" + "राम लखन सीता मन बसिया।।",
    "सूक्ष्म रूप धरि सियहिं दिखावा।" + "\n" + "बिकट रूप धरि लंक जरावा।।",
    "भीम रूप धरि असुर संहारे।" + "\n" + "रामचन्द्र के काज संवारे।।"
)
@Composable
fun HanumanChalisa(
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues = PaddingValues(0.dp)
) {
    var count by rememberSaveable {
        mutableIntStateOf(0)
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(paddingValues)
    ){
            HanumanPictures(
                count = count,
                text = "Hanuman Chalisha"
            )
        Spacer(modifier = modifier.weight(1f))
        Chaupai(hanumanChalisa,count = count)
        Spacer(modifier = modifier.weight(1f))
        Buttons(
            onNext = {
                if(count<9){
                    count++
                }
            },
            onPrev = {
                if(count>0){
                    count--
                }
            }
        )
        Spacer(modifier = modifier.weight(1f))
    }
}

@Composable
@Preview
fun show(){
    HanumanChalisa()
}



