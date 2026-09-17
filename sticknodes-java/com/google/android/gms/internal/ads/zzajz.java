package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzajz implements com.google.android.gms.internal.ads.zzake {
    private final com.google.android.gms.internal.ads.zzadm zza;
    private final com.google.android.gms.internal.ads.zzadl zzb;
    private long zzc;
    private long zzd;

    public zzajz(com.google.android.gms.internal.ads.zzadm r1, com.google.android.gms.internal.ads.zzadl r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r1 = -1
            r0.zzc = r1
            r0.zzd = r1
            return
    }

    public final void zza(long r1) {
            r0 = this;
            r0.zzc = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzake
    public final long zzd(com.google.android.gms.internal.ads.zzadc r7) {
            r6 = this;
            long r0 = r6.zzd
            r2 = -1
            r4 = 0
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 < 0) goto L11
            r4 = 2
            long r0 = r0 + r4
            r6.zzd = r2
            long r0 = -r0
            return r0
        L11:
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzake
    public final com.google.android.gms.internal.ads.zzaea zze() {
            r5 = this;
            long r0 = r5.zzc
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            com.google.android.gms.internal.ads.zzadk r0 = new com.google.android.gms.internal.ads.zzadk
            long r1 = r5.zzc
            com.google.android.gms.internal.ads.zzadm r3 = r5.zza
            r0.<init>(r3, r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzake
    public final void zzg(long r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzadl r0 = r2.zzb
            long[] r0 = r0.zza
            r1 = 1
            int r3 = com.google.android.gms.internal.ads.zzeu.zzc(r0, r3, r1, r1)
            r3 = r0[r3]
            r2.zzd = r3
            return
    }
}
