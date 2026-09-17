package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgtf {
    public static byte[] zza(byte[] r7) {
            int r0 = r7.length
            r1 = 16
            if (r0 != r1) goto L33
            byte[] r0 = new byte[r1]
            r2 = 0
            r3 = 0
        L9:
            r4 = 15
            if (r3 >= r1) goto L25
            int r5 = r3 + 1
            r6 = r7[r3]
            int r6 = r6 + r6
            r6 = r6 & 254(0xfe, float:3.56E-43)
            byte r6 = (byte) r6
            r0[r3] = r6
            if (r3 >= r4) goto L23
            r4 = r7[r5]
            int r4 = r4 >> 7
            r4 = r4 & 1
            r4 = r4 | r6
            byte r4 = (byte) r4
            r0[r3] = r4
        L23:
            r3 = r5
            goto L9
        L25:
            r1 = r0[r4]
            r7 = r7[r2]
            int r7 = r7 >> 7
            r7 = r7 & 135(0x87, float:1.89E-43)
            byte r7 = (byte) r7
            r7 = r7 ^ r1
            byte r7 = (byte) r7
            r0[r4] = r7
            return r0
        L33:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "value must be a block."
            r7.<init>(r0)
            throw r7
    }
}
