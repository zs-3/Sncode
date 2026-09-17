package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "RtbVersionInfoParcelCreator")
/* loaded from: classes.dex */
public final class zzbrz extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzbrz> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    public final int zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final int zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final int zzc;

    static {
            com.google.android.gms.internal.ads.zzbsa r0 = new com.google.android.gms.internal.ads.zzbsa
            r0.<init>()
            com.google.android.gms.internal.ads.zzbrz.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzbrz(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public static com.google.android.gms.internal.ads.zzbrz zza(com.google.android.gms.ads.VersionInfo r3) {
            com.google.android.gms.internal.ads.zzbrz r0 = new com.google.android.gms.internal.ads.zzbrz
            int r1 = r3.getMajorVersion()
            int r2 = r3.getMinorVersion()
            int r3 = r3.getMicroVersion()
            r0.<init>(r1, r2, r3)
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof com.google.android.gms.internal.ads.zzbrz
            if (r1 == 0) goto L1e
            com.google.android.gms.internal.ads.zzbrz r4 = (com.google.android.gms.internal.ads.zzbrz) r4
            int r1 = r4.zzc
            int r2 = r3.zzc
            if (r1 != r2) goto L1e
            int r1 = r4.zzb
            int r2 = r3.zzb
            if (r1 != r2) goto L1e
            int r4 = r4.zza
            int r1 = r3.zza
            if (r4 != r1) goto L1e
            r4 = 1
            return r4
        L1e:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.zza
            r1 = 3
            int[] r1 = new int[r1]
            r2 = 0
            r1[r2] = r0
            int r0 = r3.zzb
            r2 = 1
            r1[r2] = r0
            int r0 = r3.zzc
            r2 = 2
            r1[r2] = r0
            int r0 = java.util.Arrays.hashCode(r1)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.zza
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            int r2 = r3.zzb
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.zzc
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = r2.zza
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r1, r4)
            int r4 = r2.zzb
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r1, r4)
            int r4 = r2.zzc
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r1, r4)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r0)
            return
    }
}
