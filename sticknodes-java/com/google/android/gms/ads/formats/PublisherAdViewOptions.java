package com.google.android.gms.ads.formats;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "PublisherAdViewOptionsCreator")
@java.lang.Deprecated
/* loaded from: classes.dex */
public final class PublisherAdViewOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.ads.formats.PublisherAdViewOptions> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getManualImpressionsEnabled", id = 1)
    private final boolean zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAppEventListenerBinder", id = 2, type = "android.os.IBinder")
    private final com.google.android.gms.ads.internal.client.zzcm zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDelayedBannerAdListenerBinder", id = 3)
    private final android.os.IBinder zzc;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    @java.lang.Deprecated
    public static final class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.ads.formats.PublisherAdViewOptions.Builder setShouldDelayBannerRenderingListener(com.google.android.gms.ads.formats.ShouldDelayBannerRenderingListener r1) {
                r0 = this;
                return r0
        }
    }

    static {
            com.google.android.gms.ads.formats.zzh r0 = new com.google.android.gms.ads.formats.zzh
            r0.<init>()
            com.google.android.gms.ads.formats.PublisherAdViewOptions.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    PublisherAdViewOptions(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) boolean r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) android.os.IBinder r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) android.os.IBinder r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            if (r2 == 0) goto Lc
            com.google.android.gms.ads.internal.client.zzcm r1 = com.google.android.gms.ads.internal.client.zzcl.zzd(r2)
            goto Ld
        Lc:
            r1 = 0
        Ld:
            r0.zzb = r1
            r0.zzc = r3
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            boolean r0 = r3.zza
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r0)
            com.google.android.gms.ads.internal.client.zzcm r0 = r3.zzb
            if (r0 != 0) goto L10
            r0 = 0
            goto L14
        L10:
            android.os.IBinder r0 = r0.asBinder()
        L14:
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(r4, r1, r0, r2)
            r0 = 3
            android.os.IBinder r1 = r3.zzc
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(r4, r0, r1, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }

    public final com.google.android.gms.ads.internal.client.zzcm zza() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzcm r0 = r1.zzb
            return r0
    }

    public final com.google.android.gms.internal.ads.zzbht zzb() {
            r1 = this;
            android.os.IBinder r0 = r1.zzc
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.google.android.gms.internal.ads.zzbht r0 = com.google.android.gms.internal.ads.zzbhs.zzb(r0)
            return r0
    }

    public final boolean zzc() {
            r1 = this;
            boolean r0 = r1.zza
            return r0
    }
}
