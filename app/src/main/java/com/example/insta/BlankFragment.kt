package com.example.insta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.insta.R


class BlankFragment : Fragment() {
    lateinit var recycler: RecyclerView
    lateinit var img: ImageView
    lateinit var txt1: TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val a= inflater.inflate(R.layout.fragment_blank, container, false)
        img=a.findViewById(R.id.img_id)
        txt1=a.findViewById(R.id.txt)
        if (img != null && txt1 != null) {
            var num = 0
            img.setOnClickListener {
                num++
                txt1.text = num.toString()
            }
        } else {
            // Handle the case where the views are null
        }


        recycler=a.findViewById(R.id.recycler1_id)
        recycler.layoutManager= LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
        val insta= ArrayList<DataClass1>()
        insta.add(DataClass1(R.drawable.modi,"about modi ","Narendra Damodardas Modi was born on 17 September 1950 to a Gujarati Hindu family of grocers in Vadnagar, Mehsana district, Bombay State (present-day Gujarat). He was the third of six children born to Damodardas Mulchand Modi ( c. 1915–1989) and Hiraben Modi (1923–2022)."))
        insta.add(DataClass1(R.drawable.prabash,"hero prabash","ప్రభాస్ ఉప్పలపాటి సూర్యనారాయణరాజు, శివ కుమారి దంపతులకు 1979 అక్టోబర్ 23 తేదీన జన్మించాడు. పశ్చిమ గోదావరి జిల్లా లోని మొగల్తూరు తన కుటుంబ స్వగ్రామం. తన తల్లితండ్రులకు ఉన్న సంతానంలో రెండోవాడు. అతనికి ఒక సోదరుడు ప్రబోధ్, ఒక చెల్లెలు ప్రగతి ఉన్నారు."))
        insta.add(DataClass1(R.drawable.kfc,"wow aha ruchi","KFC is an American fast food restaurant chain headquartered in Louisville, Kentucky, that specializes in fried chicken. It is the world's second-largest restaurant chain after McDonald's, with 22,621 locations globally in 150 countries as of December 2019. The chain is a subsidiary of Yum!"))
        insta.add(DataClass1(R.drawable.camera,"camera life","A camera is an optical instrument that captures a visual image. At a basic level, cameras consist of sealed boxes (the camera body), with a small hole (the aperture) that allows light through to capture an image on a light-sensitive surface (usually a digital sensor or photographic film"))
        insta.add(DataClass1(R.drawable.been,"honey bee","Honey bees are big money makers for U.S. agriculture. These social and hardworking insects produce six hive products – honey, pollen, royal jelly, beeswax, propolis, and venom – all collected and used by people for various nutritional and medicinal purposes"))
        insta.add(DataClass1(R.drawable.charmeenar,"light city","The Charminar is a mosque and monument located in Hyderabad, Telangana, India. Constructed in 1591, the landmark is a symbol of Hyderabad and officially incorporated in the emblem of Telangana The Charminar's long history includes the existence of a mosque on its top floor for more than 425 years."))
        insta.add(DataClass1(R.drawable.eagle,"the king of bird","महाश्येन/गरुड़ (ईगल) शिकार करने वाले बड़े आकार के पक्षी हैं। इस पक्षी को ऊँचाई से ही प्रेम है, धरातल से नहीं। यह धरातल की ओर तभी दृष्टिपात करता है, जब इसे कोई शिकार करना होता है। इसकी दृष्टि बड़ी तीव्र होती है और यह धरातल पर विचरण करते हुए अपने शिकार को ऊँचाई से ही देख लेता है।"))
        insta.add(DataClass1(R.drawable.fish,"ACQURIUM FISHES","Is it correct to say fishes?\n" +
                "The plural of fish is usually fish. When referring to more than one species of fish, especially in a scientific context, you can use fishes as the plural. The zodiac sign Pisces is also often referred to as fishes."))
        insta.add(DataClass1(R.drawable.fishes,"STYLISH","Swedish.\n" +
                "McFish.\n" +
                "Puff Daddy.\n" +
                "Floater.\n" +
                "Wave.\n" +
                "Chips.\n" +
                "Bob.\n" +
                "Flotsam."))
        insta.add(DataClass1(R.drawable.foods,"special","Food is one of the basic necessities of life. Food contains nutrients—substances essential for the growth, repair, and maintenance of body tissues and for the regulation of vital processes. Nutrients provide the energy our bodies need to function. The energy in food is measured in units called calories"))
        insta.add(DataClass1(R.drawable.fruits,"healthy fruits","Fruit is the sweet, fleshy, edible part of a plant. It generally contains seeds. Fruits are usually eaten raw, although some varieties can be cooked. They come in a wide variety of colours, shapes and flavours."))
        insta.add(DataClass1(R.drawable.gate,"india gate","The India Gate is a war memorial located near the Rajpath on the eastern edge of the \"ceremonial axis\" of New Delhi, formerly called duty path."))
        insta.add(DataClass1(R.drawable.girl,"fashion","Fashion is a form of self-expression and autonomy at a particular period and place and in a specific context, of clothing, footwear, lifestyle, accessories, makeup, hairstyle, and body posture. The term implies a look defined by the fashion industry as that which is trending"))
        insta.add(DataClass1(R.drawable.hen,"sunday chicken","The chicken is a domesticated junglefowl species, with attributes of wild species such as the grey and the Ceylon junglefowl that are originally from Southeastern Asia. Rooster or cock is a term for an adult male bird, and a younger male may be called a cockerel. A male that has been castrated is a capon"))
        insta.add(DataClass1(R.drawable.home,"beatyfull home","nothing to write home about definition: 1. not exciting or special: 2. not exciting or special: . Learn more."))
        insta.add(DataClass1(R.drawable.img,"facebook ","Create an account or log into Facebook. Connect with friends, family and other people you know. Share photos and videos, send messages and get updates."))
        insta.add(DataClass1(R.drawable.road,"road","mana jeevitham e oka road la vuntundhi"))
        insta.add(DataClass1(R.drawable.world,"world","eavry birth in theis world"))
        insta.add(DataClass1(R.drawable.tamana,"indian heroen","Tamanna Bhatia, known professionally as Tamannaah, is an Indian actress who appears primarily in Telugu and Tamil films, along with a few Hindi films."))

        val adapter_names = AdapterClass(insta)
        recycler.adapter = adapter_names

        return a

    }
}