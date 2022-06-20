package com.example.scientificeducation.utils

import java.io.Serializable


class Info : Serializable {
    var id: Int? = null
    var name: String? = null
    var number: Int? = null
    var read: String? = null
    var image: Int? = null
    var pdfName: String? = null
    var position:Int?=null


    constructor(
        id: Int?,
        name: String?,
        number: Int?,
        read: String?,
        image: Int?,
        pdfName: String?,
        position: Int?
    ) {
        this.id = id
        this.name = name
        this.number = number
        this.read = read
        this.image = image
        this.pdfName = pdfName
        this.position = position
    }

    constructor(
        name: String?,
        number: Int?,
        read: String?,
        image: Int?,
        pdfName: String?,
        position: Int?
    ) {
        this.name = name
        this.number = number
        this.read = read
        this.image = image
        this.pdfName = pdfName
        this.position = position
    }

    constructor()

}