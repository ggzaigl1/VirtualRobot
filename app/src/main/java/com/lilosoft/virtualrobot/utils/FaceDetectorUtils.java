package com.lilosoft.virtualrobot.utils;

import android.graphics.Bitmap;
import android.media.FaceDetector;
import android.media.FaceDetector.Face;

/**
 * Created by yubo on 2015/9/5.
 * 人脸检测工具类
 */
public class FaceDetectorUtils {

    private FaceDetectorUtils() {
    }

    public interface Callback {
        void onFaceDetected(Face[] faces, Bitmap bitmap);

        void onFaceNotDetected(Bitmap bitmap);
    }

    /**
     * 检测bitmap中的人脸，在callback中返回人脸数据
     *
     * @param bitmap
     * @param callback
     */
    public static void detectFace(Bitmap bitmap, Callback callback) {
        try {
            Bitmap bitmap2 = bitmap.copy(Bitmap.Config.RGB_565, true);
            FaceDetector faceDetector = new FaceDetector(bitmap2.getWidth(), bitmap2.getHeight(), 1);
            FaceDetector.Face[] faces = new FaceDetector.Face[1];
            int faceNum = faceDetector.findFaces(bitmap2, faces);
            if (faceNum > 0) {
                if (callback != null) {
                    callback.onFaceDetected(faces, bitmap);
                }
            } else {
                if (callback != null) {
                    callback.onFaceNotDetected(bitmap);
                    bitmap.recycle();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
