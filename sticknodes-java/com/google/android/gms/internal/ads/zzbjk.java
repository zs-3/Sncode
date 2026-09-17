package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbjk implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcfo zza;

    zzbjk(com.google.android.gms.internal.ads.zzcfo r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(java.lang.Throwable r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r1 = "DefaultGmsgHandlers.attributionReportingManager"
            r0.zzw(r3, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r3.zza
            java.lang.String r4 = (java.lang.String) r4
            com.google.android.gms.ads.internal.util.zzbw r1 = new com.google.android.gms.ads.internal.util.zzbw
            android.content.Context r2 = r0.getContext()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r0.zzn()
            java.lang.String r0 = r0.afmaVersion
            r1.<init>(r2, r0, r4)
            r1.zzb()
            return
    }
}
