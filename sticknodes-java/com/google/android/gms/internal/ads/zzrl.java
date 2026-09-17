package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzrl extends com.google.android.gms.internal.ads.zzcu {
    private static final int zzd = 0;

    static {
            r0 = 2143289344(0x7fc00000, float:NaN)
            int r0 = java.lang.Float.floatToIntBits(r0)
            com.google.android.gms.internal.ads.zzrl.zzd = r0
            return
    }

    zzrl() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void zzo(int r4, java.nio.ByteBuffer r5) {
            double r0 = (double) r4
            r2 = 4467570830353629184(0x3e00000000200000, double:4.656612875245797E-10)
            double r0 = r0 * r2
            float r4 = (float) r0
            int r4 = java.lang.Float.floatToIntBits(r4)
            int r0 = com.google.android.gms.internal.ads.zzrl.zzd
            if (r4 != r0) goto L16
            r4 = 0
            int r4 = java.lang.Float.floatToIntBits(r4)
        L16:
            r5.putInt(r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zze(java.nio.ByteBuffer r8) {
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            com.google.android.gms.internal.ads.zzcr r3 = r7.zzb
            int r3 = r3.zzd
            r4 = 21
            if (r3 == r4) goto Lb8
            r4 = 22
            if (r3 == r4) goto L85
            r4 = 1342177280(0x50000000, float:8.5899346E9)
            if (r3 == r4) goto L57
            r4 = 1610612736(0x60000000, float:3.6893488E19)
            if (r3 != r4) goto L51
            java.nio.ByteBuffer r2 = r7.zzj(r2)
        L22:
            if (r0 >= r1) goto Le6
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r0 + 2
            byte r4 = r8.get(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            int r5 = r0 + 1
            byte r5 = r8.get(r5)
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 16
            byte r6 = r8.get(r0)
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 24
            r3 = r3 | r4
            r3 = r3 | r5
            r3 = r3 | r6
            zzo(r3, r2)
            int r0 = r0 + 4
            goto L22
        L51:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L57:
            int r2 = r2 / 3
            int r2 = r2 * 4
            java.nio.ByteBuffer r2 = r7.zzj(r2)
        L5f:
            if (r0 >= r1) goto Le6
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            int r4 = r0 + 1
            byte r4 = r8.get(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            byte r5 = r8.get(r0)
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 24
            r3 = r3 | r4
            r3 = r3 | r5
            zzo(r3, r2)
            int r0 = r0 + 3
            goto L5f
        L85:
            java.nio.ByteBuffer r2 = r7.zzj(r2)
        L89:
            if (r0 >= r1) goto Le6
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r0 + 1
            byte r4 = r8.get(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            int r5 = r0 + 2
            byte r5 = r8.get(r5)
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 16
            int r6 = r0 + 3
            byte r6 = r8.get(r6)
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 24
            r3 = r3 | r4
            r3 = r3 | r5
            r3 = r3 | r6
            zzo(r3, r2)
            int r0 = r0 + 4
            goto L89
        Lb8:
            int r2 = r2 / 3
            int r2 = r2 * 4
            java.nio.ByteBuffer r2 = r7.zzj(r2)
        Lc0:
            if (r0 >= r1) goto Le6
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            int r4 = r0 + 1
            byte r4 = r8.get(r4)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            int r5 = r0 + 2
            byte r5 = r8.get(r5)
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 24
            r3 = r3 | r4
            r3 = r3 | r5
            zzo(r3, r2)
            int r0 = r0 + 3
            goto Lc0
        Le6:
            int r0 = r8.limit()
            r8.position(r0)
            r2.flip()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final com.google.android.gms.internal.ads.zzcr zzi(com.google.android.gms.internal.ads.zzcr r4) throws com.google.android.gms.internal.ads.zzcs {
            r3 = this;
            int r0 = r4.zzd
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 4
            r2 = 21
            if (r0 == r2) goto L22
            r2 = 1342177280(0x50000000, float:8.5899346E9)
            if (r0 == r2) goto L22
            r2 = 22
            if (r0 == r2) goto L22
            r2 = 1610612736(0x60000000, float:3.6893488E19)
            if (r0 == r2) goto L22
            if (r0 != r1) goto L1a
            com.google.android.gms.internal.ads.zzcr r4 = com.google.android.gms.internal.ads.zzcr.zza
            goto L2c
        L1a:
            com.google.android.gms.internal.ads.zzcs r0 = new com.google.android.gms.internal.ads.zzcs
            java.lang.String r1 = "Unhandled input format:"
            r0.<init>(r1, r4)
            throw r0
        L22:
            com.google.android.gms.internal.ads.zzcr r0 = new com.google.android.gms.internal.ads.zzcr
            int r2 = r4.zzb
            int r4 = r4.zzc
            r0.<init>(r2, r4, r1)
            r4 = r0
        L2c:
            return r4
    }
}
