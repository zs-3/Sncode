package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzfys implements com.google.android.gms.internal.ads.zzfyp {
    private static final com.google.android.gms.internal.ads.zzfyp zza = null;
    private final com.google.android.gms.internal.ads.zzfyw zzb;
    private volatile com.google.android.gms.internal.ads.zzfyp zzc;
    private java.lang.Object zzd;

    static {
            com.google.android.gms.internal.ads.zzfyr r0 = new com.google.android.gms.internal.ads.zzfyr
            r0.<init>()
            com.google.android.gms.internal.ads.zzfys.zza = r0
            return
    }

    zzfys(com.google.android.gms.internal.ads.zzfyp r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzfyw r0 = new com.google.android.gms.internal.ads.zzfyw
            r0.<init>()
            r1.zzb = r0
            r1.zzc = r2
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            com.google.android.gms.internal.ads.zzfyp r0 = r3.zzc
            com.google.android.gms.internal.ads.zzfyp r1 = com.google.android.gms.internal.ads.zzfys.zza
            if (r0 != r1) goto L22
            java.lang.Object r0 = r3.zzd
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

    @Override // com.google.android.gms.internal.ads.zzfyp
    public final java.lang.Object zza() {
            r3 = this;
            com.google.android.gms.internal.ads.zzfyp r0 = r3.zzc
            com.google.android.gms.internal.ads.zzfyp r1 = com.google.android.gms.internal.ads.zzfys.zza
            if (r0 == r1) goto L1e
            com.google.android.gms.internal.ads.zzfyw r0 = r3.zzb
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzfyp r2 = r3.zzc     // Catch: java.lang.Throwable -> L1b
            if (r2 == r1) goto L19
            com.google.android.gms.internal.ads.zzfyp r2 = r3.zzc     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r2 = r2.zza()     // Catch: java.lang.Throwable -> L1b
            r3.zzd = r2     // Catch: java.lang.Throwable -> L1b
            r3.zzc = r1     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r2
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            goto L1e
        L1b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r1
        L1e:
            java.lang.Object r0 = r3.zzd
            return r0
    }
}
