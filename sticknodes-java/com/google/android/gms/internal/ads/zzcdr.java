package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcdr implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ int zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcdv zzj;

    zzcdr(com.google.android.gms.internal.ads.zzcdv r1, java.lang.String r2, java.lang.String r3, int r4, int r5, long r6, long r8, boolean r10, int r11, int r12) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            r0.zze = r6
            r0.zzf = r8
            r0.zzg = r10
            r0.zzh = r11
            r0.zzi = r12
            r0.zzj = r1
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
            long r1 = r3.zze
            java.lang.String r1 = java.lang.Long.toString(r1)
            java.lang.String r2 = "bufferedDuration"
            r0.put(r2, r1)
            long r1 = r3.zzf
            java.lang.String r1 = java.lang.Long.toString(r1)
            java.lang.String r2 = "totalDuration"
            r0.put(r2, r1)
            boolean r1 = r3.zzg
            r2 = 1
            if (r2 == r1) goto L4e
            java.lang.String r1 = "0"
            goto L50
        L4e:
            java.lang.String r1 = "1"
        L50:
            java.lang.String r2 = "cacheReady"
            r0.put(r2, r1)
            int r1 = r3.zzh
            java.lang.String r1 = java.lang.Integer.toString(r1)
            java.lang.String r2 = "playerCount"
            r0.put(r2, r1)
            int r1 = r3.zzi
            java.lang.String r1 = java.lang.Integer.toString(r1)
            java.lang.String r2 = "playerPreparedCount"
            r0.put(r2, r1)
            com.google.android.gms.internal.ads.zzcdv r1 = r3.zzj
            java.lang.String r2 = "onPrecacheEvent"
            com.google.android.gms.internal.ads.zzcdv.zze(r1, r2, r0)
            return
    }
}
