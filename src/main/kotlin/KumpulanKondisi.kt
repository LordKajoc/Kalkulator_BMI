abstract class Kondisi{
    fun inputuser(){
    print("Masukan Berat Badan (kg): ")
    val beratbadan: Double = readln().toDouble()
    print("Masukan Tinggi Badan (cm): ")
    var tinggibadan: Double = readln().toDouble()
    tinggibadan = tinggibadan / 100.0
}
    class hitung: Kondisi() {

    }
}