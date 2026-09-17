package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzevx implements com.google.android.gms.internal.ads.zzexg {
    private com.google.android.gms.internal.ads.zzfur zza;
    private com.google.android.gms.internal.ads.zzfur zzb;
    private boolean zzc;
    private boolean zzd;
    private final boolean zze;
    private final boolean zzf;

    public zzevx(com.google.android.gms.internal.ads.zzfur r1, com.google.android.gms.internal.ads.zzfur r2, boolean r3, boolean r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r1 = 0
            r0.zze = r1
            r0.zzf = r5
            return
    }

    public zzevx(boolean r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zze = r0
            r1.zzf = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r6) {
            r5 = this;
            android.os.Bundle r6 = (android.os.Bundle) r6
            boolean r0 = r5.zze
            if (r0 == 0) goto L8
            goto Lc1
        L8:
            java.lang.String r0 = "pii"
            android.os.Bundle r1 = com.google.android.gms.internal.ads.zzfhq.zza(r6, r0)
            boolean r2 = r5.zzf
            if (r2 != 0) goto L24
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzcV
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L3a
        L24:
            boolean r2 = r5.zzf
            if (r2 == 0) goto L5c
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzcX
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L5c
        L3a:
            com.google.android.gms.internal.ads.zzfur r2 = r5.zza
            boolean r2 = r2.zzc()
            if (r2 == 0) goto L5c
            com.google.android.gms.internal.ads.zzfur r2 = r5.zza
            java.lang.String r2 = r2.zza()
            java.lang.String r3 = "paidv1_id_android"
            r1.putString(r3, r2)
            com.google.android.gms.internal.ads.zzfur r2 = r5.zza
            java.time.Instant r2 = r2.zzb()
            long r2 = r2.toEpochMilli()
            java.lang.String r4 = "paidv1_creation_time_android"
            r1.putLong(r4, r2)
        L5c:
            boolean r2 = r5.zzf
            if (r2 != 0) goto L72
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzcW
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L88
        L72:
            boolean r2 = r5.zzf
            if (r2 == 0) goto Lb8
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzcY
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Lb8
        L88:
            com.google.android.gms.internal.ads.zzfur r2 = r5.zzb
            boolean r2 = r2.zzc()
            if (r2 == 0) goto Laa
            com.google.android.gms.internal.ads.zzfur r2 = r5.zzb
            java.lang.String r2 = r2.zza()
            java.lang.String r3 = "paidv2_id_android"
            r1.putString(r3, r2)
            com.google.android.gms.internal.ads.zzfur r2 = r5.zzb
            java.time.Instant r2 = r2.zzb()
            long r2 = r2.toEpochMilli()
            java.lang.String r4 = "paidv2_creation_time_android"
            r1.putLong(r4, r2)
        Laa:
            boolean r2 = r5.zzc
            java.lang.String r3 = "paidv2_pub_option_android"
            r1.putBoolean(r3, r2)
            boolean r2 = r5.zzd
            java.lang.String r3 = "paidv2_user_option_android"
            r1.putBoolean(r3, r2)
        Lb8:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto Lc1
            r6.putBundle(r0, r1)
        Lc1:
            return
    }
}
