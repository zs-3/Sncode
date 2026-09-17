package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzblc {
    private final android.content.Context zza;
    private final com.google.android.gms.ads.h5.OnH5AdsEventListener zzb;
    private com.google.android.gms.internal.ads.zzbky zzc;

    public zzblc(android.content.Context r3, com.google.android.gms.ads.h5.OnH5AdsEventListener r4) {
            r2 = this;
            r2.<init>()
            r0 = 1
            java.lang.String r1 = "Android version must be Lollipop or higher"
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            r2.zza = r3
            r2.zzb = r4
            com.google.android.gms.internal.ads.zzbcv.zza(r3)
            return
    }

    public static final boolean zzc(java.lang.String r4) {
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjA
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            int r0 = r4.length()
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzjC
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r0 <= r2) goto L33
            java.lang.String r4 = "H5 GMSG exceeds max length"
            com.google.android.gms.ads.internal.util.client.zzm.zze(r4)
            return r1
        L33:
            android.net.Uri r4 = android.net.Uri.parse(r4)
            java.lang.String r0 = r4.getScheme()
            java.lang.String r2 = "gmsg"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L5d
            java.lang.String r0 = r4.getHost()
            java.lang.String r2 = "mobileads.google.com"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L5d
            java.lang.String r4 = r4.getPath()
            java.lang.String r0 = "/h5ads"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L5d
            r4 = 1
            return r4
        L5d:
            return r1
    }

    private final void zzd() {
            r4 = this;
            com.google.android.gms.internal.ads.zzbky r0 = r4.zzc
            if (r0 == 0) goto L5
            return
        L5:
            android.content.Context r0 = r4.zza
            com.google.android.gms.ads.internal.client.zzba r1 = com.google.android.gms.ads.internal.client.zzbc.zza()
            com.google.android.gms.internal.ads.zzbph r2 = new com.google.android.gms.internal.ads.zzbph
            r2.<init>()
            com.google.android.gms.ads.h5.OnH5AdsEventListener r3 = r4.zzb
            com.google.android.gms.internal.ads.zzbky r0 = r1.zzn(r0, r2, r3)
            r4.zzc = r0
            return
    }

    public final void zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjA
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L13
            goto L24
        L13:
            r2.zzd()
            com.google.android.gms.internal.ads.zzbky r0 = r2.zzc
            if (r0 == 0) goto L24
            r0.zze()     // Catch: android.os.RemoteException -> L1e
            return
        L1e:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
        L24:
            return
    }

    public final boolean zzb(java.lang.String r3) {
            r2 = this;
            boolean r0 = zzc(r3)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r2.zzd()
            com.google.android.gms.internal.ads.zzbky r0 = r2.zzc
            if (r0 == 0) goto L1b
            r0.zzf(r3)     // Catch: android.os.RemoteException -> L13
            goto L19
        L13:
            r3 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r0, r3)
        L19:
            r3 = 1
            return r3
        L1b:
            return r1
    }
}
