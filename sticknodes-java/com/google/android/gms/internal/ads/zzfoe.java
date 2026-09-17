package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfoe extends com.google.android.gms.internal.ads.zzfoa {
    public zzfoe(com.google.android.gms.ads.internal.ClientApi r1, android.content.Context r2, int r3, com.google.android.gms.internal.ads.zzbpl r4, com.google.android.gms.ads.internal.client.zzfu r5, com.google.android.gms.ads.internal.client.zzcf r6, java.util.concurrent.ScheduledExecutorService r7, com.google.android.gms.internal.ads.zzfnm r8, com.google.android.gms.common.util.Clock r9) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfoa
    protected final com.google.common.util.concurrent.ListenableFuture zza() {
            r6 = this;
            com.google.android.gms.ads.internal.ClientApi r0 = r6.zza
            com.google.android.gms.internal.ads.zzggh r1 = com.google.android.gms.internal.ads.zzggh.zze()
            android.content.Context r2 = r6.zzb
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)
            com.google.android.gms.ads.internal.client.zzfu r3 = r6.zze
            java.lang.String r3 = r3.zza
            com.google.android.gms.internal.ads.zzbpl r4 = r6.zzd
            int r5 = r6.zzc
            com.google.android.gms.internal.ads.zzbxf r0 = r0.zzp(r2, r3, r4, r5)
            com.google.android.gms.internal.ads.zzfod r2 = new com.google.android.gms.internal.ads.zzfod
            r2.<init>(r6, r1, r0)
            r3 = 1
            if (r0 == 0) goto L38
            com.google.android.gms.ads.internal.client.zzfu r4 = r6.zze     // Catch: android.os.RemoteException -> L28
            com.google.android.gms.ads.internal.client.zzm r4 = r4.zzc     // Catch: android.os.RemoteException -> L28
            r0.zzf(r4, r2)     // Catch: android.os.RemoteException -> L28
            goto L42
        L28:
            java.lang.String r0 = "Failed to load rewarded ad."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            com.google.android.gms.internal.ads.zzfni r0 = new com.google.android.gms.internal.ads.zzfni
            java.lang.String r2 = "remote exception"
            r0.<init>(r3, r2)
            r1.zzd(r0)
            goto L42
        L38:
            com.google.android.gms.internal.ads.zzfni r0 = new com.google.android.gms.internal.ads.zzfni
            java.lang.String r2 = "Failed to create a rewarded ad."
            r0.<init>(r3, r2)
            r1.zzd(r0)
        L42:
            return r1
    }
}
