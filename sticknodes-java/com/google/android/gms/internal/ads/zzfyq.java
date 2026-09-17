package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzfyq implements java.io.Serializable, com.google.android.gms.internal.ads.zzfyp {
    final com.google.android.gms.internal.ads.zzfyp zza;
    volatile transient boolean zzb;
    transient java.lang.Object zzc;
    private final com.google.android.gms.internal.ads.zzfyw zzd;

    zzfyq(com.google.android.gms.internal.ads.zzfyp r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzfyw r0 = new com.google.android.gms.internal.ads.zzfyw
            r0.<init>()
            r1.zzd = r0
            r1.zza = r2
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            boolean r0 = r3.zzb
            if (r0 == 0) goto L21
            java.lang.Object r0 = r3.zzc
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "<supplier that returned "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ">"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L23
        L21:
            com.google.android.gms.internal.ads.zzfyp r0 = r3.zza
        L23:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Suppliers.memoize("
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfyp
    public final java.lang.Object zza() {
            r3 = this;
            boolean r0 = r3.zzb
            if (r0 != 0) goto L1d
            com.google.android.gms.internal.ads.zzfyw r0 = r3.zzd
            monitor-enter(r0)
            boolean r1 = r3.zzb     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L18
            com.google.android.gms.internal.ads.zzfyp r1 = r3.zza     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r1.zza()     // Catch: java.lang.Throwable -> L1a
            r3.zzc = r1     // Catch: java.lang.Throwable -> L1a
            r2 = 1
            r3.zzb = r2     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return r1
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            goto L1d
        L1a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1
        L1d:
            java.lang.Object r0 = r3.zzc
            return r0
    }
}
