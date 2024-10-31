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

private val bajrangBan = listOf(
            "जय हनुमंत संत हितकारी ।\n" +
            "सुन लीजै प्रभु अरज हमारी ॥०१॥",
            "जन के काज विलम्ब न कीजै ।\n" +
            "आतुर दौरि महा सुख दीजै ॥०२॥",
            "जैसे कूदि सिन्धु वहि पारा ।\n" +
            "सुरसा बद पैठि विस्तारा ॥०३॥",
            "आगे जाई लंकिनी रोका ।\n" +
            "मारेहु लात गई सुर लोका ॥०४॥",
            "जाय विभीषण को सुख दीन्हा ।\n" +
            "सीता निरखि परम पद लीन्हा ॥०५॥",
            "बाग उजारी सिंधु महं बोरा ।\n" +
            "अति आतुर यम कातर तोरा ॥०६॥",
            "अक्षय कुमार मारि संहारा ।\n" +
            "लूम लपेट लंक को जारा ॥०७॥",
            "लाह समान लंक जरि गई ।\n" +
            "जय जय धुनि सुर पुर महं भई ॥०८॥",
            "अब विलम्ब केहि कारण स्वामी ।\n" +
            "कृपा करहु उर अन्तर्यामी ॥०९॥",
            "जय जय लक्ष्मण प्राण के दाता ।\n" +
            "आतुर होय दुख हरहु निपाता ॥१०॥",
            "जै गिरिधर जै जै सुखसागर ।\n" +
            "सुर समूह समरथ भटनागर ॥११॥",
            "ॐ हनु हनु हनु हनु हनुमन्त हठीले।\n" +
            "बैरिहिं मारू बज्र की कीले ॥१२॥",
            "गदा बज्र लै बैरिहिं मारो ।\n" +
            "महाराज प्रभु दास उबारो ॥१३॥",
            "ॐ कार हुंकार महाप्रभु धावो ।\n" +
            "बज्र गदा हनु विलम्ब न लावो ॥१४॥",
            "ॐ ह्नीं ह्नीं ह्नीं हनुमंत कपीसा ।\n" +
            "ॐ हुं हुं हुं हनु अरि उर शीशा ॥१५॥",
            "सत्य होहु हरि शपथ पाय के ।\n" +
            "रामदूत धरु मारु धाय के ॥१६॥",
            "जय जय जय हनुमंत अगाधा ।\n" +
            "दु:ख पावत जन केहि अपराधा ॥१७॥",
            "पूजा जप तप नेम अचारा।\n" +
            "नहिं जानत कछु दास तुम्हारा ॥१८॥",
            "वन उपवन, मग गिरि गृह माहीं ।\n" +
            "तुम्हरे बल हम डरपत नाहीं ॥१९॥",
            "पांय परों कर जोरि मनावौं ।\n" +
            "यहि अवसर अब केहि गोहरावौं ॥२०॥",
            "जय अंजनि कुमार बलवन्ता ।\n" +
            "शंकर सुवन वीर हनुमंता ॥२१॥",
            "बदन कराल काल कुल घालक ।\n" +
            "राम सहाय सदा प्रति पालक ॥२२॥",
            "भूत प्रेत पिशाच निशाचर ।\n" +
            "अग्नि बेताल काल मारी मर ॥२३॥",
            "इन्हें मारु तोहिं शपथ राम की ।\n" +
            "राखु नाथ मरजाद नाम की ॥२४॥",
            "जनकसुता हरि दास कहावौ ।\n" +
            "ताकी शपथ विलम्ब न लावो ॥२५॥",
            "जय जय जय धुनि होत अकाशा ।\n" +
            "सुमिरत होत दुसह दुःख नाशा ॥२६॥",
            "चरण शरण कर जोरि मनावौ ।\n" +
            "यहि अवसर अब केहि गौहरावौं ॥२७॥",
            "उठु उठु चलु तोहिं राम दुहाई ।\n" +
            "पांय परौं कर जोरि मनाई ॥२८॥",
            "ॐ चं चं चं चं चपल चलंता ।\n" +
            "ॐ हनु हनु हनु हनु हनुमंता ॥२९॥",
            "ॐ हं हं हांक देत कपि चंचल ।\n" +
            "ॐ सं सं सहमि पराने खल दल ॥३०॥",
            "अपने जन को तुरत उबारो ।\n" +
            "सुमिरत होय आनन्द हमारो ॥३१॥",
            "यह बजरंग बाण जेहि मारै ।\n" +
            "ताहि कहो फिर कौन उबारै ॥३२॥",
            "पाठ करै बजरंग बाण की ।\n" +
            "हनुमत रक्षा करैं प्राण की ॥३३॥",
            "यह बजरंग बाण जो जापै ।\n" +
            "तेहि ते भूत प्रेत सब कांपे ॥३४॥",
            "धूप देय अरु जपै हमेशा ।\n" +
            "ताके तन नहिं रहै कलेशा ॥३५॥"
)

@Composable
fun BajrangBaan(
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues = PaddingValues(0.dp)
) {
    var count by rememberSaveable {
        mutableIntStateOf(0)
    } // 35
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(paddingValues)
    ) {
        HanumanPictures(count = count,
            text = "Bajrang Baan")
        Spacer(modifier = modifier.weight(1f))
        Chaupai(bajrangBan, count = count)
        Spacer(modifier = modifier.weight(1f))
        Buttons(
            onNext = {
                if (count < 34) {
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
