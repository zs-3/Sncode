package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "AdErrorParcelCreator")
/* loaded from: classes.dex */
public final class zze extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.ads.internal.client.zze> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    public final int zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final java.lang.String zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final java.lang.String zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    public com.google.android.gms.ads.internal.client.zze zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5, type = "android.os.IBinder")
    public android.os.IBinder zze;

    static {
            com.google.android.gms.ads.internal.client.zzf r0 = new com.google.android.gms.ads.internal.client.zzf
            r0.<init>()
            com.google.android.gms.ads.internal.client.zze.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zze(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) com.google.android.gms.ads.internal.client.zze r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) android.os.IBinder r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = r4.zza
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r0)
            java.lang.String r0 = r4.zzb
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r0, r3)
            java.lang.String r0 = r4.zzc
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r0, r3)
            com.google.android.gms.ads.internal.client.zze r0 = r4.zzd
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r0, r6, r3)
            android.os.IBinder r6 = r4.zze
            r0 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(r5, r0, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r1)
            return
    }

    public final com.google.android.gms.ads.AdError zza() {
            r5 = this;
            com.google.android.gms.ads.internal.client.zze r0 = r5.zzd
            if (r0 != 0) goto L6
            r0 = 0
            goto L12
        L6:
            java.lang.String r1 = r0.zzc
            java.lang.String r2 = r0.zzb
            int r0 = r0.zza
            com.google.android.gms.ads.AdError r3 = new com.google.android.gms.ads.AdError
            r3.<init>(r0, r2, r1)
            r0 = r3
        L12:
            int r1 = r5.zza
            java.lang.String r2 = r5.zzb
            java.lang.String r3 = r5.zzc
            com.google.android.gms.ads.AdError r4 = new com.google.android.gms.ads.AdError
            r4.<init>(r1, r2, r3, r0)
            return r4
    }

    public final com.google.android.gms.ads.LoadAdError zzb() {
            r11 = this;
            com.google.android.gms.ads.internal.client.zze r0 = r11.zzd
            r1 = 0
            if (r0 != 0) goto L7
            r9 = r1
            goto L13
        L7:
            java.lang.String r2 = r0.zzc
            java.lang.String r3 = r0.zzb
            int r0 = r0.zza
            com.google.android.gms.ads.AdError r4 = new com.google.android.gms.ads.AdError
            r4.<init>(r0, r3, r2)
            r9 = r4
        L13:
            int r6 = r11.zza
            java.lang.String r7 = r11.zzb
            java.lang.String r8 = r11.zzc
            com.google.android.gms.ads.LoadAdError r0 = new com.google.android.gms.ads.LoadAdError
            android.os.IBinder r2 = r11.zze
            if (r2 != 0) goto L20
            goto L32
        L20:
            java.lang.String r1 = "com.google.android.gms.ads.internal.client.IResponseInfo"
            android.os.IInterface r1 = r2.queryLocalInterface(r1)
            boolean r3 = r1 instanceof com.google.android.gms.ads.internal.client.zzdy
            if (r3 == 0) goto L2d
            com.google.android.gms.ads.internal.client.zzdy r1 = (com.google.android.gms.ads.internal.client.zzdy) r1
            goto L32
        L2d:
            com.google.android.gms.ads.internal.client.zzdw r1 = new com.google.android.gms.ads.internal.client.zzdw
            r1.<init>(r2)
        L32:
            com.google.android.gms.ads.ResponseInfo r10 = com.google.android.gms.ads.ResponseInfo.zza(r1)
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            return r0
    }
}
