package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzci {
    private final android.content.BroadcastReceiver zza;
    private final java.util.Map zzb;
    private boolean zzc;
    private boolean zzd;
    private android.content.Context zze;

    public zzci() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzc = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r1.zzb = r0
            com.google.android.gms.ads.internal.util.zzch r0 = new com.google.android.gms.ads.internal.util.zzch
            r0.<init>(r1)
            r1.zza = r0
            return
    }

    static /* bridge */ /* synthetic */ void zza(com.google.android.gms.ads.internal.util.zzci r0, android.content.Context r1, android.content.Intent r2) {
            r0.zze(r1, r2)
            return
    }

    private final synchronized void zze(android.content.Context r6, android.content.Intent r7) {
            r5 = this;
            monitor-enter(r5)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4b
            r0.<init>()     // Catch: java.lang.Throwable -> L4b
            java.util.Map r1 = r5.zzb     // Catch: java.lang.Throwable -> L4b
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L4b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L4b
        L10:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L36
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L4b
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r3 = r2.getValue()     // Catch: java.lang.Throwable -> L4b
            android.content.IntentFilter r3 = (android.content.IntentFilter) r3     // Catch: java.lang.Throwable -> L4b
            java.lang.String r4 = r7.getAction()     // Catch: java.lang.Throwable -> L4b
            boolean r3 = r3.hasAction(r4)     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L10
            java.lang.Object r2 = r2.getKey()     // Catch: java.lang.Throwable -> L4b
            android.content.BroadcastReceiver r2 = (android.content.BroadcastReceiver) r2     // Catch: java.lang.Throwable -> L4b
            r0.add(r2)     // Catch: java.lang.Throwable -> L4b
            goto L10
        L36:
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L4b
            r2 = 0
        L3b:
            if (r2 >= r1) goto L49
            java.lang.Object r3 = r0.get(r2)     // Catch: java.lang.Throwable -> L4b
            android.content.BroadcastReceiver r3 = (android.content.BroadcastReceiver) r3     // Catch: java.lang.Throwable -> L4b
            r3.onReceive(r6, r7)     // Catch: java.lang.Throwable -> L4b
            int r2 = r2 + 1
            goto L3b
        L49:
            monitor-exit(r5)
            return
        L4b:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    @android.annotation.SuppressLint({"UnprotectedReceiver"})
    public final synchronized void zzb(android.content.Context r4) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzc     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L7
            monitor-exit(r3)
            return
        L7:
            android.content.Context r0 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L69
            r3.zze = r0     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto L11
            r3.zze = r4     // Catch: java.lang.Throwable -> L69
        L11:
            android.content.Context r4 = r3.zze     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.internal.ads.zzbcv.zza(r4)     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzdM     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r4 = r0.zza(r4)     // Catch: java.lang.Throwable -> L69
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L69
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L69
            r3.zzd = r4     // Catch: java.lang.Throwable -> L69
            android.content.IntentFilter r4 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L69
            r4.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = "android.intent.action.SCREEN_ON"
            r4.addAction(r0)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = "android.intent.action.SCREEN_OFF"
            r4.addAction(r0)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = "android.intent.action.USER_PRESENT"
            r4.addAction(r0)     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkE     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L69
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L69
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L5d
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L69
            r1 = 33
            if (r0 < r1) goto L5d
            android.content.Context r0 = r3.zze     // Catch: java.lang.Throwable -> L69
            android.content.BroadcastReceiver r1 = r3.zza     // Catch: java.lang.Throwable -> L69
            r2 = 4
            r0.registerReceiver(r1, r4, r2)     // Catch: java.lang.Throwable -> L69
            goto L64
        L5d:
            android.content.Context r0 = r3.zze     // Catch: java.lang.Throwable -> L69
            android.content.BroadcastReceiver r1 = r3.zza     // Catch: java.lang.Throwable -> L69
            r0.registerReceiver(r1, r4)     // Catch: java.lang.Throwable -> L69
        L64:
            r4 = 1
            r3.zzc = r4     // Catch: java.lang.Throwable -> L69
            monitor-exit(r3)
            return
        L69:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    @android.annotation.SuppressLint({"UnprotectedReceiver"})
    public final synchronized void zzc(android.content.Context r3, android.content.BroadcastReceiver r4, android.content.IntentFilter r5) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzd     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto Lc
            java.util.Map r3 = r2.zzb     // Catch: java.lang.Throwable -> L32
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L32
            monitor-exit(r2)
            return
        Lc:
            com.google.android.gms.internal.ads.zzbcv.zza(r3)     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkE     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L32
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L2d
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L32
            r1 = 33
            if (r0 < r1) goto L2d
            r0 = 4
            r3.registerReceiver(r4, r5, r0)     // Catch: java.lang.Throwable -> L32
            monitor-exit(r2)
            return
        L2d:
            r3.registerReceiver(r4, r5)     // Catch: java.lang.Throwable -> L32
            monitor-exit(r2)
            return
        L32:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final synchronized void zzd(android.content.Context r2, android.content.BroadcastReceiver r3) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzd     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto Lc
            java.util.Map r2 = r1.zzb     // Catch: java.lang.Throwable -> L11
            r2.remove(r3)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return
        Lc:
            r2.unregisterReceiver(r3)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return
        L11:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
