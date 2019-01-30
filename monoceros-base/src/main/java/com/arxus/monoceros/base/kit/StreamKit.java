package com.arxus.monoceros.base.kit;

import java.io.*;

/**
 * 流相关工具类
 */
public class StreamKit {

    /**
     * 复制InputStream
     * @param inputStream
     * @return
     * @throws IOException
     */
    public static InputStream cloneInputStream(InputStream inputStream) throws IOException {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = inputStream.read(buffer)) != -1) {
                byteArrayOutputStream.write(buffer, 0, len);
            }
            byteArrayOutputStream.flush();
            return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        }
    }


    /**
     * InputStream转化为byte数组
     * @param inputStream
     * @return
     * @throws IOException
     */
    public static byte[] inputStreamToBytes(InputStream inputStream) throws IOException {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = inputStream.read(buffer)) != -1) {
                byteArrayOutputStream.write(buffer, 0, len);
            }
            byteArrayOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        }
    }

    /**
     * byte数组转化为InputStream
     * @param bytes
     * @return
     */
    public static InputStream bytesToInputStream(byte[] bytes) {
        return new ByteArrayInputStream(bytes);
    }


    /**
     * 深拷贝对象
     * @param src
     * @param <T>
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static <T> T deepCopy(T src) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream)) {
            outputStream.writeObject(src);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        try (ObjectInputStream inputStream = new ObjectInputStream(byteArrayInputStream)) {
            return (T) inputStream.readObject();
        }
    }

}
