package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgdw {
    private static final byte[] zza = null;

    static {
            r0 = 128(0x80, float:1.794E-43)
            byte[] r0 = new byte[r0]
            r1 = -1
            java.util.Arrays.fill(r0, r1)
            r1 = 0
            r2 = 0
        La:
            r3 = 10
            if (r2 >= r3) goto L16
            int r3 = r2 + 48
            byte r4 = (byte) r2
            r0[r3] = r4
            int r2 = r2 + 1
            goto La
        L16:
            r2 = 26
            if (r1 >= r2) goto L28
            int r2 = r1 + 65
            int r3 = r1 + 10
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r1 + 97
            r0[r2] = r3
            int r1 = r1 + 1
            goto L16
        L28:
            com.google.android.gms.internal.ads.zzgdw.zza = r0
            return
    }

    static int zza(char r1) {
            r0 = 128(0x80, float:1.794E-43)
            if (r1 >= r0) goto L9
            byte[] r0 = com.google.android.gms.internal.ads.zzgdw.zza
            r1 = r0[r1]
            return r1
        L9:
            r1 = -1
            return r1
    }
}
