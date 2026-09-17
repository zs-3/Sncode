package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes.dex */
final class zzb extends com.google.android.gms.internal.common.zzh {
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zza;

    public zzb(com.google.android.gms.common.internal.BaseGmsClient r1, android.os.Looper r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>(r2)
            return
    }

    private static final void zza(android.os.Message r0) {
            java.lang.Object r0 = r0.obj
            com.google.android.gms.common.internal.zzc r0 = (com.google.android.gms.common.internal.zzc) r0
            r0.zzc()
            r0.zzg()
            return
    }

    private static final boolean zzb(android.os.Message r2) {
            int r2 = r2.what
            r0 = 1
            r1 = 2
            if (r2 == r1) goto Le
            if (r2 == r0) goto Le
            r1 = 7
            if (r2 != r1) goto Lc
            goto Le
        Lc:
            r2 = 0
            return r2
        Le:
            return r0
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message r8) {
            r7 = this;
            com.google.android.gms.common.internal.BaseGmsClient r0 = r7.zza
            java.util.concurrent.atomic.AtomicInteger r0 = r0.zzd
            int r0 = r0.get()
            int r1 = r8.arg1
            if (r0 == r1) goto L16
            boolean r0 = zzb(r8)
            if (r0 == 0) goto L15
            zza(r8)
        L15:
            return
        L16:
            int r0 = r8.what
            r1 = 4
            r2 = 1
            r3 = 5
            if (r0 == r2) goto L2e
            r4 = 7
            if (r0 == r4) goto L2e
            if (r0 != r1) goto L2a
            com.google.android.gms.common.internal.BaseGmsClient r0 = r7.zza
            boolean r0 = r0.enableLocalFallback()
            if (r0 == 0) goto L2e
        L2a:
            int r0 = r8.what
            if (r0 != r3) goto L36
        L2e:
            com.google.android.gms.common.internal.BaseGmsClient r0 = r7.zza
            boolean r0 = r0.isConnecting()
            if (r0 == 0) goto L120
        L36:
            int r0 = r8.what
            r4 = 8
            r5 = 3
            r6 = 0
            if (r0 != r1) goto L7e
            com.google.android.gms.common.internal.BaseGmsClient r0 = r7.zza
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            int r8 = r8.arg2
            r1.<init>(r8)
            com.google.android.gms.common.internal.BaseGmsClient.zzg(r0, r1)
            com.google.android.gms.common.internal.BaseGmsClient r8 = r7.zza
            boolean r8 = com.google.android.gms.common.internal.BaseGmsClient.zzo(r8)
            if (r8 == 0) goto L5f
            com.google.android.gms.common.internal.BaseGmsClient r8 = r7.zza
            boolean r0 = com.google.android.gms.common.internal.BaseGmsClient.zzm(r8)
            if (r0 == 0) goto L5b
            goto L5f
        L5b:
            com.google.android.gms.common.internal.BaseGmsClient.zzi(r8, r5, r6)
            return
        L5f:
            com.google.android.gms.common.internal.BaseGmsClient r8 = r7.zza
            com.google.android.gms.common.ConnectionResult r0 = com.google.android.gms.common.internal.BaseGmsClient.zza(r8)
            if (r0 == 0) goto L6c
            com.google.android.gms.common.ConnectionResult r8 = com.google.android.gms.common.internal.BaseGmsClient.zza(r8)
            goto L71
        L6c:
            com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
            r8.<init>(r4)
        L71:
            com.google.android.gms.common.internal.BaseGmsClient r0 = r7.zza
            com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks r0 = r0.zzc
            r0.onReportServiceBinding(r8)
            com.google.android.gms.common.internal.BaseGmsClient r0 = r7.zza
            r0.onConnectionFailed(r8)
            return
        L7e:
            if (r0 != r3) goto L9f
            com.google.android.gms.common.internal.BaseGmsClient r8 = r7.zza
            com.google.android.gms.common.ConnectionResult r0 = com.google.android.gms.common.internal.BaseGmsClient.zza(r8)
            if (r0 == 0) goto L8d
            com.google.android.gms.common.ConnectionResult r8 = com.google.android.gms.common.internal.BaseGmsClient.zza(r8)
            goto L92
        L8d:
            com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
            r8.<init>(r4)
        L92:
            com.google.android.gms.common.internal.BaseGmsClient r0 = r7.zza
            com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks r0 = r0.zzc
            r0.onReportServiceBinding(r8)
            com.google.android.gms.common.internal.BaseGmsClient r0 = r7.zza
            r0.onConnectionFailed(r8)
            return
        L9f:
            if (r0 != r5) goto Lbe
            java.lang.Object r0 = r8.obj
            boolean r1 = r0 instanceof android.app.PendingIntent
            if (r1 == 0) goto Laa
            r6 = r0
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
        Laa:
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            int r8 = r8.arg2
            r0.<init>(r8, r6)
            com.google.android.gms.common.internal.BaseGmsClient r8 = r7.zza
            com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks r8 = r8.zzc
            r8.onReportServiceBinding(r0)
            com.google.android.gms.common.internal.BaseGmsClient r8 = r7.zza
            r8.onConnectionFailed(r0)
            return
        Lbe:
            r1 = 6
            if (r0 != r1) goto Le4
            com.google.android.gms.common.internal.BaseGmsClient r0 = r7.zza
            com.google.android.gms.common.internal.BaseGmsClient.zzi(r0, r3, r6)
            com.google.android.gms.common.internal.BaseGmsClient r0 = r7.zza
            com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks r1 = com.google.android.gms.common.internal.BaseGmsClient.zzb(r0)
            if (r1 == 0) goto Ld7
            com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks r0 = com.google.android.gms.common.internal.BaseGmsClient.zzb(r0)
            int r1 = r8.arg2
            r0.onConnectionSuspended(r1)
        Ld7:
            com.google.android.gms.common.internal.BaseGmsClient r0 = r7.zza
            int r8 = r8.arg2
            r0.onConnectionSuspended(r8)
            com.google.android.gms.common.internal.BaseGmsClient r8 = r7.zza
            com.google.android.gms.common.internal.BaseGmsClient.zzn(r8, r3, r2, r6)
            return
        Le4:
            r1 = 2
            if (r0 != r1) goto Lf4
            com.google.android.gms.common.internal.BaseGmsClient r0 = r7.zza
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto Lf0
            goto Lf4
        Lf0:
            zza(r8)
            return
        Lf4:
            boolean r0 = zzb(r8)
            if (r0 == 0) goto L102
            java.lang.Object r8 = r8.obj
            com.google.android.gms.common.internal.zzc r8 = (com.google.android.gms.common.internal.zzc) r8
            r8.zze()
            return
        L102:
            int r8 = r8.what
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Don't know how to handle message: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r1 = "GmsClient"
            android.util.Log.wtf(r1, r8, r0)
            return
        L120:
            zza(r8)
            return
    }
}
