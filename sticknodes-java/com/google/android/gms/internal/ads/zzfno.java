package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfno extends com.google.android.gms.internal.ads.zzfoa {
    public zzfno(com.google.android.gms.ads.internal.ClientApi r1, android.content.Context r2, int r3, com.google.android.gms.internal.ads.zzbpl r4, com.google.android.gms.ads.internal.client.zzfu r5, com.google.android.gms.ads.internal.client.zzcf r6, java.util.concurrent.ScheduledExecutorService r7, com.google.android.gms.internal.ads.zzfnm r8, com.google.android.gms.common.util.Clock r9) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfoa
    protected final com.google.common.util.concurrent.ListenableFuture zza() {
            r8 = this;
            com.google.android.gms.internal.ads.zzggh r0 = com.google.android.gms.internal.ads.zzggh.zze()
            android.content.Context r1 = r8.zzb
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)
            com.google.android.gms.ads.internal.client.zzs r4 = new com.google.android.gms.ads.internal.client.zzs
            r4.<init>()
            com.google.android.gms.ads.internal.client.zzfu r1 = r8.zze
            java.lang.String r5 = r1.zza
            com.google.android.gms.internal.ads.zzbpl r6 = r8.zzd
            com.google.android.gms.ads.internal.ClientApi r2 = r8.zza
            int r7 = r8.zzc
            com.google.android.gms.ads.internal.client.zzby r1 = r2.zze(r3, r4, r5, r6, r7)
            r2 = 1
            if (r1 == 0) goto L3e
            com.google.android.gms.ads.internal.client.zzfu r3 = r8.zze     // Catch: android.os.RemoteException -> L2d
            com.google.android.gms.ads.internal.client.zzm r3 = r3.zzc     // Catch: android.os.RemoteException -> L2d
            com.google.android.gms.internal.ads.zzfnn r4 = new com.google.android.gms.internal.ads.zzfnn     // Catch: android.os.RemoteException -> L2d
            r4.<init>(r8, r0, r1)     // Catch: android.os.RemoteException -> L2d
            r1.zzy(r3, r4)     // Catch: android.os.RemoteException -> L2d
            goto L48
        L2d:
            r1 = move-exception
            java.lang.String r3 = "Failed to load interstitial ad."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r3, r1)
            com.google.android.gms.internal.ads.zzfni r1 = new com.google.android.gms.internal.ads.zzfni
            java.lang.String r3 = "remote exception"
            r1.<init>(r2, r3)
            r0.zzd(r1)
            goto L48
        L3e:
            com.google.android.gms.internal.ads.zzfni r1 = new com.google.android.gms.internal.ads.zzfni
            java.lang.String r3 = "Failed to create an interstitial ad manager."
            r1.<init>(r2, r3)
            r0.zzd(r1)
        L48:
            return r0
    }
}
