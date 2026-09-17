package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ScionActivityInfoCreator")
/* loaded from: classes2.dex */
public final class zzdj extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.measurement.zzdj> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    public final int zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final java.lang.String zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final android.content.Intent zzc;

    static {
            com.google.android.gms.internal.measurement.zzdk r0 = new com.google.android.gms.internal.measurement.zzdk
            r0.<init>()
            com.google.android.gms.internal.measurement.zzdj.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzdj(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) android.content.Intent r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public static com.google.android.gms.internal.measurement.zzdj zza(android.app.Activity r3) {
            com.google.android.gms.internal.measurement.zzdj r0 = new com.google.android.gms.internal.measurement.zzdj
            int r1 = r3.hashCode()
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getCanonicalName()
            android.content.Intent r3 = r3.getIntent()
            r0.<init>(r1, r2, r3)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.measurement.zzdj
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.measurement.zzdj r5 = (com.google.android.gms.internal.measurement.zzdj) r5
            int r1 = r4.zza
            int r3 = r5.zza
            if (r1 != r3) goto L27
            java.lang.String r1 = r4.zzb
            java.lang.String r3 = r5.zzb
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L27
            android.content.Intent r1 = r4.zzc
            android.content.Intent r5 = r5.zzc
            boolean r5 = java.util.Objects.equals(r1, r5)
            if (r5 == 0) goto L27
            return r0
        L27:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.zza
            return r0
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
            android.content.Intent r0 = r4.zzc
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r0, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r1)
            return
    }
}
