package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzlz implements com.google.android.gms.internal.ads.zzkt {
    private boolean zza;
    private long zzb;
    private long zzc;
    private com.google.android.gms.internal.ads.zzbq zzd;

    public zzlz(com.google.android.gms.internal.ads.zzdj r1) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.internal.ads.zzbq r1 = com.google.android.gms.internal.ads.zzbq.zza
            r0.zzd = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final long zza() {
            r7 = this;
            long r0 = r7.zzb
            boolean r2 = r7.zza
            if (r2 == 0) goto L21
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r7.zzc
            long r2 = r2 - r4
            com.google.android.gms.internal.ads.zzbq r4 = r7.zzd
            float r5 = r4.zzb
            r6 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L1c
            long r2 = com.google.android.gms.internal.ads.zzeu.zzr(r2)
            goto L20
        L1c:
            long r2 = r4.zza(r2)
        L20:
            long r0 = r0 + r2
        L21:
            return r0
    }

    public final void zzb(long r1) {
            r0 = this;
            r0.zzb = r1
            boolean r1 = r0.zza
            if (r1 == 0) goto Lc
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.zzc = r1
        Lc:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final com.google.android.gms.internal.ads.zzbq zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbq r0 = r1.zzd
            return r0
    }

    public final void zzd() {
            r2 = this;
            boolean r0 = r2.zza
            if (r0 != 0) goto Ld
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.zzc = r0
            r0 = 1
            r2.zza = r0
        Ld:
            return
    }

    public final void zze() {
            r2 = this;
            boolean r0 = r2.zza
            if (r0 == 0) goto Le
            long r0 = r2.zza()
            r2.zzb(r0)
            r0 = 0
            r2.zza = r0
        Le:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final void zzg(com.google.android.gms.internal.ads.zzbq r3) {
            r2 = this;
            boolean r0 = r2.zza
            if (r0 == 0) goto Lb
            long r0 = r2.zza()
            r2.zzb(r0)
        Lb:
            r2.zzd = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final /* synthetic */ boolean zzj() {
            r1 = this;
            r0 = 0
            return r0
    }
}
