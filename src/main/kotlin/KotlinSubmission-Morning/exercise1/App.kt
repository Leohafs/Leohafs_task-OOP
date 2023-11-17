package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val namaDepan = "Leohafs"
    val namaBelakang = "Sri Indrapura R Zain"
    val nama = namaDepan + namaBelakang
    val umur = 20
    val status = true

    println("""
        ~~~~~PROFILE~~~~~
        Nama Depan : $namaDepan
        Nama Belakang : $namaBelakang
        nama Lengkap : $nama
        Umur : $umur
        Status : ${if (status) "Single" else "Berpasangan"}
    """.trimIndent())
}

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("""
        ~~~~~GROUP DETAIL~~~~~
        Group ID : $groupId
        Group Member : $groupMember
        Session : $session
    """.trimIndent())

    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val group = listOf("leo","alfid","maria","nisa","lukas")
    val myName = group[0]
    return listOf(myName)
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("raihan","reza","megy","reynaldi","jovian","maul")
    val countOfGroup = arrayOf<String>("leo","alfid","maria","nisa","lukas")
    val total = mentor.count() + countOfGroup.count()

    return total
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Merge 7", listOf("leo","alfid","maria","nisa","lukas"), "Morning")

}