package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfnl extends com.google.android.gms.internal.ads.zzfoa {
    public zzfnl(com.google.android.gms.ads.internal.ClientApi r1, android.content.Context r2, int r3, com.google.android.gms.internal.ads.zzbpl r4, com.google.android.gms.ads.internal.client.zzfu r5, com.google.android.gms.ads.internal.client.zzcf r6, java.util.concurrent.ScheduledExecutorService r7, com.google.android.gms.internal.ads.zzfnm r8, com.google.android.gms.common.util.Clock r9) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfoa
    protected final com.google.common.util.concurrent.ListenableFuture zza() {
            r7 = this;
            com.google.android.gms.ads.internal.ClientApi r0 = r7.zza
            com.google.android.gms.internal.ads.zzggh r6 = com.google.android.gms.internal.ads.zzggh.zze()
            android.content.Context r1 = r7.zzb
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)
            com.google.android.gms.ads.internal.client.zzs r2 = com.google.android.gms.ads.internal.client.zzs.zzb()
            com.google.android.gms.ads.internal.client.zzfu r3 = r7.zze
            java.lang.String r3 = r3.zza
            com.google.android.gms.internal.ads.zzbpl r4 = r7.zzd
            int r5 = r7.zzc
            com.google.android.gms.ads.internal.client.zzby r0 = r0.zzc(r1, r2, r3, r4, r5)
            r1 = 1
            if (r0 == 0) goto L42
            com.google.android.gms.ads.internal.client.zzfu r2 = r7.zze     // Catch: android.os.RemoteException -> L31
            com.google.android.gms.internal.ads.zzfnk r3 = new com.google.android.gms.internal.ads.zzfnk     // Catch: android.os.RemoteException -> L31
            r3.<init>(r7, r6, r2)     // Catch: android.os.RemoteException -> L31
            r0.zzH(r3)     // Catch: android.os.RemoteException -> L31
            com.google.android.gms.ads.internal.client.zzfu r2 = r7.zze     // Catch: android.os.RemoteException -> L31
            com.google.android.gms.ads.internal.client.zzm r2 = r2.zzc     // Catch: android.os.RemoteException -> L31
            r0.zzab(r2)     // Catch: android.os.RemoteException -> L31
            goto L4c
        L31:
            r0 = move-exception
            java.lang.String r2 = "Failed to load app open ad."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r2, r0)
            com.google.android.gms.internal.ads.zzfni r0 = new com.google.android.gms.internal.ads.zzfni
            java.lang.String r2 = "remote exception"
            r0.<init>(r1, r2)
            r6.zzd(r0)
            goto L4c
        L42:
            com.google.android.gms.internal.ads.zzfni r0 = new com.google.android.gms.internal.ads.zzfni
            java.lang.String r2 = "Failed to create an app open ad manager."
            r0.<init>(r1, r2)
            r6.zzd(r0)
        L4c:
            return r6
    }
}
