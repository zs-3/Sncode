package com.google.firebase.encoders;

/* loaded from: classes2.dex */
public interface ObjectEncoderContext {
    com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor r1, double r2) throws java.io.IOException;

    com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor r1, int r2) throws java.io.IOException;

    com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor r1, long r2) throws java.io.IOException;

    com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor r1, java.lang.Object r2) throws java.io.IOException;

    com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor r1, boolean r2) throws java.io.IOException;
}
