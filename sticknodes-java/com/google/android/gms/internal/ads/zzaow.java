package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaow {
    public final int zza;
    public final long zzb;

    private zzaow(int r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public static com.google.android.gms.internal.ads.zzaow zza(com.google.android.gms.internal.ads.zzadc r3, com.google.android.gms.internal.ads.zzek r4) throws java.io.IOException {
            byte[] r0 = r4.zzN()
            r1 = 0
            r2 = 8
            r3.zzh(r0, r1, r2)
            r4.zzL(r1)
            int r3 = r4.zzg()
            long r0 = r4.zzs()
            com.google.android.gms.internal.ads.zzaow r4 = new com.google.android.gms.internal.ads.zzaow
            r4.<init>(r3, r0)
            return r4
    }
}
