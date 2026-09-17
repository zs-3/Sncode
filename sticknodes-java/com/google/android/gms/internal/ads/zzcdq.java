package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcdq implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ long zzg;
    final /* synthetic */ boolean zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ int zzj;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcdv zzk;

    zzcdq(com.google.android.gms.internal.ads.zzcdv r4, java.lang.String r5, java.lang.String r6, long r7, long r9, long r11, long r13, long r15, boolean r17, int r18, int r19) {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.zza = r1
            r1 = r6
            r0.zzb = r1
            r1 = r7
            r0.zzc = r1
            r1 = r9
            r0.zzd = r1
            r1 = r11
            r0.zze = r1
            r1 = r13
            r0.zzf = r1
            r1 = r15
            r0.zzg = r1
            r1 = r17
            r0.zzh = r1
            r1 = r18
            r0.zzi = r1
            r1 = r19
            r0.zzj = r1
            r1 = r4
            r0.zzk = r1
            r3.<init>()
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
            long r1 = r3.zzc
            java.lang.String r1 = java.lang.Long.toString(r1)
            java.lang.String r2 = "bufferedDuration"
            r0.put(r2, r1)
            long r1 = r3.zzd
            java.lang.String r1 = java.lang.Long.toString(r1)
            java.lang.String r2 = "totalDuration"
            r0.put(r2, r1)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzbT
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L74
            long r1 = r3.zze
            java.lang.String r1 = java.lang.Long.toString(r1)
            java.lang.String r2 = "qoeLoadedBytes"
            r0.put(r2, r1)
            long r1 = r3.zzf
            java.lang.String r1 = java.lang.Long.toString(r1)
            java.lang.String r2 = "qoeCachedBytes"
            r0.put(r2, r1)
            long r1 = r3.zzg
            java.lang.String r1 = java.lang.Long.toString(r1)
            java.lang.String r2 = "totalBytes"
            r0.put(r2, r1)
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzu.zzB()
            long r1 = r1.currentTimeMillis()
            java.lang.String r1 = java.lang.Long.toString(r1)
            java.lang.String r2 = "reportTime"
            r0.put(r2, r1)
        L74:
            r1 = 1
            boolean r2 = r3.zzh
            if (r1 == r2) goto L7c
            java.lang.String r1 = "0"
            goto L7e
        L7c:
            java.lang.String r1 = "1"
        L7e:
            java.lang.String r2 = "cacheReady"
            r0.put(r2, r1)
            int r1 = r3.zzi
            java.lang.String r1 = java.lang.Integer.toString(r1)
            java.lang.String r2 = "playerCount"
            r0.put(r2, r1)
            int r1 = r3.zzj
            java.lang.String r1 = java.lang.Integer.toString(r1)
            java.lang.String r2 = "playerPreparedCount"
            r0.put(r2, r1)
            com.google.android.gms.internal.ads.zzcdv r1 = r3.zzk
            java.lang.String r2 = "onPrecacheEvent"
            com.google.android.gms.internal.ads.zzcdv.zze(r1, r2, r0)
            return
    }
}
