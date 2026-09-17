package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes.dex */
final class zzq implements android.os.Handler.Callback {
    final /* synthetic */ com.google.android.gms.common.internal.zzs zza;

    /* synthetic */ zzq(com.google.android.gms.common.internal.zzs r1, com.google.android.gms.common.internal.zzr r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r8) {
            r7 = this;
            int r0 = r8.what
            r1 = 1
            if (r0 == 0) goto L6a
            if (r0 == r1) goto L9
            r8 = 0
            return r8
        L9:
            com.google.android.gms.common.internal.zzs r0 = r7.zza
            java.util.HashMap r0 = com.google.android.gms.common.internal.zzs.zzh(r0)
            monitor-enter(r0)
            java.lang.Object r8 = r8.obj     // Catch: java.lang.Throwable -> L67
            com.google.android.gms.common.internal.zzo r8 = (com.google.android.gms.common.internal.zzo) r8     // Catch: java.lang.Throwable -> L67
            com.google.android.gms.common.internal.zzs r2 = r7.zza     // Catch: java.lang.Throwable -> L67
            java.util.HashMap r2 = com.google.android.gms.common.internal.zzs.zzh(r2)     // Catch: java.lang.Throwable -> L67
            java.lang.Object r2 = r2.get(r8)     // Catch: java.lang.Throwable -> L67
            com.google.android.gms.common.internal.zzp r2 = (com.google.android.gms.common.internal.zzp) r2     // Catch: java.lang.Throwable -> L67
            if (r2 == 0) goto L65
            int r3 = r2.zza()     // Catch: java.lang.Throwable -> L67
            r4 = 3
            if (r3 != r4) goto L65
            java.lang.String r3 = "GmsClientSupervisor"
            java.lang.String r4 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L67
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r5.<init>()     // Catch: java.lang.Throwable -> L67
            java.lang.String r6 = "Timeout waiting for ServiceConnection callback "
            r5.append(r6)     // Catch: java.lang.Throwable -> L67
            r5.append(r4)     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L67
            java.lang.Exception r5 = new java.lang.Exception     // Catch: java.lang.Throwable -> L67
            r5.<init>()     // Catch: java.lang.Throwable -> L67
            android.util.Log.e(r3, r4, r5)     // Catch: java.lang.Throwable -> L67
            android.content.ComponentName r3 = r2.zzb()     // Catch: java.lang.Throwable -> L67
            if (r3 != 0) goto L52
            android.content.ComponentName r3 = r8.zza()     // Catch: java.lang.Throwable -> L67
        L52:
            if (r3 != 0) goto L62
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L67
            java.lang.String r8 = r8.zzc()     // Catch: java.lang.Throwable -> L67
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = "unknown"
            r3.<init>(r8, r4)     // Catch: java.lang.Throwable -> L67
        L62:
            r2.onServiceDisconnected(r3)     // Catch: java.lang.Throwable -> L67
        L65:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            return r1
        L67:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            throw r8
        L6a:
            com.google.android.gms.common.internal.zzs r0 = r7.zza
            java.util.HashMap r0 = com.google.android.gms.common.internal.zzs.zzh(r0)
            monitor-enter(r0)
            java.lang.Object r8 = r8.obj     // Catch: java.lang.Throwable -> L9f
            com.google.android.gms.common.internal.zzo r8 = (com.google.android.gms.common.internal.zzo) r8     // Catch: java.lang.Throwable -> L9f
            com.google.android.gms.common.internal.zzs r2 = r7.zza     // Catch: java.lang.Throwable -> L9f
            java.util.HashMap r2 = com.google.android.gms.common.internal.zzs.zzh(r2)     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r2 = r2.get(r8)     // Catch: java.lang.Throwable -> L9f
            com.google.android.gms.common.internal.zzp r2 = (com.google.android.gms.common.internal.zzp) r2     // Catch: java.lang.Throwable -> L9f
            if (r2 == 0) goto L9d
            boolean r3 = r2.zzi()     // Catch: java.lang.Throwable -> L9f
            if (r3 == 0) goto L9d
            boolean r3 = r2.zzj()     // Catch: java.lang.Throwable -> L9f
            if (r3 == 0) goto L94
            java.lang.String r3 = "GmsClientSupervisor"
            r2.zzg(r3)     // Catch: java.lang.Throwable -> L9f
        L94:
            com.google.android.gms.common.internal.zzs r2 = r7.zza     // Catch: java.lang.Throwable -> L9f
            java.util.HashMap r2 = com.google.android.gms.common.internal.zzs.zzh(r2)     // Catch: java.lang.Throwable -> L9f
            r2.remove(r8)     // Catch: java.lang.Throwable -> L9f
        L9d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9f
            return r1
        L9f:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9f
            throw r8
    }
}
