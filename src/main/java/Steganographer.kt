interface Steganographer {
//    fun embed(message: ByteArray, coverImage: Image): Image
//    fun extract(coverImage: Image): ByteArray

    fun embed(message: ByteArray, coverImage: ImageRelay): ImageRelay
    fun extract(coverImage: ImageRelay): ByteArray
}