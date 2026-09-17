package com.google.firebase.encoders.proto;

/* loaded from: classes2.dex */
public @interface Protobuf {

    public enum IntEncoding extends java.lang.Enum<com.google.firebase.encoders.proto.Protobuf.IntEncoding> {
        private static final /* synthetic */ com.google.firebase.encoders.proto.Protobuf.IntEncoding[] $VALUES = null;
        public static final com.google.firebase.encoders.proto.Protobuf.IntEncoding DEFAULT = null;
        public static final com.google.firebase.encoders.proto.Protobuf.IntEncoding FIXED = null;
        public static final com.google.firebase.encoders.proto.Protobuf.IntEncoding SIGNED = null;

        static {
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r0 = new com.google.firebase.encoders.proto.Protobuf$IntEncoding
                java.lang.String r1 = "DEFAULT"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.firebase.encoders.proto.Protobuf.IntEncoding.DEFAULT = r0
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = new com.google.firebase.encoders.proto.Protobuf$IntEncoding
                java.lang.String r3 = "SIGNED"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.firebase.encoders.proto.Protobuf.IntEncoding.SIGNED = r1
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r3 = new com.google.firebase.encoders.proto.Protobuf$IntEncoding
                java.lang.String r5 = "FIXED"
                r6 = 2
                r3.<init>(r5, r6)
                com.google.firebase.encoders.proto.Protobuf.IntEncoding.FIXED = r3
                r5 = 3
                com.google.firebase.encoders.proto.Protobuf$IntEncoding[] r5 = new com.google.firebase.encoders.proto.Protobuf.IntEncoding[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.google.firebase.encoders.proto.Protobuf.IntEncoding.$VALUES = r5
                return
        }

        IntEncoding(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.firebase.encoders.proto.Protobuf.IntEncoding valueOf(java.lang.String r1) {
                java.lang.Class<com.google.firebase.encoders.proto.Protobuf$IntEncoding> r0 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = (com.google.firebase.encoders.proto.Protobuf.IntEncoding) r1
                return r1
        }

        public static com.google.firebase.encoders.proto.Protobuf.IntEncoding[] values() {
                com.google.firebase.encoders.proto.Protobuf$IntEncoding[] r0 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.firebase.encoders.proto.Protobuf$IntEncoding[] r0 = (com.google.firebase.encoders.proto.Protobuf.IntEncoding[]) r0
                return r0
        }
    }

    com.google.firebase.encoders.proto.Protobuf.IntEncoding intEncoding() default com.google.firebase.encoders.proto.Protobuf.IntEncoding.DEFAULT;

    int tag();
}
