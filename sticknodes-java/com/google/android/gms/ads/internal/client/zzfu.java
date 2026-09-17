package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "PreloadConfigurationParcelCreator")
/* loaded from: classes.dex */
public final class zzfu extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.ads.internal.client.zzfu> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    public final java.lang.String zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final int zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final com.google.android.gms.ads.internal.client.zzm zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    public final int zzd;

    static {
            com.google.android.gms.ads.internal.client.zzfv r0 = new com.google.android.gms.ads.internal.client.zzfv
            r0.<init>()
            com.google.android.gms.ads.internal.client.zzfu.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzfu(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) com.google.android.gms.ads.internal.client.zzm r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) int r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.ads.internal.client.zzfu
            r2 = 0
            if (r1 == 0) goto L26
            com.google.android.gms.ads.internal.client.zzfu r5 = (com.google.android.gms.ads.internal.client.zzfu) r5
            java.lang.String r1 = r4.zza
            java.lang.String r3 = r5.zza
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L26
            int r1 = r4.zzb
            int r3 = r5.zzb
            if (r1 != r3) goto L26
            com.google.android.gms.ads.internal.client.zzm r1 = r4.zzc
            com.google.android.gms.ads.internal.client.zzm r5 = r5.zzc
            boolean r5 = r1.zza(r5)
            if (r5 == 0) goto L26
            return r0
        L26:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.zza
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            int r0 = r3.zzb
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 1
            r1[r2] = r0
            com.google.android.gms.ads.internal.client.zzm r0 = r3.zzc
            r2 = 2
            r1[r2] = r0
            int r0 = java.util.Objects.hash(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            java.lang.String r0 = r4.zza
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r0, r3)
            int r0 = r4.zzb
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r0)
            com.google.android.gms.ads.internal.client.zzm r0 = r4.zzc
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r0, r6, r3)
            int r6 = r4.zzd
            r0 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r0, r6)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r1)
            return
    }
}
