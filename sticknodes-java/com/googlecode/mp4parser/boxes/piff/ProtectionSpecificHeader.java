package com.googlecode.mp4parser.boxes.piff;

/* loaded from: classes2.dex */
public abstract class ProtectionSpecificHeader {
    protected static java.util.Map<java.util.UUID, java.lang.Class<? extends com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader>> uuidRegistry;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader.uuidRegistry = r0
            return
    }

    public ProtectionSpecificHeader() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader createFor(java.util.UUID r1, java.nio.ByteBuffer r2) {
            java.util.Map<java.util.UUID, java.lang.Class<? extends com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader>> r0 = com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader.uuidRegistry
            java.lang.Object r1 = r0.get(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L18
            com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader r1 = (com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader) r1     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L18
            goto L20
        L11:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
        L18:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
        L1f:
            r1 = 0
        L20:
            if (r1 != 0) goto L27
            com.googlecode.mp4parser.contentprotection.GenericHeader r1 = new com.googlecode.mp4parser.contentprotection.GenericHeader
            r1.<init>()
        L27:
            r1.parse(r2)
            return r1
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "somebody called equals on me but that's not supposed to happen."
            r2.<init>(r0)
            throw r2
    }

    public abstract java.nio.ByteBuffer getData();

    public abstract java.util.UUID getSystemId();

    public abstract void parse(java.nio.ByteBuffer r1);

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ProtectionSpecificHeader"
            r0.append(r1)
            java.lang.String r1 = "{data="
            r0.append(r1)
            java.nio.ByteBuffer r1 = r3.getData()
            java.nio.ByteBuffer r1 = r1.duplicate()
            r1.rewind()
            int r2 = r1.limit()
            byte[] r2 = new byte[r2]
            r1.get(r2)
            java.lang.String r1 = com.coremedia.iso.Hex.encodeHex(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
