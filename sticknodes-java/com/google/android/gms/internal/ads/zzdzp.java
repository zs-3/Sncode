package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzdzp implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ android.content.Context zza;

    zzdzp(android.content.Context r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(java.lang.Throwable r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbej.zzh
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L17
            boolean r2 = r2 instanceof com.google.android.gms.ads.internal.util.zzba
            if (r2 == 0) goto L17
            android.content.Context r2 = r1.zza
            com.google.android.gms.internal.ads.zzbcf.zze(r2)
        L17:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzeah r1 = (com.google.android.gms.internal.ads.zzeah) r1
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzbej.zzj
            java.lang.Object r1 = r1.zze()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L15
            android.content.Context r1 = r0.zza
            com.google.android.gms.internal.ads.zzbcf.zze(r1)
        L15:
            return
    }
}
