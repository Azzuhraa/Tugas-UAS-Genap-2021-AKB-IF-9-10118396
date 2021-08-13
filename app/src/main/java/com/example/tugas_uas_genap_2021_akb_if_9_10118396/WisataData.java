package com.example.tugas_uas_genap_2021_akb_if_9_10118396;

// 07 Agustus 2021
// 10118396
// Azzuhra
// IF 9

import java.util.ArrayList;

public class WisataData {
    private static String[] wisataNames = {
            "Farmhouse Lembang",
            "Chinatown Bandung",
            "Kawah Putih Ciwidey",
            "Air Terjun Pelangi",
            "Curug Malela",
            "Tebing Keraton",
            "Bukit Jamur"
    };
    private static String[] wisataDescription = {
            "Farmhouse Susu Lembang, merupakan sebuah area yang didalamnya terdapat beberapa bangunan yang ditata dengan suasana Eropa. Selain bangunan – bangunan bercitarasa Eropa yang ditawarkan disini, terdapat pula sebuah spot foto berupa rumah The Hobbit. Jadi bagi anda yang ingin merasakan bagaimana sensasi nya berfoto di depan rumah kurcaci, tidak perlu jauh – jauh terbang ke Eropa, karena Farmhouse Susu Lembang sudah menata nya sedemikian rupa hingga mirip seperti rumah kurcaci yang sebenarnya. Jika anda belum puas merasakan suasana Eropa, terdapat pula sewa baju ala gadis – gadis Eropa disini. Busana gadis Eropa lengkap dengan topi dari kain yang khas, dapat anda kenakan selama dua jam dengan membayar jasa sewa tentunya. Kenakan lah pakaian tersebut dan ambilah beberapa foto di bangunan – bangunan yang dibangun dengan eksterior ala Eropa, dijamin anda akan merasa benar – benar sedang berlibur disana.",
            "Kampung china ini berdiri di atas lahan seluas 3.000 ha. Kawasan ini mulai di komersilkan sebagai kawasan wisata pada 4 agustus 2017. Awalnya, kampung ini hanya kampung biasa yang dihuni oleh warga tionghoa yang tinggal di Bandung. Sehingga, di sebut dengan nama kampung pecinan.\n" +
                    "\n" +
                    "Di Indonesia khususnya ada di beberapa kota besar, banyak sekali wilayah pecinan yang cukup ternama dan dijadikan sebagai lokasi wisata. Di Bandung, kawasan ini pun disulap dan diperbaharui sedemikian rupa agar kawasan pecinan di Bandung terasa sangat berbeda di antara kawasan pecinan yang lain.",
            "Kampung china ini berdiri di atas lahan seluas 3.000 ha. Kawasan ini mulai di komersilkan sebagai kawasan wisata pada 4 agustus 2017. Awalnya, kampung ini hanya kampung biasa yang dihuni oleh warga tionghoa yang tinggal di Bandung. Sehingga, di sebut dengan nama kampung pecinan.\n" +
                    "\n" +
                    "Di Indonesia khususnya ada di beberapa kota besar, banyak sekali wilayah pecinan yang cukup ternama dan dijadikan sebagai lokasi wisata. Di Bandung, kawasan ini pun disulap dan diperbaharui sedemikian rupa agar kawasan pecinan di Bandung terasa sangat berbeda di antara kawasan pecinan yang lain.",
            "Curug Cimahi atau Curug Pelangi atau ada juga yang menyebutnya Rainbow Waterfalls Bandung adalah salah satu tempat wisata yang cukup terkenal dan saat ini menjadi primadona para wisatawan.\n" +
                    "\n" +
                    "Hal ini menjadi semakin terbukti dengan banyaknya kunjungan wisatawan yang berasal dari Bandung dan daerah2 sekitarnya saat musim libur tiba. Curug Cimahi menawarkan daya tarik berupa keindahan kawasan curug yang alami dan tentunya obyek curug yang sangat indah.\n" +
                    "\n" +
                    "Curug ini memiliki ketinggian sekitar 74 meter sehingga menyandang status sebagi curug tertinggi di wilayah Bandung.",
            "Curug Malela atau dalam bahasa Indonesia berarti Air Terjun Malela memiliki sumber air terjun yang  berasal dari hulu sungai bagian Utara Gunung Kendeng,\n" +
                    "\n" +
                    "yaitu sebuah gunung berapi yang terletak di sebelah barat kawasan Wisata Ciwidey yang telah mati dan kemudian mengalir melintasi sungai cidadap – Gunung Halu.\n" +
                    "\n" +
                    "Air sungainya kemudian mengalir ke hulu dan membentuk jarinagn sungai cidadap dan akhirnya aliran airnya akan bermuara di Cisokan.\n" +
                    "\n" +
                    "Curug Malela sendiri sebenarnya merupakan air terjun paling atas dari rangkaian air terjun yang ada di sepanjang aliran sungai tersebut,",
            "Tebing Keraton atau lebih dikenal dengan Tebing Keraton berada di ketinggian 1200 mdpl. Tebing ini menawarkan keindahan alam dari jejeran hutan pinus. Selain itu saat dari tebing ini, hamparan keindahan kota Bandung bisa terlihat lebih apik. Tempat wisata yang sangat cocok bagi pencinta kegiatan alam.\n" +
                    "\n" +
                    "Selain menawarkan keindahan alam dan perbukitan, beragam aktivitas bisa dilakukan di sini. Mulai dari kegiatan menantang sampai kegiatan relaksasi. Tidak salah memang tebing ini menjadi salah satu tujuan favorit wisatawan yang berkunjung ke lembang.",
            "Disebut sebagai Bukit Jamur Ciwidey bukan berarti tempat ini dipenuhi jamur ya. Namun, karena dipenuhi pepohonan cemara yang pendek dan berbentuk payung seperti jamur, akhirnya disebut bukit jamur.\n" +
                    "\n" +
                    "Bentuk pohonnya yang unik membuat tempat ini jadi favorit pengunjung untuk hunting foto, hingga pre wedding.\n" +
                    "\n" +
                    "Terdapat pula hamparan rumput hijau di bawah pepohonan yang bisa digunakan untuk rebahan. Fasilitasnya pun lengkap, mulai dari toilet, musala, gazebo, hingga lapangan parkir. "
    };
    private static String[] wisataFee = {
            "Rp.10.000,00",
            "Rp.10.000,00",
            "Gratis",
            "Rp.5000,00",
            "Rp.5.500,00",
            "Rp.5000,00",
            "Rp.5000,00"
    };

    private static String[] wisataAddress = {
            "Jl. Raya Lembang No.108, Gudangkahuripan, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391",
            "Jl. Kelenteng no.41, Ciroyom, Andir, Kota Bandung.",
            "kawah putih lebak muncang bandung, Lebakmuncang, Kec. Ciwidey, Bandung, Jawa Barat 40973",
            "Jl. Kolonel Masturi No.325, Kertawangi, Kec. Cisarua, Kabupaten Bandung Barat, Jawa Barat",
            "Kampung Manglid, Desa Cicadas, Kecamatan Rongga, Kabupaten Bandung Barat, Propinsi Jawa Barat",
            "Ciburial, Kec. Cimenyan, Kabupaten Bandung Barat, Jawa Barat 40198",
            "Sugihmukti, Pasirjambu, Bandung, West Java 40972"
    };

    private static String[] wisataMap = {
            "https://www.google.com/maps/place/Farmhouse+Susu+Lembang/@-6.8329637,107.6034296,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e13bbef5ad89:0x356bebed022b2371!8m2!3d-6.832969!4d107.6056183",
            "https://www.google.com/maps/place/Chinatown+Bandung/@-6.9172663,107.5927563,15z/data=!4m5!3m4!1s0x0:0xf0bad8c42a8715da!8m2!3d-6.9172663!4d107.5927563",
            "https://www.google.com/maps/place/Kawah+Putih+Lebak+Muncang+Bandung+Jabar/@-7.1436502,107.3959359,17z/data=!3m1!4b1!4m5!3m4!1s0x2e688c62bdec95ad:0xef9f051488fed458!8m2!3d-7.1436555!4d107.3981246",
            "https://www.google.com/maps/place/Curug+Cimahi/@-6.797733,107.5761804,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e17293f2dbe3:0xb4fb3e7c0a524f5b!8m2!3d-6.7977383!4d107.5783691",
            "https://www.google.com/maps/place/Curug+Malela/@-7.0182171,107.1984597,15z/data=!4m13!1m7!3m6!1s0x2e6859502d1faae5:0x637a7f90a74e56e2!2sMalela+waterfall!3b1!8m2!3d-7.0182386!4d107.2072145!3m4!1s0x2e685900135618eb:0x39af95c4c0d32be!8m2!3d-7.0108094!4d107.2060158",
            "https://www.google.com/maps/place/Tebing+Keraton/@-6.834063,107.6614264,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e72171df7dc1:0x2f905d027e880a47!8m2!3d-6.8340683!4d107.6636151",
            "https://www.google.com/maps/place/Mushroom+hill+Rancabolang+Ciwidey/@-7.1951049,107.4290924,17z/data=!3m1!4b1!4m5!3m4!1s0x2e688e883a887861:0x5271ae77ece8a620!8m2!3d-7.1951102!4d107.4312811"
    };

    private static int[] wisataPhoto = {
            R.drawable.farm_house,
            R.drawable.china_town,
            R.drawable.kawah_putih,
            R.drawable.air_terjun,
            R.drawable.curug_malela,
            R.drawable.tebing_keraton,
            R.drawable.bukit_jamur
    };
    static ArrayList<Wisata> getListData() {
        ArrayList<Wisata> list = new ArrayList<>();
        for (int position = 0; position < wisataNames.length; position++) {
            Wisata wisata = new Wisata();
            wisata.setName(wisataNames[position]);
            wisata.setDescription(wisataDescription[position]);
            wisata.setFee(wisataFee[position]);
            wisata.setAddress(wisataAddress[position]);
            wisata.setPhoto(wisataPhoto[position]);
            wisata.setMap(wisataMap[position]);
            list.add(wisata);
        }
        return list;
    }
}
