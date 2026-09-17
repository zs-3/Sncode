package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcnv implements com.google.android.gms.internal.ads.zzcnf {
    private final android.content.Context zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb;

    public zzcnv(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzi()
            r1.zzb = r0
            r1.zza = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcnf
    public final void zza(java.util.Map r2) {
            r1 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L7
            goto L21
        L7:
            java.lang.String r0 = "gad_idless"
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L21
            com.google.android.gms.ads.internal.util.zzg r0 = r1.zzb
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            r0.zzI(r2)
            if (r2 == 0) goto L21
            android.content.Context r2 = r1.zza
            com.google.android.gms.ads.internal.util.zzad.zzc(r2)
        L21:
            return
    }
}
