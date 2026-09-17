package com.coremedia.iso;

/* loaded from: classes.dex */
public final class IsoTypeWriterVariable {
    public IsoTypeWriterVariable() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void write(long r2, java.nio.ByteBuffer r4, int r5) {
            r0 = 1
            if (r5 == r0) goto L43
            r0 = 2
            if (r5 == r0) goto L3a
            r0 = 3
            if (r5 == r0) goto L31
            r0 = 4
            if (r5 == r0) goto L2d
            r0 = 8
            if (r5 != r0) goto L14
            com.coremedia.iso.IsoTypeWriter.writeUInt64(r4, r2)
            goto L4a
        L14:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "I don't know how to read "
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r4 = " bytes"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L2d:
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r4, r2)
            goto L4a
        L31:
            r0 = 16777215(0xffffff, double:8.2890456E-317)
            long r2 = r2 & r0
            int r3 = (int) r2
            com.coremedia.iso.IsoTypeWriter.writeUInt24(r4, r3)
            goto L4a
        L3a:
            r0 = 65535(0xffff, double:3.23786E-319)
            long r2 = r2 & r0
            int r3 = (int) r2
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r4, r3)
            goto L4a
        L43:
            r0 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r0
            int r3 = (int) r2
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r4, r3)
        L4a:
            return
    }
}
