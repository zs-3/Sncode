package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfob {
    private final android.content.Context zza;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzb;
    private final java.util.concurrent.ScheduledExecutorService zzc;
    private final com.google.android.gms.ads.internal.ClientApi zzd;
    private com.google.android.gms.internal.ads.zzbpl zze;
    private final com.google.android.gms.common.util.Clock zzf;

    zzfob(android.content.Context r1, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2, java.util.concurrent.ScheduledExecutorService r3, com.google.android.gms.common.util.Clock r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            com.google.android.gms.ads.internal.ClientApi r1 = new com.google.android.gms.ads.internal.ClientApi
            r1.<init>()
            r0.zzd = r1
            r0.zzf = r4
            return
    }

    private static com.google.android.gms.internal.ads.zzfnm zzc() {
            com.google.android.gms.internal.ads.zzfnm r9 = new com.google.android.gms.internal.ads.zzfnm
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzr
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r1 = r0.longValue()
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzs
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r3.zza(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r5 = r0.longValue()
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            r0 = r9
            r0.<init>(r1, r3, r5, r7)
            return r9
    }

    public final com.google.android.gms.internal.ads.zzfoa zza(com.google.android.gms.ads.internal.client.zzfu r12, com.google.android.gms.ads.internal.client.zzcf r13) {
            r11 = this;
            int r0 = r12.zzb
            com.google.android.gms.ads.AdFormat r0 = com.google.android.gms.ads.AdFormat.getAdFormat(r0)
            if (r0 != 0) goto L9
            goto L16
        L9:
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == r1) goto L4e
            r1 = 2
            if (r0 == r1) goto L33
            r1 = 5
            if (r0 == r1) goto L18
        L16:
            r0 = 0
            return r0
        L18:
            com.google.android.gms.ads.internal.ClientApi r1 = r11.zzd
            android.content.Context r2 = r11.zza
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r11.zzb
            com.google.android.gms.internal.ads.zzfnl r10 = new com.google.android.gms.internal.ads.zzfnl
            int r3 = r0.clientJarVersion
            com.google.android.gms.internal.ads.zzbpl r4 = r11.zze
            java.util.concurrent.ScheduledExecutorService r7 = r11.zzc
            com.google.android.gms.common.util.Clock r9 = r11.zzf
            com.google.android.gms.internal.ads.zzfnm r8 = zzc()
            r0 = r10
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
        L33:
            com.google.android.gms.ads.internal.ClientApi r1 = r11.zzd
            android.content.Context r2 = r11.zza
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r11.zzb
            com.google.android.gms.internal.ads.zzfoe r10 = new com.google.android.gms.internal.ads.zzfoe
            int r3 = r0.clientJarVersion
            com.google.android.gms.internal.ads.zzbpl r4 = r11.zze
            java.util.concurrent.ScheduledExecutorService r7 = r11.zzc
            com.google.android.gms.common.util.Clock r9 = r11.zzf
            com.google.android.gms.internal.ads.zzfnm r8 = zzc()
            r0 = r10
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
        L4e:
            com.google.android.gms.ads.internal.ClientApi r1 = r11.zzd
            android.content.Context r2 = r11.zza
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r11.zzb
            com.google.android.gms.internal.ads.zzfno r10 = new com.google.android.gms.internal.ads.zzfno
            int r3 = r0.clientJarVersion
            com.google.android.gms.internal.ads.zzbpl r4 = r11.zze
            java.util.concurrent.ScheduledExecutorService r7 = r11.zzc
            com.google.android.gms.common.util.Clock r9 = r11.zzf
            com.google.android.gms.internal.ads.zzfnm r8 = zzc()
            r0 = r10
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public final void zzb(com.google.android.gms.internal.ads.zzbpl r1) {
            r0 = this;
            r0.zze = r1
            return
    }
}
