
fun main() {
  print("Masukan Berat Badan (kg): ")
  val beratbadan: Double = readln().toDouble()
  print("Masukan Tinggi Badan (cm): ")
  var tinggibadan: Double = readln().toDouble()
  tinggibadan = tinggibadan / 100.0
  var BMI: Double = (beratbadan / (tinggibadan * tinggibadan))

    val kondisiAngka = KurusKurangDari17()
    val kurus = Kurus2()
    val normall = Normal()
    val gemuk = Gemuk()

    if ( BMI < 17.0) {
      kondisiAngka.kondisiKurus()
    } else if ( BMI in 17.0..18.5) {
        kurus.kondisiKurus()
    } else if ( BMI in 18.5..25.0) {
        normall.normal()
    } else if ( BMI in 25.0..27.0) {
        gemuk.kondisiGemuk()
    } else if ( BMI > 27) {
        gemuk.kondisiGemuk()
    }
}

//fun calculateBMI() {
//    /*
//
//}
