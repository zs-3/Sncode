package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes.dex */
public abstract class zzc {
    private java.lang.Object zza;
    private boolean zzb;
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zzd;

    public zzc(com.google.android.gms.common.internal.BaseGmsClient r1, java.lang.Object r2) {
            r0 = this;
            r0.zzd = r1
            r0.<init>()
            r0.zza = r2
            r1 = 0
            r0.zzb = r1
            return
    }

    protected abstract void zza(java.lang.Object r1);

    protected abstract void zzc();

    public final void zze() {
            r5 = this;
            monitor-enter(r5)
            java.lang.Object r0 = r5.zza     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r5.zzb     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L26
            java.lang.String r1 = "GmsClient"
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L3b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r3.<init>()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = "Callback proxy "
            r3.append(r4)     // Catch: java.lang.Throwable -> L3b
            r3.append(r2)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = " being reused. This is not safe."
            r3.append(r2)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L3b
            android.util.Log.w(r1, r2)     // Catch: java.lang.Throwable -> L3b
        L26:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L2f
            r5.zza(r0)     // Catch: java.lang.RuntimeException -> L2d
            goto L2f
        L2d:
            r0 = move-exception
            throw r0
        L2f:
            monitor-enter(r5)
            r0 = 1
            r5.zzb = r0     // Catch: java.lang.Throwable -> L38
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L38
            r5.zzg()
            return
        L38:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L38
            throw r0
        L3b:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3b
            throw r0
    }

    public final void zzf() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.zza = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            throw r0
    }

    public final void zzg() {
            r2 = this;
            r2.zzf()
            com.google.android.gms.common.internal.BaseGmsClient r0 = r2.zzd
            java.util.ArrayList r0 = com.google.android.gms.common.internal.BaseGmsClient.zzf(r0)
            monitor-enter(r0)
            com.google.android.gms.common.internal.BaseGmsClient r1 = r2.zzd     // Catch: java.lang.Throwable -> L15
            java.util.ArrayList r1 = com.google.android.gms.common.internal.BaseGmsClient.zzf(r1)     // Catch: java.lang.Throwable -> L15
            r1.remove(r2)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r1
    }
}
