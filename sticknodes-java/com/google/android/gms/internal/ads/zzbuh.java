package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzbuh extends com.google.android.gms.internal.ads.zzbua {
    final /* synthetic */ java.util.List zza;

    zzbuh(com.google.android.gms.internal.ads.zzbuj r1, java.util.List r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbub
    public final void zze(java.lang.String r2) {
            r1 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "Error recording click: "
            java.lang.String r2 = r0.concat(r2)
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbub
    public final void zzf(java.util.List r2) {
            r1 = this;
            java.util.List r2 = r1.zza
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "Recorded click: "
            java.lang.String r2 = r0.concat(r2)
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r2)
            return
    }
}
