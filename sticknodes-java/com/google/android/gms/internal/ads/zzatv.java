package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzatv {
    private final byte[] zza;
    private int zzb;
    private int zzc;

    public zzatv(byte[] r8) {
            r7 = this;
            r7.<init>()
            r0 = 256(0x100, float:3.59E-43)
            byte[] r1 = new byte[r0]
            r7.zza = r1
            r1 = 0
            r2 = 0
        Lb:
            if (r2 >= r0) goto L15
            byte[] r3 = r7.zza
            byte r4 = (byte) r2
            r3[r2] = r4
            int r2 = r2 + 1
            goto Lb
        L15:
            r2 = 0
            r3 = 0
        L17:
            if (r2 >= r0) goto L2f
            byte[] r4 = r7.zza
            r5 = r4[r2]
            int r3 = r3 + r5
            int r6 = r8.length
            int r6 = r2 % r6
            r6 = r8[r6]
            int r3 = r3 + r6
            r3 = r3 & 255(0xff, float:3.57E-43)
            r6 = r4[r3]
            r4[r2] = r6
            r4[r3] = r5
            int r2 = r2 + 1
            goto L17
        L2f:
            r7.zzb = r1
            r7.zzc = r1
            return
    }

    public final void zza(byte[] r8) {
            r7 = this;
            int r0 = r7.zzb
            int r1 = r7.zzc
            r2 = 0
        L5:
            r3 = 256(0x100, float:3.59E-43)
            if (r2 >= r3) goto L2a
            int r0 = r0 + 1
            byte[] r3 = r7.zza
            r0 = r0 & 255(0xff, float:3.57E-43)
            r4 = r3[r0]
            int r1 = r1 + r4
            r1 = r1 & 255(0xff, float:3.57E-43)
            r5 = r3[r1]
            r3[r0] = r5
            r3[r1] = r4
            r5 = r8[r2]
            r6 = r3[r0]
            int r6 = r6 + r4
            r4 = r6 & 255(0xff, float:3.57E-43)
            r3 = r3[r4]
            r3 = r3 ^ r5
            byte r3 = (byte) r3
            r8[r2] = r3
            int r2 = r2 + 1
            goto L5
        L2a:
            r7.zzb = r0
            r7.zzc = r1
            return
    }
}
