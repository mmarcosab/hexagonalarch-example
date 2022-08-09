package com.hexagonalarch.app.infrastructure.qrcode;

import com.google.gson.Gson;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.hexagonalarch.app.domain.Animal;

import java.io.ByteArrayOutputStream;

public class AnimalQrCode {

    private AnimalQrCode(){

    }

    public static byte[] generateQRCodeImage(Animal animal) throws Exception {
        QRCodeWriter barcodeWriter = new QRCodeWriter();
        Gson gson = new Gson();
        var animalJson = gson.toJson(animal);
        BitMatrix bitMatrix = barcodeWriter.encode(animalJson, BarcodeFormat.QR_CODE, 200, 200);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        MatrixToImageWriter.writeToStream(bitMatrix, "PNG", byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

}
