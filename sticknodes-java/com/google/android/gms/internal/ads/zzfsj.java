package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "GassResponseParcelCreator")
/* loaded from: classes.dex */
public final class zzfsj extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzfsj> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    public final int zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAfmaSignalsAsBytes", id = 2, type = "byte[]")
    private com.google.android.gms.internal.ads.zzath zzb;
    private byte[] zzc;

    static {
            com.google.android.gms.internal.ads.zzfsk r0 = new com.google.android.gms.internal.ads.zzfsk
            r0.<init>()
            com.google.android.gms.internal.ads.zzfsj.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzfsj(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) byte[] r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r1 = 0
            r0.zzb = r1
            r0.zzc = r2
            r0.zzb()
            return
    }

    private final void zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzath r0 = r2.zzb
            if (r0 != 0) goto L8
            byte[] r1 = r2.zzc
            if (r1 != 0) goto Lf
        L8:
            if (r0 == 0) goto L10
            byte[] r1 = r2.zzc
            if (r1 == 0) goto Lf
            goto L10
        Lf:
            return
        L10:
            if (r0 == 0) goto L1f
            byte[] r1 = r2.zzc
            if (r1 != 0) goto L17
            goto L1f
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Invalid internal representation - full"
            r0.<init>(r1)
            throw r0
        L1f:
            if (r0 != 0) goto L2d
            byte[] r0 = r2.zzc
            if (r0 != 0) goto L2d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Invalid internal representation - empty"
            r0.<init>(r1)
            throw r0
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Impossible"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = r3.zza
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r5)
            byte[] r5 = r3.zzc
            if (r5 == 0) goto Lf
            goto L15
        Lf:
            com.google.android.gms.internal.ads.zzath r5 = r3.zzb
            byte[] r5 = r5.zzaV()
        L15:
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r4, r1, r5, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }

    public final com.google.android.gms.internal.ads.zzath zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzath r0 = r2.zzb
            if (r0 != 0) goto L1d
            byte[] r0 = r2.zzc     // Catch: java.lang.NullPointerException -> L14 com.google.android.gms.internal.ads.zzhbt -> L16
            com.google.android.gms.internal.ads.zzhao r1 = com.google.android.gms.internal.ads.zzhao.zza()     // Catch: java.lang.NullPointerException -> L14 com.google.android.gms.internal.ads.zzhbt -> L16
            com.google.android.gms.internal.ads.zzath r0 = com.google.android.gms.internal.ads.zzath.zze(r0, r1)     // Catch: java.lang.NullPointerException -> L14 com.google.android.gms.internal.ads.zzhbt -> L16
            r2.zzb = r0     // Catch: java.lang.NullPointerException -> L14 com.google.android.gms.internal.ads.zzhbt -> L16
            r0 = 0
            r2.zzc = r0     // Catch: java.lang.NullPointerException -> L14 com.google.android.gms.internal.ads.zzhbt -> L16
            goto L1d
        L14:
            r0 = move-exception
            goto L17
        L16:
            r0 = move-exception
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L1d:
            r2.zzb()
            com.google.android.gms.internal.ads.zzath r0 = r2.zzb
            return r0
    }
}
