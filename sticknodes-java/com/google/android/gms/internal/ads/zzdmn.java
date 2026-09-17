package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzdmn implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ com.google.android.gms.internal.ads.zzdmo zza;

    zzdmn(com.google.android.gms.internal.ads.zzdmo r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(java.lang.Throwable r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzfe
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1b
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r1 = "omid native display exp"
            r0.zzw(r3, r1)
        L1b:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r1) {
            r0 = this;
            java.util.List r1 = (java.util.List) r1
            r0.zzc(r1)
            return
    }

    public final void zzc(java.util.List r3) {
            r2 = this;
            r0 = 0
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.ClassCastException -> Lf java.lang.IndexOutOfBoundsException -> L11
            com.google.android.gms.internal.ads.zzcfo r3 = (com.google.android.gms.internal.ads.zzcfo) r3     // Catch: java.lang.ClassCastException -> Lf java.lang.IndexOutOfBoundsException -> L11
            if (r3 == 0) goto L2d
            com.google.android.gms.internal.ads.zzdmo r0 = r2.zza     // Catch: java.lang.ClassCastException -> Lf java.lang.IndexOutOfBoundsException -> L11
            com.google.android.gms.internal.ads.zzdmo.zza(r0, r3)     // Catch: java.lang.ClassCastException -> Lf java.lang.IndexOutOfBoundsException -> L11
            return
        Lf:
            r3 = move-exception
            goto L12
        L11:
            r3 = move-exception
        L12:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzfe
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2d
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r1 = "omid native display exp"
            r0.zzw(r3, r1)
        L2d:
            return
    }
}
