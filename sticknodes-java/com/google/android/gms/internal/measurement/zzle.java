package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
final class zzle extends com.google.android.gms.internal.measurement.zzlg {
    private int zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzle(byte[] r1, int r2, int r3, boolean r4, com.google.android.gms.internal.measurement.zzlf r5) {
            r0 = this;
            r1 = 0
            r0.<init>(r1)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.zzd = r1
            r1 = 0
            r0.zzb = r1
            return
    }

    public final int zza(int r4) throws com.google.android.gms.internal.measurement.zzmm {
            r3 = this;
            int r4 = r3.zzd
            r0 = 0
            r3.zzd = r0
            int r1 = r3.zzb
            int r2 = r3.zzc
            int r1 = r1 + r2
            r3.zzb = r1
            if (r1 <= 0) goto L14
            r3.zzc = r1
            int r1 = r1 - r1
            r3.zzb = r1
            goto L16
        L14:
            r3.zzc = r0
        L16:
            return r4
    }
}
