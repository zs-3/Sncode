package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzeh extends com.google.android.gms.internal.auth.zzej {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    /* synthetic */ zzeh(byte[] r1, int r2, int r3, boolean r4, com.google.android.gms.internal.auth.zzeg r5) {
            r0 = this;
            r2 = 0
            r0.<init>(r2)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zze = r2
            r0.zzb = r1
            r1 = 0
            r0.zzc = r1
            return
    }

    public final int zza(int r4) throws com.google.android.gms.internal.auth.zzfb {
            r3 = this;
            int r4 = r3.zze
            r0 = 0
            r3.zze = r0
            int r1 = r3.zzc
            int r2 = r3.zzd
            int r1 = r1 + r2
            r3.zzc = r1
            if (r1 <= 0) goto L14
            r3.zzd = r1
            int r1 = r1 - r1
            r3.zzc = r1
            goto L16
        L14:
            r3.zzd = r0
        L16:
            return r4
    }
}
