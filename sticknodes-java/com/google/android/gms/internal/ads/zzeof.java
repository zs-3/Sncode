package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeof implements com.google.android.gms.ads.internal.client.zza, com.google.android.gms.internal.ads.zzdga {
    private com.google.android.gms.ads.internal.client.zzbi zza;

    public zzeof() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.ads.internal.client.zzbi r0 = r2.zza     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L12
            r0.zzb()     // Catch: android.os.RemoteException -> La java.lang.Throwable -> L14
            monitor-exit(r2)
            return
        La:
            r0 = move-exception
            java.lang.String r1 = "Remote Exception at onAdClicked."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r1, r0)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)
            return
        L12:
            monitor-exit(r2)
            return
        L14:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final synchronized void zza(com.google.android.gms.ads.internal.client.zzbi r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zza = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzdga
    public final synchronized void zzdG() {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.ads.internal.client.zzbi r0 = r2.zza     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L12
            r0.zzb()     // Catch: android.os.RemoteException -> La java.lang.Throwable -> L14
            monitor-exit(r2)
            return
        La:
            r0 = move-exception
            java.lang.String r1 = "Remote Exception at onPhysicalClick."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r1, r0)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)
            return
        L12:
            monitor-exit(r2)
            return
        L14:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzdga
    public final synchronized void zzdf() {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            return
    }
}
