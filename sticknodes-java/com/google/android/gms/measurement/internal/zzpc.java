package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "UploadBatchesCriteriaCreator")
/* loaded from: classes2.dex */
public final class zzpc extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.zzpc> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 1)
    public final java.util.List zza;

    static {
            com.google.android.gms.measurement.internal.zzpd r0 = new com.google.android.gms.measurement.internal.zzpd
            r0.<init>()
            com.google.android.gms.measurement.internal.zzpc.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzpc(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.util.List r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public static com.google.android.gms.measurement.internal.zzpc zza(com.google.android.gms.measurement.internal.zzmf... r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            r1 = 0
            r2 = r2[r1]
            int r2 = r2.zza()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            com.google.android.gms.measurement.internal.zzpc r2 = new com.google.android.gms.measurement.internal.zzpc
            r2.<init>(r0)
            return r2
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            java.util.List r5 = r3.zza
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r1 = 1
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerList(r4, r1, r5, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }
}
