package com.faceunity.fulivedemo.utils;

import android.util.Log;

public class YuvUtils {

    public static byte[] nv21MirrorY(byte[] src, int width, int height) {
        byte[] dst = new byte[src.length];
        for (int y = 0; y < height; y++) {
            System.arraycopy(src, (height - 1 - y) * width, dst, y * width, width);
        }
        int wh = width * height;
        int halfH = height / 2;
        for (int y = 0; y < halfH; y++) {
            System.arraycopy(src, wh + y * width, dst, wh + (halfH - 1 - y) * width, width);
        }
        return dst;
    }

}
