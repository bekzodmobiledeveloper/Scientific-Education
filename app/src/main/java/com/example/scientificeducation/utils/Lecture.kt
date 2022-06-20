package com.example.scientificeducation.utils

import java.io.Serializable

class Lecture:Serializable {
    var name: String? = null
    var number: Int? = null
    var image: Int? = null
    var fileName: String? = null

    constructor(name: String?, number: Int?, image: Int?, fileName: String?) {
        this.name = name
        this.number = number
        this.image = image
        this.fileName = fileName
    }
}