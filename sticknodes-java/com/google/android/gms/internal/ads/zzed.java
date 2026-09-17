package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzed {
    public static void zza(android.media.MediaFormat r1, java.lang.String r2, int r3) {
            r0 = -1
            if (r3 == r0) goto L6
            r1.setInteger(r2, r3)
        L6:
            return
    }

    public static void zzb(android.media.MediaFormat r3, java.util.List r4) {
            r0 = 0
        L1:
            int r1 = r4.size()
            if (r0 >= r1) goto L28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "csd-"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.Object r2 = r4.get(r0)
            byte[] r2 = (byte[]) r2
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)
            r3.setByteBuffer(r1, r2)
            int r0 = r0 + 1
            goto L1
        L28:
            return
    }
}
