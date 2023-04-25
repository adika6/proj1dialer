package com.merebapps.commons.extensions

import android.content.Context
import com.merebapps.commons.models.FileDirItem

fun FileDirItem.isRecycleBinPath(context: Context): Boolean {
    return path.startsWith(context.recycleBinPath)
}
