package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaeq implements com.google.android.gms.internal.ads.zzaea {
    final /* synthetic */ com.google.android.gms.internal.ads.zzaet zza;
    private final long zzb;

    public zzaeq(com.google.android.gms.internal.ads.zzaet r1, long r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final long zza() {
            r2 = this;
            long r0 = r2.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final com.google.android.gms.internal.ads.zzady zzg(long r9) {
            r8 = this;
            com.google.android.gms.internal.ads.zzaet r0 = r8.zza
            com.google.android.gms.internal.ads.zzaew[] r0 = com.google.android.gms.internal.ads.zzaet.zza(r0)
            r1 = 0
            r0 = r0[r1]
            com.google.android.gms.internal.ads.zzady r0 = r0.zza(r9)
            r1 = 1
        Le:
            com.google.android.gms.internal.ads.zzaet r2 = r8.zza
            com.google.android.gms.internal.ads.zzaew[] r3 = com.google.android.gms.internal.ads.zzaet.zza(r2)
            int r3 = r3.length
            if (r1 >= r3) goto L31
            com.google.android.gms.internal.ads.zzaew[] r2 = com.google.android.gms.internal.ads.zzaet.zza(r2)
            r2 = r2[r1]
            com.google.android.gms.internal.ads.zzady r2 = r2.zza(r9)
            com.google.android.gms.internal.ads.zzaeb r3 = r2.zza
            com.google.android.gms.internal.ads.zzaeb r4 = r0.zza
            long r5 = r3.zzc
            long r3 = r4.zzc
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L2e
            r0 = r2
        L2e:
            int r1 = r1 + 1
            goto Le
        L31:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final boolean zzh() {
            r1 = this;
            r0 = 1
            return r0
    }
}
