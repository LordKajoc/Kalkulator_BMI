abstract class Kondisi{
    fun hitung(){
    print("Masukan Berat Badan (kg): ")
    val beratbadan: Double = readln().toDouble()
    print("Masukan Tinggi Badan (cm): ")
    var tinggibadan: Double = readln().toDouble()
    tinggibadan = tinggibadan / 100.0
        var BMI: Double = (beratbadan / (tinggibadan * tinggibadan))
}
}