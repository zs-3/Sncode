package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzdk implements java.io.Serializable, com.google.android.gms.internal.auth.zzdj {
    final com.google.android.gms.internal.auth.zzdj zza;
    volatile transient boolean zzb;
    transient java.lang.Object zzc;

    zzdk(com.google.android.gms.internal.auth.zzdj r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
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
            com.google.android.gms.internal.auth.zzdj r0 = r3.zza
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

    @Override // com.google.android.gms.internal.auth.zzdj
    public final java.lang.Object zza() {
            r2 = this;
            boolean r0 = r2.zzb
            if (r0 != 0) goto L1b
            monitor-enter(r2)
            boolean r0 = r2.zzb     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L16
            com.google.android.gms.internal.auth.zzdj r0 = r2.zza     // Catch: java.lang.Throwable -> L18
            java.lang.Object r0 = r0.zza()     // Catch: java.lang.Throwable -> L18
            r2.zzc = r0     // Catch: java.lang.Throwable -> L18
            r1 = 1
            r2.zzb = r1     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            return r0
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            goto L1b
        L18:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r0
        L1b:
            java.lang.Object r0 = r2.zzc
            return r0
    }
}
