package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "NativeAdOptionsParcelCreator")
/* loaded from: classes.dex */
public final class zzbfr extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzbfr> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    public final int zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final boolean zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final int zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    public final boolean zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    public final int zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 6)
    public final com.google.android.gms.ads.internal.client.zzgb zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 7)
    public final boolean zzg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 8)
    public final int zzh;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 9)
    public final int zzi;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 10)
    public final boolean zzj;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 11)
    public final int zzk;

    static {
            com.google.android.gms.internal.ads.zzbfs r0 = new com.google.android.gms.internal.ads.zzbfs
            r0.<init>()
            com.google.android.gms.internal.ads.zzbfr.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzbfr(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) boolean r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) boolean r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) int r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) com.google.android.gms.ads.internal.client.zzgb r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) boolean r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) int r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) int r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 10) boolean r10, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 11) int r11) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            r0.zzh = r8
            r0.zzj = r10
            r0.zzi = r9
            r0.zzk = r11
            return
    }

    @java.lang.Deprecated
    public zzbfr(com.google.android.gms.ads.formats.NativeAdOptions r13) {
            r12 = this;
            boolean r2 = r13.shouldReturnUrlsForImageAssets()
            int r3 = r13.getImageOrientation()
            boolean r4 = r13.shouldRequestMultipleImages()
            int r5 = r13.getAdChoicesPlacement()
            com.google.android.gms.ads.VideoOptions r0 = r13.getVideoOptions()
            if (r0 == 0) goto L20
            com.google.android.gms.ads.internal.client.zzgb r0 = new com.google.android.gms.ads.internal.client.zzgb
            com.google.android.gms.ads.VideoOptions r1 = r13.getVideoOptions()
            r0.<init>(r1)
            goto L21
        L20:
            r0 = 0
        L21:
            r6 = r0
            r1 = 4
            boolean r7 = r13.zza()
            int r8 = r13.getMediaAspectRatio()
            r9 = 0
            r10 = 0
            r11 = 0
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static com.google.android.gms.ads.nativead.NativeAdOptions zza(com.google.android.gms.internal.ads.zzbfr r5) {
            com.google.android.gms.ads.nativead.NativeAdOptions$Builder r0 = new com.google.android.gms.ads.nativead.NativeAdOptions$Builder
            r0.<init>()
            if (r5 != 0) goto Lc
            com.google.android.gms.ads.nativead.NativeAdOptions r5 = r0.build()
            return r5
        Lc:
            int r1 = r5.zza
            r2 = 2
            if (r1 == r2) goto L45
            r3 = 3
            if (r1 == r3) goto L39
            r4 = 4
            if (r1 == r4) goto L18
            goto L4a
        L18:
            boolean r1 = r5.zzg
            r0.setRequestCustomMuteThisAd(r1)
            int r1 = r5.zzh
            r0.setMediaAspectRatio(r1)
            int r1 = r5.zzi
            boolean r4 = r5.zzj
            r0.enableCustomClickGestureDirection(r1, r4)
            int r1 = r5.zzk
            r4 = 1
            if (r1 != 0) goto L30
        L2e:
            r2 = 1
            goto L36
        L30:
            if (r1 != r2) goto L34
            r2 = 3
            goto L36
        L34:
            if (r1 != r4) goto L2e
        L36:
            r0.zzi(r2)
        L39:
            com.google.android.gms.ads.internal.client.zzgb r1 = r5.zzf
            if (r1 == 0) goto L45
            com.google.android.gms.ads.VideoOptions r2 = new com.google.android.gms.ads.VideoOptions
            r2.<init>(r1)
            r0.setVideoOptions(r2)
        L45:
            int r1 = r5.zze
            r0.setAdChoicesPlacement(r1)
        L4a:
            boolean r1 = r5.zzb
            r0.setReturnUrlsForImageAssets(r1)
            boolean r5 = r5.zzd
            r0.setRequestMultipleImages(r5)
            com.google.android.gms.ads.nativead.NativeAdOptions r5 = r0.build()
            return r5
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = r4.zza
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r0)
            boolean r0 = r4.zzb
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r2, r0)
            int r0 = r4.zzc
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r0)
            boolean r0 = r4.zzd
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r2, r0)
            int r0 = r4.zze
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r0)
            com.google.android.gms.ads.internal.client.zzgb r0 = r4.zzf
            r2 = 6
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r0, r6, r3)
            boolean r6 = r4.zzg
            r0 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r0, r6)
            int r6 = r4.zzh
            r0 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r0, r6)
            int r6 = r4.zzi
            r0 = 9
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r0, r6)
            boolean r6 = r4.zzj
            r0 = 10
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r0, r6)
            int r6 = r4.zzk
            r0 = 11
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r0, r6)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r1)
            return
    }
}
