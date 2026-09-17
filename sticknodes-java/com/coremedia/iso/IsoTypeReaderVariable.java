package com.coremedia.iso;

/* loaded from: classes.dex */
public final class IsoTypeReaderVariable {
    public IsoTypeReaderVariable() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long read(java.nio.ByteBuffer r2, int r3) {
            r0 = 1
            if (r3 == r0) goto L3e
            r0 = 2
            if (r3 == r0) goto L39
            r0 = 3
            if (r3 == r0) goto L33
            r0 = 4
            if (r3 == r0) goto L2e
            r0 = 8
            if (r3 != r0) goto L15
            long r2 = com.coremedia.iso.IsoTypeReader.readUInt64(r2)
            return r2
        L15:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "I don't know how to read "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " bytes"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        L2e:
            long r2 = com.coremedia.iso.IsoTypeReader.readUInt32(r2)
            return r2
        L33:
            int r2 = com.coremedia.iso.IsoTypeReader.readUInt24(r2)
        L37:
            long r2 = (long) r2
            return r2
        L39:
            int r2 = com.coremedia.iso.IsoTypeReader.readUInt16(r2)
            goto L37
        L3e:
            int r2 = com.coremedia.iso.IsoTypeReader.readUInt8(r2)
            goto L37
    }
}
