package com.merebapps.commons.extensions

import java.io.BufferedWriter

fun BufferedWriter.writeLn(line: String) {
    write(line)
    newLine()
}
