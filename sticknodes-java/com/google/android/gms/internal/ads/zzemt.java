package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzemt {
    private final java.util.concurrent.ConcurrentHashMap zza;
    private final com.google.android.gms.internal.ads.zzdru zzb;

    public zzemt(com.google.android.gms.internal.ads.zzdru r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.zza = r0
            r1.zzb = r2
            return
    }

    public final com.google.android.gms.internal.ads.zzbrk zza(java.lang.String r2) {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r1.zza
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L11
            java.util.concurrent.ConcurrentHashMap r0 = r1.zza
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.ads.zzbrk r2 = (com.google.android.gms.internal.ads.zzbrk) r2
            return r2
        L11:
            r2 = 0
            return r2
    }

    public final void zzb(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzdru r0 = r2.zzb     // Catch: android.os.RemoteException -> Lc
            com.google.android.gms.internal.ads.zzbrk r0 = r0.zzb(r3)     // Catch: android.os.RemoteException -> Lc
            java.util.concurrent.ConcurrentHashMap r1 = r2.zza     // Catch: android.os.RemoteException -> Lc
            r1.put(r3, r0)     // Catch: android.os.RemoteException -> Lc
            return
        Lc:
            r3 = move-exception
            java.lang.String r0 = "Couldn't create RTB adapter : "
            com.google.android.gms.ads.internal.util.zze.zzb(r0, r3)
            return
    }
}
