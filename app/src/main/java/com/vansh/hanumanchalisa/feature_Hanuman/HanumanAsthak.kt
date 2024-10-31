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

private val sankatMochan = listOf(
    "बाल समय रवि भक्षी लियो तब, तीनहुं लोक भयो अंधियारों।" + "\n" +
            "ताहि सों त्रास भयो जग को, यह संकट काहु सों जात न टारो।" + "\n" +
            "देवन आनि करी बिनती तब, छाड़ी दियो रवि कष्ट निवारो।" + "\n" +
            "को नहीं जानत है जग में कपि, संकटमोचन नाम तिहारो ॥ १ ॥",

    "बालि की त्रास कपीस बसैं गिरि, जात महाप्रभु पंथ निहारो।" + "\n" +
            "चौंकि महामुनि साप दियो तब, चाहिए कौन बिचार बिचारो।" + "\n" +
            "कैद्विज रूप लिवाय महाप्रभु, सो तुम दास के सोक निवारो" + "\n" +
            "को नहीं जानत है जग में कपि, संकटमोचन नाम तिहारो ॥ २ ॥",

    "अंगद के संग लेन गए सिय, खोज कपीस यह बैन उचारो।" + "\n" +
            "जीवत ना बचिहौ हम सो जु, बिना सुधि लाये इहाँ पगु धारो।" + "\n" +
            "हेरी थके तट सिन्धु सबे तब, लाए सिया-सुधि प्राण उबारो" + "\n" +
            "को नहीं जानत है जग में कपि, संकटमोचन नाम तिहारो॥ ३ ॥",

    "रावण त्रास दई सिय को सब, राक्षसी सों कही सोक निवारो।" + "\n" +
            "ताहि समय हनुमान महाप्रभु, जाए महा रजनीचर मरो।" + "\n" +
            "चाहत सीय असोक सों आगि सु, दै प्रभुमुद्रिका सोक निवारो" + "\n" +
            "को नहीं जानत है जग में कपि, संकटमोचन नाम तिहारो॥ ४ ॥",

    "बान लाग्यो उर लछिमन के तब, प्राण तजे सूत रावन मारो।" + "\n" +
            "लै गृह बैद्य सुषेन समेत, तबै गिरि द्रोण सु बीर उपारो।" + "\n" +
            "आनि सजीवन हाथ दिए तब, लछिमन के तुम प्रान उबारो" + "\n" +
            "को नहीं जानत है जग में कपि, संकटमोचन नाम तिहारो॥ ५ ॥",

    "रावन जुध अजान कियो तब, नाग कि फाँस सबै सिर डारो।" + "\n" +
            "श्रीरघुनाथ समेत सबै दल, मोह भयो यह संकट भारो |" + "\n" +
            "आनि खगेस तबै हनुमान जु, बंधन काटि सुत्रास निवारो" + "\n" +
            "को नहीं जानत है जग में कपि, संकटमोचन नाम तिहारो॥ ६ ॥",

    "बंधू समेत जबै अहिरावन, लै रघुनाथ पताल सिधारो।" + "\n" +
            "देबिन्हीं पूजि भलि विधि सों बलि, देउ सबै मिलि मन्त्र विचारो।" + "\n" +
            "जाये सहाए भयो तब ही, अहिरावन सैन्य समेत संहारो" + "\n" +
            "को नहीं जानत है जग में कपि, संकटमोचन नाम तिहारो॥ ७ ॥",

    "काज किये बड़ देवन के तुम, बीर महाप्रभु देखि बिचारो।" + "\n" +
            "कौन सो संकट मोर गरीब को, जो तुमसे नहिं जात है टारो।" + "\n" +
            "बेगि हरो हनुमान महाप्रभु, जो कछु संकट होए हमारो" + "\n" +
            "को नहीं जानत है जग में कपि, संकटमोचन नाम तिहारो॥ ८ ॥"
)


@Composable
fun HanumanAsthak(
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues = PaddingValues(0.dp)
){
    var count by rememberSaveable {
        mutableIntStateOf(0)
    } // 7
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(paddingValues)
    ) {
        HanumanPictures(count = count,
            text = "Hanuman Asthak")
        Spacer(modifier = modifier.weight(1f))
        Chaupai(sankatMochan, count = count)
        Spacer(modifier = modifier.weight(1f))
        Buttons(
            onNext = {
                if (count < 7) {
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