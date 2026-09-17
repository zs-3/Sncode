package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbjy implements com.google.android.gms.internal.ads.zzbjw {
    private final com.google.android.gms.internal.ads.zzbjz zza;

    public zzbjy(com.google.android.gms.internal.ads.zzbjz r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r6, java.util.Map r7) {
            r5 = this;
            java.lang.String r0 = "blurRadius"
            com.google.android.gms.internal.ads.zzcfo r6 = (com.google.android.gms.internal.ads.zzcfo) r6
            java.lang.String r1 = "transparentBackground"
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r2 = "1"
            boolean r1 = r2.equals(r1)
            java.lang.String r3 = "blur"
            java.lang.Object r3 = r7.get(r3)
            boolean r2 = r2.equals(r3)
            r3 = 0
            java.lang.Object r4 = r7.get(r0)     // Catch: java.lang.NumberFormatException -> L2c
            if (r4 == 0) goto L32
            java.lang.Object r7 = r7.get(r0)     // Catch: java.lang.NumberFormatException -> L2c
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.NumberFormatException -> L2c
            float r3 = java.lang.Float.parseFloat(r7)     // Catch: java.lang.NumberFormatException -> L2c
            goto L32
        L2c:
            r7 = move-exception
            java.lang.String r0 = "Fail to parse float"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r7)
        L32:
            com.google.android.gms.internal.ads.zzbjz r7 = r5.zza
            r7.zzc(r1)
            com.google.android.gms.internal.ads.zzbjz r7 = r5.zza
            r7.zzb(r2, r3)
            r6.zzay(r1)
            return
    }
}
