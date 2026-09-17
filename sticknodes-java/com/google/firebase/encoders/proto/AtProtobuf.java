package com.google.firebase.encoders.proto;

/* loaded from: classes2.dex */
public final class AtProtobuf {
    private com.google.firebase.encoders.proto.Protobuf.IntEncoding intEncoding;
    private int tag;

    private static final class ProtobufImpl implements com.google.firebase.encoders.proto.Protobuf {
        private final com.google.firebase.encoders.proto.Protobuf.IntEncoding intEncoding;
        private final int tag;

        ProtobufImpl(int r1, com.google.firebase.encoders.proto.Protobuf.IntEncoding r2) {
                r0 = this;
                r0.<init>()
                r0.tag = r1
                r0.intEncoding = r2
                return
        }

        @Override // java.lang.annotation.Annotation
        public java.lang.Class<? extends java.lang.annotation.Annotation> annotationType() {
                r1 = this;
                java.lang.Class<com.google.firebase.encoders.proto.Protobuf> r0 = com.google.firebase.encoders.proto.Protobuf.class
                return r0
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.google.firebase.encoders.proto.Protobuf
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.google.firebase.encoders.proto.Protobuf r5 = (com.google.firebase.encoders.proto.Protobuf) r5
                int r1 = r4.tag
                int r3 = r5.tag()
                if (r1 != r3) goto L21
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = r4.intEncoding
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r5 = r5.intEncoding()
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L21
                goto L22
            L21:
                r0 = 0
            L22:
                return r0
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
                r3 = this;
                int r0 = r3.tag
                r1 = 14552422(0xde0d66, float:2.0392287E-38)
                r0 = r0 ^ r1
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = r3.intEncoding
                int r1 = r1.hashCode()
                r2 = 2041407134(0x79ad669e, float:1.12543585E35)
                r1 = r1 ^ r2
                int r0 = r0 + r1
                return r0
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public com.google.firebase.encoders.proto.Protobuf.IntEncoding intEncoding() {
                r1 = this;
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r0 = r1.intEncoding
                return r0
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public int tag() {
                r1 = this;
                int r0 = r1.tag
                return r0
        }

        @Override // java.lang.annotation.Annotation
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "@com.google.firebase.encoders.proto.Protobuf"
                r0.<init>(r1)
                r1 = 40
                r0.append(r1)
                java.lang.String r1 = "tag="
                r0.append(r1)
                int r1 = r2.tag
                r0.append(r1)
                java.lang.String r1 = "intEncoding="
                r0.append(r1)
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = r2.intEncoding
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public AtProtobuf() {
            r1 = this;
            r1.<init>()
            com.google.firebase.encoders.proto.Protobuf$IntEncoding r0 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.DEFAULT
            r1.intEncoding = r0
            return
    }

    public static com.google.firebase.encoders.proto.AtProtobuf builder() {
            com.google.firebase.encoders.proto.AtProtobuf r0 = new com.google.firebase.encoders.proto.AtProtobuf
            r0.<init>()
            return r0
    }

    public com.google.firebase.encoders.proto.Protobuf build() {
            r3 = this;
            com.google.firebase.encoders.proto.AtProtobuf$ProtobufImpl r0 = new com.google.firebase.encoders.proto.AtProtobuf$ProtobufImpl
            int r1 = r3.tag
            com.google.firebase.encoders.proto.Protobuf$IntEncoding r2 = r3.intEncoding
            r0.<init>(r1, r2)
            return r0
    }

    public com.google.firebase.encoders.proto.AtProtobuf tag(int r1) {
            r0 = this;
            r0.tag = r1
            return r0
    }
}
