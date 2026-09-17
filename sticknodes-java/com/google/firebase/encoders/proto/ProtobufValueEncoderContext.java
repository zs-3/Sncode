package com.google.firebase.encoders.proto;

/* loaded from: classes2.dex */
class ProtobufValueEncoderContext implements com.google.firebase.encoders.ValueEncoderContext {
    private boolean encoded;
    private com.google.firebase.encoders.FieldDescriptor field;
    private final com.google.firebase.encoders.proto.ProtobufDataEncoderContext objEncoderCtx;
    private boolean skipDefault;

    ProtobufValueEncoderContext(com.google.firebase.encoders.proto.ProtobufDataEncoderContext r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.encoded = r0
            r1.skipDefault = r0
            r1.objEncoderCtx = r2
            return
    }

    private void checkNotUsed() {
            r2 = this;
            boolean r0 = r2.encoded
            if (r0 != 0) goto L8
            r0 = 1
            r2.encoded = r0
            return
        L8:
            com.google.firebase.encoders.EncodingException r0 = new com.google.firebase.encoders.EncodingException
            java.lang.String r1 = "Cannot encode a second value in the ValueEncoderContext"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public com.google.firebase.encoders.ValueEncoderContext add(java.lang.String r4) throws java.io.IOException {
            r3 = this;
            r3.checkNotUsed()
            com.google.firebase.encoders.proto.ProtobufDataEncoderContext r0 = r3.objEncoderCtx
            com.google.firebase.encoders.FieldDescriptor r1 = r3.field
            boolean r2 = r3.skipDefault
            r0.add(r1, r4, r2)
            return r3
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public com.google.firebase.encoders.ValueEncoderContext add(boolean r4) throws java.io.IOException {
            r3 = this;
            r3.checkNotUsed()
            com.google.firebase.encoders.proto.ProtobufDataEncoderContext r0 = r3.objEncoderCtx
            com.google.firebase.encoders.FieldDescriptor r1 = r3.field
            boolean r2 = r3.skipDefault
            r0.add(r1, r4, r2)
            return r3
    }

    void resetContext(com.google.firebase.encoders.FieldDescriptor r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.encoded = r0
            r1.field = r2
            r1.skipDefault = r3
            return
    }
}
