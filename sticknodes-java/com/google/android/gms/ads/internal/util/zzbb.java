package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ExceptionParcelCreator")
/* loaded from: classes.dex */
public final class zzbb extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.ads.internal.util.zzbb> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    public final java.lang.String zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final int zzb;

    static {
            com.google.android.gms.ads.internal.util.zzbc r0 = new com.google.android.gms.ads.internal.util.zzbc
            r0.<init>()
            com.google.android.gms.ads.internal.util.zzbb.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzbb(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r2) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L7
            java.lang.String r1 = ""
        L7:
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public static com.google.android.gms.ads.internal.util.zzbb zzb(java.lang.Throwable r2) {
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfie.zza(r2)
            java.lang.String r1 = r2.getMessage()
            boolean r1 = com.google.android.gms.internal.ads.zzfyo.zzd(r1)
            if (r1 == 0) goto L11
            java.lang.String r2 = r0.zzb
            goto L15
        L11:
            java.lang.String r2 = r2.getMessage()
        L15:
            com.google.android.gms.ads.internal.util.zzbb r1 = new com.google.android.gms.ads.internal.util.zzbb
            int r0 = r0.zza
            r1.<init>(r2, r0)
            return r1
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            java.lang.String r5 = r3.zza
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r1 = 1
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r5, r2)
            int r5 = r3.zzb
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r5)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }

    public final com.google.android.gms.ads.internal.util.zzba zza() {
            r3 = this;
            com.google.android.gms.ads.internal.util.zzba r0 = new com.google.android.gms.ads.internal.util.zzba
            java.lang.String r1 = r3.zza
            int r2 = r3.zzb
            r0.<init>(r1, r2)
            return r0
    }
}
