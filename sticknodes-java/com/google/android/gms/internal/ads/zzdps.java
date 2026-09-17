package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzdps implements com.google.android.gms.internal.ads.zzbjw {
    final /* synthetic */ com.google.android.gms.internal.ads.zzdpt zza;
    private final java.lang.ref.WeakReference zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.internal.ads.zzbjw zzd;

    /* synthetic */ zzdps(com.google.android.gms.internal.ads.zzdpt r1, java.lang.ref.WeakReference r2, java.lang.String r3, com.google.android.gms.internal.ads.zzbjw r4, com.google.android.gms.internal.ads.zzdpr r5) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void zza(java.lang.Object r2, java.util.Map r3) {
            r1 = this;
            java.lang.ref.WeakReference r2 = r1.zzb
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L10
            com.google.android.gms.internal.ads.zzdpt r2 = r1.zza
            java.lang.String r3 = r1.zzc
            r2.zzn(r3, r1)
            return
        L10:
            com.google.android.gms.internal.ads.zzbjw r0 = r1.zzd
            r0.zza(r2, r3)
            return
    }
}
