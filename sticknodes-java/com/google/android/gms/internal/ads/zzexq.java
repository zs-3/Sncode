package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzexq implements com.google.android.gms.internal.ads.zzexg {
    public final boolean zza;
    public final boolean zzb;
    public final java.lang.String zzc;
    public final boolean zzd;
    public final boolean zze;
    public final boolean zzf;
    public final java.lang.String zzg;
    public final java.util.ArrayList zzh;
    public final java.lang.String zzi;
    public final java.lang.String zzj;
    public final java.lang.String zzk;
    public final boolean zzl;
    public final java.lang.String zzm;
    public final long zzn;
    public final boolean zzo;
    public final java.lang.String zzp;
    public final int zzq;

    public zzexq(boolean r4, boolean r5, java.lang.String r6, boolean r7, boolean r8, boolean r9, java.lang.String r10, java.util.ArrayList r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15, java.lang.String r16, long r17, boolean r19, java.lang.String r20, int r21) {
            r3 = this;
            r0 = r3
            r3.<init>()
            r1 = r4
            r0.zza = r1
            r1 = r5
            r0.zzb = r1
            r1 = r6
            r0.zzc = r1
            r1 = r7
            r0.zzd = r1
            r1 = r8
            r0.zze = r1
            r1 = r9
            r0.zzf = r1
            r1 = r10
            r0.zzg = r1
            r1 = r11
            r0.zzh = r1
            r1 = r12
            r0.zzi = r1
            r1 = r13
            r0.zzj = r1
            r1 = r14
            r0.zzk = r1
            r1 = r15
            r0.zzl = r1
            r1 = r16
            r0.zzm = r1
            r1 = r17
            r0.zzn = r1
            r1 = r19
            r0.zzo = r1
            r1 = r20
            r0.zzp = r1
            r1 = r21
            r0.zzq = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r5) {
            r4 = this;
            android.os.Bundle r5 = (android.os.Bundle) r5
            boolean r0 = r4.zza
            java.lang.String r1 = "cog"
            r5.putBoolean(r1, r0)
            boolean r0 = r4.zzb
            java.lang.String r1 = "coh"
            r5.putBoolean(r1, r0)
            java.lang.String r0 = r4.zzc
            java.lang.String r1 = "gl"
            r5.putString(r1, r0)
            boolean r0 = r4.zzd
            java.lang.String r1 = "simulator"
            r5.putBoolean(r1, r0)
            boolean r0 = r4.zze
            java.lang.String r1 = "is_latchsky"
            r5.putBoolean(r1, r0)
            int r0 = r4.zzq
            java.lang.String r1 = "build_api_level"
            r5.putInt(r1, r0)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkG
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L45
            boolean r0 = r4.zzf
            java.lang.String r1 = "is_sidewinder"
            r5.putBoolean(r1, r0)
        L45:
            java.lang.String r0 = r4.zzg
            java.lang.String r1 = "hl"
            r5.putString(r1, r0)
            java.util.ArrayList r0 = r4.zzh
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L5b
            java.util.ArrayList r0 = r4.zzh
            java.lang.String r1 = "hl_list"
            r5.putStringArrayList(r1, r0)
        L5b:
            java.lang.String r0 = r4.zzi
            java.lang.String r1 = "mv"
            r5.putString(r1, r0)
            java.lang.String r0 = r4.zzm
            java.lang.String r1 = "submodel"
            r5.putString(r1, r0)
            java.lang.String r0 = "device"
            android.os.Bundle r1 = com.google.android.gms.internal.ads.zzfhq.zza(r5, r0)
            r5.putBundle(r0, r1)
            java.lang.String r0 = r4.zzk
            java.lang.String r2 = "build"
            r1.putString(r2, r0)
            long r2 = r4.zzn
            java.lang.String r0 = "remaining_data_partition_space"
            r1.putLong(r0, r2)
            java.lang.String r0 = "browser"
            android.os.Bundle r2 = com.google.android.gms.internal.ads.zzfhq.zza(r1, r0)
            r1.putBundle(r0, r2)
            boolean r0 = r4.zzl
            java.lang.String r3 = "is_browser_custom_tabs_capable"
            r2.putBoolean(r3, r0)
            java.lang.String r0 = r4.zzj
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto La8
            java.lang.String r0 = "play_store"
            android.os.Bundle r2 = com.google.android.gms.internal.ads.zzfhq.zza(r1, r0)
            r1.putBundle(r0, r2)
            java.lang.String r0 = r4.zzj
            java.lang.String r1 = "package_version"
            r2.putString(r1, r0)
        La8:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkX
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lc1
            boolean r0 = r4.zzo
            java.lang.String r1 = "is_bstar"
            r5.putBoolean(r1, r0)
        Lc1:
            java.lang.String r0 = r4.zzp
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Ld0
            java.lang.String r0 = r4.zzp
            java.lang.String r1 = "v_unity"
            r5.putString(r1, r0)
        Ld0:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkR
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L10d
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkO
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "gotmt_l"
            r2 = 1
            com.google.android.gms.internal.ads.zzfhq.zzg(r5, r1, r2, r0)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkN
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "gotmt_i"
            com.google.android.gms.internal.ads.zzfhq.zzg(r5, r1, r2, r0)
        L10d:
            return
    }
}
