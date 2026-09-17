package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcdp implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcdv zze;

    zzcdp(com.google.android.gms.internal.ads.zzcdv r1, java.lang.String r2, java.lang.String r3, int r4, int r5, boolean r6) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            r0.zze = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "event"
            java.lang.String r2 = "precacheProgress"
            r0.put(r1, r2)
            java.lang.String r1 = r3.zza
            java.lang.String r2 = "src"
            r0.put(r2, r1)
            java.lang.String r1 = r3.zzb
            java.lang.String r2 = "cachedSrc"
            r0.put(r2, r1)
            int r1 = r3.zzc
            java.lang.String r1 = java.lang.Integer.toString(r1)
            java.lang.String r2 = "bytesLoaded"
            r0.put(r2, r1)
            int r1 = r3.zzd
            java.lang.String r1 = java.lang.Integer.toString(r1)
            java.lang.String r2 = "totalBytes"
            r0.put(r2, r1)
            java.lang.String r1 = "cacheReady"
            java.lang.String r2 = "0"
            r0.put(r1, r2)
            com.google.android.gms.internal.ads.zzcdv r1 = r3.zze
            java.lang.String r2 = "onPrecacheEvent"
            com.google.android.gms.internal.ads.zzcdv.zze(r1, r2, r0)
            return
    }
}
