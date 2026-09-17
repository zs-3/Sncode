package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzdm implements com.google.android.gms.internal.auth.zzdj {
    private static final com.google.android.gms.internal.auth.zzdj zza = null;
    private volatile com.google.android.gms.internal.auth.zzdj zzb;
    private java.lang.Object zzc;

    static {
            com.google.android.gms.internal.auth.zzdl r0 = com.google.android.gms.internal.auth.zzdl.zza
            com.google.android.gms.internal.auth.zzdm.zza = r0
            return
    }

    zzdm(com.google.android.gms.internal.auth.zzdj r1) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            com.google.android.gms.internal.auth.zzdj r0 = r3.zzb
            com.google.android.gms.internal.auth.zzdj r1 = com.google.android.gms.internal.auth.zzdm.zza
            if (r0 != r1) goto L22
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
        L22:
            java.lang.String r0 = java.lang.String.valueOf(r0)
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
            com.google.android.gms.internal.auth.zzdj r0 = r2.zzb
            com.google.android.gms.internal.auth.zzdj r1 = com.google.android.gms.internal.auth.zzdm.zza
            if (r0 == r1) goto L1c
            monitor-enter(r2)
            com.google.android.gms.internal.auth.zzdj r0 = r2.zzb     // Catch: java.lang.Throwable -> L19
            if (r0 == r1) goto L17
            com.google.android.gms.internal.auth.zzdj r0 = r2.zzb     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.zza()     // Catch: java.lang.Throwable -> L19
            r2.zzc = r0     // Catch: java.lang.Throwable -> L19
            r2.zzb = r1     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            return r0
        L17:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            goto L1c
        L19:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r0
        L1c:
            java.lang.Object r0 = r2.zzc
            return r0
    }
}
