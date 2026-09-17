package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbaw {
    private com.google.android.gms.ads.internal.client.zzby zza;
    private final android.content.Context zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.ads.internal.client.zzei zzd;

    @com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdOrientation
    private final int zze;
    private final com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback zzf;
    private final com.google.android.gms.internal.ads.zzbph zzg;
    private final com.google.android.gms.ads.internal.client.zzr zzh;

    public zzbaw(android.content.Context r2, java.lang.String r3, com.google.android.gms.ads.internal.client.zzei r4, @com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdOrientation int r5, com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback r6) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzbph r0 = new com.google.android.gms.internal.ads.zzbph
            r0.<init>()
            r1.zzg = r0
            r1.zzb = r2
            r1.zzc = r3
            r1.zzd = r4
            r1.zze = r5
            r1.zzf = r6
            com.google.android.gms.ads.internal.client.zzr r2 = com.google.android.gms.ads.internal.client.zzr.zza
            r1.zzh = r2
            return
    }

    public final void zza() {
            r7 = this;
            long r0 = java.lang.System.currentTimeMillis()     // Catch: android.os.RemoteException -> L4e
            com.google.android.gms.ads.internal.client.zzs r2 = com.google.android.gms.ads.internal.client.zzs.zzb()     // Catch: android.os.RemoteException -> L4e
            com.google.android.gms.ads.internal.client.zzba r3 = com.google.android.gms.ads.internal.client.zzbc.zza()     // Catch: android.os.RemoteException -> L4e
            android.content.Context r4 = r7.zzb     // Catch: android.os.RemoteException -> L4e
            java.lang.String r5 = r7.zzc     // Catch: android.os.RemoteException -> L4e
            com.google.android.gms.internal.ads.zzbph r6 = r7.zzg     // Catch: android.os.RemoteException -> L4e
            com.google.android.gms.ads.internal.client.zzby r2 = r3.zze(r4, r2, r5, r6)     // Catch: android.os.RemoteException -> L4e
            r7.zza = r2     // Catch: android.os.RemoteException -> L4e
            if (r2 == 0) goto L4d
            int r2 = r7.zze     // Catch: android.os.RemoteException -> L4e
            r3 = 3
            if (r2 == r3) goto L2b
            com.google.android.gms.ads.internal.client.zzy r2 = new com.google.android.gms.ads.internal.client.zzy     // Catch: android.os.RemoteException -> L4e
            int r3 = r7.zze     // Catch: android.os.RemoteException -> L4e
            r2.<init>(r3)     // Catch: android.os.RemoteException -> L4e
            com.google.android.gms.ads.internal.client.zzby r3 = r7.zza     // Catch: android.os.RemoteException -> L4e
            r3.zzI(r2)     // Catch: android.os.RemoteException -> L4e
        L2b:
            com.google.android.gms.ads.internal.client.zzei r2 = r7.zzd     // Catch: android.os.RemoteException -> L4e
            r2.zzq(r0)     // Catch: android.os.RemoteException -> L4e
            com.google.android.gms.ads.internal.client.zzby r0 = r7.zza     // Catch: android.os.RemoteException -> L4e
            com.google.android.gms.internal.ads.zzbaj r1 = new com.google.android.gms.internal.ads.zzbaj     // Catch: android.os.RemoteException -> L4e
            com.google.android.gms.ads.appopen.AppOpenAd$AppOpenAdLoadCallback r2 = r7.zzf     // Catch: android.os.RemoteException -> L4e
            java.lang.String r3 = r7.zzc     // Catch: android.os.RemoteException -> L4e
            r1.<init>(r2, r3)     // Catch: android.os.RemoteException -> L4e
            r0.zzH(r1)     // Catch: android.os.RemoteException -> L4e
            com.google.android.gms.ads.internal.client.zzby r0 = r7.zza     // Catch: android.os.RemoteException -> L4e
            com.google.android.gms.ads.internal.client.zzr r1 = r7.zzh     // Catch: android.os.RemoteException -> L4e
            android.content.Context r2 = r7.zzb     // Catch: android.os.RemoteException -> L4e
            com.google.android.gms.ads.internal.client.zzei r3 = r7.zzd     // Catch: android.os.RemoteException -> L4e
            com.google.android.gms.ads.internal.client.zzm r1 = r1.zza(r2, r3)     // Catch: android.os.RemoteException -> L4e
            r0.zzab(r1)     // Catch: android.os.RemoteException -> L4e
        L4d:
            return
        L4e:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
            return
    }
}
