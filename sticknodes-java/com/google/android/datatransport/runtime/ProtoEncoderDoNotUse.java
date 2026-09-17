package com.google.android.datatransport.runtime;

/* loaded from: classes.dex */
public abstract class ProtoEncoderDoNotUse {
    private static final com.google.firebase.encoders.proto.ProtobufEncoder ENCODER = null;

    static {
            com.google.firebase.encoders.proto.ProtobufEncoder$Builder r0 = com.google.firebase.encoders.proto.ProtobufEncoder.builder()
            com.google.firebase.encoders.config.Configurator r1 = com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.CONFIG
            com.google.firebase.encoders.proto.ProtobufEncoder$Builder r0 = r0.configureWith(r1)
            com.google.firebase.encoders.proto.ProtobufEncoder r0 = r0.build()
            com.google.android.datatransport.runtime.ProtoEncoderDoNotUse.ENCODER = r0
            return
    }

    private ProtoEncoderDoNotUse() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void encode(java.lang.Object r1, java.io.OutputStream r2) throws java.io.IOException {
            com.google.firebase.encoders.proto.ProtobufEncoder r0 = com.google.android.datatransport.runtime.ProtoEncoderDoNotUse.ENCODER
            r0.encode(r1, r2)
            return
    }

    public static byte[] encode(java.lang.Object r1) {
            com.google.firebase.encoders.proto.ProtobufEncoder r0 = com.google.android.datatransport.runtime.ProtoEncoderDoNotUse.ENCODER
            byte[] r1 = r0.encode(r1)
            return r1
    }

    public abstract com.google.android.datatransport.runtime.firebase.transport.ClientMetrics getClientMetrics();
}
