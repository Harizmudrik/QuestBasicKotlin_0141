package com.example.activity1_141

fun ContohList() {
    println("=== List ===")
    //List Read - Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    //List Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    //Menambahkan data ke dalam List Mutable
    shape.add("Circle")
    println(shape)

    //Menghapus data dari list Mutable
    shape.remove("Triangle")
    println(shape)

    //mengubah data di dalam List Mutable
    shape[0] = "Oval"
    println(shape)

    //List Read-Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

// Map adalah kumpulan data yang disusun dalam pasangan key-value
// Map bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
// Map bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat di ubah
// Map Read-Only menggunakan mapOf
// Map Mutable menggunakan mutableMapOf

fun ContohMap() {
    println("=== Map ===")

    // Map Read-Only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyShape)

    // Map Mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)

    // Menambahkan data ke dalam Map Mutable
    shape["Rectangle"] = 4
    println(shape)

    // Menghapus data dari Map Mutable
    shape.remove("Circle")
    println(shape)

    // Mengubah data di dalam Map Mutable
    shape["Square"] = 5
    println(shape)

    // Map Read-Only
    val shapesLocked: Map<String, Int> = shape
    println(shapesLocked)
}

fun main() {
    ContohList()
    //ContohSet()
    ContohMap()
}



