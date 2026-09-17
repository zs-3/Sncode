package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzedp implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfkj zza;

    zzedp(com.google.android.gms.internal.ads.zzedq r1, com.google.android.gms.internal.ads.zzfkj r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(java.lang.Throwable r2) {
            r1 = this;
            java.lang.String r2 = r2.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "Failed to get offline signal database: "
            java.lang.String r2 = r0.concat(r2)
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r2) {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r2 = (android.database.sqlite.SQLiteDatabase) r2
            com.google.android.gms.internal.ads.zzfkj r0 = r1.zza     // Catch: java.lang.Exception -> L8
            r0.zza(r2)     // Catch: java.lang.Exception -> L8
            return
        L8:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "Error executing function on offline signal database: "
            java.lang.String r2 = r0.concat(r2)
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r2)
            return
    }
}
