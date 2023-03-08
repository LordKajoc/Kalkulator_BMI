abstract class kondisimanusia() {
    abstract fun hitung()
}

open class kondisi1() : kondisimanusia() {
    override fun hitung() {
        print("Masukan Berat Badan (kg): ")
        val beratbadan = readln().toDouble()
        print("Masukan Tinggi Badan (cm): ")
        var tinggibadan = readln().toDouble()
        tinggibadan = tinggibadan / 100.0
        val BMI: Double = (beratbadan / (tinggibadan * tinggibadan))
        if (BMI < 17.0) {
            val kuruspertama = KurusKurangDari17()
            kuruspertama.kondisiKurus()
        } else if (BMI in 17.0..18.5) {
            val kuruskedua = Kurus2()
            kuruskedua.kondisiKurus()
        } else if (BMI in 18.5..25.0) {
            val normal = Normal()
            normal.normal()
        } else if (BMI in 25.0..27.0) {
            val gemuk1 = Gemuk()
            gemuk1.kondisiGemuk()
        } else if (BMI > 27) {
            val gemuk2 = Gemuk()
            gemuk2.kondisiGemuk()
        }
    }
}

