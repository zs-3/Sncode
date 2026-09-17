package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcpe implements com.google.android.gms.internal.ads.zzbjw {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcph zza;

    zzcpe(com.google.android.gms.internal.ads.zzcph r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void zza(java.lang.Object r1, java.util.Map r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzcph r1 = r0.zza
            boolean r1 = com.google.android.gms.internal.ads.zzcph.zzg(r1, r2)
            if (r1 != 0) goto L9
            return
        L9:
            com.google.android.gms.internal.ads.zzcph r1 = r0.zza
            java.util.concurrent.Executor r1 = com.google.android.gms.internal.ads.zzcph.zzb(r1)
            com.google.android.gms.internal.ads.zzcpd r2 = new com.google.android.gms.internal.ads.zzcpd
            r2.<init>(r0)
            r1.execute(r2)
            return
    }
}
