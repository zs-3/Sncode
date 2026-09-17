package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "PoolConfigurationCreator")
/* loaded from: classes.dex */
public final class zzfix extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzfix> CREATOR = null;
    public final android.content.Context zza;
    public final com.google.android.gms.internal.ads.zzfiu zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final int zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final int zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    public final int zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    public final java.lang.String zzf;
    public final int zzg;
    private final com.google.android.gms.internal.ads.zzfiu[] zzh;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getFormatInt", id = 1)
    private final int zzi;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPoolDiscardStrategyInt", id = 6)
    private final int zzj;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPrecacheStartTriggerInt", id = 7)
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    static {
            com.google.android.gms.internal.ads.zzfiy r0 = new com.google.android.gms.internal.ads.zzfiy
            r0.<init>()
            com.google.android.gms.internal.ads.zzfix.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzfix(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) int r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) java.lang.String r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) int r10, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) int r11) {
            r4 = this;
            r4.<init>()
            com.google.android.gms.internal.ads.zzfiu[] r0 = com.google.android.gms.internal.ads.zzfiu.values()
            r4.zzh = r0
            int[] r1 = com.google.android.gms.internal.ads.zzfiv.zza()
            r4.zzl = r1
            int[] r2 = com.google.android.gms.internal.ads.zzfiw.zza()
            r4.zzm = r2
            r3 = 0
            r4.zza = r3
            r4.zzi = r5
            r5 = r0[r5]
            r4.zzb = r5
            r4.zzc = r6
            r4.zzd = r7
            r4.zze = r8
            r4.zzf = r9
            r4.zzj = r10
            r5 = r1[r10]
            r4.zzg = r5
            r4.zzk = r11
            r5 = r2[r11]
            return
    }

    private zzfix(android.content.Context r2, com.google.android.gms.internal.ads.zzfiu r3, int r4, int r5, int r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzfiu[] r0 = com.google.android.gms.internal.ads.zzfiu.values()
            r1.zzh = r0
            int[] r0 = com.google.android.gms.internal.ads.zzfiv.zza()
            r1.zzl = r0
            int[] r0 = com.google.android.gms.internal.ads.zzfiw.zza()
            r1.zzm = r0
            r1.zza = r2
            int r2 = r3.ordinal()
            r1.zzi = r2
            r1.zzb = r3
            r1.zzc = r4
            r1.zzd = r5
            r1.zze = r6
            r1.zzf = r7
            java.lang.String r2 = "oldest"
            boolean r2 = r2.equals(r8)
            r3 = 2
            if (r2 == 0) goto L32
            r3 = 1
            goto L44
        L32:
            java.lang.String r2 = "lru"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L3b
            goto L44
        L3b:
            java.lang.String r2 = "lfu"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L44
            r3 = 3
        L44:
            r1.zzg = r3
            int r3 = r3 + (-1)
            r1.zzj = r3
            java.lang.String r2 = "onAdClosed"
            r2.equals(r9)
            r2 = 0
            r1.zzk = r2
            return
    }

    public static com.google.android.gms.internal.ads.zzfix zza(com.google.android.gms.internal.ads.zzfiu r10, android.content.Context r11) {
            com.google.android.gms.internal.ads.zzfiu r0 = com.google.android.gms.internal.ads.zzfiu.zza
            if (r10 != r0) goto L64
            com.google.android.gms.internal.ads.zzfix r0 = new com.google.android.gms.internal.ads.zzfix
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzge
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r4 = r1.intValue()
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzgk
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r5 = r1.intValue()
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzgm
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r6 = r1.intValue()
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzgo
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzgg
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            r8 = r1
            java.lang.String r8 = (java.lang.String) r8
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzgi
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            r1 = r0
            r2 = r11
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        L64:
            com.google.android.gms.internal.ads.zzfiu r0 = com.google.android.gms.internal.ads.zzfiu.zzb
            if (r10 != r0) goto Lc8
            com.google.android.gms.internal.ads.zzfix r0 = new com.google.android.gms.internal.ads.zzfix
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzgf
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r4 = r1.intValue()
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzgl
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r5 = r1.intValue()
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzgn
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r6 = r1.intValue()
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzgp
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzgh
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            r8 = r1
            java.lang.String r8 = (java.lang.String) r8
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzgj
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            r1 = r0
            r2 = r11
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        Lc8:
            com.google.android.gms.internal.ads.zzfiu r0 = com.google.android.gms.internal.ads.zzfiu.zzc
            if (r10 != r0) goto L12c
            com.google.android.gms.internal.ads.zzfix r0 = new com.google.android.gms.internal.ads.zzfix
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzgs
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r4 = r1.intValue()
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzgu
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r5 = r1.intValue()
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzgv
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r6 = r1.intValue()
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzgq
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzgr
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            r8 = r1
            java.lang.String r8 = (java.lang.String) r8
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzgt
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            r1 = r0
            r2 = r11
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        L12c:
            r10 = 0
            return r10
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = r3.zzi
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r5)
            int r5 = r3.zzc
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r5)
            int r5 = r3.zzd
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r5)
            int r5 = r3.zze
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r5)
            java.lang.String r5 = r3.zzf
            r1 = 5
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r5, r2)
            int r5 = r3.zzj
            r1 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r5)
            int r5 = r3.zzk
            r1 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r5)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }
}
