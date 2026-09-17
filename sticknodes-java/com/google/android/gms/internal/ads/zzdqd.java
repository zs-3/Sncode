package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdqd extends com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks {
    private final com.google.android.gms.internal.ads.zzdkp zza;

    public zzdqd(com.google.android.gms.internal.ads.zzdkp r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    private static com.google.android.gms.ads.internal.client.zzee zza(com.google.android.gms.internal.ads.zzdkp r1) {
            com.google.android.gms.ads.internal.client.zzeb r1 = r1.zzj()
            r0 = 0
            if (r1 != 0) goto L8
            return r0
        L8:
            com.google.android.gms.ads.internal.client.zzee r1 = r1.zzi()     // Catch: android.os.RemoteException -> Ld
            return r1
        Ld:
            return r0
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
            r2 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r2.zza
            com.google.android.gms.ads.internal.client.zzee r0 = zza(r0)
            if (r0 != 0) goto L9
            return
        L9:
            r0.zze()     // Catch: android.os.RemoteException -> Ld
            return
        Ld:
            r0 = move-exception
            java.lang.String r1 = "Unable to call onVideoEnd()"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r1, r0)
            return
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
            r2 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r2.zza
            com.google.android.gms.ads.internal.client.zzee r0 = zza(r0)
            if (r0 != 0) goto L9
            return
        L9:
            r0.zzg()     // Catch: android.os.RemoteException -> Ld
            return
        Ld:
            r0 = move-exception
            java.lang.String r1 = "Unable to call onVideoEnd()"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r1, r0)
            return
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
            r2 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r2.zza
            com.google.android.gms.ads.internal.client.zzee r0 = zza(r0)
            if (r0 != 0) goto L9
            return
        L9:
            r0.zzi()     // Catch: android.os.RemoteException -> Ld
            return
        Ld:
            r0 = move-exception
            java.lang.String r1 = "Unable to call onVideoEnd()"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r1, r0)
            return
    }
}
