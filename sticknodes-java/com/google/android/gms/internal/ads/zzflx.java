package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzflx implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfma zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzflp zzb;
    final /* synthetic */ boolean zzc;

    zzflx(com.google.android.gms.internal.ads.zzfma r1, com.google.android.gms.internal.ads.zzflp r2, boolean r3) {
            r0 = this;
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(java.lang.Throwable r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzflp r0 = r2.zzb
            boolean r1 = r0.zzk()
            if (r1 == 0) goto L1d
            com.google.android.gms.internal.ads.zzfma r1 = r2.zza
            r0.zzh(r3)
            r3 = 0
            r0.zzg(r3)
            r1.zza(r0)
            boolean r3 = r2.zzc
            if (r3 == 0) goto L1d
            com.google.android.gms.internal.ads.zzfma r3 = r2.zza
            r3.zzh()
        L1d:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zzb(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzflp r2 = r1.zzb
            r0 = 1
            r2.zzg(r0)
            com.google.android.gms.internal.ads.zzfma r0 = r1.zza
            r0.zza(r2)
            boolean r2 = r1.zzc
            if (r2 == 0) goto L14
            com.google.android.gms.internal.ads.zzfma r2 = r1.zza
            r2.zzh()
        L14:
            return
    }
}
