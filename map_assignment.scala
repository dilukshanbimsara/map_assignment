//Index No: 19000121

object Ceasar_Cipher extends App{
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    val Encryption = (alp:String, shift:Int, c:Char)=> alp((alp.indexOf(c.toUpper) + shift) % alp.size)

    val Decryption = (alp:String, shift:Int, c:Char) => {
        if((alp.indexOf(c.toUpper)-shift)<0) alp((alp.indexOf(c.toUpper)-shift+alp.size) % alp.size)
        else alp((alp.indexOf(c.toUpper) - shift) % alp.size)
    }

    val Cipher = (function:(String, Int, Char) => Char, s:String, alp:String, shift:Int) => s.map(function(alp,shift,_))

    val str = "FUNCTIONAL PROGRAMMING"

    val s = str.replace(" ", "")
    println("String: "+s)

    print("Encryption: ")
    val et = Cipher(Encryption, s, alphabet, 5)
    println(et)

    print("Decryption: ")
    val dt = Cipher(Decryption, et, alphabet, 5)
    println(dt)
}