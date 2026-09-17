package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaxq extends com.google.android.gms.internal.ads.zzayc {
    public zzaxq(com.google.android.gms.internal.ads.zzawo r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.internal.ads.zzasm r11, int r12, int r13) {
            r7 = this;
            java.lang.String r2 = "pkxrOWj7zD1ScyeXlo8fp1m52MhBIE9QvURtfE4hxB81XVp6EbBK8CYQjvvhYlf1"
            java.lang.String r3 = "OfZFeGMpPN4nP2QoVlOsW4kmNx194lMXDh8YPc+yAeg="
            r6 = 3
            r0 = r7
            r1 = r8
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r5 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcL
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.reflect.Method r1 = r5.zze
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.google.android.gms.internal.ads.zzawo r3 = r5.zza
            android.content.Context r3 = r3.zzb()
            r4 = 0
            r2[r4] = r3
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3 = 1
            r2[r3] = r0
            r0 = 0
            java.lang.Object r0 = r1.invoke(r0, r2)
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.gms.internal.ads.zzavu r1 = new com.google.android.gms.internal.ads.zzavu
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zzasm r0 = r5.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzasm r2 = r5.zzd     // Catch: java.lang.Throwable -> L44
            long r3 = r1.zza     // Catch: java.lang.Throwable -> L44
            r2.zzj(r3)     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.ads.zzasm r2 = r5.zzd     // Catch: java.lang.Throwable -> L44
            long r3 = r1.zzb     // Catch: java.lang.Throwable -> L44
            r2.zzC(r3)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            return
        L44:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            throw r1
    }
}
