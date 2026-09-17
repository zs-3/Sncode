package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbzd implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbze zza;
    private final java.lang.String zzb;

    public zzbzd(com.google.android.gms.internal.ads.zzbze r1, java.lang.String r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            return
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r6, java.lang.String r7) {
            r5 = this;
            com.google.android.gms.internal.ads.zzbze r0 = r5.zza
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbze r1 = r5.zza     // Catch: java.lang.Throwable -> L25
            java.util.List r1 = com.google.android.gms.internal.ads.zzbze.zza(r1)     // Catch: java.lang.Throwable -> L25
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L25
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzbzc r2 = (com.google.android.gms.internal.ads.zzbzc) r2     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = r5.zzb     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzbze r4 = r2.zza     // Catch: java.lang.Throwable -> L25
            java.util.Map r2 = r2.zzb     // Catch: java.lang.Throwable -> L25
            r4.zzb(r2, r6, r3, r7)     // Catch: java.lang.Throwable -> L25
            goto Ld
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r6
    }
}
