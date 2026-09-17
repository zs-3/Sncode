package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzo extends java.util.LinkedHashMap {
    final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzq zza;

    zzo(com.google.android.gms.ads.nonagon.signalgeneration.zzq r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(java.util.Map.Entry r6) {
            r5 = this;
            com.google.android.gms.ads.nonagon.signalgeneration.zzq r0 = r5.zza
            monitor-enter(r0)
            int r1 = r5.size()     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.ads.nonagon.signalgeneration.zzq r2 = r5.zza     // Catch: java.lang.Throwable -> L3b
            int r3 = com.google.android.gms.ads.nonagon.signalgeneration.zzq.zza(r2)     // Catch: java.lang.Throwable -> L3b
            r4 = 0
            if (r1 > r3) goto L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            return r4
        L12:
            java.util.ArrayDeque r1 = com.google.android.gms.ads.nonagon.signalgeneration.zzq.zzc(r2)     // Catch: java.lang.Throwable -> L3b
            android.util.Pair r2 = new android.util.Pair     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r3 = r6.getKey()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.ads.nonagon.signalgeneration.zzp r6 = (com.google.android.gms.ads.nonagon.signalgeneration.zzp) r6     // Catch: java.lang.Throwable -> L3b
            java.lang.String r6 = r6.zzb     // Catch: java.lang.Throwable -> L3b
            r2.<init>(r3, r6)     // Catch: java.lang.Throwable -> L3b
            r1.add(r2)     // Catch: java.lang.Throwable -> L3b
            int r6 = r5.size()     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.ads.nonagon.signalgeneration.zzq r1 = r5.zza     // Catch: java.lang.Throwable -> L3b
            int r1 = com.google.android.gms.ads.nonagon.signalgeneration.zzq.zza(r1)     // Catch: java.lang.Throwable -> L3b
            if (r6 <= r1) goto L39
            r4 = 1
        L39:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            return r4
        L3b:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            throw r6
    }
}
