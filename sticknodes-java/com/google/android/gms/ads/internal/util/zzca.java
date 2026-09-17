package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzca implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzcb zza;
    private final java.lang.String zzb;

    public zzca(com.google.android.gms.ads.internal.util.zzcb r1, java.lang.String r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            return
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r5, java.lang.String r6) {
            r4 = this;
            com.google.android.gms.ads.internal.util.zzcb r5 = r4.zza
            monitor-enter(r5)
            com.google.android.gms.ads.internal.util.zzcb r0 = r4.zza     // Catch: java.lang.Throwable -> L3e
            java.util.List r0 = com.google.android.gms.ads.internal.util.zzcb.zza(r0)     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3e
        Ld:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.ads.internal.util.zzbz r1 = (com.google.android.gms.ads.internal.util.zzbz) r1     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = r4.zzb     // Catch: java.lang.Throwable -> L3e
            java.util.Map r1 = r1.zza     // Catch: java.lang.Throwable -> L3e
            boolean r3 = r1.containsKey(r2)     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto Ld
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L3e
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Throwable -> L3e
            boolean r1 = r1.contains(r6)     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto Ld
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.ads.internal.util.zzg r1 = r1.zzi()     // Catch: java.lang.Throwable -> L3e
            r2 = 0
            r1.zzJ(r2)     // Catch: java.lang.Throwable -> L3e
            goto Ld
        L3c:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3e
            return
        L3e:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3e
            throw r6
    }
}
