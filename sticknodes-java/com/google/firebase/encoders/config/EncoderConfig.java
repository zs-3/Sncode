package com.google.firebase.encoders.config;

import com.google.firebase.encoders.config.EncoderConfig;

/* loaded from: classes2.dex */
public interface EncoderConfig<T extends com.google.firebase.encoders.config.EncoderConfig<T>> {
    <U> T registerEncoder(java.lang.Class<U> r1, com.google.firebase.encoders.ObjectEncoder<? super U> r2);
}
