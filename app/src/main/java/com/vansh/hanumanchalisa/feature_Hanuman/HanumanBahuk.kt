package com.vansh.hanumanchalisa.feature_Hanuman

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.vansh.hanumanchalisa.common.Buttons
import com.vansh.hanumanchalisa.common.Chaupai
import com.vansh.hanumanchalisa.common.HanumanPictures

private val hanumanBahukVerses = listOf(
    "1. श्रीगणेशाय नमः।\n" +
            "    हनुमानबाहुकं मनः प्रक्षालये हृदये।\n" +
            "    राघवेशं च वन्दे हनुमानं च सदा भजे।",

    "2. जपाकुसुमसङ्काशं रामदूतं महाद्युतिम्।\n" +
            "    चञ्चलमुखं कर्तव्यं सर्वं च जपये मनः।",

    "3. बन्धुः सुरसंसक्तं हनुमानं च नमाम्यहम्।\n" +
            "    बोधयित्वा च कर्तव्यं यथा चित्तं विनोदये।",

    "4. हृदयं च यथा रामस्य चन्दनं च यथा।\n" +
            "    सर्वं च प्राप्यते हनुमान् च सदा विभुं।",

    "5. यत्र चन्दनं च रामस्य सदा भक्त्यां च।\n" +
            "    हृदयं च यथा रामस्य चन्दनं च यथा।",

    "6. सदा रामस्य भक्तं च हृदयं च यथा।\n" +
            "    रामस्य नाम महात्मनं च सदा विभुं।",

    "7. रामं चन्द्रमयं चित्तं मन्दिरं च प्रगृह्य।\n" +
            "    हृदयं च यथा रामस्य सदा भक्त्यां च।",

    "8. तं च हृदयं च रामस्य चन्दनं च यथा।\n" +
            "    सर्वं च प्राप्यते हनुमान् च सदा विभुं।",

    "9. काकुत्स्थस्य च रामस्य सर्वमंगलमयम्।\n" +
            "    मन्त्रं च हृदयं गत्वा महाबाहो सन्निधिं।",

    "10. रामस्य च हृदयस्य चन्दनं च यथा चिता।\n" +
            "    तं प्राप्य हनुमान् साक्षाद् रामं च निन्युः।",

    "11. राघवस्य हृदयं च हनुमान् यत्र च सुखं।\n" +
            "    यत्र चन्दनं च रामस्य सदा गुणसंपन्नं।",

    "12. तं च हृदयं च यथा रामस्य चन्दनं च यथा।\n" +
            "    सर्वं च प्राप्यते हनुमान् च सदा विभुं।",

    "13. वासुदेवाय च रामं मनोवृत्तिं च सम्प्राप्य।\n" +
            "    समुत्थाय हरिवृत्तं सर्पतां गत्वा भक्त्या।",

    "14. राममंदिरमायुष्मदवः परमधर्ममार्गः।\n" +
            "    पतितं च निस्वासं सुखयन्तं मनोवृत्तिं।",

    "15. तं हानुमान् प्रविश्य रामं समवेदयामास।\n" +
            "    रामस्य धर्ममार्गस्य पथं च सदा भगवतः।",

    "16. काकुत्थसमागम्य निलयं मृगयित्न।\n" +
            "    मन्दीरं राममन्दिरं तं प्राप्य मनोवृत्तिः।",

    "17. हनुमान् हर्तुं हृदयः प्रगृह्य वाचं गत्वा।\n" +
            "    सहशक्तं गृहीत्वा रामं संप्रत्यन्तु मन्दिरं।",

    "18. ततो वाचोऽतिमायं तस्मादेव यशसिंधवः।\n" +
            "    ततो वाचोऽतिमायं मृगाय स्खलिता हि।",

    "19. कदाचिद्राघवे रामे रामायाण्युत्तमे।\n" +
            "    हृदयं च यथा रामस्य सदा भक्त्यां च।",

    "20. तं च मृगं च समग्रं तं रामं च सदा कृतं।\n" +
            "    यत्र चन्दनं च हृदयस्य महात्मने।",

    "21. काकुत्स्थस्य च रामस्य सर्वमंगलमयम्।\n" +
            "    मन्त्रं च हृदयं गत्वा महाबाहो सन्निधिं।",

    "22. रामस्य च हृदयस्य चन्दनं च यथा चिता।\n" +
            "    तं प्राप्य हनुमान् साक्षाद् रामं च निन्युः।",

    "23. तं च हृदयं च रामस्य चन्दनं च यथा।\n" +
            "    सर्वं च प्राप्यते हनुमान् च सदा विभुं।",

    "24. हृदयं च यथा रामस्य चन्दनं च यथा।\n" +
            "    सर्वं च प्राप्यते हनुमान् च सदा विभुं।",

    "25. राघवस्य हृदयं च हनुमान् यत्र च सुखं।\n" +
            "    यत्र चन्दनं च रामस्य सदा गुणसंपन्नं।",

    "26. चित्तं हृदयस्य च यथा चन्दनं च।\n" +
            "    हृदयं च यथा रामस्य चन्दनं च यथा।",

    "27. तं हृदयं च यथा रामस्य चन्दनं च यथा।\n" +
            "    सर्वं च प्राप्यते हनुमान् च सदा विभुं।",

    "28. वासुदेवाय च रामं मनोवृत्तिं च सम्प्राप्य।\n" +
            "    समुत्थाय हरिवृत्तं सर्पतां गत्वा भक्त्या।",

    "29. राममंदिरमायुष्मदवः परमधर्ममार्गः।\n" +
            "    पतितं च निस्वासं सुखयन्तं मनोवृत्तिं।",

    "30. तं हानुमान् प्रविश्य रामं समवेदयामास।\n" +
            "    रामस्य धर्ममार्गस्य पथं च सदा भगवतः।"
)

@Composable
fun HanumanBahuk(
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues = PaddingValues(0.dp)
){
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(paddingValues)
    ) {
        var count by rememberSaveable {
            mutableIntStateOf(0)
        }//29
        HanumanPictures(count = count,
            text = "Hanuman Bahuk")
        Spacer(modifier = modifier.weight(1f))
        Chaupai(hanumanBahukVerses, count = count)
        Spacer(modifier = modifier.weight(1f))
        Buttons(
            onNext = {
                if (count < 29) {
                    count++
                }
            },
            onPrev = {
                if (count > 0) {
                    count--
                }
            }
        )
        Spacer(modifier = modifier.weight(1f))
    }
}