package com.google.firebase.encoders.proto;

/* loaded from: classes2.dex */
public class ProtobufEncoder {
    private final com.google.firebase.encoders.ObjectEncoder<java.lang.Object> fallbackEncoder;
    private final java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> objectEncoders;
    private final java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> valueEncoders;

    public static final class Builder implements com.google.firebase.encoders.config.EncoderConfig<com.google.firebase.encoders.proto.ProtobufEncoder.Builder> {
        private static final com.google.firebase.encoders.ObjectEncoder<java.lang.Object> DEFAULT_FALLBACK_ENCODER = null;
        private com.google.firebase.encoders.ObjectEncoder<java.lang.Object> fallbackEncoder;
        private final java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> objectEncoders;
        private final java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> valueEncoders;

        /* renamed from: $r8$lambda$JOeBREy-arX3AusrR1rEc3P7Mnw, reason: not valid java name */
        public static /* synthetic */ void m63$r8$lambda$JOeBREyarX3AusrR1rEc3P7Mnw(java.lang.Object r0, com.google.firebase.encoders.ObjectEncoderContext r1) {
                lambda$static$0(r0, r1)
                return
        }

        static {
                com.google.firebase.encoders.proto.ProtobufEncoder$Builder$$ExternalSyntheticLambda0 r0 = com.google.firebase.encoders.proto.ProtobufEncoder$Builder$$ExternalSyntheticLambda0.INSTANCE
                com.google.firebase.encoders.proto.ProtobufEncoder.Builder.DEFAULT_FALLBACK_ENCODER = r0
                return
        }

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.objectEncoders = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.valueEncoders = r0
                com.google.firebase.encoders.ObjectEncoder<java.lang.Object> r0 = com.google.firebase.encoders.proto.ProtobufEncoder.Builder.DEFAULT_FALLBACK_ENCODER
                r1.fallbackEncoder = r0
                return
        }

        private static /* synthetic */ void lambda$static$0(java.lang.Object r2, com.google.firebase.encoders.ObjectEncoderContext r3) throws java.io.IOException {
                com.google.firebase.encoders.EncodingException r3 = new com.google.firebase.encoders.EncodingException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Couldn't find encoder for type "
                r0.append(r1)
                java.lang.Class r2 = r2.getClass()
                java.lang.String r2 = r2.getCanonicalName()
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r3.<init>(r2)
                throw r3
        }

        public com.google.firebase.encoders.proto.ProtobufEncoder build() {
                r4 = this;
                com.google.firebase.encoders.proto.ProtobufEncoder r0 = new com.google.firebase.encoders.proto.ProtobufEncoder
                java.util.HashMap r1 = new java.util.HashMap
                java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> r2 = r4.objectEncoders
                r1.<init>(r2)
                java.util.HashMap r2 = new java.util.HashMap
                java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> r3 = r4.valueEncoders
                r2.<init>(r3)
                com.google.firebase.encoders.ObjectEncoder<java.lang.Object> r3 = r4.fallbackEncoder
                r0.<init>(r1, r2, r3)
                return r0
        }

        public com.google.firebase.encoders.proto.ProtobufEncoder.Builder configureWith(com.google.firebase.encoders.config.Configurator r1) {
                r0 = this;
                r1.configure(r0)
                return r0
        }

        @Override // com.google.firebase.encoders.config.EncoderConfig
        public /* bridge */ /* synthetic */ com.google.firebase.encoders.config.EncoderConfig registerEncoder(java.lang.Class r1, com.google.firebase.encoders.ObjectEncoder r2) {
                r0 = this;
                com.google.firebase.encoders.proto.ProtobufEncoder$Builder r1 = r0.registerEncoder(r1, r2)
                return r1
        }

        @Override // com.google.firebase.encoders.config.EncoderConfig
        public <U> com.google.firebase.encoders.proto.ProtobufEncoder.Builder registerEncoder(java.lang.Class<U> r2, com.google.firebase.encoders.ObjectEncoder<? super U> r3) {
                r1 = this;
                java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> r0 = r1.objectEncoders
                r0.put(r2, r3)
                java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> r3 = r1.valueEncoders
                r3.remove(r2)
                return r1
        }
    }

    ProtobufEncoder(java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> r1, java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> r2, com.google.firebase.encoders.ObjectEncoder<java.lang.Object> r3) {
            r0 = this;
            r0.<init>()
            r0.objectEncoders = r1
            r0.valueEncoders = r2
            r0.fallbackEncoder = r3
            return
    }

    public static com.google.firebase.encoders.proto.ProtobufEncoder.Builder builder() {
            com.google.firebase.encoders.proto.ProtobufEncoder$Builder r0 = new com.google.firebase.encoders.proto.ProtobufEncoder$Builder
            r0.<init>()
            return r0
    }

    public void encode(java.lang.Object r5, java.io.OutputStream r6) throws java.io.IOException {
            r4 = this;
            com.google.firebase.encoders.proto.ProtobufDataEncoderContext r0 = new com.google.firebase.encoders.proto.ProtobufDataEncoderContext
            java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> r1 = r4.objectEncoders
            java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> r2 = r4.valueEncoders
            com.google.firebase.encoders.ObjectEncoder<java.lang.Object> r3 = r4.fallbackEncoder
            r0.<init>(r6, r1, r2, r3)
            r0.encode(r5)
            return
    }

    public byte[] encode(java.lang.Object r2) {
            r1 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1.encode(r2, r0)     // Catch: java.io.IOException -> L8
        L8:
            byte[] r2 = r0.toByteArray()
            return r2
    }
}
