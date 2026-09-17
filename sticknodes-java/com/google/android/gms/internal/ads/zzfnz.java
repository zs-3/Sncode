package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfnz extends com.google.android.gms.internal.ads.zzfnj {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfoa zza;

    zzfnz(com.google.android.gms.internal.ads.zzfoa r1, com.google.android.gms.internal.ads.zzggh r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfnj
    public final void zza(com.google.android.gms.ads.internal.client.zze r5) {
            r4 = this;
            com.google.android.gms.internal.ads.zzfoa r0 = r4.zza
            java.util.concurrent.atomic.AtomicBoolean r0 = com.google.android.gms.internal.ads.zzfoa.zze(r0)
            r1 = 0
            r0.set(r1)
            int r5 = r5.zza
            r0 = 1
            if (r5 == r0) goto L21
            r2 = 8
            if (r5 == r2) goto L21
            r2 = 10
            if (r5 == r2) goto L21
            r2 = 11
            if (r5 == r2) goto L21
            com.google.android.gms.internal.ads.zzfoa r5 = r4.zza
            com.google.android.gms.internal.ads.zzfoa.zzg(r5, r0)
            return
        L21:
            com.google.android.gms.internal.ads.zzfoa r5 = r4.zza
            com.google.android.gms.ads.internal.client.zzfu r5 = r5.zze
            int r0 = r5.zzb
            java.lang.String r5 = r5.zza
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Preloading "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", for adUnitId:"
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = ", Ad load failed. Stop preloading due to non-retriable error:"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r5)
            com.google.android.gms.internal.ads.zzfoa r5 = r4.zza
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.zzf
            r5.set(r1)
            return
    }
}
