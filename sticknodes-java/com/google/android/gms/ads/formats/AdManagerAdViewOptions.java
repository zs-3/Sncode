package com.google.android.gms.ads.formats;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "AdManagerAdViewOptionsCreator")
/* loaded from: classes.dex */
public final class AdManagerAdViewOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.ads.formats.AdManagerAdViewOptions> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getManualImpressionsEnabled", id = 1)
    private final boolean zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDelayedBannerAdListenerBinder", id = 2)
    private final android.os.IBinder zzb;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    public static final class Builder {
        private boolean zza;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.zza = r0
                return
        }

        static /* bridge */ /* synthetic */ boolean zza(com.google.android.gms.ads.formats.AdManagerAdViewOptions.Builder r0) {
                boolean r0 = r0.zza
                return r0
        }

        public com.google.android.gms.ads.formats.AdManagerAdViewOptions build() {
                r2 = this;
                com.google.android.gms.ads.formats.AdManagerAdViewOptions r0 = new com.google.android.gms.ads.formats.AdManagerAdViewOptions
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public com.google.android.gms.ads.formats.AdManagerAdViewOptions.Builder setManualImpressionsEnabled(boolean r1) {
                r0 = this;
                r0.zza = r1
                return r0
        }
    }

    static {
            com.google.android.gms.ads.formats.zzc r0 = new com.google.android.gms.ads.formats.zzc
            r0.<init>()
            com.google.android.gms.ads.formats.AdManagerAdViewOptions.CREATOR = r0
            return
    }

    /* synthetic */ AdManagerAdViewOptions(com.google.android.gms.ads.formats.AdManagerAdViewOptions.Builder r1, com.google.android.gms.ads.formats.zzb r2) {
            r0 = this;
            r0.<init>()
            boolean r1 = com.google.android.gms.ads.formats.AdManagerAdViewOptions.Builder.zza(r1)
            r0.zza = r1
            r1 = 0
            r0.zzb = r1
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    AdManagerAdViewOptions(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) boolean r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) android.os.IBinder r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public boolean getManualImpressionsEnabled() {
            r1 = this;
            boolean r0 = r1.zza
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            boolean r0 = r3.getManualImpressionsEnabled()
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r0)
            android.os.IBinder r0 = r3.zzb
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }

    public final com.google.android.gms.internal.ads.zzbht zza() {
            r1 = this;
            android.os.IBinder r0 = r1.zzb
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.google.android.gms.internal.ads.zzbht r0 = com.google.android.gms.internal.ads.zzbhs.zzb(r0)
            return r0
    }
}
