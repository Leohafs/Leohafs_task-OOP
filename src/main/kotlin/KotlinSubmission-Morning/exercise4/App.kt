package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    // melakukan pembagian jika tidak memasukan angka output "harus memasukan angka" jika ada kesalah output "terjadi kesalahan"
    try {
        print("Masukkan angka pertama: ")
        val num1 = readLine()!!.toDouble()

        print("Masukkan angka kedua: ")
        val num2 = readLine()!!.toDouble()

        val result = num1 / num2
        // Output hasil
        println("Hasil pembagian: $result")

    } catch (e: NumberFormatException) {
        println("Error: harus memasukkan angka")
    }  catch (e: Exception) {
        println("Error: Terjadi kesalahan.")
    }
}