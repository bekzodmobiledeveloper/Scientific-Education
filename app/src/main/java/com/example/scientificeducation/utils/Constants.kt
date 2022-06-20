package com.example.scientificeducation.utils

object Constants {
    const val username: String = "user_name"
    const val Total_Questions: String = "total_questions"
    const val correct_Questions: String = "correct_answers"


    fun getQuestion(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()
        val que1 = Questions(
            1,
            "Wobblers nima uchun ishlatiladi?",
            "savdo joyini ro'yxatdan o'tkazish uchun ",
            "korporativ identifikatsiyaning imidj komponenti\n",
            "reklama vositasi sifatida",
            "chop etish jarayonida shaxsiylashtirish imkoniyati ",
            1
        )
        questionsList.add(que1)
        val que2 = Questions(
            1,
            "……. - bu dissertatsiya mavzusi bilan bog'liq muammolar qatoriga kiradigan har qanday mavzuni o'z ichiga olgan to'liq va mantiqiy uzviy ishdir. ",
            "dissertatsiya",
            "ilmiy maqola",
            "monografiya",
            "o'quv qo'llanma",
            2
        )
        questionsList.add(que2)

        val que3 = Questions(
            1, "……… — muallif, shuningdek qonun yoki shartnoma asosida EHM\n" +
                    "uchun dastur yoki ma’lumotlar bazasiga, qo‘riqlanadigan topologiyaga\n" +
                    "mutlaq huquqqa ega bo‘lgan har qanday jismoniy yoki yuridik shaxs.",
            "akslantirish, burish",
            "muallif",
            "mualliflik huquqi egasi",
            "professor", 3
        )
        questionsList.add(que3)

        val que4 = Questions(
            1, "……-bu ThomsonReuters tomonidan yaratilgan butun dunyo bo'ylab\n" +
                    "politematik qidiruv hamjamiyati uchun bepul resurs. ",
            "ResearcherID",
            "Web of Science",
            "Google Scholar",
            "SCOPUS",
            1
        )
        questionsList.add(que4)
        val que5 = Questions(
            1, "“Tibbiy ocherklar va kuzatishlar” nashriga tayyorgarlik ko‘rishda\n" +
                    "o‘zaro tekshirish tartibi birinchi marta qachon qo‘llanilgan.",
            "1731 yilda Genrix Oldenburg tomonidan",
            " 1822-1895 yillarda Lui Paster tomonidan",
            "1731 yilda Iogann Lambert tomonidan\n",
            "1731 yilda Uilyam Pleyfer tomonidan",
            1
        )
        questionsList.add(que5)
        val que6 = Questions(
            1,
            "Ilmiy tadqiqotdagi umumiy va hususiy uslublarni o’rganadigan,\n" +
                    "hamda ularga mos ilmiy tamoiylar ishlab chiqadigan fan sohasi bu..\n",
            "ilmiy muammo",
            "falsafiy nazariya",
            "ilmiy tasavvur etish",
            "fan metodologiyasi ",
            4
        )
        questionsList.add(que6)
        val que7 = Questions(
            1, "Yevropaga – fanning shakllanishi va fan tasnifi bo’yicha\n" +
                    "kimning tadqiqoti katta ta’sirko’rsatdi?",
            "Farobiy",
            "Aristotel",
            "Ibn Rushd",
            "Al-Kindiy", 3
        )
        questionsList.add(que7)
        val que8 = Questions(
            1,
            "Ilmiy bilimning barcha soxalariga taraqqiyot goyasini tadbik etish\n" +
                    "nimani anglatadi?",
            "fanning ob’ektivlashishini",
            "fanning dialektiklashishini",
            "fanning matematiklashishini",
            "fanning nazariylashishini",
            2
        )
        questionsList.add(que8)
        val que9 = Questions(
            1, "Ilmiy bilishda epistemologiyaning o’rni nimadan iborat?",
            "bilishning umumiy muammolarini o’rganuvchi falsafa bo’limi",
            "ilmiy bilishning metod va shakllarini o’rganuvchi falsafa bo’limi ",
            "ijtimoiy taraqqiyot muammolarini o’rganuvchi falsafa bo’limi",
            "borliq muammo va rivojning o’rganuvchi falsafa bo’lim", 2
        )
        questionsList.add(que9)
        val que10 = Questions(
            1,
            "Ilmiy maqola yozish tarkibi: ",
            "Sarlavha (Mavzu nomi). Annotasiya. Kalit so'zlar. Kirish. Adabiyotlarni tahlil\n" +
                    "qiqish. Asosiy qism (metodologiya, natijalar). Tadqiqot natijalari va istiqbollari.\n" +
                    "Hulosa. Adabiyotlar ro'yxati ",
            "Kalit so'zlar. Kirish. Asosiy qism (metodologiya, natijalar). Tadqiqot natijalari va\n" +
                    "istiqbollari. Adabiyotlar ro'yxati\n",
            "Kalit so'zlar. Kirish. Asosiy qism (metodologiya, natijalar). Tadqiqot natijalari va\n" +
                    "istiqbollari. Adabiyotlar ro'yxati\n",
            "Sarlavha (sarlavha). Annotasiya. Kalit so'zlar. Kirish. Adabiyotlarni ko'rib chiqish.\n" +
                    "Asosiy qism (metodologiya, natijalar)",
            1
        )
        questionsList.add(que10)
        val que11 = Questions(
            1,
            "Ilmiy-uslubiy jurnalda qanday ma’lumotlar nashr etiladi?\n",
            "maktabgacha tarbiyachilar, o'rta maktab o'quvchilari va talabalar ilmiy-tadqiqot\n" +
                    "faoliyatini psixologik-pedagogik qo'llab-quvvatlash muammolari, shuningdek, turli\n" +
                    "ilmiy tadbirlarni tashkil etish muammolari (seminarlar, master-klasslar,\n" +
                    "ekspeditsiyalar va boshqalar)",
            "maktabgacha yoshdagi bolalarning tadqiqot faoliyatini psixologik va pedagogik\n" +
                    "qo'llab-quvvatlash muammolari.",
            "maktabgacha yoshdagi bolalar, o'rta maktab o'quvchilari va talabalarning ",
            "o'rta maktab o'quvchilari va talabalar, shuningdek, turli ilmiy tadbirlarni tashkil\n" +
                    "etish muammolari ",
            1
        )
        questionsList.add(que11)
        val que12 = Questions(
            1,
            "Web of Science tarkibiga quyidagilar kiradi:\n",
            " samarali boshqaruv qarorlarini qabul qilish imkonini beradigan ilmiy\n" +
                    "tadqiqotning har qanday sohasi (qaysi tashkilotlarda, qaysi sohada va kim\n" +
                    "tomonidan tadqiqot olib borilmoqda) so'nggi ma'lumotlarni olish\n",
            "Bosma obunaning maqsadga muvofiqligini ob'ektiv aniqlash (har qanday bilim\n" +
                    "sohasidagi eng mashhur va iqtibos keltiriladigan jurnallar)",
            "Tabiiy fanlar, ijtimoiy-gumanitar fanlar, muhandislik fanlari va san'at\n" +
                    "sohasidagi tadqiqot sohalaridagi jurnallar va materiallar",
            " Ma'lumotlar bazasi foydalanuvchilarga qidiruv so'rovlarini yaratish va muallif\n" +
                    "profilidagi o'zgarishlar uchun elektron pochta yoki RSS bildirishnomalarini\n" +
                    "o'rnatish uchun mualliflarning noyob identifikatorlaridan foydalanish imkoniyatini\n" +
                    "beradi",
            3
        )
        questionsList.add(que12)
        val que13 = Questions(
            1,
            "Ilmiy metrik ma’lumotlar bazalari – bu ...",
            "ilmiy nashrlarda chop etilgan maqolalarning kotirovkasini kuzatish vositalari bilan\n" +
                    "ilmiy ma'lumotlar bazalari ",
            "bibliografik va mavhum ma'lumotlar bazalari maqolalarning kotirovkasini kuzatish\n" +
                    "vositalari bilan ",
            "ilmiy nashrlarda chop etilgan maqolalarning kotirovkasini kuzatish vositalari bilan\n" +
                    "adabiy ma'lumotlar bazalari ",
            "lmiy nashrlarda chop etilgan maqolalarning kotirovkasini kuzatish vositalari bilan\n" +
                    "bibliografik va mavhum ma'lumotlar bazalari",
            4
        )
        val que14 = Questions(
            1,
            "Keltirilgan qaysi uzoklashtirish algoritmida maydonni to`g`ri burchakli 4 kismga bulish ishlatiladi?",
            "Appelya algoritmi",
            "Varnok algoritmi",
            "z-bufer usuli",
            "Roberts algoritmi",
            2
        )
        val que15 = Questions(
            1,
            "Bosmaxonaning asosiy vazifalarini ko’rsating.",
            "sifatli qog'oz, chop etish, blanka bilan ta'minlash",
            "chop etishga tayyorlash, mahsulot sifatini nazorat qilish, mahsulotni qadoqlash\n" +
                    "va saralash",
            "mahsulot sifatini nazorat qilish, takomillashtirilgan qog'ozlar, tashrif qog'ozlari\n" +
                    "bilan ta'minlash\n",
            "mahsulotni qadoqlash va saralash, bosib chiqarish, korreksiya\n",
            2
        )
        val que16 = Questions(
            1,
            "Bosib chiqarish jarayonlarini avtomatlashtirish darajasi ... imkonini\n" +
                    "beradi",
            "kitobni sotuvda chop etish, chop etish va unga hamrohlik qilish\n",
            "nashrni reklama bilan ta'minlaydi",
            "сhop etish vaqtini tezlashtirish va bosma mahsulotlar sifatini yaxshilash ",
            "asar, bosmaxona esa chop etadi",
            3
        )
        val que17 = Questions(
            1,
            "Thomson Reuters tomonidan yaratilgan butun dunyo bo'ylab politematik\n" +
                    "qidiruv hamjamiyatiga bepul resurs bu.....",
            "ID ",
            "Web of Science",
            "Google olimi",
            "RSCI",
            1
        )
        val que18 = Questions(
            1,
            "BMI loyihalashda har xil turdagi sxemalar, anketalar, fotosuratlar,\n" +
                    "jadvallar, qo’shimcha ma'lumotlarning qaysi qisnga kiritiladi?",
            "adabiyot",
            "birinchi qismda ",
            "kirish qismida",
            "ilova",
            4
        )
        val que19 = Questions(
            1,
            "Ilova - ...",
            "loyihaning bir qismi, unda turli xil grafik, jadvalli materiallar joylashtiriladi, ular\n" +
                    "yozilish jarayonida kurs yoki tezis muallifi tomonidan havola qilinadi ",
            "Bajarilgan ish natijasi haqida qisqacha xulosa.\n",
            "ilmiy ishning manbalar ko'rsatilgan qismi, ish matnida havola qilingan,\n" +
                    "o'rganilgan material bilan",
            "bobning boshi joylashgan sahifa raqamlari ko'rsatilgan barcha boblar va\n" +
                    "paragraflarning nomi",
            1
        )
        val que20 = Questions(
            1,
            "Kirish - bu ...",
            "bajarilgan ishlar xulosasining mazmuni",
            "mavzuning asosli dolzarbligi, uning nazariy va amaliy ahamiyati, maqsadni\n" +
                    "shakllantirish",
            "bobning boshi joylashgan sahifa raqamlari ko'rsatilgan barcha boblar va\n" +
                    "paragraflarning nomlari",
            "dissertatsiyaning tarkibiy mazmunini, shu jumladan kirish, asosiy va xulosani\n" +
                    "to'liq aks ettirish\n",
            2
        )

        questionsList.add(que13)
        questionsList.add(que14)
        questionsList.add(que15)
        questionsList.add(que16)
        questionsList.add(que17)
        questionsList.add(que18)
        questionsList.add(que19)
        questionsList.add(que20)
        questionsList.shuffle()
        return questionsList
    }

}