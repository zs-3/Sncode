package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcb {
    private final java.util.Map zza;
    private final java.util.List zzb;
    private final android.content.Context zzc;

    zzcb(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zza = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zzb = r0
            r1.zzc = r2
            return
    }

    static /* bridge */ /* synthetic */ java.util.List zza(com.google.android.gms.ads.internal.util.zzcb r0) {
            java.util.List r0 = r0.zzb
            return r0
    }

    final synchronized void zzb(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.Map r0 = r3.zza     // Catch: java.lang.Throwable -> L30
            boolean r0 = r0.containsKey(r4)     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto Lb
            monitor-exit(r3)
            return
        Lb:
            java.lang.String r0 = "__default__"
            boolean r0 = java.util.Objects.equals(r4, r0)     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L1a
            android.content.Context r0 = r3.zzc     // Catch: java.lang.Throwable -> L30
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r0)     // Catch: java.lang.Throwable -> L30
            goto L21
        L1a:
            android.content.Context r0 = r3.zzc     // Catch: java.lang.Throwable -> L30
            r1 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r4, r1)     // Catch: java.lang.Throwable -> L30
        L21:
            com.google.android.gms.ads.internal.util.zzca r1 = new com.google.android.gms.ads.internal.util.zzca     // Catch: java.lang.Throwable -> L30
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L30
            java.util.Map r2 = r3.zza     // Catch: java.lang.Throwable -> L30
            r2.put(r4, r1)     // Catch: java.lang.Throwable -> L30
            r0.registerOnSharedPreferenceChangeListener(r1)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r3)
            return
        L30:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final void zzc() {
            r3 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjZ
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L13
            return
        L13:
            com.google.android.gms.ads.internal.zzu.zzp()
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzke
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.util.Map r0 = com.google.android.gms.ads.internal.util.zzt.zzv(r0)
            java.util.Set r1 = r0.keySet()
            java.util.Iterator r1 = r1.iterator()
        L2e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r3.zzb(r2)
            goto L2e
        L3e:
            com.google.android.gms.ads.internal.util.zzbz r1 = new com.google.android.gms.ads.internal.util.zzbz
            r1.<init>(r0)
            r3.zzd(r1)
            return
    }

    final synchronized void zzd(com.google.android.gms.ads.internal.util.zzbz r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.List r0 = r1.zzb     // Catch: java.lang.Throwable -> L8
            r0.add(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
