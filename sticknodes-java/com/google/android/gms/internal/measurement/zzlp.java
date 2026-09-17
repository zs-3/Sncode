package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzlp {
    static final com.google.android.gms.internal.measurement.zzlp zza = null;
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc;
    private static volatile com.google.android.gms.internal.measurement.zzlp zzd;
    private final java.util.Map zze;

    static {
            com.google.android.gms.internal.measurement.zzlp r0 = new com.google.android.gms.internal.measurement.zzlp
            r1 = 1
            r0.<init>(r1)
            com.google.android.gms.internal.measurement.zzlp.zza = r0
            return
    }

    zzlp() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zze = r0
            return
    }

    zzlp(boolean r1) {
            r0 = this;
            r0.<init>()
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0.zze = r1
            return
    }

    public static com.google.android.gms.internal.measurement.zzlp zza() {
            java.lang.Class<com.google.android.gms.internal.measurement.zzlp> r0 = com.google.android.gms.internal.measurement.zzlp.class
            com.google.android.gms.internal.measurement.zzlp r1 = com.google.android.gms.internal.measurement.zzlp.zzd
            if (r1 == 0) goto L7
            return r1
        L7:
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.zzlp r1 = com.google.android.gms.internal.measurement.zzlp.zzd     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r1
        Le:
            int r1 = com.google.android.gms.internal.measurement.zznp.zza     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.internal.measurement.zzlp r1 = com.google.android.gms.internal.measurement.zzlx.zzb(r0)     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.internal.measurement.zzlp.zzd = r1     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r1
        L18:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
    }

    public final com.google.android.gms.internal.measurement.zzmc zzb(com.google.android.gms.internal.measurement.zznh r2, int r3) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzlo r0 = new com.google.android.gms.internal.measurement.zzlo
            r0.<init>(r2, r3)
            java.util.Map r2 = r1.zze
            java.lang.Object r2 = r2.get(r0)
            com.google.android.gms.internal.measurement.zzmc r2 = (com.google.android.gms.internal.measurement.zzmc) r2
            return r2
    }
}
