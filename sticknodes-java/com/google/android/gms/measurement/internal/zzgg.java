package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzgg {
    private static final java.lang.Object zza = null;
    private final java.lang.String zzb;
    private final com.google.android.gms.measurement.internal.zzge zzc;
    private final java.lang.Object zzd;
    private final java.lang.Object zze;
    private volatile java.lang.Object zzf;
    private volatile java.lang.Object zzg;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.measurement.internal.zzgg.zza = r0
            return
    }

    /* synthetic */ zzgg(java.lang.String r1, java.lang.Object r2, java.lang.Object r3, com.google.android.gms.measurement.internal.zzge r4, com.google.android.gms.measurement.internal.zzgh r5) {
            r0 = this;
            r0.<init>()
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r0.zze = r3
            r3 = 0
            r0.zzf = r3
            r0.zzg = r3
            r0.zzb = r1
            r0.zzd = r2
            r0.zzc = r4
            return
    }

    public final java.lang.Object zza(java.lang.Object r4) {
            r3 = this;
            java.lang.Object r0 = r3.zze
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            if (r4 == 0) goto L7
            return r4
        L7:
            com.google.android.gms.measurement.internal.zzaf r4 = com.google.android.gms.measurement.internal.zzgf.zza
            if (r4 != 0) goto Le
            java.lang.Object r4 = r3.zzd
            return r4
        Le:
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzgg.zza
            monitor-enter(r4)
            boolean r0 = com.google.android.gms.measurement.internal.zzaf.zza()     // Catch: java.lang.Throwable -> L65
            if (r0 == 0) goto L22
            java.lang.Object r0 = r3.zzg     // Catch: java.lang.Throwable -> L65
            if (r0 != 0) goto L1e
            java.lang.Object r0 = r3.zzd     // Catch: java.lang.Throwable -> L65
            goto L20
        L1e:
            java.lang.Object r0 = r3.zzg     // Catch: java.lang.Throwable -> L65
        L20:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L65
            goto L64
        L22:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L65
            java.util.List r4 = com.google.android.gms.measurement.internal.zzgi.zzb()     // Catch: java.lang.SecurityException -> L58
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.SecurityException -> L58
        L2b:
            boolean r0 = r4.hasNext()     // Catch: java.lang.SecurityException -> L58
            if (r0 == 0) goto L59
            java.lang.Object r0 = r4.next()     // Catch: java.lang.SecurityException -> L58
            com.google.android.gms.measurement.internal.zzgg r0 = (com.google.android.gms.measurement.internal.zzgg) r0     // Catch: java.lang.SecurityException -> L58
            boolean r1 = com.google.android.gms.measurement.internal.zzaf.zza()     // Catch: java.lang.SecurityException -> L58
            if (r1 != 0) goto L50
            r1 = 0
            com.google.android.gms.measurement.internal.zzge r2 = r0.zzc     // Catch: java.lang.IllegalStateException -> L46 java.lang.SecurityException -> L58
            if (r2 == 0) goto L46
            java.lang.Object r1 = r2.zza()     // Catch: java.lang.IllegalStateException -> L46 java.lang.SecurityException -> L58
        L46:
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzgg.zza     // Catch: java.lang.SecurityException -> L58
            monitor-enter(r2)     // Catch: java.lang.SecurityException -> L58
            r0.zzg = r1     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
            goto L2b
        L4d:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
            throw r4     // Catch: java.lang.SecurityException -> L58
        L50:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.SecurityException -> L58
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch: java.lang.SecurityException -> L58
            throw r4     // Catch: java.lang.SecurityException -> L58
        L58:
        L59:
            com.google.android.gms.measurement.internal.zzge r4 = r3.zzc
            if (r4 != 0) goto L60
        L5d:
            java.lang.Object r0 = r3.zzd
            goto L64
        L60:
            java.lang.Object r0 = r4.zza()     // Catch: java.lang.Throwable -> L5d
        L64:
            return r0
        L65:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L65
            throw r0
        L68:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            throw r4
    }

    public final java.lang.String zzb() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }
}
