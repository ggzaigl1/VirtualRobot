package com.lilosoft.virtualrobot.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.SystemClock;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/**
 * @author LiuQiang on 2018.08.30
 */
public final class FileUtils {
    public static final String TXT_EXTENSION = ".txt";
    public static final String WAV_EXTENSION = ".wav";
    public static final String DAT_EXTENSION = ".dat";
    public static final String MP3_EXTENSION = ".mp3";
    public static final String PCM_EXTENSION = ".pcm";

    private static final String TAG = "FileUtils";

    private FileUtils() {
    }

    /**
     * 生成唯一标示
     *
     * @return
     */
    public static String getUUID32() {
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }

    public static void copyFile(File src, File dest) throws IOException {
        copyFile(new FileInputStream(src), dest);
    }

    public static void copyFile(InputStream is, File dest) throws IOException {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        if (dest.exists()) {
            dest.delete();
        }
        try {
            bis = new BufferedInputStream(is);
            bos = new BufferedOutputStream(new FileOutputStream(dest));
            byte[] bytes = new byte[bis.available()];
            bis.read(bytes);
            bos.write(bytes);
        } finally {
            if (bos != null) {
                bos.close();
            }
            if (bis != null) {
                bis.close();
            }
        }
    }

    public static File getExternalFileDir(Context context) {
        File fileDir = context.getExternalFilesDir(null);
        if (fileDir == null) {
            fileDir = context.getFilesDir();
        }
        return fileDir;
    }

    public static File getCacheDir(Context context) {
        File cacheDir = context.getExternalCacheDir();
        if (cacheDir == null) {
            cacheDir = context.getCacheDir();
        }
        return cacheDir;
    }

    public static String getTxtCachePath(Context context) {
        File cacheDir = getCacheDir(context);
        File pcmCacheDir = new File(cacheDir, SystemClock.elapsedRealtime() + "log.txt");
        return pcmCacheDir.getAbsolutePath();
    }

    public static File getPcmCacheDir(Context context) {
        File cacheDir = getCacheDir(context);
        File pcmCacheDir = new File(cacheDir, "pcm");
        if (!pcmCacheDir.exists()) {
            pcmCacheDir.mkdirs();
        }
        return pcmCacheDir;
    }

    public static File getWavCacheDir(Context context) {
        File cacheDir = getCacheDir(context);
        File wavCacheDir = new File(cacheDir, "wav");
        if (!wavCacheDir.exists()) {
            wavCacheDir.mkdirs();
        }
        return wavCacheDir;
    }

    public static void deleteFile(File file) {
        if (file != null && file.exists()) {
            file.delete();
        }
    }

    public static byte[] readBytesFromFile(File file) throws IOException {
        return readBytesFromFile(file.getAbsolutePath());
    }

    public static byte[] readBytesFromFile(String path) throws IOException {
        try (InputStream inputStream = new FileInputStream(path)) {
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
            inputStream.close();
            return bytes;
        }
    }

    public static byte[] readBytesFromAssets(Context context, String path) throws IOException {
        AssetManager assets = context.getAssets();
        InputStream in = assets.open(path);
        byte[] bytes = new byte[in.available()];
        in.read(bytes);
        in.close();
        return bytes;
    }

    public static String readStringFromFile(File file) throws IOException {
        return readStringFromFile(file.getAbsolutePath());
    }

    public static String readStringFromFile(String path) throws IOException {
        BufferedInputStream bis = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(path));
            byte[] bytes = new byte[bis.available()];
            bis.read(bytes);
            return new String(bytes);
        } finally {
            if (bis != null) {
                bis.close();
            }
        }
    }

    /**
     * 从 assets 复制出来的歌曲文件
     *
     * @param context
     * @return
     */
    public static File getAssetsFilePath(Context context) {
        File fileDir = getExternalFileDir(context);
        File file = new File(fileDir, "song_data");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /**
     * 从 assets 复制出来的歌曲文件
     *
     * @param context
     * @return
     */
    public static File getResourceFilePath(Context context) {
        File fileDir = getExternalFileDir(context);
        File file = new File(fileDir, "avatar");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
